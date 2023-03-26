/**
 */
package mymetamodel.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import mymetamodel.MymetamodelPackage;
import mymetamodel.MymetamodelTables;
import mymetamodel.Programmation;
import mymetamodel.Semainier;
import mymetamodel.Semestre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semainier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.SemainierImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mymetamodel.impl.SemainierImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mymetamodel.impl.SemainierImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mymetamodel.impl.SemainierImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link mymetamodel.impl.SemainierImpl#getProgrammation <em>Programmation</em>}</li>
 *   <li>{@link mymetamodel.impl.SemainierImpl#getSemestre <em>Semestre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemainierImpl extends MinimalEObjectImpl.Container implements Semainier {
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
	 * The default value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected String contenu = CONTENU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammation() <em>Programmation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammation()
	 * @generated
	 * @ordered
	 */
	protected EList<Programmation> programmation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemainierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.SEMAINIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMAINIER__NUMERO, oldNumero, numero));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMAINIER__DATE_DEBUT, oldDateDebut, dateDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMAINIER__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(String newContenu) {
		String oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMAINIER__CONTENU, oldContenu, contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programmation> getProgrammation() {
		if (programmation == null) {
			programmation = new EObjectContainmentEList<Programmation>(Programmation.class, this, MymetamodelPackage.SEMAINIER__PROGRAMMATION);
		}
		return programmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre getSemestre() {
		if (eContainerFeatureID() != MymetamodelPackage.SEMAINIER__SEMESTRE) return null;
		return (Semestre)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemestre(Semestre newSemestre, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemestre, MymetamodelPackage.SEMAINIER__SEMESTRE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemestre(Semestre newSemestre) {
		if (newSemestre != eInternalContainer() || (eContainerFeatureID() != MymetamodelPackage.SEMAINIER__SEMESTRE && newSemestre != null)) {
			if (EcoreUtil.isAncestor(this, newSemestre))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemestre != null)
				msgs = ((InternalEObject)newSemestre).eInverseAdd(this, MymetamodelPackage.SEMESTRE__SEMAINIER, Semestre.class, msgs);
			msgs = basicSetSemestre(newSemestre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.SEMAINIER__SEMESTRE, newSemestre, newSemestre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContenuDefini(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semainier::ContenuDefini";
		try {
			/**
			 *
			 * inv ContenuDefini:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.contenu <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMAINIER___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ String contenu = this.getContenu();
				final /*@NonInvalid*/ boolean result = contenu != null;
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
		final String constraintName = "Semainier::Named";
		try {
			/**
			 *
			 * inv Named:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.numero <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMAINIER___NAMED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, ValueUtil.TRUE_VALUE, MymetamodelTables.INT_0).booleanValue();
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
	public boolean SemainierValideDate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semainier::SemainierValideDate";
		try {
			/**
			 *
			 * inv SemainierValideDate:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.dateDebut < self.dateFin
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMAINIER___SEMAINIER_VALIDE_DATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Date dateDebut = this.getDateDebut();
					if (dateDebut == null) {
						throw new InvalidValueException("Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@NonInvalid*/ Date dateFin = this.getDateFin();
					if (dateFin == null) {
						throw new InvalidValueException("Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
					}
					if (!(dateFin instanceof Date)) {
						throw new InvalidValueException("Invalid Date Fin");
					}
					final /*@Thrown*/ boolean result = OclComparableLessThanOperation.INSTANCE.evaluate(executor, dateDebut, dateFin).booleanValue();
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
	public boolean DatesSeancesValides(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semainier::DatesSeancesValides";
		try {
			/**
			 *
			 * inv DatesSeancesValides:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.dateDebut >= self.semestre.dateDebut and self.dateFin <= self.semestre.dateFin
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMAINIER___DATES_SEANCES_VALIDES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_ge;
					try {
						final /*@NonInvalid*/ Date dateDebut = this.getDateDebut();
						if (dateDebut == null) {
							throw new InvalidValueException("Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@NonInvalid*/ Semestre semestre = this.getSemestre();
						final /*@NonInvalid*/ Date dateDebut_0 = semestre.getDateDebut();
						if (dateDebut_0 == null) {
							throw new InvalidValueException("Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
						}
						if (!(dateDebut_0 instanceof Date)) {
							throw new InvalidValueException("invalid dateDebut_0");
						}
						final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, dateDebut, dateDebut_0).booleanValue();
						CAUGHT_ge = ge;
					}
					catch (Exception e) {
						CAUGHT_ge = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_le_0;
						try {
							final /*@NonInvalid*/ Date dateFin = this.getDateFin();
							if (dateFin == null) {
								throw new InvalidValueException("Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@NonInvalid*/ Semestre semestre_0 = this.getSemestre();
							final /*@NonInvalid*/ Date dateFin_0 = semestre_0.getDateFin();
							if (dateFin_0 == null) {
								throw new InvalidValueException("Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
							}
							if (!(dateFin_0 instanceof Date)) {
								throw new InvalidValueException("invalid dateFin_0");
							}
							final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, dateFin, dateFin_0).booleanValue();
							CAUGHT_le_0 = le_0;
						}
						catch (Exception e) {
							CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_ge;
							}
							if (CAUGHT_le_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_le_0;
							}
							result = ValueUtil.TRUE_VALUE;
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
	public boolean pourUnSeulSemestre(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Semainier::pourUnSeulSemestre";
		try {
			/**
			 *
			 * inv pourUnSeulSemestre:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.semestre->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MymetamodelPackage.Literals.SEMAINIER___POUR_UN_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MymetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Semestre semestre = this.getSemestre();
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MymetamodelTables.SET_CLSSid_Semestre, semestre);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
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
			case MymetamodelPackage.SEMAINIER__PROGRAMMATION:
				return ((InternalEList<?>)getProgrammation()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
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
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
				return eInternalContainer().eInverseRemove(this, MymetamodelPackage.SEMESTRE__SEMAINIER, Semestre.class, msgs);
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
			case MymetamodelPackage.SEMAINIER__NUMERO:
				return getNumero();
			case MymetamodelPackage.SEMAINIER__DATE_DEBUT:
				return getDateDebut();
			case MymetamodelPackage.SEMAINIER__DATE_FIN:
				return getDateFin();
			case MymetamodelPackage.SEMAINIER__CONTENU:
				return getContenu();
			case MymetamodelPackage.SEMAINIER__PROGRAMMATION:
				return getProgrammation();
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
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
			case MymetamodelPackage.SEMAINIER__NUMERO:
				setNumero((Integer)newValue);
				return;
			case MymetamodelPackage.SEMAINIER__DATE_DEBUT:
				setDateDebut((Date)newValue);
				return;
			case MymetamodelPackage.SEMAINIER__DATE_FIN:
				setDateFin((Date)newValue);
				return;
			case MymetamodelPackage.SEMAINIER__CONTENU:
				setContenu((String)newValue);
				return;
			case MymetamodelPackage.SEMAINIER__PROGRAMMATION:
				getProgrammation().clear();
				getProgrammation().addAll((Collection<? extends Programmation>)newValue);
				return;
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
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
			case MymetamodelPackage.SEMAINIER__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case MymetamodelPackage.SEMAINIER__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case MymetamodelPackage.SEMAINIER__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case MymetamodelPackage.SEMAINIER__CONTENU:
				setContenu(CONTENU_EDEFAULT);
				return;
			case MymetamodelPackage.SEMAINIER__PROGRAMMATION:
				getProgrammation().clear();
				return;
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
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
			case MymetamodelPackage.SEMAINIER__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case MymetamodelPackage.SEMAINIER__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case MymetamodelPackage.SEMAINIER__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case MymetamodelPackage.SEMAINIER__CONTENU:
				return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
			case MymetamodelPackage.SEMAINIER__PROGRAMMATION:
				return programmation != null && !programmation.isEmpty();
			case MymetamodelPackage.SEMAINIER__SEMESTRE:
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
			case MymetamodelPackage.SEMAINIER___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP:
				return ContenuDefini((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMAINIER___NAMED__DIAGNOSTICCHAIN_MAP:
				return Named((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMAINIER___SEMAINIER_VALIDE_DATE__DIAGNOSTICCHAIN_MAP:
				return SemainierValideDate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMAINIER___DATES_SEANCES_VALIDES__DIAGNOSTICCHAIN_MAP:
				return DatesSeancesValides((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MymetamodelPackage.SEMAINIER___POUR_UN_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP:
				return pourUnSeulSemestre((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", contenu: ");
		result.append(contenu);
		result.append(')');
		return result.toString();
	}

} //SemainierImpl
