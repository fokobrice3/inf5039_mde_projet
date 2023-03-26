/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mymetamodel.Formation;
import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Niveau;
import mymetamodel.Responsable;
import mymetamodel.Semestre;
import mymetamodel.Specialite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

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
 * An implementation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getFormation <em>Formation</em>}</li>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.impl.NiveauImpl#getSpecialite <em>Specialite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NiveauImpl extends MinimalEObjectImpl.Container implements Niveau {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

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
	 * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestre()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestre;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected Responsable responsable;

	/**
	 * The cached value of the '{@link #getSpecialite() <em>Specialite</em>}' reference list.
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
	protected NiveauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.NIVEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.NIVEAU__NUMERO, oldNumero, numero));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.NIVEAU__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.NIVEAU__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestre() {
		if (semestre == null) {
			semestre = new EObjectContainmentWithInverseEList<Semestre>(Semestre.class, this, MymetamodelPackage.NIVEAU__SEMESTRE, MymetamodelPackage.SEMESTRE__NIVEAU);
		}
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation getFormation() {
		if (eContainerFeatureID() != MymetamodelPackage.NIVEAU__FORMATION) return null;
		return (Formation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormation(Formation newFormation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormation, MymetamodelPackage.NIVEAU__FORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormation(Formation newFormation) {
		if (newFormation != eInternalContainer() || (eContainerFeatureID() != MymetamodelPackage.NIVEAU__FORMATION && newFormation != null)) {
			if (EcoreUtil.isAncestor(this, newFormation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormation != null)
				msgs = ((InternalEObject)newFormation).eInverseAdd(this, MymetamodelPackage.FORMATION__NIVEAU, Formation.class, msgs);
			msgs = basicSetFormation(newFormation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.NIVEAU__FORMATION, newFormation, newFormation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject)responsable;
			responsable = (Responsable)eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymetamodelPackage.NIVEAU__RESPONSABLE, oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Responsable newResponsable) {
		Responsable oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.NIVEAU__RESPONSABLE, oldResponsable, responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialite> getSpecialite() {
		if (specialite == null) {
			specialite = new EObjectResolvingEList<Specialite>(Specialite.class, this, MymetamodelPackage.NIVEAU__SPECIALITE);
		}
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean multiSpecialite(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::multiSpecialite";
		try {
			/**
			 *
			 * inv multiSpecialite:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.specialite->size() >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___MULTI_SPECIALITE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Specialite> specialite = this.getSpecialite();
				final /*@NonInvalid*/ OrderedSetValue BOXED_specialite = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Specialite, specialite);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialite);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, MymetamodelTables.INT_0).booleanValue();
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
	public boolean associeSemestre(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::associeSemestre";
		try {
			/**
			 *
			 * inv associeSemestre:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.semestre->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___ASSOCIE_SEMESTRE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Semestre> semestre = this.getSemestre();
				final /*@NonInvalid*/ OrderedSetValue BOXED_semestre = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semestre, semestre);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_semestre).booleanValue();
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
	public boolean auMoins1Responsable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::auMoins1Responsable";
		try {
			/**
			 *
			 * inv auMoins1Responsable:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.responsable->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Responsable responsable = this.getResponsable();
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MymetamodelTables.SET_CLSSid_Responsable, responsable);
					final /*@Thrown*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MymetamodelTables.INT_0).booleanValue();
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
	public boolean semestreUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::semestreUnique";
		try {
			/**
			 *
			 * inv semestreUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.semestre->forAll(s1, s2 | s1 <> s2 implies s1.numero <> s2.numero)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Semestre> semestre = this.getSemestre();
					final /*@NonInvalid*/ OrderedSetValue BOXED_semestre = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semestre, semestre);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_semestre);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * s1 <> s2 implies s1.numero <> s2.numero
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_semestre = (OrderedSetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object s1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object s2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Semestre local_0 = (Semestre)s1;
								final /*@NonInvalid*/ Semestre local_1 = (Semestre)s2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Semestre::numero\'");
										}
										final /*@Thrown*/ int numero = local_0.getNumero();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Semestre::numero\'");
										}
										final /*@Thrown*/ int numero_0 = local_1.getNumero();
										final /*@Thrown*/ boolean ne_0 = numero != numero_0;
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
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
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_semestre, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MymetamodelTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	public boolean Named(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::Named";
		try {
			/**
			 *
			 * inv Named:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.numero <> null and self.nom <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___NAMED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Boolean result;
				final /*@NonInvalid*/ String nom = this.getNom();
				final /*@NonInvalid*/ boolean ne = nom != null;
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
	public boolean associeFormation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::associeFormation";
		try {
			/**
			 *
			 * inv associeFormation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.formation->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___ASSOCIE_FORMATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Formation formation = this.getFormation();
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MymetamodelTables.SET_CLSSid_Formation, formation);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
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
	public boolean numeroSemestreUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::numeroSemestreUnique";
		try {
			/**
			 *
			 * inv numeroSemestreUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.semestre->forAll(s1, s2 | s1 <> s2 implies s1.numero <> s2.numero)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___NUMERO_SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Semestre> semestre = this.getSemestre();
					final /*@NonInvalid*/ OrderedSetValue BOXED_semestre = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semestre, semestre);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_semestre);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * s1 <> s2 implies s1.numero <> s2.numero
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_semestre = (OrderedSetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object s1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object s2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Semestre local_0 = (Semestre)s1;
								final /*@NonInvalid*/ Semestre local_1 = (Semestre)s2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Semestre::numero\'");
										}
										final /*@Thrown*/ int numero = local_0.getNumero();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'mymetamodel1\'::Semestre::numero\'");
										}
										final /*@Thrown*/ int numero_0 = local_1.getNumero();
										final /*@Thrown*/ boolean ne_0 = numero != numero_0;
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
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
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_semestre, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MymetamodelTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	public boolean NotSpecialityWthDiffLevelWthSameName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::NotSpecialityWthDiffLevelWthSameName";
		try {
			/**
			 *
			 * inv NotSpecialityWthDiffLevelWthSameName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self->select(n | n.formation = self.formation)
			 *         ->select(n | n <> self)
			 *         ->forAll(n | n.specialite->select(s | s.nom = self.nom)->size() = 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.NIVEAU___NOT_SPECIALITY_WTH_DIFF_LEVEL_WTH_SAME_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MymetamodelTables.SET_CLSSid_Niveau, this);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(MymetamodelTables.SET_CLSSid_Niveau);
				Iterator<Object> ITERATOR_n = oclAsSet.iterator();
				/*@NonInvalid*/ SetValue select_0;
				while (true) {
					if (!ITERATOR_n.hasNext()) {
						select_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Niveau n = (Niveau)ITERATOR_n.next();
					/**
					 * n.formation = self.formation
					 */
					final /*@NonInvalid*/ Formation formation = n.getFormation();
					final /*@NonInvalid*/ Formation formation_0 = this.getFormation();
					final /*@NonInvalid*/ boolean eq = formation.equals(formation_0);
					//
					if (eq) {
						accumulator.add(n);
					}
				}
				/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSetAccumulatorValue(MymetamodelTables.SET_CLSSid_Niveau);
				Iterator<Object> ITERATOR_n_0 = select_0.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR_n_0.hasNext()) {
						select = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Niveau n_0 = (Niveau)ITERATOR_n_0.next();
					/**
					 * n <> self
					 */
					final /*@NonInvalid*/ boolean ne = !n_0.equals(this);
					//
					if (ne) {
						accumulator_0.add(n_0);
					}
				}
				/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_n_1 = select.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_n_1.hasNext()) {
						if (accumulator_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_1;
						}
						break;
					}
					/*@NonInvalid*/ Niveau n_1 = (Niveau)ITERATOR_n_1.next();
					/**
					 * n.specialite->select(s | s.nom = self.nom)->size() = 0
					 */
					final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
					final /*@NonInvalid*/ List<Specialite> specialite = n_1.getSpecialite();
					final /*@NonInvalid*/ OrderedSetValue BOXED_specialite = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Specialite, specialite);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_2 = ValueUtil.createOrderedSetAccumulatorValue(MymetamodelTables.ORD_CLSSid_Specialite);
					Iterator<Object> ITERATOR_s = BOXED_specialite.iterator();
					/*@NonInvalid*/ OrderedSetValue select_1;
					while (true) {
						if (!ITERATOR_s.hasNext()) {
							select_1 = accumulator_2;
							break;
						}
						/*@NonInvalid*/ Specialite s = (Specialite)ITERATOR_s.next();
						/**
						 * s.nom = self.nom
						 */
						final /*@NonInvalid*/ String nom = s.getNom();
						final /*@NonInvalid*/ String nom_0 = this.getNom();
						final /*@NonInvalid*/ boolean eq_0 = nom.equals(nom_0);
						//
						if (eq_0) {
							accumulator_2.add(s);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select_1);
					final /*@NonInvalid*/ boolean eq_1 = size.equals(MymetamodelTables.INT_0);
					//
					if (!eq_1) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (eq_1) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.NIVEAU__SEMESTRE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemestre()).basicAdd(otherEnd, msgs);
			case MymetamodelPackage.NIVEAU__FORMATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormation((Formation)otherEnd, msgs);
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
			case MymetamodelPackage.NIVEAU__SEMESTRE:
				return ((InternalEList<?>)getSemestre()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.NIVEAU__FORMATION:
				return basicSetFormation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MymetamodelPackage.NIVEAU__FORMATION:
				return eInternalContainer().eInverseRemove(this, MymetamodelPackage.FORMATION__NIVEAU, Formation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MymetamodelPackage.NIVEAU__NUMERO:
				return getNumero();
			case MymetamodelPackage.NIVEAU__NOM:
				return getNom();
			case MymetamodelPackage.NIVEAU__DESCRIPTION:
				return getDescription();
			case MymetamodelPackage.NIVEAU__SEMESTRE:
				return getSemestre();
			case MymetamodelPackage.NIVEAU__FORMATION:
				return getFormation();
			case MymetamodelPackage.NIVEAU__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
			case MymetamodelPackage.NIVEAU__SPECIALITE:
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
			case MymetamodelPackage.NIVEAU__NUMERO:
				setNumero((Integer)newValue);
				return;
			case MymetamodelPackage.NIVEAU__NOM:
				setNom((String)newValue);
				return;
			case MymetamodelPackage.NIVEAU__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MymetamodelPackage.NIVEAU__SEMESTRE:
				getSemestre().clear();
				getSemestre().addAll((Collection<? extends Semestre>)newValue);
				return;
			case MymetamodelPackage.NIVEAU__FORMATION:
				setFormation((Formation)newValue);
				return;
			case MymetamodelPackage.NIVEAU__RESPONSABLE:
				setResponsable((Responsable)newValue);
				return;
			case MymetamodelPackage.NIVEAU__SPECIALITE:
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
			case MymetamodelPackage.NIVEAU__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case MymetamodelPackage.NIVEAU__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MymetamodelPackage.NIVEAU__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MymetamodelPackage.NIVEAU__SEMESTRE:
				getSemestre().clear();
				return;
			case MymetamodelPackage.NIVEAU__FORMATION:
				setFormation((Formation)null);
				return;
			case MymetamodelPackage.NIVEAU__RESPONSABLE:
				setResponsable((Responsable)null);
				return;
			case MymetamodelPackage.NIVEAU__SPECIALITE:
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
			case MymetamodelPackage.NIVEAU__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case MymetamodelPackage.NIVEAU__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MymetamodelPackage.NIVEAU__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MymetamodelPackage.NIVEAU__SEMESTRE:
				return semestre != null && !semestre.isEmpty();
			case MymetamodelPackage.NIVEAU__FORMATION:
				return getFormation() != null;
			case MymetamodelPackage.NIVEAU__RESPONSABLE:
				return responsable != null;
			case MymetamodelPackage.NIVEAU__SPECIALITE:
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
			case MymetamodelPackage.NIVEAU___MULTI_SPECIALITE__DIAGNOSTICCHAIN_MAP:
				return multiSpecialite((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___ASSOCIE_SEMESTRE__DIAGNOSTICCHAIN_MAP:
				return associeSemestre((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP:
				return auMoins1Responsable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return semestreUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___NAMED__DIAGNOSTICCHAIN_MAP:
				return Named((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___ASSOCIE_FORMATION__DIAGNOSTICCHAIN_MAP:
				return associeFormation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___NUMERO_SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return numeroSemestreUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.NIVEAU___NOT_SPECIALITY_WTH_DIFF_LEVEL_WTH_SAME_NAME__DIAGNOSTICCHAIN_MAP:
				return NotSpecialityWthDiffLevelWthSameName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NiveauImpl
