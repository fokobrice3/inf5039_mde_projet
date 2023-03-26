/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mymetamodel/MetaModel/RESTApi/MMRestApi.ecore
 * using:
 *   /mymetamodel/MetaModel/RESTApi/MMRestAPi.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package MMRestApi;

// import MMRestApi.MMRestApiPackage;
// import MMRestApi.MMRestApiTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MMRestApiTables provides the dispatch tables for the MMRestApi for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MMRestApiTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MMRestApiPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Orphanage", "orphanage", null);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_mymetamodel2 = IdManager.getNsURIPackageId("mymetamodel2", null, MMRestApiPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_API = MMRestApiTables.PACKid_mymetamodel2.getClassId("API", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = MMRestApiTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operation = MMRestApiTables.PACKid_mymetamodel2.getClassId("Operation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parametre = MMRestApiTables.PACKid_mymetamodel2.getClassId("Parametre", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Propriete = MMRestApiTables.PACKid_mymetamodel2.getClassId("Propriete", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reponse = MMRestApiTables.PACKid_mymetamodel2.getClassId("Reponse", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ressource = MMRestApiTables.PACKid_mymetamodel2.getClassId("Ressource", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_URI = MMRestApiTables.PACKid_mymetamodel2.getClassId("URI", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EEList = MMRestApiTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage.getDataTypeId("EEList", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = MMRestApiTables.PACKid_mymetamodel2.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_HttpMethod = MMRestApiTables.PACKid_mymetamodel2.getEnumerationId("HttpMethod");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_HttpStatus = MMRestApiTables.PACKid_mymetamodel2.getEnumerationId("HttpStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OperationType = MMRestApiTables.PACKid_mymetamodel2.getEnumerationId("OperationType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Operation = TypeId.BAG.getSpecializedId(MMRestApiTables.CLSSid_Operation);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DELETE = MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId("DELETE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_GET = MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId("GET");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_HEAD = MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId("HEAD");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PATCH = MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId("PATCH");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_POST = MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId("POST");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PUT = MMRestApiTables.ENUMid_HttpMethod.getEnumerationLiteralId("PUT");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_READ = MMRestApiTables.ENUMid_OperationType.getEnumerationLiteralId("READ");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_WRITE = MMRestApiTables.ENUMid_OperationType.getEnumerationLiteralId("WRITE");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Operation = TypeId.ORDERED_SET.getSpecializedId(MMRestApiTables.CLSSid_Operation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parametre = TypeId.ORDERED_SET.getSpecializedId(MMRestApiTables.CLSSid_Parametre);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Propriete = TypeId.ORDERED_SET.getSpecializedId(MMRestApiTables.CLSSid_Propriete);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Reponse = TypeId.ORDERED_SET.getSpecializedId(MMRestApiTables.CLSSid_Reponse);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ressource = TypeId.ORDERED_SET.getSpecializedId(MMRestApiTables.CLSSid_Ressource);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_URI = TypeId.ORDERED_SET.getSpecializedId(MMRestApiTables.CLSSid_URI);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Ressource = TypeId.SET.getSpecializedId(MMRestApiTables.CLSSid_Ressource);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_URI = TypeId.SET.getSpecializedId(MMRestApiTables.CLSSid_URI);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MMRestApiTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _API = new EcoreExecutorType(MMRestApiPackage.Literals.API, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(MMRestApiPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _HttpMethod = new EcoreExecutorEnumeration(MMRestApiPackage.Literals.HTTP_METHOD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _HttpStatus = new EcoreExecutorEnumeration(MMRestApiPackage.Literals.HTTP_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _JsonObject = new EcoreExecutorType("JsonObject", PACKAGE, 0);
		public static final EcoreExecutorType _Operation = new EcoreExecutorType(MMRestApiPackage.Literals.OPERATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OperationType = new EcoreExecutorEnumeration(MMRestApiPackage.Literals.OPERATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Parametre = new EcoreExecutorType(MMRestApiPackage.Literals.PARAMETRE, PACKAGE, 0);
		public static final EcoreExecutorType _Propriete = new EcoreExecutorType(MMRestApiPackage.Literals.PROPRIETE, PACKAGE, 0);
		public static final EcoreExecutorType _Reponse = new EcoreExecutorType(MMRestApiPackage.Literals.REPONSE, PACKAGE, 0);
		public static final EcoreExecutorType _Ressource = new EcoreExecutorType(MMRestApiPackage.Literals.RESSOURCE, PACKAGE, 0);
		public static final EcoreExecutorType _URI = new EcoreExecutorType(MMRestApiPackage.Literals.URI, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_API,
			_DataType,
			_HttpMethod,
			_HttpStatus,
			_JsonObject,
			_Operation,
			_OperationType,
			_Parametre,
			_Propriete,
			_Reponse,
			_Ressource,
			_URI
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _API__API = new ExecutorFragment(Types._API, MMRestApiTables.Types._API);
		private static final ExecutorFragment _API__OclAny = new ExecutorFragment(Types._API, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _API__OclElement = new ExecutorFragment(Types._API, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, MMRestApiTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _HttpMethod__HttpMethod = new ExecutorFragment(Types._HttpMethod, MMRestApiTables.Types._HttpMethod);
		private static final ExecutorFragment _HttpMethod__OclAny = new ExecutorFragment(Types._HttpMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HttpMethod__OclElement = new ExecutorFragment(Types._HttpMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _HttpMethod__OclEnumeration = new ExecutorFragment(Types._HttpMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _HttpMethod__OclType = new ExecutorFragment(Types._HttpMethod, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _HttpStatus__HttpStatus = new ExecutorFragment(Types._HttpStatus, MMRestApiTables.Types._HttpStatus);
		private static final ExecutorFragment _HttpStatus__OclAny = new ExecutorFragment(Types._HttpStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HttpStatus__OclElement = new ExecutorFragment(Types._HttpStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _HttpStatus__OclEnumeration = new ExecutorFragment(Types._HttpStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _HttpStatus__OclType = new ExecutorFragment(Types._HttpStatus, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _JsonObject__JsonObject = new ExecutorFragment(Types._JsonObject, MMRestApiTables.Types._JsonObject);
		private static final ExecutorFragment _JsonObject__OclAny = new ExecutorFragment(Types._JsonObject, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, MMRestApiTables.Types._Operation);

		private static final ExecutorFragment _OperationType__OclAny = new ExecutorFragment(Types._OperationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OperationType__OclElement = new ExecutorFragment(Types._OperationType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OperationType__OclEnumeration = new ExecutorFragment(Types._OperationType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OperationType__OclType = new ExecutorFragment(Types._OperationType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OperationType__OperationType = new ExecutorFragment(Types._OperationType, MMRestApiTables.Types._OperationType);

		private static final ExecutorFragment _Parametre__OclAny = new ExecutorFragment(Types._Parametre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parametre__OclElement = new ExecutorFragment(Types._Parametre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parametre__Parametre = new ExecutorFragment(Types._Parametre, MMRestApiTables.Types._Parametre);

		private static final ExecutorFragment _Propriete__OclAny = new ExecutorFragment(Types._Propriete, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Propriete__OclElement = new ExecutorFragment(Types._Propriete, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Propriete__Propriete = new ExecutorFragment(Types._Propriete, MMRestApiTables.Types._Propriete);

		private static final ExecutorFragment _Reponse__OclAny = new ExecutorFragment(Types._Reponse, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reponse__OclElement = new ExecutorFragment(Types._Reponse, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reponse__Reponse = new ExecutorFragment(Types._Reponse, MMRestApiTables.Types._Reponse);

		private static final ExecutorFragment _Ressource__OclAny = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ressource__OclElement = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ressource__Ressource = new ExecutorFragment(Types._Ressource, MMRestApiTables.Types._Ressource);

		private static final ExecutorFragment _URI__OclAny = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _URI__OclElement = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _URI__URI = new ExecutorFragment(Types._URI, MMRestApiTables.Types._URI);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _API__base_url = new EcoreExecutorProperty(MMRestApiPackage.Literals.API__BASE_URL, Types._API, 0);
		public static final ExecutorProperty _API__description = new EcoreExecutorProperty(MMRestApiPackage.Literals.API__DESCRIPTION, Types._API, 1);
		public static final ExecutorProperty _API__nom = new EcoreExecutorProperty(MMRestApiPackage.Literals.API__NOM, Types._API, 2);
		public static final ExecutorProperty _API__ressource = new EcoreExecutorProperty(MMRestApiPackage.Literals.API__RESSOURCE, Types._API, 3);

		public static final ExecutorProperty _Operation__methode = new EcoreExecutorProperty(MMRestApiPackage.Literals.OPERATION__METHODE, Types._Operation, 0);
		public static final ExecutorProperty _Operation__nom = new EcoreExecutorProperty(MMRestApiPackage.Literals.OPERATION__NOM, Types._Operation, 1);
		public static final ExecutorProperty _Operation__parametre = new EcoreExecutorProperty(MMRestApiPackage.Literals.OPERATION__PARAMETRE, Types._Operation, 2);
		public static final ExecutorProperty _Operation__reponse = new EcoreExecutorProperty(MMRestApiPackage.Literals.OPERATION__REPONSE, Types._Operation, 3);
		public static final ExecutorProperty _Operation__type = new EcoreExecutorProperty(MMRestApiPackage.Literals.OPERATION__TYPE, Types._Operation, 4);
		public static final ExecutorProperty _Operation__uri = new EcoreExecutorProperty(MMRestApiPackage.Literals.OPERATION__URI, Types._Operation, 5);
		public static final ExecutorProperty _Operation__Ressource__operation = new ExecutorPropertyWithImplementation("Ressource", Types._Operation, 6, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.RESSOURCE__OPERATION));

		public static final ExecutorProperty _Parametre__description = new EcoreExecutorProperty(MMRestApiPackage.Literals.PARAMETRE__DESCRIPTION, Types._Parametre, 0);
		public static final ExecutorProperty _Parametre__nom = new EcoreExecutorProperty(MMRestApiPackage.Literals.PARAMETRE__NOM, Types._Parametre, 1);
		public static final ExecutorProperty _Parametre__type = new EcoreExecutorProperty(MMRestApiPackage.Literals.PARAMETRE__TYPE, Types._Parametre, 2);
		public static final ExecutorProperty _Parametre__Operation__parametre = new ExecutorPropertyWithImplementation("Operation", Types._Parametre, 3, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.OPERATION__PARAMETRE));
		public static final ExecutorProperty _Parametre__URI__variable = new ExecutorPropertyWithImplementation("URI", Types._Parametre, 4, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.URI__VARIABLE));

		public static final ExecutorProperty _Propriete__nom = new EcoreExecutorProperty(MMRestApiPackage.Literals.PROPRIETE__NOM, Types._Propriete, 0);
		public static final ExecutorProperty _Propriete__type = new EcoreExecutorProperty(MMRestApiPackage.Literals.PROPRIETE__TYPE, Types._Propriete, 1);
		public static final ExecutorProperty _Propriete__Ressource__propriete = new ExecutorPropertyWithImplementation("Ressource", Types._Propriete, 2, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.RESSOURCE__PROPRIETE));

		public static final ExecutorProperty _Reponse__body = new EcoreExecutorProperty(MMRestApiPackage.Literals.REPONSE__BODY, Types._Reponse, 0);
		public static final ExecutorProperty _Reponse__description = new EcoreExecutorProperty(MMRestApiPackage.Literals.REPONSE__DESCRIPTION, Types._Reponse, 1);
		public static final ExecutorProperty _Reponse__headers = new EcoreExecutorProperty(MMRestApiPackage.Literals.REPONSE__HEADERS, Types._Reponse, 2);
		public static final ExecutorProperty _Reponse__status = new EcoreExecutorProperty(MMRestApiPackage.Literals.REPONSE__STATUS, Types._Reponse, 3);
		public static final ExecutorProperty _Reponse__Operation__reponse = new ExecutorPropertyWithImplementation("Operation", Types._Reponse, 4, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.OPERATION__REPONSE));

		public static final ExecutorProperty _Ressource__description = new EcoreExecutorProperty(MMRestApiPackage.Literals.RESSOURCE__DESCRIPTION, Types._Ressource, 0);
		public static final ExecutorProperty _Ressource__nom = new EcoreExecutorProperty(MMRestApiPackage.Literals.RESSOURCE__NOM, Types._Ressource, 1);
		public static final ExecutorProperty _Ressource__operation = new EcoreExecutorProperty(MMRestApiPackage.Literals.RESSOURCE__OPERATION, Types._Ressource, 2);
		public static final ExecutorProperty _Ressource__propriete = new EcoreExecutorProperty(MMRestApiPackage.Literals.RESSOURCE__PROPRIETE, Types._Ressource, 3);
		public static final ExecutorProperty _Ressource__props = new EcoreExecutorProperty(MMRestApiPackage.Literals.RESSOURCE__PROPS, Types._Ressource, 4);
		public static final ExecutorProperty _Ressource__uri = new EcoreExecutorProperty(MMRestApiPackage.Literals.RESSOURCE__URI, Types._Ressource, 5);
		public static final ExecutorProperty _Ressource__API__ressource = new ExecutorPropertyWithImplementation("API", Types._Ressource, 6, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.API__RESSOURCE));

		public static final ExecutorProperty _URI__method = new EcoreExecutorProperty(MMRestApiPackage.Literals.URI__METHOD, Types._URI, 0);
		public static final ExecutorProperty _URI__uri_template = new EcoreExecutorProperty(MMRestApiPackage.Literals.URI__URI_TEMPLATE, Types._URI, 1);
		public static final ExecutorProperty _URI__variable = new EcoreExecutorProperty(MMRestApiPackage.Literals.URI__VARIABLE, Types._URI, 2);
		public static final ExecutorProperty _URI__Operation__uri = new ExecutorPropertyWithImplementation("Operation", Types._URI, 3, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.OPERATION__URI));
		public static final ExecutorProperty _URI__Ressource__uri = new ExecutorPropertyWithImplementation("Ressource", Types._URI, 4, new EcoreLibraryOppositeProperty(MMRestApiPackage.Literals.RESSOURCE__URI));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _API =
			{
				Fragments._API__OclAny /* 0 */,
				Fragments._API__OclElement /* 1 */,
				Fragments._API__API /* 2 */
			};
		private static final int /*@NonNull*/ [] __API = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HttpMethod =
			{
				Fragments._HttpMethod__OclAny /* 0 */,
				Fragments._HttpMethod__OclElement /* 1 */,
				Fragments._HttpMethod__OclType /* 2 */,
				Fragments._HttpMethod__OclEnumeration /* 3 */,
				Fragments._HttpMethod__HttpMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __HttpMethod = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HttpStatus =
			{
				Fragments._HttpStatus__OclAny /* 0 */,
				Fragments._HttpStatus__OclElement /* 1 */,
				Fragments._HttpStatus__OclType /* 2 */,
				Fragments._HttpStatus__OclEnumeration /* 3 */,
				Fragments._HttpStatus__HttpStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __HttpStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _JsonObject =
			{
				Fragments._JsonObject__OclAny /* 0 */,
				Fragments._JsonObject__JsonObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __JsonObject = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operation =
			{
				Fragments._Operation__OclAny /* 0 */,
				Fragments._Operation__OclElement /* 1 */,
				Fragments._Operation__Operation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Operation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OperationType =
			{
				Fragments._OperationType__OclAny /* 0 */,
				Fragments._OperationType__OclElement /* 1 */,
				Fragments._OperationType__OclType /* 2 */,
				Fragments._OperationType__OclEnumeration /* 3 */,
				Fragments._OperationType__OperationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __OperationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parametre =
			{
				Fragments._Parametre__OclAny /* 0 */,
				Fragments._Parametre__OclElement /* 1 */,
				Fragments._Parametre__Parametre /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parametre = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Propriete =
			{
				Fragments._Propriete__OclAny /* 0 */,
				Fragments._Propriete__OclElement /* 1 */,
				Fragments._Propriete__Propriete /* 2 */
			};
		private static final int /*@NonNull*/ [] __Propriete = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reponse =
			{
				Fragments._Reponse__OclAny /* 0 */,
				Fragments._Reponse__OclElement /* 1 */,
				Fragments._Reponse__Reponse /* 2 */
			};
		private static final int /*@NonNull*/ [] __Reponse = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ressource =
			{
				Fragments._Ressource__OclAny /* 0 */,
				Fragments._Ressource__OclElement /* 1 */,
				Fragments._Ressource__Ressource /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ressource = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _URI =
			{
				Fragments._URI__OclAny /* 0 */,
				Fragments._URI__OclElement /* 1 */,
				Fragments._URI__URI /* 2 */
			};
		private static final int /*@NonNull*/ [] __URI = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._API.initFragments(_API, __API);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._HttpMethod.initFragments(_HttpMethod, __HttpMethod);
			Types._HttpStatus.initFragments(_HttpStatus, __HttpStatus);
			Types._JsonObject.initFragments(_JsonObject, __JsonObject);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._OperationType.initFragments(_OperationType, __OperationType);
			Types._Parametre.initFragments(_Parametre, __Parametre);
			Types._Propriete.initFragments(_Propriete, __Propriete);
			Types._Reponse.initFragments(_Reponse, __Reponse);
			Types._Ressource.initFragments(_Ressource, __Ressource);
			Types._URI.initFragments(_URI, __URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _API__API = {};
		private static final ExecutorOperation /*@NonNull*/ [] _API__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _API__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HttpMethod__HttpMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HttpStatus__HttpStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HttpStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _JsonObject__JsonObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JsonObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Operation__Operation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OperationType__OperationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OperationType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parametre__Parametre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parametre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parametre__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Propriete__Propriete = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Propriete__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Propriete__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reponse__Reponse = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__Ressource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _URI__URI = {};
		private static final ExecutorOperation /*@NonNull*/ [] _URI__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _URI__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._API__API.initOperations(_API__API);
			Fragments._API__OclAny.initOperations(_API__OclAny);
			Fragments._API__OclElement.initOperations(_API__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._HttpMethod__HttpMethod.initOperations(_HttpMethod__HttpMethod);
			Fragments._HttpMethod__OclAny.initOperations(_HttpMethod__OclAny);
			Fragments._HttpMethod__OclElement.initOperations(_HttpMethod__OclElement);
			Fragments._HttpMethod__OclEnumeration.initOperations(_HttpMethod__OclEnumeration);
			Fragments._HttpMethod__OclType.initOperations(_HttpMethod__OclType);

			Fragments._HttpStatus__HttpStatus.initOperations(_HttpStatus__HttpStatus);
			Fragments._HttpStatus__OclAny.initOperations(_HttpStatus__OclAny);
			Fragments._HttpStatus__OclElement.initOperations(_HttpStatus__OclElement);
			Fragments._HttpStatus__OclEnumeration.initOperations(_HttpStatus__OclEnumeration);
			Fragments._HttpStatus__OclType.initOperations(_HttpStatus__OclType);

			Fragments._JsonObject__JsonObject.initOperations(_JsonObject__JsonObject);
			Fragments._JsonObject__OclAny.initOperations(_JsonObject__OclAny);

			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);

			Fragments._OperationType__OclAny.initOperations(_OperationType__OclAny);
			Fragments._OperationType__OclElement.initOperations(_OperationType__OclElement);
			Fragments._OperationType__OclEnumeration.initOperations(_OperationType__OclEnumeration);
			Fragments._OperationType__OclType.initOperations(_OperationType__OclType);
			Fragments._OperationType__OperationType.initOperations(_OperationType__OperationType);

			Fragments._Parametre__OclAny.initOperations(_Parametre__OclAny);
			Fragments._Parametre__OclElement.initOperations(_Parametre__OclElement);
			Fragments._Parametre__Parametre.initOperations(_Parametre__Parametre);

			Fragments._Propriete__OclAny.initOperations(_Propriete__OclAny);
			Fragments._Propriete__OclElement.initOperations(_Propriete__OclElement);
			Fragments._Propriete__Propriete.initOperations(_Propriete__Propriete);

			Fragments._Reponse__OclAny.initOperations(_Reponse__OclAny);
			Fragments._Reponse__OclElement.initOperations(_Reponse__OclElement);
			Fragments._Reponse__Reponse.initOperations(_Reponse__Reponse);

			Fragments._Ressource__OclAny.initOperations(_Ressource__OclAny);
			Fragments._Ressource__OclElement.initOperations(_Ressource__OclElement);
			Fragments._Ressource__Ressource.initOperations(_Ressource__Ressource);

			Fragments._URI__OclAny.initOperations(_URI__OclAny);
			Fragments._URI__OclElement.initOperations(_URI__OclElement);
			Fragments._URI__URI.initOperations(_URI__URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _API = {
			MMRestApiTables.Properties._API__base_url,
			MMRestApiTables.Properties._API__description,
			MMRestApiTables.Properties._API__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._API__ressource
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HttpMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HttpStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _JsonObject = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Operation = {
			MMRestApiTables.Properties._Operation__methode,
			MMRestApiTables.Properties._Operation__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._Operation__parametre,
			MMRestApiTables.Properties._Operation__reponse,
			MMRestApiTables.Properties._Operation__type,
			MMRestApiTables.Properties._Operation__uri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OperationType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parametre = {
			MMRestApiTables.Properties._Parametre__description,
			MMRestApiTables.Properties._Parametre__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._Parametre__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Propriete = {
			MMRestApiTables.Properties._Propriete__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._Propriete__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reponse = {
			MMRestApiTables.Properties._Reponse__body,
			MMRestApiTables.Properties._Reponse__description,
			MMRestApiTables.Properties._Reponse__headers,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._Reponse__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ressource = {
			MMRestApiTables.Properties._Ressource__description,
			MMRestApiTables.Properties._Ressource__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._Ressource__operation,
			MMRestApiTables.Properties._Ressource__propriete,
			MMRestApiTables.Properties._Ressource__props,
			MMRestApiTables.Properties._Ressource__uri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _URI = {
			MMRestApiTables.Properties._URI__method,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MMRestApiTables.Properties._URI__uri_template,
			MMRestApiTables.Properties._URI__variable
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._API__API.initProperties(_API);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._HttpMethod__HttpMethod.initProperties(_HttpMethod);
			Fragments._HttpStatus__HttpStatus.initProperties(_HttpStatus);
			Fragments._JsonObject__JsonObject.initProperties(_JsonObject);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._OperationType__OperationType.initProperties(_OperationType);
			Fragments._Parametre__Parametre.initProperties(_Parametre);
			Fragments._Propriete__Propriete.initProperties(_Propriete);
			Fragments._Reponse__Reponse.initProperties(_Reponse);
			Fragments._Ressource__Ressource.initProperties(_Ressource);
			Fragments._URI__URI.initProperties(_URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DataType__STRING = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("STRING"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__INT = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("INT"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__CHAR = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("CHAR"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__DATE = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("DATE"), Types._DataType, 3);
		public static final EcoreExecutorEnumerationLiteral _DataType__TIME = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("TIME"), Types._DataType, 4);
		public static final EcoreExecutorEnumerationLiteral _DataType__DOUBLE = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("DOUBLE"), Types._DataType, 5);
		public static final EcoreExecutorEnumerationLiteral _DataType__BOOLEAN = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("BOOLEAN"), Types._DataType, 6);
		public static final EcoreExecutorEnumerationLiteral _DataType__JSON_OBJECT = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("JSON_OBJECT"), Types._DataType, 7);
		public static final EcoreExecutorEnumerationLiteral _DataType__TEXT = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.DATA_TYPE.getEEnumLiteral("TEXT"), Types._DataType, 8);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__STRING,
			_DataType__INT,
			_DataType__CHAR,
			_DataType__DATE,
			_DataType__TIME,
			_DataType__DOUBLE,
			_DataType__BOOLEAN,
			_DataType__JSON_OBJECT,
			_DataType__TEXT
		};

		public static final EcoreExecutorEnumerationLiteral _HttpMethod__GET = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_METHOD.getEEnumLiteral("GET"), Types._HttpMethod, 0);
		public static final EcoreExecutorEnumerationLiteral _HttpMethod__POST = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_METHOD.getEEnumLiteral("POST"), Types._HttpMethod, 1);
		public static final EcoreExecutorEnumerationLiteral _HttpMethod__PUT = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_METHOD.getEEnumLiteral("PUT"), Types._HttpMethod, 2);
		public static final EcoreExecutorEnumerationLiteral _HttpMethod__DELETE = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_METHOD.getEEnumLiteral("DELETE"), Types._HttpMethod, 3);
		public static final EcoreExecutorEnumerationLiteral _HttpMethod__PATCH = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_METHOD.getEEnumLiteral("PATCH"), Types._HttpMethod, 4);
		public static final EcoreExecutorEnumerationLiteral _HttpMethod__HEAD = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_METHOD.getEEnumLiteral("HEAD"), Types._HttpMethod, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _HttpMethod = {
			_HttpMethod__GET,
			_HttpMethod__POST,
			_HttpMethod__PUT,
			_HttpMethod__DELETE,
			_HttpMethod__PATCH,
			_HttpMethod__HEAD
		};

		public static final EcoreExecutorEnumerationLiteral _HttpStatus__NotFound_404 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("NotFound_404"), Types._HttpStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__OK_200 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("OK_200"), Types._HttpStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__Unauthorized_401 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("Unauthorized_401"), Types._HttpStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__Accepted_202 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("Accepted_202"), Types._HttpStatus, 3);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__Created_201 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("Created_201"), Types._HttpStatus, 4);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__NoContent_204 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("NoContent_204"), Types._HttpStatus, 5);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__BadRequest_400 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("BadRequest_400"), Types._HttpStatus, 6);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__Forbidden_403 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("Forbidden_403"), Types._HttpStatus, 7);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__RequestTimeout_408 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("RequestTimeout_408"), Types._HttpStatus, 8);
		public static final EcoreExecutorEnumerationLiteral _HttpStatus__InternalServerError_500 = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.HTTP_STATUS.getEEnumLiteral("InternalServerError_500"), Types._HttpStatus, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _HttpStatus = {
			_HttpStatus__NotFound_404,
			_HttpStatus__OK_200,
			_HttpStatus__Unauthorized_401,
			_HttpStatus__Accepted_202,
			_HttpStatus__Created_201,
			_HttpStatus__NoContent_204,
			_HttpStatus__BadRequest_400,
			_HttpStatus__Forbidden_403,
			_HttpStatus__RequestTimeout_408,
			_HttpStatus__InternalServerError_500
		};

		public static final EcoreExecutorEnumerationLiteral _OperationType__READ = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.OPERATION_TYPE.getEEnumLiteral("READ"), Types._OperationType, 0);
		public static final EcoreExecutorEnumerationLiteral _OperationType__WRITE = new EcoreExecutorEnumerationLiteral(MMRestApiPackage.Literals.OPERATION_TYPE.getEEnumLiteral("WRITE"), Types._OperationType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperationType = {
			_OperationType__READ,
			_OperationType__WRITE
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataType.initLiterals(_DataType);
			Types._HttpMethod.initLiterals(_HttpMethod);
			Types._HttpStatus.initLiterals(_HttpStatus);
			Types._OperationType.initLiterals(_OperationType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MMRestApiTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MMRestApiTables();
	}

	private MMRestApiTables() {
		super(MMRestApiPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		MMRestApiPackage.Literals.RESSOURCE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
