/**
 */
package MMRestApi.util;

import MMRestApi.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MMRestApi.MMRestApiPackage
 * @generated
 */
public class MMRestApiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MMRestApiValidator INSTANCE = new MMRestApiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MMRestApi";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique name' of 'Ressource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESSOURCE__UNIQUE_NAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At least one operation' of 'Ressource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESSOURCE__AT_LEAST_ONE_OPERATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One uri' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__ONE_URI = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Uris have defined variable' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__URIS_HAVE_DEFINED_VARIABLE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Read not modify' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__READ_NOT_MODIFY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Have http Method' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__HAVE_HTTP_METHOD = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Read operation http method' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__READ_OPERATION_HTTP_METHOD = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Http method consistency' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__HTTP_METHOD_CONSISTENCY = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMRestApiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MMRestApiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MMRestApiPackage.RESSOURCE:
				return validateRessource((Ressource)value, diagnostics, context);
			case MMRestApiPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case MMRestApiPackage.URI:
				return validateURI((URI)value, diagnostics, context);
			case MMRestApiPackage.PARAMETRE:
				return validateParametre((Parametre)value, diagnostics, context);
			case MMRestApiPackage.REPONSE:
				return validateReponse((Reponse)value, diagnostics, context);
			case MMRestApiPackage.PROPRIETE:
				return validatePropriete((Propriete)value, diagnostics, context);
			case MMRestApiPackage.API:
				return validateAPI((API)value, diagnostics, context);
			case MMRestApiPackage.HTTP_METHOD:
				return validateHttpMethod((HttpMethod)value, diagnostics, context);
			case MMRestApiPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case MMRestApiPackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case MMRestApiPackage.HTTP_STATUS:
				return validateHttpStatus((HttpStatus)value, diagnostics, context);
			case MMRestApiPackage.JSON_OBJECT:
				return validateJsonObject(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ressource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRessource_at_least_one_operation(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRessource_unique_name(ressource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the at_least_one_operation constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_at_least_one_operation(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ressource.at_least_one_operation(diagnostics, context);
	}

	/**
	 * Validates the unique_name constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_unique_name(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ressource.unique_name(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_http_method_consistency(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_one_uri(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_uris_have_defined_variable(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_read_not_modify(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_have_httpMethod(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_read_operation_http_method(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the http_method_consistency constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_http_method_consistency(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.http_method_consistency(diagnostics, context);
	}

	/**
	 * Validates the one_uri constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_one_uri(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.one_uri(diagnostics, context);
	}

	/**
	 * Validates the uris_have_defined_variable constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_uris_have_defined_variable(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.uris_have_defined_variable(diagnostics, context);
	}

	/**
	 * Validates the read_not_modify constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_read_not_modify(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.read_not_modify(diagnostics, context);
	}

	/**
	 * Validates the have_httpMethod constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_have_httpMethod(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.have_httpMethod(diagnostics, context);
	}

	/**
	 * Validates the read_operation_http_method constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_read_operation_http_method(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.read_operation_http_method(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametre(Parametre parametre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReponse(Reponse reponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropriete(Propriete propriete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propriete, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(api, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpMethod(HttpMethod httpMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpStatus(HttpStatus httpStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJsonObject(Object jsonObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MMRestApiValidator
