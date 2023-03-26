/**
 */
package MMRestApi.impl;

import MMRestApi.HttpMethod;
import MMRestApi.MMRestApiPackage;
import MMRestApi.MMRestApiTables;
import MMRestApi.Operation;
import MMRestApi.OperationType;
import MMRestApi.Parametre;
import MMRestApi.Reponse;
import MMRestApi.URI;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringIndexOfOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.impl.OperationImpl#getMethode <em>Methode</em>}</li>
 *   <li>{@link MMRestApi.impl.OperationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link MMRestApi.impl.OperationImpl#getParametre <em>Parametre</em>}</li>
 *   <li>{@link MMRestApi.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link MMRestApi.impl.OperationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link MMRestApi.impl.OperationImpl#getReponse <em>Reponse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod METHODE_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod methode = METHODE_EDEFAULT;

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
	 * The cached value of the '{@link #getParametre() <em>Parametre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametre()
	 * @generated
	 * @ordered
	 */
	protected EList<Parametre> parametre;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType TYPE_EDEFAULT = OperationType.READ;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OperationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected URI uri;

	/**
	 * The cached value of the '{@link #getReponse() <em>Reponse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Reponse> reponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMRestApiPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethode() {
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethode(HttpMethod newMethode) {
		HttpMethod oldMethode = methode;
		methode = newMethode == null ? METHODE_EDEFAULT : newMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMRestApiPackage.OPERATION__METHODE, oldMethode, methode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MMRestApiPackage.OPERATION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametre> getParametre() {
		if (parametre == null) {
			parametre = new EObjectContainmentEList<Parametre>(Parametre.class, this, MMRestApiPackage.OPERATION__PARAMETRE);
		}
		return parametre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OperationType newType) {
		OperationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMRestApiPackage.OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getUri() {
		if (uri != null && uri.eIsProxy()) {
			InternalEObject oldUri = (InternalEObject)uri;
			uri = (URI)eResolveProxy(oldUri);
			if (uri != oldUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMRestApiPackage.OPERATION__URI, oldUri, uri));
			}
		}
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI basicGetUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(URI newUri) {
		URI oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMRestApiPackage.OPERATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reponse> getReponse() {
		if (reponse == null) {
			reponse = new EObjectContainmentEList<Reponse>(Reponse.class, this, MMRestApiPackage.OPERATION__REPONSE);
		}
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean one_uri(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operation::one_uri";
		try {
			/**
			 *
			 * inv one_uri:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.uri->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MMRestApiPackage.Literals.OPERATION___ONE_URI__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MMRestApiTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ URI uri = this.getUri();
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MMRestApiTables.SET_CLSSid_URI, uri);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
				final /*@NonInvalid*/ boolean result = size.equals(MMRestApiTables.INT_1);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MMRestApiTables.INT_0).booleanValue();
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
	public boolean uris_have_defined_variable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operation::uris_have_defined_variable";
		try {
			/**
			 *
			 * inv uris_have_defined_variable:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.uri->forAll(u |
			 *           u.variable->forAll(v | u.uri_template.indexOf(v.nom) <> -1))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MMRestApiPackage.Literals.OPERATION___URIS_HAVE_DEFINED_VARIABLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MMRestApiTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ URI uri = this.getUri();
					final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, MMRestApiTables.SET_CLSSid_URI, uri);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_u = oclAsSet.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_u.hasNext()) {
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
						/*@NonInvalid*/ URI u = (URI)ITERATOR_u.next();
						/**
						 *
						 * u.variable->forAll(v | u.uri_template.indexOf(v.nom) <> -1)
						 */
						final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Parametre> variable = u.getVariable();
							final /*@NonInvalid*/ OrderedSetValue BOXED_variable = idResolver.createOrderedSetOfAll(MMRestApiTables.ORD_CLSSid_Parametre, variable);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_v = BOXED_variable.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_v.hasNext()) {
									if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ Parametre v = (Parametre)ITERATOR_v.next();
								/**
								 * u.uri_template.indexOf(v.nom) <> -1
								 */
								/*@Caught*/ Object CAUGHT_ne;
								try {
									final /*@NonInvalid*/ String uri_template = u.getUri_template();
									if (uri_template == null) {
										throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@NonInvalid*/ String nom = v.getNom();
									if (nom == null) {
										throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ IntegerValue indexOf = StringIndexOfOperation.INSTANCE.evaluate(uri_template, nom);
									final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(MMRestApiTables.INT_1);
									final /*@Thrown*/ boolean ne = !indexOf.equals(diff);
									CAUGHT_ne = ne;
								}
								catch (Exception e) {
									CAUGHT_ne = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (CAUGHT_ne == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else if (CAUGHT_ne instanceof InvalidValueException) {		// Abnormal exception evaluation result
									accumulator_0 = CAUGHT_ne;									// Cache an exception failure
								}
								else {															// Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_forAll == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_forAll instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_forAll;									// Cache an exception failure
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
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MMRestApiTables.INT_0).booleanValue();
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
	public boolean read_not_modify(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operation::read_not_modify";
		try {
			/**
			 *
			 * inv read_not_modify:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type <> OperationType::READ or self.methode <> HttpMethod::POST and self.methode <> HttpMethod::PUT and self.methode <> HttpMethod::PATCH and self.methode <> HttpMethod::DELETE
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MMRestApiPackage.Literals.OPERATION___READ_NOT_MODIFY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MMRestApiTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ OperationType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : MMRestApiTables.ENUMid_OperationType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean ne = BOXED_type != MMRestApiTables.ELITid_READ;
					final /*@Thrown*/ Boolean result;
					if (ne) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							final /*@NonInvalid*/ HttpMethod methode_2 = this.getMethode();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_methode_2 = methode_2 == null ? null : MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId(ClassUtil.nonNullState(methode_2.getName()));
							/*@Caught*/ Object CAUGHT_and_0;
							try {
								final /*@NonInvalid*/ boolean ne_0 = BOXED_methode_2 != MMRestApiTables.ELITid_POST;
								final /*@NonInvalid*/ Boolean and;
								if (!ne_0) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean ne_1 = BOXED_methode_2 != MMRestApiTables.ELITid_PUT;
									if (!ne_1) {
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
									final /*@NonInvalid*/ boolean ne_2 = BOXED_methode_2 != MMRestApiTables.ELITid_PATCH;
									if (!ne_2) {
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
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean ne_3 = BOXED_methode_2 != MMRestApiTables.ELITid_DELETE;
								if (!ne_3) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_0;
									}
									if (CAUGHT_and_0 == null) {
										and_1 = null;
									}
									else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_1 = and_1;
						}
						catch (Exception e) {
							CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_1;
							}
							if (CAUGHT_and_1 == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MMRestApiTables.INT_0).booleanValue();
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
	public boolean have_httpMethod(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operation::have_httpMethod";
		try {
			/**
			 *
			 * inv have_httpMethod:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.methode.oclIsUndefined() implies self.uri.method = self.methode
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MMRestApiPackage.Literals.OPERATION___HAVE_HTTP_METHOD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MMRestApiTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ HttpMethod methode_0 = this.getMethode();
					final /*@NonInvalid*/ boolean oclIsUndefined = methode_0 == null;
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsUndefined) {
						not = ValueUtil.TRUE_VALUE;
					}
					else {
						if (oclIsUndefined) {
							not = ValueUtil.FALSE_VALUE;
						}
						else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ URI uri = this.getUri();
						final /*@NonInvalid*/ HttpMethod method = uri.getMethod();
						final /*@NonInvalid*/ boolean eq = (method != null) ? method.equals(methode_0) : (methode_0 == null);
						if (eq) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (not == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MMRestApiTables.INT_0).booleanValue();
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
	public boolean read_operation_http_method(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operation::read_operation_http_method";
		try {
			/**
			 *
			 * inv read_operation_http_method:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type <> OperationType::READ or self.methode <> HttpMethod::POST and self.methode <> HttpMethod::PUT and self.methode <> HttpMethod::PATCH and self.methode <> HttpMethod::DELETE
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MMRestApiPackage.Literals.OPERATION___READ_OPERATION_HTTP_METHOD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MMRestApiTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ OperationType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : MMRestApiTables.ENUMid_OperationType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean ne = BOXED_type != MMRestApiTables.ELITid_READ;
					final /*@Thrown*/ Boolean result;
					if (ne) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							final /*@NonInvalid*/ HttpMethod methode_2 = this.getMethode();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_methode_2 = methode_2 == null ? null : MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId(ClassUtil.nonNullState(methode_2.getName()));
							/*@Caught*/ Object CAUGHT_and_0;
							try {
								final /*@NonInvalid*/ boolean ne_0 = BOXED_methode_2 != MMRestApiTables.ELITid_POST;
								final /*@NonInvalid*/ Boolean and;
								if (!ne_0) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean ne_1 = BOXED_methode_2 != MMRestApiTables.ELITid_PUT;
									if (!ne_1) {
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
									final /*@NonInvalid*/ boolean ne_2 = BOXED_methode_2 != MMRestApiTables.ELITid_PATCH;
									if (!ne_2) {
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
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean ne_3 = BOXED_methode_2 != MMRestApiTables.ELITid_DELETE;
								if (!ne_3) {
									and_1 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and_0;
									}
									if (CAUGHT_and_0 == null) {
										and_1 = null;
									}
									else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_1 = and_1;
						}
						catch (Exception e) {
							CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_1;
							}
							if (CAUGHT_and_1 == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MMRestApiTables.INT_0).booleanValue();
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
	public boolean http_method_consistency(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Operation::http_method_consistency";
		try {
			/**
			 *
			 * inv http_method_consistency:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type = OperationType::READ and
			 *         (self.methode = HttpMethod::GET or self.methode = HttpMethod::HEAD
			 *         ) or self.type = OperationType::WRITE and
			 *         (self.methode = HttpMethod::POST or self.methode = HttpMethod::PUT or self.methode = HttpMethod::PATCH or self.methode = HttpMethod::DELETE
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MMRestApiPackage.Literals.OPERATION___HTTP_METHOD_CONSISTENCY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MMRestApiTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ HttpMethod methode_0 = this.getMethode();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_methode_0 = methode_0 == null ? null : MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId(ClassUtil.nonNullState(methode_0.getName()));
						final /*@NonInvalid*/ OperationType type = this.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : MMRestApiTables.ENUMid_OperationType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_type == MMRestApiTables.ELITid_READ;
						final /*@Thrown*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_0 = BOXED_methode_0 == MMRestApiTables.ELITid_GET;
							final /*@NonInvalid*/ Boolean or;
							if (eq_0) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_1 = BOXED_methode_0 == MMRestApiTables.ELITid_HEAD;
								if (eq_1) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							if (or == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (or == null) {
									and = null;
								}
								else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ OperationType type_0 = this.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = type_0 == null ? null : MMRestApiTables.ENUMid_OperationType.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
							final /*@NonInvalid*/ boolean eq_2 = BOXED_type_0 == MMRestApiTables.ELITid_WRITE;
							final /*@Thrown*/ Boolean and_0;
							if (!eq_2) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_or_2;
								try {
									final /*@NonInvalid*/ HttpMethod methode_4 = this.getMethode();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_methode_4 = methode_4 == null ? null : MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId(ClassUtil.nonNullState(methode_4.getName()));
									/*@Caught*/ Object CAUGHT_or_1;
									try {
										final /*@NonInvalid*/ boolean eq_3 = BOXED_methode_4 == MMRestApiTables.ELITid_POST;
										final /*@NonInvalid*/ Boolean or_0;
										if (eq_3) {
											or_0 = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean eq_4 = BOXED_methode_4 == MMRestApiTables.ELITid_PUT;
											if (eq_4) {
												or_0 = ValueUtil.TRUE_VALUE;
											}
											else {
												or_0 = ValueUtil.FALSE_VALUE;
											}
										}
										final /*@Thrown*/ Boolean or_1;
										if (or_0 == ValueUtil.TRUE_VALUE) {
											or_1 = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean eq_5 = BOXED_methode_4 == MMRestApiTables.ELITid_PATCH;
											if (eq_5) {
												or_1 = ValueUtil.TRUE_VALUE;
											}
											else {
												if (or_0 == null) {
													or_1 = null;
												}
												else {
													or_1 = ValueUtil.FALSE_VALUE;
												}
											}
										}
										CAUGHT_or_1 = or_1;
									}
									catch (Exception e) {
										CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_2;
									if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
										or_2 = ValueUtil.TRUE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean eq_6 = BOXED_methode_4 == MMRestApiTables.ELITid_DELETE;
										if (eq_6) {
											or_2 = ValueUtil.TRUE_VALUE;
										}
										else {
											if (CAUGHT_or_1 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_or_1;
											}
											if (CAUGHT_or_1 == null) {
												or_2 = null;
											}
											else {
												or_2 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or_2 = or_2;
								}
								catch (Exception e) {
									CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_or_2 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_or_2 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_or_2;
									}
									if (CAUGHT_or_2 == null) {
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
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, MMRestApiTables.INT_0).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MMRestApiPackage.OPERATION__PARAMETRE:
				return ((InternalEList<?>)getParametre()).basicRemove(otherEnd, msgs);
			case MMRestApiPackage.OPERATION__REPONSE:
				return ((InternalEList<?>)getReponse()).basicRemove(otherEnd, msgs);
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
			case MMRestApiPackage.OPERATION__METHODE:
				return getMethode();
			case MMRestApiPackage.OPERATION__NOM:
				return getNom();
			case MMRestApiPackage.OPERATION__PARAMETRE:
				return getParametre();
			case MMRestApiPackage.OPERATION__TYPE:
				return getType();
			case MMRestApiPackage.OPERATION__URI:
				if (resolve) return getUri();
				return basicGetUri();
			case MMRestApiPackage.OPERATION__REPONSE:
				return getReponse();
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
			case MMRestApiPackage.OPERATION__METHODE:
				setMethode((HttpMethod)newValue);
				return;
			case MMRestApiPackage.OPERATION__NOM:
				setNom((String)newValue);
				return;
			case MMRestApiPackage.OPERATION__PARAMETRE:
				getParametre().clear();
				getParametre().addAll((Collection<? extends Parametre>)newValue);
				return;
			case MMRestApiPackage.OPERATION__TYPE:
				setType((OperationType)newValue);
				return;
			case MMRestApiPackage.OPERATION__URI:
				setUri((URI)newValue);
				return;
			case MMRestApiPackage.OPERATION__REPONSE:
				getReponse().clear();
				getReponse().addAll((Collection<? extends Reponse>)newValue);
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
			case MMRestApiPackage.OPERATION__METHODE:
				setMethode(METHODE_EDEFAULT);
				return;
			case MMRestApiPackage.OPERATION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MMRestApiPackage.OPERATION__PARAMETRE:
				getParametre().clear();
				return;
			case MMRestApiPackage.OPERATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MMRestApiPackage.OPERATION__URI:
				setUri((URI)null);
				return;
			case MMRestApiPackage.OPERATION__REPONSE:
				getReponse().clear();
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
			case MMRestApiPackage.OPERATION__METHODE:
				return methode != METHODE_EDEFAULT;
			case MMRestApiPackage.OPERATION__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MMRestApiPackage.OPERATION__PARAMETRE:
				return parametre != null && !parametre.isEmpty();
			case MMRestApiPackage.OPERATION__TYPE:
				return type != TYPE_EDEFAULT;
			case MMRestApiPackage.OPERATION__URI:
				return uri != null;
			case MMRestApiPackage.OPERATION__REPONSE:
				return reponse != null && !reponse.isEmpty();
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
			case MMRestApiPackage.OPERATION___ONE_URI__DIAGNOSTICCHAIN_MAP:
				return one_uri((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MMRestApiPackage.OPERATION___URIS_HAVE_DEFINED_VARIABLE__DIAGNOSTICCHAIN_MAP:
				return uris_have_defined_variable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MMRestApiPackage.OPERATION___READ_NOT_MODIFY__DIAGNOSTICCHAIN_MAP:
				return read_not_modify((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MMRestApiPackage.OPERATION___HAVE_HTTP_METHOD__DIAGNOSTICCHAIN_MAP:
				return have_httpMethod((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MMRestApiPackage.OPERATION___READ_OPERATION_HTTP_METHOD__DIAGNOSTICCHAIN_MAP:
				return read_operation_http_method((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MMRestApiPackage.OPERATION___HTTP_METHOD_CONSISTENCY__DIAGNOSTICCHAIN_MAP:
				return http_method_consistency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (methode: ");
		result.append(methode);
		result.append(", nom: ");
		result.append(nom);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
