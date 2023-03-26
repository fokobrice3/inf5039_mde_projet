/**
 */
package MMRestApi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MMRestApi.MMRestApiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MMRestApiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MMRestApi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mymetamodel2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MMRA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MMRestApiPackage eINSTANCE = MMRestApi.impl.MMRestApiPackageImpl.init();

	/**
	 * The meta object id for the '{@link MMRestApi.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.RessourceImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__URI = 3;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__PROPRIETE = 4;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__PROPS = 5;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Unique name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>At least one operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___AT_LEAST_ONE_OPERATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MMRestApi.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.OperationImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__METHODE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NOM = 1;

	/**
	 * The feature id for the '<em><b>Parametre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETRE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__URI = 4;

	/**
	 * The feature id for the '<em><b>Reponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REPONSE = 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>One uri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ONE_URI__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Uris have defined variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___URIS_HAVE_DEFINED_VARIABLE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Read not modify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___READ_NOT_MODIFY__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Have http Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAVE_HTTP_METHOD__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Read operation http method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___READ_OPERATION_HTTP_METHOD__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Http method consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___HTTP_METHOD_CONSISTENCY__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link MMRestApi.impl.URIImpl <em>URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.URIImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getURI()
	 * @generated
	 */
	int URI = 2;

	/**
	 * The feature id for the '<em><b>Uri template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__URI_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__METHOD = 2;

	/**
	 * The number of structural features of the '<em>URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MMRestApi.impl.ParametreImpl <em>Parametre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.ParametreImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getParametre()
	 * @generated
	 */
	int PARAMETRE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Parametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MMRestApi.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.ReponseImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__HEADERS = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__BODY = 3;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MMRestApi.impl.ProprieteImpl <em>Propriete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.ProprieteImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getPropriete()
	 * @generated
	 */
	int PROPRIETE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MMRestApi.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.impl.APIImpl
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getAPI()
	 * @generated
	 */
	int API = 6;

	/**
	 * The feature id for the '<em><b>Base url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_URL = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NOM = 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__RESSOURCE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MMRestApi.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.HttpMethod
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 7;

	/**
	 * The meta object id for the '{@link MMRestApi.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.DataType
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 8;

	/**
	 * The meta object id for the '{@link MMRestApi.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.OperationType
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 9;

	/**
	 * The meta object id for the '{@link MMRestApi.HttpStatus <em>Http Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MMRestApi.HttpStatus
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getHttpStatus()
	 * @generated
	 */
	int HTTP_STATUS = 10;

	/**
	 * The meta object id for the '<em>Json Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see MMRestApi.impl.MMRestApiPackageImpl#getJsonObject()
	 * @generated
	 */
	int JSON_OBJECT = 11;


	/**
	 * Returns the meta object for class '{@link MMRestApi.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see MMRestApi.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.Ressource#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see MMRestApi.Ressource#getOperation()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Operation();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Ressource#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MMRestApi.Ressource#getNom()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Nom();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Ressource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MMRestApi.Ressource#getDescription()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.Ressource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uri</em>'.
	 * @see MMRestApi.Ressource#getUri()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.Ressource#getPropriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propriete</em>'.
	 * @see MMRestApi.Ressource#getPropriete()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Propriete();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Ressource#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see MMRestApi.Ressource#getProps()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Props();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Ressource#unique_name(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique name</em>' operation.
	 * @see MMRestApi.Ressource#unique_name(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRessource__Unique_name__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Ressource#at_least_one_operation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At least one operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At least one operation</em>' operation.
	 * @see MMRestApi.Ressource#at_least_one_operation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRessource__At_least_one_operation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MMRestApi.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see MMRestApi.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Operation#getMethode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Methode</em>'.
	 * @see MMRestApi.Operation#getMethode()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Methode();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Operation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MMRestApi.Operation#getNom()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.Operation#getParametre <em>Parametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametre</em>'.
	 * @see MMRestApi.Operation#getParametre()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parametre();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MMRestApi.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Type();

	/**
	 * Returns the meta object for the reference '{@link MMRestApi.Operation#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uri</em>'.
	 * @see MMRestApi.Operation#getUri()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.Operation#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponse</em>'.
	 * @see MMRestApi.Operation#getReponse()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Reponse();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Operation#one_uri(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One uri</em>' operation.
	 * @see MMRestApi.Operation#one_uri(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__One_uri__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Operation#uris_have_defined_variable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Uris have defined variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uris have defined variable</em>' operation.
	 * @see MMRestApi.Operation#uris_have_defined_variable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__Uris_have_defined_variable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Operation#read_not_modify(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Read not modify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read not modify</em>' operation.
	 * @see MMRestApi.Operation#read_not_modify(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__Read_not_modify__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Operation#have_httpMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Have http Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Have http Method</em>' operation.
	 * @see MMRestApi.Operation#have_httpMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__Have_httpMethod__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Operation#read_operation_http_method(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Read operation http method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read operation http method</em>' operation.
	 * @see MMRestApi.Operation#read_operation_http_method(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__Read_operation_http_method__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link MMRestApi.Operation#http_method_consistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Http method consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Http method consistency</em>' operation.
	 * @see MMRestApi.Operation#http_method_consistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOperation__Http_method_consistency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MMRestApi.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URI</em>'.
	 * @see MMRestApi.URI
	 * @generated
	 */
	EClass getURI();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.URI#getUri_template <em>Uri template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri template</em>'.
	 * @see MMRestApi.URI#getUri_template()
	 * @see #getURI()
	 * @generated
	 */
	EAttribute getURI_Uri_template();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.URI#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see MMRestApi.URI#getVariable()
	 * @see #getURI()
	 * @generated
	 */
	EReference getURI_Variable();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.URI#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see MMRestApi.URI#getMethod()
	 * @see #getURI()
	 * @generated
	 */
	EAttribute getURI_Method();

	/**
	 * Returns the meta object for class '{@link MMRestApi.Parametre <em>Parametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametre</em>'.
	 * @see MMRestApi.Parametre
	 * @generated
	 */
	EClass getParametre();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Parametre#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MMRestApi.Parametre#getType()
	 * @see #getParametre()
	 * @generated
	 */
	EAttribute getParametre_Type();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Parametre#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MMRestApi.Parametre#getNom()
	 * @see #getParametre()
	 * @generated
	 */
	EAttribute getParametre_Nom();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Parametre#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MMRestApi.Parametre#getDescription()
	 * @see #getParametre()
	 * @generated
	 */
	EAttribute getParametre_Description();

	/**
	 * Returns the meta object for class '{@link MMRestApi.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see MMRestApi.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Reponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see MMRestApi.Reponse#getStatus()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Reponse#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MMRestApi.Reponse#getDescription()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Description();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Reponse#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see MMRestApi.Reponse#getHeaders()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Headers();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Reponse#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see MMRestApi.Reponse#getBody()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Body();

	/**
	 * Returns the meta object for class '{@link MMRestApi.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete</em>'.
	 * @see MMRestApi.Propriete
	 * @generated
	 */
	EClass getPropriete();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Propriete#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MMRestApi.Propriete#getNom()
	 * @see #getPropriete()
	 * @generated
	 */
	EAttribute getPropriete_Nom();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.Propriete#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MMRestApi.Propriete#getType()
	 * @see #getPropriete()
	 * @generated
	 */
	EAttribute getPropriete_Type();

	/**
	 * Returns the meta object for class '{@link MMRestApi.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see MMRestApi.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.API#getBase_url <em>Base url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base url</em>'.
	 * @see MMRestApi.API#getBase_url()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Base_url();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.API#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MMRestApi.API#getNom()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link MMRestApi.API#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressource</em>'.
	 * @see MMRestApi.API#getRessource()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Ressource();

	/**
	 * Returns the meta object for the attribute '{@link MMRestApi.API#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MMRestApi.API#getDescription()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Description();

	/**
	 * Returns the meta object for enum '{@link MMRestApi.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see MMRestApi.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link MMRestApi.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see MMRestApi.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link MMRestApi.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see MMRestApi.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link MMRestApi.HttpStatus <em>Http Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Status</em>'.
	 * @see MMRestApi.HttpStatus
	 * @generated
	 */
	EEnum getHttpStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Objet Json retourné par une requette
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Json Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJsonObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MMRestApiFactory getMMRestApiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MMRestApi.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.RessourceImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__OPERATION = eINSTANCE.getRessource_Operation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NOM = eINSTANCE.getRessource_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__DESCRIPTION = eINSTANCE.getRessource_Description();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__URI = eINSTANCE.getRessource_Uri();

		/**
		 * The meta object literal for the '<em><b>Propriete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__PROPRIETE = eINSTANCE.getRessource_Propriete();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__PROPS = eINSTANCE.getRessource_Props();

		/**
		 * The meta object literal for the '<em><b>Unique name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRessource__Unique_name__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>At least one operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___AT_LEAST_ONE_OPERATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRessource__At_least_one_operation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MMRestApi.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.OperationImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__METHODE = eINSTANCE.getOperation_Methode();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NOM = eINSTANCE.getOperation_Nom();

		/**
		 * The meta object literal for the '<em><b>Parametre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETRE = eINSTANCE.getOperation_Parametre();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__URI = eINSTANCE.getOperation_Uri();

		/**
		 * The meta object literal for the '<em><b>Reponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REPONSE = eINSTANCE.getOperation_Reponse();

		/**
		 * The meta object literal for the '<em><b>One uri</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___ONE_URI__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__One_uri__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Uris have defined variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___URIS_HAVE_DEFINED_VARIABLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__Uris_have_defined_variable__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Read not modify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___READ_NOT_MODIFY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__Read_not_modify__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Have http Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___HAVE_HTTP_METHOD__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__Have_httpMethod__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Read operation http method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___READ_OPERATION_HTTP_METHOD__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__Read_operation_http_method__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Http method consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___HTTP_METHOD_CONSISTENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOperation__Http_method_consistency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MMRestApi.impl.URIImpl <em>URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.URIImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getURI()
		 * @generated
		 */
		EClass URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em><b>Uri template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__URI_TEMPLATE = eINSTANCE.getURI_Uri_template();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URI__VARIABLE = eINSTANCE.getURI_Variable();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__METHOD = eINSTANCE.getURI_Method();

		/**
		 * The meta object literal for the '{@link MMRestApi.impl.ParametreImpl <em>Parametre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.ParametreImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getParametre()
		 * @generated
		 */
		EClass PARAMETRE = eINSTANCE.getParametre();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRE__TYPE = eINSTANCE.getParametre_Type();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRE__NOM = eINSTANCE.getParametre_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRE__DESCRIPTION = eINSTANCE.getParametre_Description();

		/**
		 * The meta object literal for the '{@link MMRestApi.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.ReponseImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__STATUS = eINSTANCE.getReponse_Status();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__DESCRIPTION = eINSTANCE.getReponse_Description();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__HEADERS = eINSTANCE.getReponse_Headers();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__BODY = eINSTANCE.getReponse_Body();

		/**
		 * The meta object literal for the '{@link MMRestApi.impl.ProprieteImpl <em>Propriete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.ProprieteImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getPropriete()
		 * @generated
		 */
		EClass PROPRIETE = eINSTANCE.getPropriete();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE__NOM = eINSTANCE.getPropriete_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE__TYPE = eINSTANCE.getPropriete_Type();

		/**
		 * The meta object literal for the '{@link MMRestApi.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.impl.APIImpl
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Base url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__BASE_URL = eINSTANCE.getAPI_Base_url();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__NOM = eINSTANCE.getAPI_Nom();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__RESSOURCE = eINSTANCE.getAPI_Ressource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__DESCRIPTION = eINSTANCE.getAPI_Description();

		/**
		 * The meta object literal for the '{@link MMRestApi.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.HttpMethod
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link MMRestApi.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.DataType
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link MMRestApi.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.OperationType
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link MMRestApi.HttpStatus <em>Http Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MMRestApi.HttpStatus
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getHttpStatus()
		 * @generated
		 */
		EEnum HTTP_STATUS = eINSTANCE.getHttpStatus();

		/**
		 * The meta object literal for the '<em>Json Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see MMRestApi.impl.MMRestApiPackageImpl#getJsonObject()
		 * @generated
		 */
		EDataType JSON_OBJECT = eINSTANCE.getJsonObject();

	}

} //MMRestApiPackage
