/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mymetamodel/MetaModel/LangageWebsite/mymetamodel.ecore
 * using:
 *   /mymetamodel/MetaModel/LangageWebsite/mymetamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package mymetamodel;

// import mymetamodel.MymetamodelPackage;
// import mymetamodel.MymetamodelTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
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
 * MymetamodelTables provides the dispatch tables for the mymetamodel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MymetamodelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MymetamodelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_mymetamodel1 = IdManager.getNsURIPackageId("mymetamodel1", null, MymetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = MymetamodelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Debouche = MymetamodelTables.PACKid_mymetamodel1.getClassId("Debouche", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Departement = MymetamodelTables.PACKid_mymetamodel1.getClassId("Departement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Formation = MymetamodelTables.PACKid_mymetamodel1.getClassId("Formation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Niveau = MymetamodelTables.PACKid_mymetamodel1.getClassId("Niveau", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Programmation = MymetamodelTables.PACKid_mymetamodel1.getClassId("Programmation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Responsable = MymetamodelTables.PACKid_mymetamodel1.getClassId("Responsable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ressource = MymetamodelTables.PACKid_mymetamodel1.getClassId("Ressource", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Semainier = MymetamodelTables.PACKid_mymetamodel1.getClassId("Semainier", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Semestre = MymetamodelTables.PACKid_mymetamodel1.getClassId("Semestre", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Specialite = MymetamodelTables.PACKid_mymetamodel1.getClassId("Specialite", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UE = MymetamodelTables.PACKid_mymetamodel1.getClassId("UE", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_prerequis = MymetamodelTables.PACKid_mymetamodel1.getClassId("prerequis", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = MymetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = MymetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_JOUR = MymetamodelTables.PACKid_mymetamodel1.getEnumerationId("JOUR");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SEXE = MymetamodelTables.PACKid_mymetamodel1.getEnumerationId("SEXE");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TYPE = MymetamodelTables.PACKid_mymetamodel1.getEnumerationId("TYPE");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_20 = ValueUtil.integerValueOf("20");
	public static final /*@NonInvalid*/ IntegerValue INT_21 = ValueUtil.integerValueOf("21");
	public static final /*@NonInvalid*/ IntegerValue INT_24 = ValueUtil.integerValueOf("24");
	public static final /*@NonInvalid*/ IntegerValue INT_7 = ValueUtil.integerValueOf("7");
	public static final /*@NonInvalid*/ IntegerValue INT_8 = ValueUtil.integerValueOf("8");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Departement = TypeId.BAG.getSpecializedId(MymetamodelTables.CLSSid_Departement);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Niveau = TypeId.BAG.getSpecializedId(MymetamodelTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Programmation = TypeId.BAG.getSpecializedId(MymetamodelTables.CLSSid_Programmation);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Responsable = TypeId.BAG.getSpecializedId(MymetamodelTables.CLSSid_Responsable);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Specialite = TypeId.BAG.getSpecializedId(MymetamodelTables.CLSSid_Specialite);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_UE = TypeId.BAG.getSpecializedId(MymetamodelTables.CLSSid_UE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Debouche = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Debouche);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Formation = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Formation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Niveau = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Programmation = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Programmation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Responsable = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Responsable);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ressource = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Ressource);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Semainier = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Semainier);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Semestre = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Semestre);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Specialite = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_Specialite);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UE = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_UE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_prerequis = TypeId.ORDERED_SET.getSpecializedId(MymetamodelTables.CLSSid_prerequis);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Departement = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Departement);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Formation = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Formation);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Niveau = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Responsable = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Responsable);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Ressource = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Ressource);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Semestre = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Semestre);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Specialite = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_Specialite);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_UE = TypeId.SET.getSpecializedId(MymetamodelTables.CLSSid_UE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MymetamodelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Debouche = new EcoreExecutorType(MymetamodelPackage.Literals.DEBOUCHE, PACKAGE, 0);
		public static final EcoreExecutorType _Departement = new EcoreExecutorType(MymetamodelPackage.Literals.DEPARTEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Formation = new EcoreExecutorType(MymetamodelPackage.Literals.FORMATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _JOUR = new EcoreExecutorEnumeration(MymetamodelPackage.Literals.JOUR, PACKAGE, 0);
		public static final EcoreExecutorType _Niveau = new EcoreExecutorType(MymetamodelPackage.Literals.NIVEAU, PACKAGE, 0);
		public static final EcoreExecutorType _Programmation = new EcoreExecutorType(MymetamodelPackage.Literals.PROGRAMMATION, PACKAGE, 0);
		public static final EcoreExecutorType _Responsable = new EcoreExecutorType(MymetamodelPackage.Literals.RESPONSABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Ressource = new EcoreExecutorType(MymetamodelPackage.Literals.RESSOURCE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SEXE = new EcoreExecutorEnumeration(MymetamodelPackage.Literals.SEXE, PACKAGE, 0);
		public static final EcoreExecutorType _Semainier = new EcoreExecutorType(MymetamodelPackage.Literals.SEMAINIER, PACKAGE, 0);
		public static final EcoreExecutorType _Semestre = new EcoreExecutorType(MymetamodelPackage.Literals.SEMESTRE, PACKAGE, 0);
		public static final EcoreExecutorType _Specialite = new EcoreExecutorType(MymetamodelPackage.Literals.SPECIALITE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TYPE = new EcoreExecutorEnumeration(MymetamodelPackage.Literals.TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _UE = new EcoreExecutorType(MymetamodelPackage.Literals.UE, PACKAGE, 0);
		public static final EcoreExecutorType _prerequis = new EcoreExecutorType(MymetamodelPackage.Literals.PREREQUIS, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Debouche,
			_Departement,
			_Formation,
			_JOUR,
			_Niveau,
			_Programmation,
			_Responsable,
			_Ressource,
			_SEXE,
			_Semainier,
			_Semestre,
			_Specialite,
			_TYPE,
			_UE,
			_prerequis
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Debouche__Debouche = new ExecutorFragment(Types._Debouche, MymetamodelTables.Types._Debouche);
		private static final ExecutorFragment _Debouche__OclAny = new ExecutorFragment(Types._Debouche, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Debouche__OclElement = new ExecutorFragment(Types._Debouche, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Departement__Departement = new ExecutorFragment(Types._Departement, MymetamodelTables.Types._Departement);
		private static final ExecutorFragment _Departement__OclAny = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Departement__OclElement = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Formation__Formation = new ExecutorFragment(Types._Formation, MymetamodelTables.Types._Formation);
		private static final ExecutorFragment _Formation__OclAny = new ExecutorFragment(Types._Formation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Formation__OclElement = new ExecutorFragment(Types._Formation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _JOUR__JOUR = new ExecutorFragment(Types._JOUR, MymetamodelTables.Types._JOUR);
		private static final ExecutorFragment _JOUR__OclAny = new ExecutorFragment(Types._JOUR, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _JOUR__OclElement = new ExecutorFragment(Types._JOUR, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _JOUR__OclEnumeration = new ExecutorFragment(Types._JOUR, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _JOUR__OclType = new ExecutorFragment(Types._JOUR, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Niveau__Niveau = new ExecutorFragment(Types._Niveau, MymetamodelTables.Types._Niveau);
		private static final ExecutorFragment _Niveau__OclAny = new ExecutorFragment(Types._Niveau, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Niveau__OclElement = new ExecutorFragment(Types._Niveau, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Programmation__OclAny = new ExecutorFragment(Types._Programmation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Programmation__OclElement = new ExecutorFragment(Types._Programmation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Programmation__Programmation = new ExecutorFragment(Types._Programmation, MymetamodelTables.Types._Programmation);

		private static final ExecutorFragment _Responsable__OclAny = new ExecutorFragment(Types._Responsable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Responsable__OclElement = new ExecutorFragment(Types._Responsable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Responsable__Responsable = new ExecutorFragment(Types._Responsable, MymetamodelTables.Types._Responsable);

		private static final ExecutorFragment _Ressource__OclAny = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ressource__OclElement = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ressource__Ressource = new ExecutorFragment(Types._Ressource, MymetamodelTables.Types._Ressource);

		private static final ExecutorFragment _SEXE__OclAny = new ExecutorFragment(Types._SEXE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SEXE__OclElement = new ExecutorFragment(Types._SEXE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SEXE__OclEnumeration = new ExecutorFragment(Types._SEXE, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SEXE__OclType = new ExecutorFragment(Types._SEXE, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SEXE__SEXE = new ExecutorFragment(Types._SEXE, MymetamodelTables.Types._SEXE);

		private static final ExecutorFragment _Semainier__OclAny = new ExecutorFragment(Types._Semainier, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Semainier__OclElement = new ExecutorFragment(Types._Semainier, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Semainier__Semainier = new ExecutorFragment(Types._Semainier, MymetamodelTables.Types._Semainier);

		private static final ExecutorFragment _Semestre__OclAny = new ExecutorFragment(Types._Semestre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Semestre__OclElement = new ExecutorFragment(Types._Semestre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Semestre__Semestre = new ExecutorFragment(Types._Semestre, MymetamodelTables.Types._Semestre);

		private static final ExecutorFragment _Specialite__OclAny = new ExecutorFragment(Types._Specialite, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Specialite__OclElement = new ExecutorFragment(Types._Specialite, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Specialite__Specialite = new ExecutorFragment(Types._Specialite, MymetamodelTables.Types._Specialite);

		private static final ExecutorFragment _TYPE__OclAny = new ExecutorFragment(Types._TYPE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TYPE__OclElement = new ExecutorFragment(Types._TYPE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TYPE__OclEnumeration = new ExecutorFragment(Types._TYPE, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TYPE__OclType = new ExecutorFragment(Types._TYPE, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TYPE__TYPE = new ExecutorFragment(Types._TYPE, MymetamodelTables.Types._TYPE);

		private static final ExecutorFragment _UE__OclAny = new ExecutorFragment(Types._UE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UE__OclElement = new ExecutorFragment(Types._UE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UE__UE = new ExecutorFragment(Types._UE, MymetamodelTables.Types._UE);

		private static final ExecutorFragment _prerequis__OclAny = new ExecutorFragment(Types._prerequis, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _prerequis__OclElement = new ExecutorFragment(Types._prerequis, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _prerequis__prerequis = new ExecutorFragment(Types._prerequis, MymetamodelTables.Types._prerequis);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of MymetamodelTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of MymetamodelTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Debouche__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEBOUCHE__DESCRIPTION, Types._Debouche, 0);
		public static final ExecutorProperty _Debouche__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEBOUCHE__NOM, Types._Debouche, 1);
		public static final ExecutorProperty _Debouche__Formation__debouche = new ExecutorPropertyWithImplementation("Formation", Types._Debouche, 2, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.FORMATION__DEBOUCHE));

		public static final ExecutorProperty _Departement__chef = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEPARTEMENT__CHEF, Types._Departement, 0);
		public static final ExecutorProperty _Departement__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEPARTEMENT__DESCRIPTION, Types._Departement, 1);
		public static final ExecutorProperty _Departement__formation = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEPARTEMENT__FORMATION, Types._Departement, 2);
		public static final ExecutorProperty _Departement__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEPARTEMENT__NOM, Types._Departement, 3);
		public static final ExecutorProperty _Departement__responsable = new EcoreExecutorProperty(MymetamodelPackage.Literals.DEPARTEMENT__RESPONSABLE, Types._Departement, 4);

		public static final ExecutorProperty _Formation__debouche = new EcoreExecutorProperty(MymetamodelPackage.Literals.FORMATION__DEBOUCHE, Types._Formation, 0);
		public static final ExecutorProperty _Formation__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.FORMATION__DESCRIPTION, Types._Formation, 1);
		public static final ExecutorProperty _Formation__niveau = new EcoreExecutorProperty(MymetamodelPackage.Literals.FORMATION__NIVEAU, Types._Formation, 2);
		public static final ExecutorProperty _Formation__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.FORMATION__NOM, Types._Formation, 3);
		public static final ExecutorProperty _Formation__responsable = new EcoreExecutorProperty(MymetamodelPackage.Literals.FORMATION__RESPONSABLE, Types._Formation, 4);
		public static final ExecutorProperty _Formation__specialite = new EcoreExecutorProperty(MymetamodelPackage.Literals.FORMATION__SPECIALITE, Types._Formation, 5);
		public static final ExecutorProperty _Formation__Departement__formation = new ExecutorPropertyWithImplementation("Departement", Types._Formation, 6, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.DEPARTEMENT__FORMATION));

		public static final ExecutorProperty _Niveau__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__DESCRIPTION, Types._Niveau, 0);
		public static final ExecutorProperty _Niveau__formation = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__FORMATION, Types._Niveau, 1);
		public static final ExecutorProperty _Niveau__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__NOM, Types._Niveau, 2);
		public static final ExecutorProperty _Niveau__numero = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__NUMERO, Types._Niveau, 3);
		public static final ExecutorProperty _Niveau__responsable = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__RESPONSABLE, Types._Niveau, 4);
		public static final ExecutorProperty _Niveau__semestre = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__SEMESTRE, Types._Niveau, 5);
		public static final ExecutorProperty _Niveau__specialite = new EcoreExecutorProperty(MymetamodelPackage.Literals.NIVEAU__SPECIALITE, Types._Niveau, 6);

		public static final ExecutorProperty _Programmation__heureDebut = new EcoreExecutorProperty(MymetamodelPackage.Literals.PROGRAMMATION__HEURE_DEBUT, Types._Programmation, 0);
		public static final ExecutorProperty _Programmation__heureFin = new EcoreExecutorProperty(MymetamodelPackage.Literals.PROGRAMMATION__HEURE_FIN, Types._Programmation, 1);
		public static final ExecutorProperty _Programmation__jour = new EcoreExecutorProperty(MymetamodelPackage.Literals.PROGRAMMATION__JOUR, Types._Programmation, 2);
		public static final ExecutorProperty _Programmation__responsable = new EcoreExecutorProperty(MymetamodelPackage.Literals.PROGRAMMATION__RESPONSABLE, Types._Programmation, 3);
		public static final ExecutorProperty _Programmation__salle = new EcoreExecutorProperty(MymetamodelPackage.Literals.PROGRAMMATION__SALLE, Types._Programmation, 4);
		public static final ExecutorProperty _Programmation__Semainier__programmation = new ExecutorPropertyWithImplementation("Semainier", Types._Programmation, 5, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.SEMAINIER__PROGRAMMATION));
		public static final ExecutorProperty _Programmation__UE__programmation = new ExecutorPropertyWithImplementation("UE", Types._Programmation, 6, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.UE__PROGRAMMATION));

		public static final ExecutorProperty _Responsable__dateNaissance = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__DATE_NAISSANCE, Types._Responsable, 0);
		public static final ExecutorProperty _Responsable__fonction = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__FONCTION, Types._Responsable, 1);
		public static final ExecutorProperty _Responsable__formation = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__FORMATION, Types._Responsable, 2);
		public static final ExecutorProperty _Responsable__mail = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__MAIL, Types._Responsable, 3);
		public static final ExecutorProperty _Responsable__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__NOM, Types._Responsable, 4);
		public static final ExecutorProperty _Responsable__sexe = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__SEXE, Types._Responsable, 5);
		public static final ExecutorProperty _Responsable__telephone = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__TELEPHONE, Types._Responsable, 6);
		public static final ExecutorProperty _Responsable__ue = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESPONSABLE__UE, Types._Responsable, 7);
		public static final ExecutorProperty _Responsable__Departement__chef = new ExecutorPropertyWithImplementation("Departement", Types._Responsable, 8, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.DEPARTEMENT__CHEF));
		public static final ExecutorProperty _Responsable__Departement__responsable = new ExecutorPropertyWithImplementation("Departement", Types._Responsable, 9, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.DEPARTEMENT__RESPONSABLE));
		public static final ExecutorProperty _Responsable__Niveau__responsable = new ExecutorPropertyWithImplementation("Niveau", Types._Responsable, 10, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.NIVEAU__RESPONSABLE));
		public static final ExecutorProperty _Responsable__Programmation__responsable = new ExecutorPropertyWithImplementation("Programmation", Types._Responsable, 11, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.PROGRAMMATION__RESPONSABLE));
		public static final ExecutorProperty _Responsable__Specialite__responsable = new ExecutorPropertyWithImplementation("Specialite", Types._Responsable, 12, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.SPECIALITE__RESPONSABLE));
		public static final ExecutorProperty _Responsable__UE__responsable = new ExecutorPropertyWithImplementation("UE", Types._Responsable, 13, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.UE__RESPONSABLE));

		public static final ExecutorProperty _Ressource__chemin = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESSOURCE__CHEMIN, Types._Ressource, 0);
		public static final ExecutorProperty _Ressource__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESSOURCE__NOM, Types._Ressource, 1);
		public static final ExecutorProperty _Ressource__type = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESSOURCE__TYPE, Types._Ressource, 2);
		public static final ExecutorProperty _Ressource__ue = new EcoreExecutorProperty(MymetamodelPackage.Literals.RESSOURCE__UE, Types._Ressource, 3);

		public static final ExecutorProperty _Semainier__contenu = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMAINIER__CONTENU, Types._Semainier, 0);
		public static final ExecutorProperty _Semainier__dateDebut = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMAINIER__DATE_DEBUT, Types._Semainier, 1);
		public static final ExecutorProperty _Semainier__dateFin = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMAINIER__DATE_FIN, Types._Semainier, 2);
		public static final ExecutorProperty _Semainier__numero = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMAINIER__NUMERO, Types._Semainier, 3);
		public static final ExecutorProperty _Semainier__programmation = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMAINIER__PROGRAMMATION, Types._Semainier, 4);
		public static final ExecutorProperty _Semainier__semestre = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMAINIER__SEMESTRE, Types._Semainier, 5);
		public static final ExecutorProperty _Semainier__UE__semainier = new ExecutorPropertyWithImplementation("UE", Types._Semainier, 6, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.UE__SEMAINIER));

		public static final ExecutorProperty _Semestre__dateDebut = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__DATE_DEBUT, Types._Semestre, 0);
		public static final ExecutorProperty _Semestre__dateFin = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__DATE_FIN, Types._Semestre, 1);
		public static final ExecutorProperty _Semestre__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__DESCRIPTION, Types._Semestre, 2);
		public static final ExecutorProperty _Semestre__nbSemaine = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__NB_SEMAINE, Types._Semestre, 3);
		public static final ExecutorProperty _Semestre__niveau = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__NIVEAU, Types._Semestre, 4);
		public static final ExecutorProperty _Semestre__numero = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__NUMERO, Types._Semestre, 5);
		public static final ExecutorProperty _Semestre__semainier = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__SEMAINIER, Types._Semestre, 6);
		public static final ExecutorProperty _Semestre__ue = new EcoreExecutorProperty(MymetamodelPackage.Literals.SEMESTRE__UE, Types._Semestre, 7);

		public static final ExecutorProperty _Specialite__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.SPECIALITE__DESCRIPTION, Types._Specialite, 0);
		public static final ExecutorProperty _Specialite__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.SPECIALITE__NOM, Types._Specialite, 1);
		public static final ExecutorProperty _Specialite__responsable = new EcoreExecutorProperty(MymetamodelPackage.Literals.SPECIALITE__RESPONSABLE, Types._Specialite, 2);
		public static final ExecutorProperty _Specialite__Formation__specialite = new ExecutorPropertyWithImplementation("Formation", Types._Specialite, 3, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.FORMATION__SPECIALITE));
		public static final ExecutorProperty _Specialite__Niveau__specialite = new ExecutorPropertyWithImplementation("Niveau", Types._Specialite, 4, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.NIVEAU__SPECIALITE));
		public static final ExecutorProperty _Specialite__UE__specialite = new ExecutorPropertyWithImplementation("UE", Types._Specialite, 5, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.UE__SPECIALITE));

		public static final ExecutorProperty _UE__code = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__CODE, Types._UE, 0);
		public static final ExecutorProperty _UE__credit = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__CREDIT, Types._UE, 1);
		public static final ExecutorProperty _UE__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__DESCRIPTION, Types._UE, 2);
		public static final ExecutorProperty _UE__isOptionel = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__IS_OPTIONEL, Types._UE, 3);
		public static final ExecutorProperty _UE__nom = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__NOM, Types._UE, 4);
		public static final ExecutorProperty _UE__objectif = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__OBJECTIF, Types._UE, 5);
		public static final ExecutorProperty _UE__prerequis = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__PREREQUIS, Types._UE, 6);
		public static final ExecutorProperty _UE__programmation = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__PROGRAMMATION, Types._UE, 7);
		public static final ExecutorProperty _UE__responsable = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__RESPONSABLE, Types._UE, 8);
		public static final ExecutorProperty _UE__ressource = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__RESSOURCE, Types._UE, 9);
		public static final ExecutorProperty _UE__semainier = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__SEMAINIER, Types._UE, 10);
		public static final ExecutorProperty _UE__semestre = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__SEMESTRE, Types._UE, 11);
		public static final ExecutorProperty _UE__specialite = new EcoreExecutorProperty(MymetamodelPackage.Literals.UE__SPECIALITE, Types._UE, 12);
		public static final ExecutorProperty _UE__Responsable__ue = new ExecutorPropertyWithImplementation("Responsable", Types._UE, 13, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.RESPONSABLE__UE));

		public static final ExecutorProperty _prerequis__description = new EcoreExecutorProperty(MymetamodelPackage.Literals.PREREQUIS__DESCRIPTION, Types._prerequis, 0);
		public static final ExecutorProperty _prerequis__UE__prerequis = new ExecutorPropertyWithImplementation("UE", Types._prerequis, 1, new EcoreLibraryOppositeProperty(MymetamodelPackage.Literals.UE__PREREQUIS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Debouche =
			{
				Fragments._Debouche__OclAny /* 0 */,
				Fragments._Debouche__OclElement /* 1 */,
				Fragments._Debouche__Debouche /* 2 */
			};
		private static final int /*@NonNull*/ [] __Debouche = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Departement =
			{
				Fragments._Departement__OclAny /* 0 */,
				Fragments._Departement__OclElement /* 1 */,
				Fragments._Departement__Departement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Departement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Formation =
			{
				Fragments._Formation__OclAny /* 0 */,
				Fragments._Formation__OclElement /* 1 */,
				Fragments._Formation__Formation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Formation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _JOUR =
			{
				Fragments._JOUR__OclAny /* 0 */,
				Fragments._JOUR__OclElement /* 1 */,
				Fragments._JOUR__OclType /* 2 */,
				Fragments._JOUR__OclEnumeration /* 3 */,
				Fragments._JOUR__JOUR /* 4 */
			};
		private static final int /*@NonNull*/ [] __JOUR = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Niveau =
			{
				Fragments._Niveau__OclAny /* 0 */,
				Fragments._Niveau__OclElement /* 1 */,
				Fragments._Niveau__Niveau /* 2 */
			};
		private static final int /*@NonNull*/ [] __Niveau = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Programmation =
			{
				Fragments._Programmation__OclAny /* 0 */,
				Fragments._Programmation__OclElement /* 1 */,
				Fragments._Programmation__Programmation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Programmation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Responsable =
			{
				Fragments._Responsable__OclAny /* 0 */,
				Fragments._Responsable__OclElement /* 1 */,
				Fragments._Responsable__Responsable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Responsable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ressource =
			{
				Fragments._Ressource__OclAny /* 0 */,
				Fragments._Ressource__OclElement /* 1 */,
				Fragments._Ressource__Ressource /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ressource = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SEXE =
			{
				Fragments._SEXE__OclAny /* 0 */,
				Fragments._SEXE__OclElement /* 1 */,
				Fragments._SEXE__OclType /* 2 */,
				Fragments._SEXE__OclEnumeration /* 3 */,
				Fragments._SEXE__SEXE /* 4 */
			};
		private static final int /*@NonNull*/ [] __SEXE = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Semainier =
			{
				Fragments._Semainier__OclAny /* 0 */,
				Fragments._Semainier__OclElement /* 1 */,
				Fragments._Semainier__Semainier /* 2 */
			};
		private static final int /*@NonNull*/ [] __Semainier = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Semestre =
			{
				Fragments._Semestre__OclAny /* 0 */,
				Fragments._Semestre__OclElement /* 1 */,
				Fragments._Semestre__Semestre /* 2 */
			};
		private static final int /*@NonNull*/ [] __Semestre = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Specialite =
			{
				Fragments._Specialite__OclAny /* 0 */,
				Fragments._Specialite__OclElement /* 1 */,
				Fragments._Specialite__Specialite /* 2 */
			};
		private static final int /*@NonNull*/ [] __Specialite = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TYPE =
			{
				Fragments._TYPE__OclAny /* 0 */,
				Fragments._TYPE__OclElement /* 1 */,
				Fragments._TYPE__OclType /* 2 */,
				Fragments._TYPE__OclEnumeration /* 3 */,
				Fragments._TYPE__TYPE /* 4 */
			};
		private static final int /*@NonNull*/ [] __TYPE = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UE =
			{
				Fragments._UE__OclAny /* 0 */,
				Fragments._UE__OclElement /* 1 */,
				Fragments._UE__UE /* 2 */
			};
		private static final int /*@NonNull*/ [] __UE = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _prerequis =
			{
				Fragments._prerequis__OclAny /* 0 */,
				Fragments._prerequis__OclElement /* 1 */,
				Fragments._prerequis__prerequis /* 2 */
			};
		private static final int /*@NonNull*/ [] __prerequis = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Debouche.initFragments(_Debouche, __Debouche);
			Types._Departement.initFragments(_Departement, __Departement);
			Types._Formation.initFragments(_Formation, __Formation);
			Types._JOUR.initFragments(_JOUR, __JOUR);
			Types._Niveau.initFragments(_Niveau, __Niveau);
			Types._Programmation.initFragments(_Programmation, __Programmation);
			Types._Responsable.initFragments(_Responsable, __Responsable);
			Types._Ressource.initFragments(_Ressource, __Ressource);
			Types._SEXE.initFragments(_SEXE, __SEXE);
			Types._Semainier.initFragments(_Semainier, __Semainier);
			Types._Semestre.initFragments(_Semestre, __Semestre);
			Types._Specialite.initFragments(_Specialite, __Specialite);
			Types._TYPE.initFragments(_TYPE, __TYPE);
			Types._UE.initFragments(_UE, __UE);
			Types._prerequis.initFragments(_prerequis, __prerequis);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Debouche__Debouche = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Debouche__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Debouche__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Departement__Departement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Formation__Formation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Formation__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Formation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _JOUR__JOUR = {};
		private static final ExecutorOperation /*@NonNull*/ [] _JOUR__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _JOUR__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JOUR__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _JOUR__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__Niveau = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__Programmation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Responsable__Responsable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Responsable__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Responsable__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _SEXE__SEXE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SEXE__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SEXE__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SEXE__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SEXE__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Semainier__Semainier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Semainier__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Semainier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__Semestre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__Specialite = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TYPE__TYPE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TYPE__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _TYPE__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TYPE__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TYPE__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UE__UE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UE__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _UE__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _prerequis__prerequis = {};
		private static final ExecutorOperation /*@NonNull*/ [] _prerequis__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _prerequis__OclElement = {
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
			Fragments._Debouche__Debouche.initOperations(_Debouche__Debouche);
			Fragments._Debouche__OclAny.initOperations(_Debouche__OclAny);
			Fragments._Debouche__OclElement.initOperations(_Debouche__OclElement);

			Fragments._Departement__Departement.initOperations(_Departement__Departement);
			Fragments._Departement__OclAny.initOperations(_Departement__OclAny);
			Fragments._Departement__OclElement.initOperations(_Departement__OclElement);

			Fragments._Formation__Formation.initOperations(_Formation__Formation);
			Fragments._Formation__OclAny.initOperations(_Formation__OclAny);
			Fragments._Formation__OclElement.initOperations(_Formation__OclElement);

			Fragments._JOUR__JOUR.initOperations(_JOUR__JOUR);
			Fragments._JOUR__OclAny.initOperations(_JOUR__OclAny);
			Fragments._JOUR__OclElement.initOperations(_JOUR__OclElement);
			Fragments._JOUR__OclEnumeration.initOperations(_JOUR__OclEnumeration);
			Fragments._JOUR__OclType.initOperations(_JOUR__OclType);

			Fragments._Niveau__Niveau.initOperations(_Niveau__Niveau);
			Fragments._Niveau__OclAny.initOperations(_Niveau__OclAny);
			Fragments._Niveau__OclElement.initOperations(_Niveau__OclElement);

			Fragments._Programmation__OclAny.initOperations(_Programmation__OclAny);
			Fragments._Programmation__OclElement.initOperations(_Programmation__OclElement);
			Fragments._Programmation__Programmation.initOperations(_Programmation__Programmation);

			Fragments._Responsable__OclAny.initOperations(_Responsable__OclAny);
			Fragments._Responsable__OclElement.initOperations(_Responsable__OclElement);
			Fragments._Responsable__Responsable.initOperations(_Responsable__Responsable);

			Fragments._Ressource__OclAny.initOperations(_Ressource__OclAny);
			Fragments._Ressource__OclElement.initOperations(_Ressource__OclElement);
			Fragments._Ressource__Ressource.initOperations(_Ressource__Ressource);

			Fragments._SEXE__OclAny.initOperations(_SEXE__OclAny);
			Fragments._SEXE__OclElement.initOperations(_SEXE__OclElement);
			Fragments._SEXE__OclEnumeration.initOperations(_SEXE__OclEnumeration);
			Fragments._SEXE__OclType.initOperations(_SEXE__OclType);
			Fragments._SEXE__SEXE.initOperations(_SEXE__SEXE);

			Fragments._Semainier__OclAny.initOperations(_Semainier__OclAny);
			Fragments._Semainier__OclElement.initOperations(_Semainier__OclElement);
			Fragments._Semainier__Semainier.initOperations(_Semainier__Semainier);

			Fragments._Semestre__OclAny.initOperations(_Semestre__OclAny);
			Fragments._Semestre__OclElement.initOperations(_Semestre__OclElement);
			Fragments._Semestre__Semestre.initOperations(_Semestre__Semestre);

			Fragments._Specialite__OclAny.initOperations(_Specialite__OclAny);
			Fragments._Specialite__OclElement.initOperations(_Specialite__OclElement);
			Fragments._Specialite__Specialite.initOperations(_Specialite__Specialite);

			Fragments._TYPE__OclAny.initOperations(_TYPE__OclAny);
			Fragments._TYPE__OclElement.initOperations(_TYPE__OclElement);
			Fragments._TYPE__OclEnumeration.initOperations(_TYPE__OclEnumeration);
			Fragments._TYPE__OclType.initOperations(_TYPE__OclType);
			Fragments._TYPE__TYPE.initOperations(_TYPE__TYPE);

			Fragments._UE__OclAny.initOperations(_UE__OclAny);
			Fragments._UE__OclElement.initOperations(_UE__OclElement);
			Fragments._UE__UE.initOperations(_UE__UE);

			Fragments._prerequis__OclAny.initOperations(_prerequis__OclAny);
			Fragments._prerequis__OclElement.initOperations(_prerequis__OclElement);
			Fragments._prerequis__prerequis.initOperations(_prerequis__prerequis);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Debouche = {
			MymetamodelTables.Properties._Debouche__description,
			MymetamodelTables.Properties._Debouche__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Departement = {
			MymetamodelTables.Properties._Departement__chef,
			MymetamodelTables.Properties._Departement__description,
			MymetamodelTables.Properties._Departement__formation,
			MymetamodelTables.Properties._Departement__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Departement__responsable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Formation = {
			MymetamodelTables.Properties._Formation__debouche,
			MymetamodelTables.Properties._Formation__description,
			MymetamodelTables.Properties._Formation__niveau,
			MymetamodelTables.Properties._Formation__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Formation__responsable,
			MymetamodelTables.Properties._Formation__specialite
		};

		private static final ExecutorProperty /*@NonNull*/ [] _JOUR = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Niveau = {
			MymetamodelTables.Properties._Niveau__description,
			MymetamodelTables.Properties._Niveau__formation,
			MymetamodelTables.Properties._Niveau__nom,
			MymetamodelTables.Properties._Niveau__numero,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Niveau__responsable,
			MymetamodelTables.Properties._Niveau__semestre,
			MymetamodelTables.Properties._Niveau__specialite
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Programmation = {
			MymetamodelTables.Properties._Programmation__heureDebut,
			MymetamodelTables.Properties._Programmation__heureFin,
			MymetamodelTables.Properties._Programmation__jour,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Programmation__responsable,
			MymetamodelTables.Properties._Programmation__salle
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Responsable = {
			MymetamodelTables.Properties._Responsable__dateNaissance,
			MymetamodelTables.Properties._Responsable__fonction,
			MymetamodelTables.Properties._Responsable__formation,
			MymetamodelTables.Properties._Responsable__mail,
			MymetamodelTables.Properties._Responsable__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Responsable__sexe,
			MymetamodelTables.Properties._Responsable__telephone,
			MymetamodelTables.Properties._Responsable__ue
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ressource = {
			MymetamodelTables.Properties._Ressource__chemin,
			MymetamodelTables.Properties._Ressource__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Ressource__type,
			MymetamodelTables.Properties._Ressource__ue
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SEXE = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Semainier = {
			MymetamodelTables.Properties._Semainier__contenu,
			MymetamodelTables.Properties._Semainier__dateDebut,
			MymetamodelTables.Properties._Semainier__dateFin,
			MymetamodelTables.Properties._Semainier__numero,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Semainier__programmation,
			MymetamodelTables.Properties._Semainier__semestre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Semestre = {
			MymetamodelTables.Properties._Semestre__dateDebut,
			MymetamodelTables.Properties._Semestre__dateFin,
			MymetamodelTables.Properties._Semestre__description,
			MymetamodelTables.Properties._Semestre__nbSemaine,
			MymetamodelTables.Properties._Semestre__niveau,
			MymetamodelTables.Properties._Semestre__numero,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Semestre__semainier,
			MymetamodelTables.Properties._Semestre__ue
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Specialite = {
			MymetamodelTables.Properties._Specialite__description,
			MymetamodelTables.Properties._Specialite__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._Specialite__responsable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TYPE = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UE = {
			MymetamodelTables.Properties._UE__code,
			MymetamodelTables.Properties._UE__credit,
			MymetamodelTables.Properties._UE__description,
			MymetamodelTables.Properties._UE__isOptionel,
			MymetamodelTables.Properties._UE__nom,
			MymetamodelTables.Properties._UE__objectif,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MymetamodelTables.Properties._UE__prerequis,
			MymetamodelTables.Properties._UE__programmation,
			MymetamodelTables.Properties._UE__responsable,
			MymetamodelTables.Properties._UE__ressource,
			MymetamodelTables.Properties._UE__semainier,
			MymetamodelTables.Properties._UE__semestre,
			MymetamodelTables.Properties._UE__specialite
		};

		private static final ExecutorProperty /*@NonNull*/ [] _prerequis = {
			MymetamodelTables.Properties._prerequis__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Debouche__Debouche.initProperties(_Debouche);
			Fragments._Departement__Departement.initProperties(_Departement);
			Fragments._Formation__Formation.initProperties(_Formation);
			Fragments._JOUR__JOUR.initProperties(_JOUR);
			Fragments._Niveau__Niveau.initProperties(_Niveau);
			Fragments._Programmation__Programmation.initProperties(_Programmation);
			Fragments._Responsable__Responsable.initProperties(_Responsable);
			Fragments._Ressource__Ressource.initProperties(_Ressource);
			Fragments._SEXE__SEXE.initProperties(_SEXE);
			Fragments._Semainier__Semainier.initProperties(_Semainier);
			Fragments._Semestre__Semestre.initProperties(_Semestre);
			Fragments._Specialite__Specialite.initProperties(_Specialite);
			Fragments._TYPE__TYPE.initProperties(_TYPE);
			Fragments._UE__UE.initProperties(_UE);
			Fragments._prerequis__prerequis.initProperties(_prerequis);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _JOUR__Lundi = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.JOUR.getEEnumLiteral("Lundi"), Types._JOUR, 0);
		public static final EcoreExecutorEnumerationLiteral _JOUR__Mardi = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.JOUR.getEEnumLiteral("Mardi"), Types._JOUR, 1);
		public static final EcoreExecutorEnumerationLiteral _JOUR__Mercredi = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.JOUR.getEEnumLiteral("Mercredi"), Types._JOUR, 2);
		public static final EcoreExecutorEnumerationLiteral _JOUR__Jeudi = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.JOUR.getEEnumLiteral("Jeudi"), Types._JOUR, 3);
		public static final EcoreExecutorEnumerationLiteral _JOUR__Vendredi = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.JOUR.getEEnumLiteral("Vendredi"), Types._JOUR, 4);
		public static final EcoreExecutorEnumerationLiteral _JOUR__Samedi = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.JOUR.getEEnumLiteral("Samedi"), Types._JOUR, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _JOUR = {
			_JOUR__Lundi,
			_JOUR__Mardi,
			_JOUR__Mercredi,
			_JOUR__Jeudi,
			_JOUR__Vendredi,
			_JOUR__Samedi
		};

		public static final EcoreExecutorEnumerationLiteral _SEXE__Homme = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.SEXE.getEEnumLiteral("Homme"), Types._SEXE, 0);
		public static final EcoreExecutorEnumerationLiteral _SEXE__Femme = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.SEXE.getEEnumLiteral("Femme"), Types._SEXE, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SEXE = {
			_SEXE__Homme,
			_SEXE__Femme
		};

		public static final EcoreExecutorEnumerationLiteral _TYPE__video = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.TYPE.getEEnumLiteral("video"), Types._TYPE, 0);
		public static final EcoreExecutorEnumerationLiteral _TYPE__audio = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.TYPE.getEEnumLiteral("audio"), Types._TYPE, 1);
		public static final EcoreExecutorEnumerationLiteral _TYPE__slide = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.TYPE.getEEnumLiteral("slide"), Types._TYPE, 2);
		public static final EcoreExecutorEnumerationLiteral _TYPE__code = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.TYPE.getEEnumLiteral("code"), Types._TYPE, 3);
		public static final EcoreExecutorEnumerationLiteral _TYPE__pdf = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.TYPE.getEEnumLiteral("pdf"), Types._TYPE, 4);
		public static final EcoreExecutorEnumerationLiteral _TYPE__others = new EcoreExecutorEnumerationLiteral(MymetamodelPackage.Literals.TYPE.getEEnumLiteral("others"), Types._TYPE, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TYPE = {
			_TYPE__video,
			_TYPE__audio,
			_TYPE__slide,
			_TYPE__code,
			_TYPE__pdf,
			_TYPE__others
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._JOUR.initLiterals(_JOUR);
			Types._SEXE.initLiterals(_SEXE);
			Types._TYPE.initLiterals(_TYPE);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MymetamodelTables::EnumerationLiterals and all preceding sub-packages.
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
		new MymetamodelTables();
	}

	private MymetamodelTables() {
		super(MymetamodelPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		MymetamodelPackage.Literals.DEPARTEMENT,
		MymetamodelPackage.Literals.FORMATION,
		MymetamodelPackage.Literals.RESSOURCE,
		MymetamodelPackage.Literals.SPECIALITE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
