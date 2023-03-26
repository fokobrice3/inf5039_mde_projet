/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Programmation;
import mymetamodel.Responsable;
import mymetamodel.Ressource;
import mymetamodel.Semainier;
import mymetamodel.Semestre;
import mymetamodel.Specialite;
import mymetamodel.UE;
import mymetamodel.prerequis;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.UEImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getCode <em>Code</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getPrerequis <em>Prerequis</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getSemainier <em>Semainier</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getProgrammation <em>Programmation</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getSpecialite <em>Specialite</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#isIsOptionel <em>Is Optionel</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.impl.UEImpl#getSemestre <em>Semestre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UEImpl extends MinimalEObjectImpl.Container implements UE {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected int credit = CREDIT_EDEFAULT;

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
	 * The default value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected String objectif = OBJECTIF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrerequis() <em>Prerequis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequis()
	 * @generated
	 * @ordered
	 */
	protected EList<prerequis> prerequis;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressource;

	/**
	 * The cached value of the '{@link #getSemainier() <em>Semainier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemainier()
	 * @generated
	 * @ordered
	 */
	protected EList<Semainier> semainier;

	/**
	 * The cached value of the '{@link #getProgrammation() <em>Programmation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammation()
	 * @generated
	 * @ordered
	 */
	protected EList<Programmation> programmation;

	/**
	 * The cached value of the '{@link #getSpecialite() <em>Specialite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialite()
	 * @generated
	 * @ordered
	 */
	protected Specialite specialite;

	/**
	 * The default value of the '{@link #isIsOptionel() <em>Is Optionel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptionel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptionel() <em>Is Optionel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptionel()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptionel = IS_OPTIONEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.UE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(int newCredit) {
		int oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__CREDIT, oldCredit, credit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectif() {
		return objectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectif(String newObjectif) {
		String oldObjectif = objectif;
		objectif = newObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__OBJECTIF, oldObjectif, objectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<prerequis> getPrerequis() {
		if (prerequis == null) {
			prerequis = new EObjectContainmentEList<prerequis>(prerequis.class, this, MymetamodelPackage.UE__PREREQUIS);
		}
		return prerequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessource() {
		if (ressource == null) {
			ressource = new EObjectContainmentWithInverseEList<Ressource>(Ressource.class, this, MymetamodelPackage.UE__RESSOURCE, MymetamodelPackage.RESSOURCE__UE);
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semainier> getSemainier() {
		if (semainier == null) {
			semainier = new EObjectResolvingEList<Semainier>(Semainier.class, this, MymetamodelPackage.UE__SEMAINIER);
		}
		return semainier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programmation> getProgrammation() {
		if (programmation == null) {
			programmation = new EObjectResolvingEList<Programmation>(Programmation.class, this, MymetamodelPackage.UE__PROGRAMMATION);
		}
		return programmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialite getSpecialite() {
		if (specialite != null && specialite.eIsProxy()) {
			InternalEObject oldSpecialite = (InternalEObject)specialite;
			specialite = (Specialite)eResolveProxy(oldSpecialite);
			if (specialite != oldSpecialite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymetamodelPackage.UE__SPECIALITE, oldSpecialite, specialite));
			}
		}
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialite basicGetSpecialite() {
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialite(Specialite newSpecialite) {
		Specialite oldSpecialite = specialite;
		specialite = newSpecialite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__SPECIALITE, oldSpecialite, specialite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptionel() {
		return isOptionel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptionel(boolean newIsOptionel) {
		boolean oldIsOptionel = isOptionel;
		isOptionel = newIsOptionel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__IS_OPTIONEL, oldIsOptionel, isOptionel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsable> getResponsable() {
		if (responsable == null) {
			responsable = new EObjectResolvingEList<Responsable>(Responsable.class, this, MymetamodelPackage.UE__RESPONSABLE);
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre getSemestre() {
		if (eContainerFeatureID() != MymetamodelPackage.UE__SEMESTRE) return null;
		return (Semestre)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemestre(Semestre newSemestre, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemestre, MymetamodelPackage.UE__SEMESTRE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemestre(Semestre newSemestre) {
		if (newSemestre != eInternalContainer() || (eContainerFeatureID() != MymetamodelPackage.UE__SEMESTRE && newSemestre != null)) {
			if (EcoreUtil.isAncestor(this, newSemestre))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemestre != null)
				msgs = ((InternalEObject)newSemestre).eInverseAdd(this, MymetamodelPackage.SEMESTRE__UE, Semestre.class, msgs);
			msgs = basicSetSemestre(newSemestre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.UE__SEMESTRE, newSemestre, newSemestre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean plusieursRessources(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "UE::plusieursRessources";
		try {
			/**
			 *
			 * inv plusieursRessources:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.ressource->size() >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.UE___PLUSIEURS_RESSOURCES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Ressource> ressource = this.getRessource();
				final /*@NonInvalid*/ OrderedSetValue BOXED_ressource = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Ressource, ressource);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_ressource);
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
	public boolean EnseignantsValides(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "UE::EnseignantsValides";
		try {
			/**
			 *
			 * inv EnseignantsValides:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.programmation->forAll(p |
			 *           self.responsable->includes(p.responsable))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.UE___ENSEIGNANTS_VALIDES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Programmation> programmation = this.getProgrammation();
					final /*@NonInvalid*/ OrderedSetValue BOXED_programmation = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Programmation, programmation);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_programmation.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Programmation p = (Programmation)ITERATOR_p.next();
						/**
						 * self.responsable->includes(p.responsable)
						 */
						/*@Caught*/ Object CAUGHT_includes;
						try {
							final /*@NonInvalid*/ List<Responsable> responsable = this.getResponsable();
							final /*@NonInvalid*/ OrderedSetValue BOXED_responsable = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Responsable, responsable);
							final /*@NonInvalid*/ Responsable responsable_0 = p.getResponsable();
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_responsable, responsable_0).booleanValue();
							CAUGHT_includes = includes;
						}
						catch (Exception e) {
							CAUGHT_includes = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_includes == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_includes == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_includes instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_includes;									// Cache an exception failure
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
	public boolean auMoins1Responsable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "UE::auMoins1Responsable";
		try {
			/**
			 *
			 * inv auMoins1Responsable:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.responsable->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.UE___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Responsable> responsable = this.getResponsable();
				final /*@NonInvalid*/ OrderedSetValue BOXED_responsable = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Responsable, responsable);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_responsable);
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
	public boolean dans1SeulSemestre(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "UE::dans1SeulSemestre";
		try {
			/**
			 *
			 * inv dans1SeulSemestre:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.responsable->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.UE___DANS1_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Responsable> responsable = this.getResponsable();
				final /*@NonInvalid*/ OrderedSetValue BOXED_responsable = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Responsable, responsable);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_responsable);
				final /*@NonInvalid*/ boolean result = size.equals(MymetamodelTables.INT_1);
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
	public boolean semanierValide(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "UE::semanierValide";
		try {
			/**
			 *
			 * inv semanierValide:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.semainier->forAll(sem |
			 *           self.semestre.semainier->includes(sem))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.UE___SEMANIER_VALIDE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Semainier> semainier = this.getSemainier();
				final /*@NonInvalid*/ OrderedSetValue BOXED_semainier = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semainier, semainier);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_sem = BOXED_semainier.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_sem.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Semainier sem = (Semainier)ITERATOR_sem.next();
					/**
					 * self.semestre.semainier->includes(sem)
					 */
					final /*@NonInvalid*/ Semestre semestre = this.getSemestre();
					final /*@NonInvalid*/ List<Semainier> semainier_0 = semestre.getSemainier();
					final /*@NonInvalid*/ OrderedSetValue BOXED_semainier_0 = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_Semainier, semainier_0);
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_semainier_0, sem).booleanValue();
					//
					if (!includes) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (includes) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	public boolean Named(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "UE::Named";
		try {
			/**
			 *
			 * inv Named:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.nom <> null and self.description <> null and self.isOptionel <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.UE___NAMED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Boolean and;
					final /*@NonInvalid*/ String description = this.getDescription();
					final /*@NonInvalid*/ boolean ne = description != null;
					and = ne;
					final /*@Thrown*/ Boolean result;
					if (and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = (Boolean)and;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.UE__RESSOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRessource()).basicAdd(otherEnd, msgs);
			case MymetamodelPackage.UE__SEMESTRE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemestre((Semestre)otherEnd, msgs);
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
			case MymetamodelPackage.UE__PREREQUIS:
				return ((InternalEList<?>)getPrerequis()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.UE__RESSOURCE:
				return ((InternalEList<?>)getRessource()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.UE__SEMESTRE:
				return basicSetSemestre(null, msgs);
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
			case MymetamodelPackage.UE__SEMESTRE:
				return eInternalContainer().eInverseRemove(this, MymetamodelPackage.SEMESTRE__UE, Semestre.class, msgs);
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
			case MymetamodelPackage.UE__NOM:
				return getNom();
			case MymetamodelPackage.UE__CODE:
				return getCode();
			case MymetamodelPackage.UE__CREDIT:
				return getCredit();
			case MymetamodelPackage.UE__DESCRIPTION:
				return getDescription();
			case MymetamodelPackage.UE__OBJECTIF:
				return getObjectif();
			case MymetamodelPackage.UE__PREREQUIS:
				return getPrerequis();
			case MymetamodelPackage.UE__RESSOURCE:
				return getRessource();
			case MymetamodelPackage.UE__SEMAINIER:
				return getSemainier();
			case MymetamodelPackage.UE__PROGRAMMATION:
				return getProgrammation();
			case MymetamodelPackage.UE__SPECIALITE:
				if (resolve) return getSpecialite();
				return basicGetSpecialite();
			case MymetamodelPackage.UE__IS_OPTIONEL:
				return isIsOptionel();
			case MymetamodelPackage.UE__RESPONSABLE:
				return getResponsable();
			case MymetamodelPackage.UE__SEMESTRE:
				return getSemestre();
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
			case MymetamodelPackage.UE__NOM:
				setNom((String)newValue);
				return;
			case MymetamodelPackage.UE__CODE:
				setCode((String)newValue);
				return;
			case MymetamodelPackage.UE__CREDIT:
				setCredit((Integer)newValue);
				return;
			case MymetamodelPackage.UE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MymetamodelPackage.UE__OBJECTIF:
				setObjectif((String)newValue);
				return;
			case MymetamodelPackage.UE__PREREQUIS:
				getPrerequis().clear();
				getPrerequis().addAll((Collection<? extends prerequis>)newValue);
				return;
			case MymetamodelPackage.UE__RESSOURCE:
				getRessource().clear();
				getRessource().addAll((Collection<? extends Ressource>)newValue);
				return;
			case MymetamodelPackage.UE__SEMAINIER:
				getSemainier().clear();
				getSemainier().addAll((Collection<? extends Semainier>)newValue);
				return;
			case MymetamodelPackage.UE__PROGRAMMATION:
				getProgrammation().clear();
				getProgrammation().addAll((Collection<? extends Programmation>)newValue);
				return;
			case MymetamodelPackage.UE__SPECIALITE:
				setSpecialite((Specialite)newValue);
				return;
			case MymetamodelPackage.UE__IS_OPTIONEL:
				setIsOptionel((Boolean)newValue);
				return;
			case MymetamodelPackage.UE__RESPONSABLE:
				getResponsable().clear();
				getResponsable().addAll((Collection<? extends Responsable>)newValue);
				return;
			case MymetamodelPackage.UE__SEMESTRE:
				setSemestre((Semestre)newValue);
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
			case MymetamodelPackage.UE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MymetamodelPackage.UE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case MymetamodelPackage.UE__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case MymetamodelPackage.UE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MymetamodelPackage.UE__OBJECTIF:
				setObjectif(OBJECTIF_EDEFAULT);
				return;
			case MymetamodelPackage.UE__PREREQUIS:
				getPrerequis().clear();
				return;
			case MymetamodelPackage.UE__RESSOURCE:
				getRessource().clear();
				return;
			case MymetamodelPackage.UE__SEMAINIER:
				getSemainier().clear();
				return;
			case MymetamodelPackage.UE__PROGRAMMATION:
				getProgrammation().clear();
				return;
			case MymetamodelPackage.UE__SPECIALITE:
				setSpecialite((Specialite)null);
				return;
			case MymetamodelPackage.UE__IS_OPTIONEL:
				setIsOptionel(IS_OPTIONEL_EDEFAULT);
				return;
			case MymetamodelPackage.UE__RESPONSABLE:
				getResponsable().clear();
				return;
			case MymetamodelPackage.UE__SEMESTRE:
				setSemestre((Semestre)null);
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
			case MymetamodelPackage.UE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MymetamodelPackage.UE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case MymetamodelPackage.UE__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case MymetamodelPackage.UE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MymetamodelPackage.UE__OBJECTIF:
				return OBJECTIF_EDEFAULT == null ? objectif != null : !OBJECTIF_EDEFAULT.equals(objectif);
			case MymetamodelPackage.UE__PREREQUIS:
				return prerequis != null && !prerequis.isEmpty();
			case MymetamodelPackage.UE__RESSOURCE:
				return ressource != null && !ressource.isEmpty();
			case MymetamodelPackage.UE__SEMAINIER:
				return semainier != null && !semainier.isEmpty();
			case MymetamodelPackage.UE__PROGRAMMATION:
				return programmation != null && !programmation.isEmpty();
			case MymetamodelPackage.UE__SPECIALITE:
				return specialite != null;
			case MymetamodelPackage.UE__IS_OPTIONEL:
				return isOptionel != IS_OPTIONEL_EDEFAULT;
			case MymetamodelPackage.UE__RESPONSABLE:
				return responsable != null && !responsable.isEmpty();
			case MymetamodelPackage.UE__SEMESTRE:
				return getSemestre() != null;
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
			case MymetamodelPackage.UE___PLUSIEURS_RESSOURCES__DIAGNOSTICCHAIN_MAP:
				return plusieursRessources((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.UE___ENSEIGNANTS_VALIDES__DIAGNOSTICCHAIN_MAP:
				return EnseignantsValides((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.UE___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP:
				return auMoins1Responsable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.UE___DANS1_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP:
				return dans1SeulSemestre((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.UE___SEMANIER_VALIDE__DIAGNOSTICCHAIN_MAP:
				return semanierValide((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.UE___NAMED__DIAGNOSTICCHAIN_MAP:
				return Named((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", code: ");
		result.append(code);
		result.append(", credit: ");
		result.append(credit);
		result.append(", description: ");
		result.append(description);
		result.append(", objectif: ");
		result.append(objectif);
		result.append(", isOptionel: ");
		result.append(isOptionel);
		result.append(')');
		return result.toString();
	}

} //UEImpl
