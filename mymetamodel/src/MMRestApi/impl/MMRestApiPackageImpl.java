/**
 */
package MMRestApi.impl;

import MMRestApi.DataType;
import MMRestApi.HttpMethod;
import MMRestApi.HttpStatus;
import MMRestApi.MMRestApiFactory;
import MMRestApi.MMRestApiPackage;
import MMRestApi.Operation;
import MMRestApi.OperationType;
import MMRestApi.Parametre;
import MMRestApi.Propriete;
import MMRestApi.Reponse;
import MMRestApi.Ressource;

import MMRestApi.util.MMRestApiValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MMRestApiPackageImpl extends EPackageImpl implements MMRestApiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MMRestApi.MMRestApiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MMRestApiPackageImpl() {
		super(eNS_URI, MMRestApiFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MMRestApiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MMRestApiPackage init() {
		if (isInited) return (MMRestApiPackage)EPackage.Registry.INSTANCE.getEPackage(MMRestApiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMMRestApiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MMRestApiPackageImpl theMMRestApiPackage = registeredMMRestApiPackage instanceof MMRestApiPackageImpl ? (MMRestApiPackageImpl)registeredMMRestApiPackage : new MMRestApiPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMMRestApiPackage.createPackageContents();

		// Initialize created meta-data
		theMMRestApiPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMMRestApiPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MMRestApiValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMMRestApiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MMRestApiPackage.eNS_URI, theMMRestApiPackage);
		return theMMRestApiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessource_Operation() {
		return (EReference)ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Nom() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Description() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessource_Uri() {
		return (EReference)ressourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessource_Propriete() {
		return (EReference)ressourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Props() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessource__Unique_name__DiagnosticChain_Map() {
		return ressourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessource__At_least_one_operation__DiagnosticChain_Map() {
		return ressourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Methode() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Nom() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parametre() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Type() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Uri() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Reponse() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__One_uri__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Uris_have_defined_variable__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Read_not_modify__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Have_httpMethod__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Read_operation_http_method__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Http_method_consistency__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURI() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURI_Uri_template() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURI_Variable() {
		return (EReference)uriEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURI_Method() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametre() {
		return parametreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametre_Type() {
		return (EAttribute)parametreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametre_Nom() {
		return (EAttribute)parametreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametre_Description() {
		return (EAttribute)parametreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponse() {
		return reponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponse_Status() {
		return (EAttribute)reponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponse_Description() {
		return (EAttribute)reponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponse_Headers() {
		return (EAttribute)reponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponse_Body() {
		return (EAttribute)reponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropriete() {
		return proprieteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropriete_Nom() {
		return (EAttribute)proprieteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropriete_Type() {
		return (EAttribute)proprieteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Base_url() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Nom() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPI_Ressource() {
		return (EReference)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Description() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpStatus() {
		return httpStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonObject() {
		return jsonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMRestApiFactory getMMRestApiFactory() {
		return (MMRestApiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ressourceEClass = createEClass(RESSOURCE);
		createEReference(ressourceEClass, RESSOURCE__OPERATION);
		createEAttribute(ressourceEClass, RESSOURCE__NOM);
		createEAttribute(ressourceEClass, RESSOURCE__DESCRIPTION);
		createEReference(ressourceEClass, RESSOURCE__URI);
		createEReference(ressourceEClass, RESSOURCE__PROPRIETE);
		createEAttribute(ressourceEClass, RESSOURCE__PROPS);
		createEOperation(ressourceEClass, RESSOURCE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(ressourceEClass, RESSOURCE___AT_LEAST_ONE_OPERATION__DIAGNOSTICCHAIN_MAP);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__METHODE);
		createEAttribute(operationEClass, OPERATION__NOM);
		createEReference(operationEClass, OPERATION__PARAMETRE);
		createEAttribute(operationEClass, OPERATION__TYPE);
		createEReference(operationEClass, OPERATION__URI);
		createEReference(operationEClass, OPERATION__REPONSE);
		createEOperation(operationEClass, OPERATION___ONE_URI__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___URIS_HAVE_DEFINED_VARIABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___READ_NOT_MODIFY__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___HAVE_HTTP_METHOD__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___READ_OPERATION_HTTP_METHOD__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___HTTP_METHOD_CONSISTENCY__DIAGNOSTICCHAIN_MAP);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__URI_TEMPLATE);
		createEReference(uriEClass, URI__VARIABLE);
		createEAttribute(uriEClass, URI__METHOD);

		parametreEClass = createEClass(PARAMETRE);
		createEAttribute(parametreEClass, PARAMETRE__TYPE);
		createEAttribute(parametreEClass, PARAMETRE__NOM);
		createEAttribute(parametreEClass, PARAMETRE__DESCRIPTION);

		reponseEClass = createEClass(REPONSE);
		createEAttribute(reponseEClass, REPONSE__STATUS);
		createEAttribute(reponseEClass, REPONSE__DESCRIPTION);
		createEAttribute(reponseEClass, REPONSE__HEADERS);
		createEAttribute(reponseEClass, REPONSE__BODY);

		proprieteEClass = createEClass(PROPRIETE);
		createEAttribute(proprieteEClass, PROPRIETE__NOM);
		createEAttribute(proprieteEClass, PROPRIETE__TYPE);

		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__BASE_URL);
		createEAttribute(apiEClass, API__NOM);
		createEReference(apiEClass, API__RESSOURCE);
		createEAttribute(apiEClass, API__DESCRIPTION);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
		httpStatusEEnum = createEEnum(HTTP_STATUS);

		// Create data types
		jsonObjectEDataType = createEDataType(JSON_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRessource_Operation(), this.getOperation(), null, "operation", null, 1, -1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_Description(), ecorePackage.getEString(), "description", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRessource_Uri(), this.getURI(), null, "uri", null, 1, -1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRessource_Propriete(), this.getPropriete(), null, "propriete", null, 0, -1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getPropriete());
		g1.getETypeArguments().add(g2);
		initEAttribute(getRessource_Props(), g1, "props", null, 0, 1, Ressource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRessource__Unique_name__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unique_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRessource__At_least_one_operation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "at_least_one_operation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Methode(), this.getHttpMethod(), "methode", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parametre(), this.getParametre(), null, "parametre", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Type(), this.getOperationType(), "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Uri(), this.getURI(), null, "uri", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Reponse(), this.getReponse(), null, "reponse", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperation__One_uri__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "one_uri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__Uris_have_defined_variable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uris_have_defined_variable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__Read_not_modify__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "read_not_modify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__Have_httpMethod__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "have_httpMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__Read_operation_http_method__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "read_operation_http_method", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__Http_method_consistency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "http_method_consistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uriEClass, MMRestApi.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURI_Uri_template(), ecorePackage.getEString(), "uri_template", null, 0, 1, MMRestApi.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURI_Variable(), this.getParametre(), null, "variable", null, 0, -1, MMRestApi.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURI_Method(), this.getHttpMethod(), "method", null, 0, 1, MMRestApi.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametreEClass, Parametre.class, "Parametre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametre_Type(), this.getDataType(), "type", null, 0, 1, Parametre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametre_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Parametre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametre_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parametre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reponseEClass, Reponse.class, "Reponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReponse_Status(), this.getHttpStatus(), "status", null, 0, 1, Reponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReponse_Description(), ecorePackage.getEString(), "description", null, 0, 1, Reponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReponse_Headers(), ecorePackage.getEString(), "headers", null, 0, 1, Reponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReponse_Body(), ecorePackage.getEString(), "body", null, 0, 1, Reponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proprieteEClass, Propriete.class, "Propriete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropriete_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Propriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropriete_Type(), this.getDataType(), "type", null, 0, 1, Propriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, MMRestApi.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPI_Base_url(), ecorePackage.getEString(), "base_url", null, 1, 1, MMRestApi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, MMRestApi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Ressource(), this.getRessource(), null, "ressource", null, 0, -1, MMRestApi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Description(), ecorePackage.getEString(), "description", null, 0, 1, MMRestApi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PATCH);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.HEAD);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.CHAR);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.DOUBLE);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.JSON_OBJECT);
		addEEnumLiteral(dataTypeEEnum, DataType.TEXT);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.READ);
		addEEnumLiteral(operationTypeEEnum, OperationType.WRITE);

		initEEnum(httpStatusEEnum, HttpStatus.class, "HttpStatus");
		addEEnumLiteral(httpStatusEEnum, HttpStatus.NOT_FOUND_404);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.OK_200);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.UNAUTHORIZED_401);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.ACCEPTED_202);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.CREATED_201);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.NO_CONTENT_204);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.BAD_REQUEST_400);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.FORBIDDEN_403);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.REQUEST_TIMEOUT_408);
		addEEnumLiteral(httpStatusEEnum, HttpStatus.INTERNAL_SERVER_ERROR_500);

		// Initialize data types
		initEDataType(jsonObjectEDataType, Object.class, "JsonObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (ressourceEClass,
		   source,
		   new String[] {
			   "constraints", "at_least_one_operation"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "constraints", "http_method_consistency"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getRessource__Unique_name__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.oclType().allInstances()->isUnique(nom)"
		   });
		addAnnotation
		  (getRessource__At_least_one_operation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.operation->size() >= 1"
		   });
		addAnnotation
		  (getOperation__One_uri__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.uri->size() = 1"
		   });
		addAnnotation
		  (getOperation__Uris_have_defined_variable__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.uri->forAll(u | u.variable->forAll(v |u.uri_template.indexOf(v.nom) <> -1))"
		   });
		addAnnotation
		  (getOperation__Read_not_modify__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.type <> OperationType::READ or self.methode <> HttpMethod::POST and self.methode <> HttpMethod::PUT and self.methode <> HttpMethod::PATCH and self.methode <> HttpMethod::DELETE"
		   });
		addAnnotation
		  (getOperation__Have_httpMethod__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "not self.methode.oclIsUndefined() implies self.uri.method = self.methode"
		   });
		addAnnotation
		  (getOperation__Read_operation_http_method__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.type <> OperationType::READ or (self.methode <> HttpMethod::POST and self.methode <> HttpMethod::PUT and self.methode <> HttpMethod::PATCH and self.methode <> HttpMethod::DELETE)"
		   });
		addAnnotation
		  (getOperation__Http_method_consistency__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(self.type = OperationType::READ and (self.methode = HttpMethod::GET or self.methode = HttpMethod::HEAD)) or (self.type = OperationType::WRITE and (self.methode = HttpMethod::POST or self.methode = HttpMethod::PUT or self.methode = HttpMethod::PATCH or self.methode = HttpMethod::DELETE))"
		   });
	}

} //MMRestApiPackageImpl
