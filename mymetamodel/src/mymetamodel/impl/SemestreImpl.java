/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Niveau;
import mymetamodel.Semainier;
import mymetamodel.Semestre;
import mymetamodel.UE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getSemainier <em>Semainier</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getNbSemaine <em>Nb Semaine</em>}</li>
 *   <li>{@link mymetamodel.impl.SemestreImpl#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestreImpl extends MinimalEObjectImpl.Container implements Semestre {
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
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected Date dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected Date dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemainier() <em>Semainier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemainier()
	 * @generated
	 * @ordered
	 */
	protected EList<Semainier> semainier;

	/**
	 * The default value of the '{@link #getNbSemaine() <em>Nb Semaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSemaine()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_SEMAINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbSemaine() <em>Nb Semaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSemaine()
	 * @generated
	 * @ordered
	 */
	protected int nbSemaine = NB_SEMAINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUe() <em>Ue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUe()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.SEMESTRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMESTRE__NUMERO, oldNumero, numero));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMESTRE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau getNiveau() {
		if (eContainerFeatureID() != MymetamodelPackage.SEMESTRE__NIVEAU) return null;
		return (Niveau)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNiveau(Niveau newNiveau, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNiveau, MymetamodelPackage.SEMESTRE__NIVEAU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(Niveau newNiveau) {
		if (newNiveau != eInternalContainer() || (eContainerFeatureID() != MymetamodelPackage.SEMESTRE__NIVEAU && newNiveau != null)) {
			if (EcoreUtil.isAncestor(this, newNiveau))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNiveau != null)
				msgs = ((InternalEObject)newNiveau).eInverseAdd(this, MymetamodelPackage.NIVEAU__SEMESTRE, Niveau.class, msgs);
			msgs = basicSetNiveau(newNiveau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMESTRE__NIVEAU, newNiveau, newNiveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(Date newDateDebut) {
		Date oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMESTRE__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(Date newDateFin) {
		Date oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMESTRE__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semainier> getSemainier() {
		if (semainier == null) {
			semainier = new EObjectContainmentWithInverseEList<Semainier>(Semainier.class, this, MymetamodelPackage.SEMESTRE__SEMAINIER, MymetamodelPackage.SEMAINIER__SEMESTRE);
		}
		return semainier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbSemaine() {
		return nbSemaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbSemaine(int newNbSemaine) {
		int oldNbSemaine = nbSemaine;
		nbSemaine = newNbSemaine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMESTRE__NB_SEMAINE, oldNbSemaine, nbSemaine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUe() {
		if (ue == null) {
			ue = new EObjectContainmentWithInverseEList<UE>(UE.class, this, MymetamodelPackage.SEMESTRE__UE, MymetamodelPackage.UE__SEMESTRE);
		}
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numeroUniqueParNiveau(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semestre::numeroUniqueParNiveau";
		try {
			/**
			 *
			 * inv numeroUniqueParNiveau:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.niveau.semestre->forAll(s | s <> self implies s.numero <> self.numero)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMESTRE___NUMERO_UNIQUE_PAR_NIVEAU__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Niveau niveau = this.getNiveau();
					final /*@NonInvalid*/ List<Semestre> semestre = niveau.getSemestre();
					final /*@NonInvalid*/ OrderedSetValue BOXED_semestre = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semestre, semestre);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_s = BOXED_semestre.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_s.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Semestre s = (Semestre)ITERATOR_s.next();
						/**
						 * s <> self implies s.numero <> self.numero
						 */
						final /*@NonInvalid*/ boolean ne = !s.equals(this);
						final /*@NonInvalid*/ Boolean implies;
						if (!ne) {
							implies = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ int numero = s.getNumero();
							final /*@NonInvalid*/ int numero_0 = this.getNumero();
							final /*@NonInvalid*/ boolean ne_0 = numero != numero_0;
							if (ne_0) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								implies = ValueUtil.FALSE_VALUE;
							}
						}
						//
						if (implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
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
	public boolean nombreSemaine(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semestre::nombreSemaine";
		try {
			/**
			 *
			 * inv nombreSemaine:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.nbSemaine >= 1 and self.nbSemaine <= 24
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMESTRE___NOMBRE_SEMAINE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int nbSemaine_0 = this.getNbSemaine();
				final /*@NonInvalid*/ IntegerValue BOXED_nbSemaine_0 = ValueUtil.integerValueOf(nbSemaine_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nbSemaine_0, MymetamodelTables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nbSemaine_0, MymetamodelTables.INT_24).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
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
	public boolean AssocieNiveau(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semestre::AssocieNiveau";
		try {
			/**
			 *
			 * inv AssocieNiveau:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.niveau <> null and
			 *         self.niveau->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMESTRE___ASSOCIE_NIVEAU__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Boolean result;
				final /*@NonInvalid*/ Niveau niveau = this.getNiveau();
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MymetamodelTables.SET_CLSSid_Niveau, niveau);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
				final /*@NonInvalid*/ boolean eq = size.equals(MymetamodelTables.INT_1);
				result = eq;
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
	public boolean Named(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semestre::Named";
		try {
			/**
			 *
			 * inv Named:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.numero <> null and self.description <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMESTRE___NAMED__DIAGNOSTICCHAIN_MAP);
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
	public boolean auMoins1Ue(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semestre::auMoins1Ue";
		try {
			/**
			 *
			 * inv auMoins1Ue:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.ue->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMESTRE___AU_MOINS1_UE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<UE> ue = this.getUe();
				final /*@NonInvalid*/ OrderedSetValue BOXED_ue = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_UE, ue);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_ue);
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
	public boolean NombreSeancesValide(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semestre::NombreSeancesValide";
		try {
			/**
			 *
			 * inv NombreSeancesValide:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.semainier->size() <= self.nbSemaine
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMESTRE___NOMBRE_SEANCES_VALIDE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Semainier> semainier = this.getSemainier();
				final /*@NonInvalid*/ OrderedSetValue BOXED_semainier = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semainier, semainier);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_semainier);
				final /*@NonInvalid*/ int nbSemaine = this.getNbSemaine();
				final /*@NonInvalid*/ IntegerValue BOXED_nbSemaine = ValueUtil.integerValueOf(nbSemaine);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, BOXED_nbSemaine).booleanValue();
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
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNiveau((Niveau)otherEnd, msgs);
			case MymetamodelPackage.SEMESTRE__SEMAINIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemainier()).basicAdd(otherEnd, msgs);
			case MymetamodelPackage.SEMESTRE__UE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUe()).basicAdd(otherEnd, msgs);
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
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				return basicSetNiveau(null, msgs);
			case MymetamodelPackage.SEMESTRE__SEMAINIER:
				return ((InternalEList<?>)getSemainier()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.SEMESTRE__UE:
				return ((InternalEList<?>)getUe()).basicRemove(otherEnd, msgs);
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
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				return eInternalContainer().eInverseRemove(this, MymetamodelPackage.NIVEAU__SEMESTRE, Niveau.class, msgs);
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
			case MymetamodelPackage.SEMESTRE__NUMERO:
				return getNumero();
			case MymetamodelPackage.SEMESTRE__DESCRIPTION:
				return getDescription();
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				return getNiveau();
			case MymetamodelPackage.SEMESTRE__DATE_DEBUT:
				return getDateDebut();
			case MymetamodelPackage.SEMESTRE__DATE_FIN:
				return getDateFin();
			case MymetamodelPackage.SEMESTRE__SEMAINIER:
				return getSemainier();
			case MymetamodelPackage.SEMESTRE__NB_SEMAINE:
				return getNbSemaine();
			case MymetamodelPackage.SEMESTRE__UE:
				return getUe();
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
			case MymetamodelPackage.SEMESTRE__NUMERO:
				setNumero((Integer)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				setNiveau((Niveau)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__DATE_DEBUT:
				setDateDebut((Date)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__DATE_FIN:
				setDateFin((Date)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__SEMAINIER:
				getSemainier().clear();
				getSemainier().addAll((Collection<? extends Semainier>)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__NB_SEMAINE:
				setNbSemaine((Integer)newValue);
				return;
			case MymetamodelPackage.SEMESTRE__UE:
				getUe().clear();
				getUe().addAll((Collection<? extends UE>)newValue);
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
			case MymetamodelPackage.SEMESTRE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case MymetamodelPackage.SEMESTRE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				setNiveau((Niveau)null);
				return;
			case MymetamodelPackage.SEMESTRE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case MymetamodelPackage.SEMESTRE__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case MymetamodelPackage.SEMESTRE__SEMAINIER:
				getSemainier().clear();
				return;
			case MymetamodelPackage.SEMESTRE__NB_SEMAINE:
				setNbSemaine(NB_SEMAINE_EDEFAULT);
				return;
			case MymetamodelPackage.SEMESTRE__UE:
				getUe().clear();
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
			case MymetamodelPackage.SEMESTRE__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case MymetamodelPackage.SEMESTRE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MymetamodelPackage.SEMESTRE__NIVEAU:
				return getNiveau() != null;
			case MymetamodelPackage.SEMESTRE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case MymetamodelPackage.SEMESTRE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case MymetamodelPackage.SEMESTRE__SEMAINIER:
				return semainier != null && !semainier.isEmpty();
			case MymetamodelPackage.SEMESTRE__NB_SEMAINE:
				return nbSemaine != NB_SEMAINE_EDEFAULT;
			case MymetamodelPackage.SEMESTRE__UE:
				return ue != null && !ue.isEmpty();
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
			case MymetamodelPackage.SEMESTRE___NUMERO_UNIQUE_PAR_NIVEAU__DIAGNOSTICCHAIN_MAP:
				return numeroUniqueParNiveau((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMESTRE___NOMBRE_SEMAINE__DIAGNOSTICCHAIN_MAP:
				return nombreSemaine((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMESTRE___ASSOCIE_NIVEAU__DIAGNOSTICCHAIN_MAP:
				return AssocieNiveau((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMESTRE___NAMED__DIAGNOSTICCHAIN_MAP:
				return Named((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMESTRE___AU_MOINS1_UE__DIAGNOSTICCHAIN_MAP:
				return auMoins1Ue((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMESTRE___NOMBRE_SEANCES_VALIDE__DIAGNOSTICCHAIN_MAP:
				return NombreSeancesValide((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", description: ");
		result.append(description);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", nbSemaine: ");
		result.append(nbSemaine);
		result.append(')');
		return result.toString();
	}

} //SemestreImpl
