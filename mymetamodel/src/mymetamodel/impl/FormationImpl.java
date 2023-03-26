/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mymetamodel.Debouche;
import mymetamodel.Formation;
import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Niveau;
import mymetamodel.Responsable;
import mymetamodel.Specialite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.FormationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.impl.FormationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.impl.FormationImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mymetamodel.impl.FormationImpl#getDebouche <em>Debouche</em>}</li>
 *   <li>{@link mymetamodel.impl.FormationImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.impl.FormationImpl#getSpecialite <em>Specialite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends MinimalEObjectImpl.Container implements Formation {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected EList<Niveau> niveau;

	/**
	 * The cached value of the '{@link #getDebouche() <em>Debouche</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebouche()
	 * @generated
	 * @ordered
	 */
	protected EList<Debouche> debouche;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsable> responsable;

	/**
	 * The cached value of the '{@link #getSpecialite() <em>Specialite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialite()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialite> specialite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.FORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.FORMATION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.FORMATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Niveau> getNiveau() {
		if (niveau == null) {
			niveau = new EObjectContainmentWithInverseEList<Niveau>(Niveau.class, this, MymetamodelPackage.FORMATION__NIVEAU, MymetamodelPackage.NIVEAU__FORMATION);
		}
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Debouche> getDebouche() {
		if (debouche == null) {
			debouche = new EObjectContainmentEList<Debouche>(Debouche.class, this, MymetamodelPackage.FORMATION__DEBOUCHE);
		}
		return debouche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsable> getResponsable() {
		if (responsable == null) {
			responsable = new EObjectWithInverseResolvingEList.ManyInverse<Responsable>(Responsable.class, this, MymetamodelPackage.FORMATION__RESPONSABLE, MymetamodelPackage.RESPONSABLE__FORMATION);
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialite> getSpecialite() {
		if (specialite == null) {
			specialite = new EObjectContainmentEList<Specialite>(Specialite.class, this, MymetamodelPackage.FORMATION__SPECIALITE);
		}
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Named(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Formation::Named";
		try {
			/**
			 *
			 * inv Named:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.nom <> null and self.description <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.FORMATION___NAMED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Boolean result;
				final /*@NonInvalid*/ String description = this.getDescription();
				final /*@NonInvalid*/ boolean ne = description != null;
				result = ne;
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MymetamodelTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nomUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Formation::nomUnique";
		try {
			/**
			 *
			 * inv nomUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.oclType().allInstances()->isUnique(nom)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.FORMATION___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class oclType = (org.eclipse.ocl.pivot.Class)OclAnyOclTypeOperation.INSTANCE.evaluate(executor, this);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, MymetamodelTables.SET_CLSSid_Formation, oclType);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(MymetamodelTables.SET_CLSSid_Formation);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Formation _1 = (Formation)ITERATOR__1.next();
					/**
					 * nom
					 */
					final /*@NonInvalid*/ String nom = _1.getNom();
					//
					if (accumulator.includes(nom) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(nom);
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MymetamodelTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean auMoins1Niveau(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Formation::auMoins1Niveau";
		try {
			/**
			 *
			 * inv auMoins1Niveau:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.niveau->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.FORMATION___AU_MOINS1_NIVEAU__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Niveau> niveau = this.getNiveau();
				final /*@NonInvalid*/ OrderedSetValue BOXED_niveau = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Niveau, niveau);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_niveau);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, MymetamodelTables.INT_1).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MymetamodelTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean niveauDistinct(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Formation::niveauDistinct";
		try {
			/**
			 *
			 * inv niveauDistinct:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.niveau->forAll(n1, n2 | n1 <> n2 implies n1.numero <> n2.numero and n1.nom <> n2.nom)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.FORMATION___NIVEAU_DISTINCT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Niveau> niveau = this.getNiveau();
					final /*@NonInvalid*/ OrderedSetValue BOXED_niveau = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Niveau, niveau);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_niveau);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * n1 <> n2 implies n1.numero <> n2.numero and n1.nom <> n2.nom
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_niveau = (OrderedSetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object n1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object n2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Niveau local_0 = (Niveau)n1;
								final /*@NonInvalid*/ Niveau local_1 = (Niveau)n2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_and;
									try {
										/*@Caught*/ Object CAUGHT_ne_0;
										try {
											if (local_0 == null) {
												throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Niveau::numero\'");
											}
											final /*@Thrown*/ int numero = local_0.getNumero();
											if (local_1 == null) {
												throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Niveau::numero\'");
											}
											final /*@Thrown*/ int numero_0 = local_1.getNumero();
											final /*@Thrown*/ boolean ne_0 = numero != numero_0;
											CAUGHT_ne_0 = ne_0;
										}
										catch (Exception e) {
											CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and;
										if (CAUGHT_ne_0 == ValueUtil.FALSE_VALUE) {
											and = ValueUtil.FALSE_VALUE;
										}
										else {
											/*@Caught*/ Object CAUGHT_ne_1;
											try {
												if (local_0 == null) {
													throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Niveau::nom\'");
												}
												final /*@Thrown*/ String nom = local_0.getNom();
												if (local_1 == null) {
													throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Niveau::nom\'");
												}
												final /*@Thrown*/ String nom_0 = local_1.getNom();
												final /*@Thrown*/ boolean ne_1 = (nom != null) ? !nom.equals(nom_0) : (nom_0 != null);
												CAUGHT_ne_1 = ne_1;
											}
											catch (Exception e) {
												CAUGHT_ne_1 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_ne_1 == ValueUtil.FALSE_VALUE) {
												and = ValueUtil.FALSE_VALUE;
											}
											else {
												if (CAUGHT_ne_0 instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_ne_0;
												}
												if (CAUGHT_ne_1 instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_ne_1;
												}
												and = ValueUtil.TRUE_VALUE;
											}
										}
										CAUGHT_and = and;
									}
									catch (Exception e) {
										CAUGHT_and = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_and instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_and;
										}
										if (CAUGHT_and == null) {
											implies = null;
										}
										else {
											implies = ValueUtil.FALSE_VALUE;
										}
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_niveau, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MymetamodelTables.INT_0).booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.FORMATION__NIVEAU:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNiveau()).basicAdd(otherEnd, msgs);
			case MymetamodelPackage.FORMATION__RESPONSABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsable()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.FORMATION__NIVEAU:
				return ((InternalEList<?>)getNiveau()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.FORMATION__DEBOUCHE:
				return ((InternalEList<?>)getDebouche()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.FORMATION__RESPONSABLE:
				return ((InternalEList<?>)getResponsable()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.FORMATION__SPECIALITE:
				return ((InternalEList<?>)getSpecialite()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MymetamodelPackage.FORMATION__NOM:
				return getNom();
			case MymetamodelPackage.FORMATION__DESCRIPTION:
				return getDescription();
			case MymetamodelPackage.FORMATION__NIVEAU:
				return getNiveau();
			case MymetamodelPackage.FORMATION__DEBOUCHE:
				return getDebouche();
			case MymetamodelPackage.FORMATION__RESPONSABLE:
				return getResponsable();
			case MymetamodelPackage.FORMATION__SPECIALITE:
				return getSpecialite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MymetamodelPackage.FORMATION__NOM:
				setNom((String)newValue);
				return;
			case MymetamodelPackage.FORMATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MymetamodelPackage.FORMATION__NIVEAU:
				getNiveau().clear();
				getNiveau().addAll((Collection<? extends Niveau>)newValue);
				return;
			case MymetamodelPackage.FORMATION__DEBOUCHE:
				getDebouche().clear();
				getDebouche().addAll((Collection<? extends Debouche>)newValue);
				return;
			case MymetamodelPackage.FORMATION__RESPONSABLE:
				getResponsable().clear();
				getResponsable().addAll((Collection<? extends Responsable>)newValue);
				return;
			case MymetamodelPackage.FORMATION__SPECIALITE:
				getSpecialite().clear();
				getSpecialite().addAll((Collection<? extends Specialite>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MymetamodelPackage.FORMATION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MymetamodelPackage.FORMATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MymetamodelPackage.FORMATION__NIVEAU:
				getNiveau().clear();
				return;
			case MymetamodelPackage.FORMATION__DEBOUCHE:
				getDebouche().clear();
				return;
			case MymetamodelPackage.FORMATION__RESPONSABLE:
				getResponsable().clear();
				return;
			case MymetamodelPackage.FORMATION__SPECIALITE:
				getSpecialite().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MymetamodelPackage.FORMATION__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MymetamodelPackage.FORMATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MymetamodelPackage.FORMATION__NIVEAU:
				return niveau != null && !niveau.isEmpty();
			case MymetamodelPackage.FORMATION__DEBOUCHE:
				return debouche != null && !debouche.isEmpty();
			case MymetamodelPackage.FORMATION__RESPONSABLE:
				return responsable != null && !responsable.isEmpty();
			case MymetamodelPackage.FORMATION__SPECIALITE:
				return specialite != null && !specialite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MymetamodelPackage.FORMATION___NAMED__DIAGNOSTICCHAIN_MAP:
				return Named((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.FORMATION___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return nomUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.FORMATION___AU_MOINS1_NIVEAU__DIAGNOSTICCHAIN_MAP:
				return auMoins1Niveau((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.FORMATION___NIVEAU_DISTINCT__DIAGNOSTICCHAIN_MAP:
				return niveauDistinct((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FormationImpl
