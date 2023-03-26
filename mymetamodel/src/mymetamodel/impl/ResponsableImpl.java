/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mymetamodel.Formation;
import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Niveau;
import mymetamodel.Responsable;
import mymetamodel.SEXE;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

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
 * An implementation of the model object '<em><b>Responsable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getSexe <em>Sexe</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getDateNaissance <em>Date Naissance</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getFormation <em>Formation</em>}</li>
 *   <li>{@link mymetamodel.impl.ResponsableImpl#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsableImpl extends MinimalEObjectImpl.Container implements Responsable {
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
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final int TELEPHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected int telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected static final SEXE SEXE_EDEFAULT = SEXE.HOMME;

	/**
	 * The cached value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected SEXE sexe = SEXE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected String fonction = FONCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateNaissance() <em>Date Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNaissance()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_NAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateNaissance() <em>Date Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNaissance()
	 * @generated
	 * @ordered
	 */
	protected Date dateNaissance = DATE_NAISSANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormation() <em>Formation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormation()
	 * @generated
	 * @ordered
	 */
	protected EList<Formation> formation;

	/**
	 * The cached value of the '{@link #getUe() <em>Ue</em>}' reference list.
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
	protected ResponsableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.RESPONSABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.RESPONSABLE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(int newTelephone) {
		int oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.RESPONSABLE__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEXE getSexe() {
		return sexe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSexe(SEXE newSexe) {
		SEXE oldSexe = sexe;
		sexe = newSexe == null ? SEXE_EDEFAULT : newSexe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.RESPONSABLE__SEXE, oldSexe, sexe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(String newFonction) {
		String oldFonction = fonction;
		fonction = newFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.RESPONSABLE__FONCTION, oldFonction, fonction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateNaissance(Date newDateNaissance) {
		Date oldDateNaissance = dateNaissance;
		dateNaissance = newDateNaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.RESPONSABLE__DATE_NAISSANCE, oldDateNaissance, dateNaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.RESPONSABLE__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formation> getFormation() {
		if (formation == null) {
			formation = new EObjectWithInverseResolvingEList.ManyInverse<Formation>(Formation.class, this, MymetamodelPackage.RESPONSABLE__FORMATION, MymetamodelPackage.FORMATION__RESPONSABLE);
		}
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUe() {
		if (ue == null) {
			ue = new EObjectResolvingEList<UE>(UE.class, this, MymetamodelPackage.RESPONSABLE__UE);
		}
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UesDansFormationsOuIntervient(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Responsable::UesDansFormationsOuIntervient";
		try {
			/**
			 *
			 * inv UesDansFormationsOuIntervient:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.ue->forAll(u |
			 *           self.formation->includes(u.semestre.niveau.formation))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.RESPONSABLE___UES_DANS_FORMATIONS_OU_INTERVIENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<UE> ue = this.getUe();
				final /*@NonInvalid*/ OrderedSetValue BOXED_ue = idResolver.createOrderedSetOfAll(MymetamodelTables.ORD_CLSSid_UE, ue);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_u = BOXED_ue.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_u.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ UE u = (UE)ITERATOR_u.next();
					/**
					 * self.formation->includes(u.semestre.niveau.formation)
					 */
					final /*@NonInvalid*/ List<Formation> formation = this.getFormation();
					final /*@NonInvalid*/ SetValue BOXED_formation = idResolver.createSetOfAll(MymetamodelTables.SET_CLSSid_Formation, formation);
					final /*@NonInvalid*/ Semestre semestre = u.getSemestre();
					final /*@NonInvalid*/ Niveau niveau = semestre.getNiveau();
					final /*@NonInvalid*/ Formation formation_0 = niveau.getFormation();
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_formation, formation_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.RESPONSABLE__FORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormation()).basicAdd(otherEnd, msgs);
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
			case MymetamodelPackage.RESPONSABLE__FORMATION:
				return ((InternalEList<?>)getFormation()).basicRemove(otherEnd, msgs);
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
			case MymetamodelPackage.RESPONSABLE__NOM:
				return getNom();
			case MymetamodelPackage.RESPONSABLE__TELEPHONE:
				return getTelephone();
			case MymetamodelPackage.RESPONSABLE__SEXE:
				return getSexe();
			case MymetamodelPackage.RESPONSABLE__FONCTION:
				return getFonction();
			case MymetamodelPackage.RESPONSABLE__DATE_NAISSANCE:
				return getDateNaissance();
			case MymetamodelPackage.RESPONSABLE__MAIL:
				return getMail();
			case MymetamodelPackage.RESPONSABLE__FORMATION:
				return getFormation();
			case MymetamodelPackage.RESPONSABLE__UE:
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
			case MymetamodelPackage.RESPONSABLE__NOM:
				setNom((String)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__TELEPHONE:
				setTelephone((Integer)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__SEXE:
				setSexe((SEXE)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__FONCTION:
				setFonction((String)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__DATE_NAISSANCE:
				setDateNaissance((Date)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__MAIL:
				setMail((String)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__FORMATION:
				getFormation().clear();
				getFormation().addAll((Collection<? extends Formation>)newValue);
				return;
			case MymetamodelPackage.RESPONSABLE__UE:
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
			case MymetamodelPackage.RESPONSABLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MymetamodelPackage.RESPONSABLE__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case MymetamodelPackage.RESPONSABLE__SEXE:
				setSexe(SEXE_EDEFAULT);
				return;
			case MymetamodelPackage.RESPONSABLE__FONCTION:
				setFonction(FONCTION_EDEFAULT);
				return;
			case MymetamodelPackage.RESPONSABLE__DATE_NAISSANCE:
				setDateNaissance(DATE_NAISSANCE_EDEFAULT);
				return;
			case MymetamodelPackage.RESPONSABLE__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case MymetamodelPackage.RESPONSABLE__FORMATION:
				getFormation().clear();
				return;
			case MymetamodelPackage.RESPONSABLE__UE:
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
			case MymetamodelPackage.RESPONSABLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MymetamodelPackage.RESPONSABLE__TELEPHONE:
				return telephone != TELEPHONE_EDEFAULT;
			case MymetamodelPackage.RESPONSABLE__SEXE:
				return sexe != SEXE_EDEFAULT;
			case MymetamodelPackage.RESPONSABLE__FONCTION:
				return FONCTION_EDEFAULT == null ? fonction != null : !FONCTION_EDEFAULT.equals(fonction);
			case MymetamodelPackage.RESPONSABLE__DATE_NAISSANCE:
				return DATE_NAISSANCE_EDEFAULT == null ? dateNaissance != null : !DATE_NAISSANCE_EDEFAULT.equals(dateNaissance);
			case MymetamodelPackage.RESPONSABLE__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case MymetamodelPackage.RESPONSABLE__FORMATION:
				return formation != null && !formation.isEmpty();
			case MymetamodelPackage.RESPONSABLE__UE:
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
			case MymetamodelPackage.RESPONSABLE___UES_DANS_FORMATIONS_OU_INTERVIENT__DIAGNOSTICCHAIN_MAP:
				return UesDansFormationsOuIntervient((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", sexe: ");
		result.append(sexe);
		result.append(", fonction: ");
		result.append(fonction);
		result.append(", dateNaissance: ");
		result.append(dateNaissance);
		result.append(", mail: ");
		result.append(mail);
		result.append(')');
		return result.toString();
	}

} //ResponsableImpl
