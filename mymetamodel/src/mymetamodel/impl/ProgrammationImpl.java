/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import mymetamodel.JOUR;
import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Programmation;
import mymetamodel.Responsable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.ProgrammationImpl#getJour <em>Jour</em>}</li>
 *   <li>{@link mymetamodel.impl.ProgrammationImpl#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link mymetamodel.impl.ProgrammationImpl#getHeureFin <em>Heure Fin</em>}</li>
 *   <li>{@link mymetamodel.impl.ProgrammationImpl#getSalle <em>Salle</em>}</li>
 *   <li>{@link mymetamodel.impl.ProgrammationImpl#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammationImpl extends MinimalEObjectImpl.Container implements Programmation {
	/**
	 * The default value of the '{@link #getJour() <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJour()
	 * @generated
	 * @ordered
	 */
	protected static final JOUR JOUR_EDEFAULT = JOUR.LUNDI;

	/**
	 * The cached value of the '{@link #getJour() <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJour()
	 * @generated
	 * @ordered
	 */
	protected JOUR jour = JOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_DEBUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected int heureDebut = HEURE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_FIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected int heureFin = HEURE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalle() <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected static final String SALLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalle() <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected String salle = SALLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.PROGRAMMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOUR getJour() {
		return jour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJour(JOUR newJour) {
		JOUR oldJour = jour;
		jour = newJour == null ? JOUR_EDEFAULT : newJour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROGRAMMATION__JOUR, oldJour, jour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureDebut() {
		return heureDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebut(int newHeureDebut) {
		int oldHeureDebut = heureDebut;
		heureDebut = newHeureDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROGRAMMATION__HEURE_DEBUT, oldHeureDebut, heureDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureFin() {
		return heureFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFin(int newHeureFin) {
		int oldHeureFin = heureFin;
		heureFin = newHeureFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROGRAMMATION__HEURE_FIN, oldHeureFin, heureFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalle() {
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalle(String newSalle) {
		String oldSalle = salle;
		salle = newSalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROGRAMMATION__SALLE, oldSalle, salle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymetamodelPackage.PROGRAMMATION__RESPONSABLE, oldResponsable, responsable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROGRAMMATION__RESPONSABLE, oldResponsable, responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContenuDefini(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Programmation::ContenuDefini";
		try {
			/**
			 *
			 * inv ContenuDefini:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.jour <> null and self.heureDebut <> null and self.heureFin <> null and self.salle <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.PROGRAMMATION___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ JOUR jour = this.getJour();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_jour = jour == null ? null : MymetamodelTables.ENUMid_JOUR.getEnumerationLiteralId(ClassUtil.nonNullState(jour.getName()));
						final /*@NonInvalid*/ boolean ne = BOXED_jour != null;
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							and = ne;
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							and_0 = (Boolean)and;
						}
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						final /*@NonInvalid*/ String salle = this.getSalle();
						final /*@NonInvalid*/ boolean ne_0 = salle != null;
						if (!ne_0) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if (CAUGHT_and_0 == null) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public boolean trancheHoraire(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Programmation::trancheHoraire";
		try {
			/**
			 *
			 * inv trancheHoraire:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.heureDebut <= 20 and self.heureDebut >= 7 and self.heureFin <= 21 and self.heureFin >= 8
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.PROGRAMMATION___TRANCHE_HORAIRE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ int heureFin_0 = this.getHeureFin();
					final /*@NonInvalid*/ IntegerValue BOXED_heureFin_0 = ValueUtil.integerValueOf(heureFin_0);
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ int heureDebut_0 = this.getHeureDebut();
						final /*@NonInvalid*/ IntegerValue BOXED_heureDebut_0 = ValueUtil.integerValueOf(heureDebut_0);
						final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_heureDebut_0, MymetamodelTables.INT_20).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!le_0) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_heureDebut_0, MymetamodelTables.INT_7).booleanValue();
							if (!ge) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_heureFin_0, MymetamodelTables.INT_21).booleanValue();
							if (!le_1) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (and == null) {
									and_0 = null;
								}
								else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_heureFin_0, MymetamodelTables.INT_8).booleanValue();
						if (!ge_0) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if (CAUGHT_and_0 == null) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public boolean HoraireValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Programmation::HoraireValid";
		try {
			/**
			 *
			 * inv HoraireValid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.heureDebut < self.heureFin and self.heureFin - self.heureDebut >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.PROGRAMMATION___HORAIRE_VALID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int heureDebut = this.getHeureDebut();
				final /*@NonInvalid*/ int heureFin = this.getHeureFin();
				final /*@NonInvalid*/ IntegerValue BOXED_heureDebut = ValueUtil.integerValueOf(heureDebut);
				final /*@NonInvalid*/ IntegerValue BOXED_heureFin = ValueUtil.integerValueOf(heureFin);
				final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_heureDebut, BOXED_heureFin).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!lt) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(BOXED_heureFin, BOXED_heureDebut);
					final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, diff, MymetamodelTables.INT_1).booleanValue();
					if (!ge) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MymetamodelPackage.PROGRAMMATION__JOUR:
				return getJour();
			case MymetamodelPackage.PROGRAMMATION__HEURE_DEBUT:
				return getHeureDebut();
			case MymetamodelPackage.PROGRAMMATION__HEURE_FIN:
				return getHeureFin();
			case MymetamodelPackage.PROGRAMMATION__SALLE:
				return getSalle();
			case MymetamodelPackage.PROGRAMMATION__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MymetamodelPackage.PROGRAMMATION__JOUR:
				setJour((JOUR)newValue);
				return;
			case MymetamodelPackage.PROGRAMMATION__HEURE_DEBUT:
				setHeureDebut((Integer)newValue);
				return;
			case MymetamodelPackage.PROGRAMMATION__HEURE_FIN:
				setHeureFin((Integer)newValue);
				return;
			case MymetamodelPackage.PROGRAMMATION__SALLE:
				setSalle((String)newValue);
				return;
			case MymetamodelPackage.PROGRAMMATION__RESPONSABLE:
				setResponsable((Responsable)newValue);
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
			case MymetamodelPackage.PROGRAMMATION__JOUR:
				setJour(JOUR_EDEFAULT);
				return;
			case MymetamodelPackage.PROGRAMMATION__HEURE_DEBUT:
				setHeureDebut(HEURE_DEBUT_EDEFAULT);
				return;
			case MymetamodelPackage.PROGRAMMATION__HEURE_FIN:
				setHeureFin(HEURE_FIN_EDEFAULT);
				return;
			case MymetamodelPackage.PROGRAMMATION__SALLE:
				setSalle(SALLE_EDEFAULT);
				return;
			case MymetamodelPackage.PROGRAMMATION__RESPONSABLE:
				setResponsable((Responsable)null);
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
			case MymetamodelPackage.PROGRAMMATION__JOUR:
				return jour != JOUR_EDEFAULT;
			case MymetamodelPackage.PROGRAMMATION__HEURE_DEBUT:
				return heureDebut != HEURE_DEBUT_EDEFAULT;
			case MymetamodelPackage.PROGRAMMATION__HEURE_FIN:
				return heureFin != HEURE_FIN_EDEFAULT;
			case MymetamodelPackage.PROGRAMMATION__SALLE:
				return SALLE_EDEFAULT == null ? salle != null : !SALLE_EDEFAULT.equals(salle);
			case MymetamodelPackage.PROGRAMMATION__RESPONSABLE:
				return responsable != null;
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
			case MymetamodelPackage.PROGRAMMATION___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP:
				return ContenuDefini((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.PROGRAMMATION___TRANCHE_HORAIRE__DIAGNOSTICCHAIN_MAP:
				return trancheHoraire((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.PROGRAMMATION___HORAIRE_VALID__DIAGNOSTICCHAIN_MAP:
				return HoraireValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (jour: ");
		result.append(jour);
		result.append(", heureDebut: ");
		result.append(heureDebut);
		result.append(", heureFin: ");
		result.append(heureFin);
		result.append(", salle: ");
		result.append(salle);
		result.append(')');
		return result.toString();
	}

} //ProgrammationImpl
