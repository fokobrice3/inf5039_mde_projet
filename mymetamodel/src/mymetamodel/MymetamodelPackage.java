/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mymetamodel.MymetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MymetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mymetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mymetamodel1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mymm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MymetamodelPackage eINSTANCE = mymetamodel.impl.MymetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mymetamodel.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.DepartementImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__FORMATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__RESPONSABLE = 3;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__CHEF = 4;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>At Least One Formation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___AT_LEAST_ONE_FORMATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Au Moins1 Responsable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Unique Dep Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___UNIQUE_DEP_NAME__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___NAMED__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Unique Formation List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___UNIQUE_FORMATION_LIST__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.FormationImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Debouche</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DEBOUCHE = 3;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__RESPONSABLE = 4;

	/**
	 * The feature id for the '<em><b>Specialite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SPECIALITE = 5;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___NAMED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Nom Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Au Moins1 Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___AU_MOINS1_NIVEAU__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Niveau Distinct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___NIVEAU_DISTINCT__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.NiveauImpl <em>Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.NiveauImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__NOM = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SEMESTRE = 3;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__FORMATION = 4;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__RESPONSABLE = 5;

	/**
	 * The feature id for the '<em><b>Specialite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SPECIALITE = 6;

	/**
	 * The number of structural features of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Multi Specialite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___MULTI_SPECIALITE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Associe Semestre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___ASSOCIE_SEMESTRE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Au Moins1 Responsable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Semestre Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___NAMED__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Associe Formation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___ASSOCIE_FORMATION__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Numero Semestre Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___NUMERO_SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Not Speciality Wth Diff Level Wth Same Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU___NOT_SPECIALITY_WTH_DIFF_LEVEL_WTH_SAME_NAME__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The number of operations of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.SpecialiteImpl <em>Specialite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.SpecialiteImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getSpecialite()
	 * @generated
	 */
	int SPECIALITE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__RESPONSABLE = 2;

	/**
	 * The number of structural features of the '<em>Specialite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE___NAMED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Nom Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Specialite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.SemestreImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 4;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__DATE_DEBUT = 3;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__DATE_FIN = 4;

	/**
	 * The feature id for the '<em><b>Semainier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__SEMAINIER = 5;

	/**
	 * The feature id for the '<em><b>Nb Semaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NB_SEMAINE = 6;

	/**
	 * The feature id for the '<em><b>Ue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UE = 7;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Numero Unique Par Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE___NUMERO_UNIQUE_PAR_NIVEAU__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Nombre Semaine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE___NOMBRE_SEMAINE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Associe Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE___ASSOCIE_NIVEAU__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE___NAMED__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Au Moins1 Ue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE___AU_MOINS1_UE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Nombre Seances Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE___NOMBRE_SEANCES_VALIDE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.SemainierImpl <em>Semainier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.SemainierImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getSemainier()
	 * @generated
	 */
	int SEMAINIER = 5;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__DATE_DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__DATE_FIN = 2;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__CONTENU = 3;

	/**
	 * The feature id for the '<em><b>Programmation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__PROGRAMMATION = 4;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER__SEMESTRE = 5;

	/**
	 * The number of structural features of the '<em>Semainier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Contenu Defini</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER___NAMED__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Semainier Valide Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER___SEMAINIER_VALIDE_DATE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Dates Seances Valides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER___DATES_SEANCES_VALIDES__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Pour Un Seul Semestre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER___POUR_UN_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Semainier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAINIER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.UEImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getUE()
	 * @generated
	 */
	int UE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__OBJECTIF = 4;

	/**
	 * The feature id for the '<em><b>Prerequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PREREQUIS = 5;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESSOURCE = 6;

	/**
	 * The feature id for the '<em><b>Semainier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__SEMAINIER = 7;

	/**
	 * The feature id for the '<em><b>Programmation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PROGRAMMATION = 8;

	/**
	 * The feature id for the '<em><b>Specialite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__SPECIALITE = 9;

	/**
	 * The feature id for the '<em><b>Is Optionel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__IS_OPTIONEL = 10;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESPONSABLE = 11;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__SEMESTRE = 12;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Plusieurs Ressources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___PLUSIEURS_RESSOURCES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Enseignants Valides</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___ENSEIGNANTS_VALIDES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Au Moins1 Responsable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Dans1 Seul Semestre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___DANS1_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Semanier Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___SEMANIER_VALIDE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___NAMED__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.RessourceImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__CHEMIN = 2;

	/**
	 * The feature id for the '<em><b>Ue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__UE = 3;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___NAMED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Nom Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Une Seule Ue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___UNE_SEULE_UE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.ResponsableImpl <em>Responsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.ResponsableImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getResponsable()
	 * @generated
	 */
	int RESPONSABLE = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__TELEPHONE = 1;

	/**
	 * The feature id for the '<em><b>Sexe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__SEXE = 2;

	/**
	 * The feature id for the '<em><b>Fonction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__FONCTION = 3;

	/**
	 * The feature id for the '<em><b>Date Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__DATE_NAISSANCE = 4;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__MAIL = 5;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__FORMATION = 6;

	/**
	 * The feature id for the '<em><b>Ue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__UE = 7;

	/**
	 * The number of structural features of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Ues Dans Formations Ou Intervient</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE___UES_DANS_FORMATIONS_OU_INTERVIENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.prerequisImpl <em>prerequis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.prerequisImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getprerequis()
	 * @generated
	 */
	int PREREQUIS = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUIS__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>prerequis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUIS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUIS___NAMED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>prerequis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUIS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.DeboucheImpl <em>Debouche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.DeboucheImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getDebouche()
	 * @generated
	 */
	int DEBOUCHE = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBOUCHE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBOUCHE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Debouche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBOUCHE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Named</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBOUCHE___NAMED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Debouche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBOUCHE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.ProgrammationImpl <em>Programmation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.ProgrammationImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getProgrammation()
	 * @generated
	 */
	int PROGRAMMATION = 11;

	/**
	 * The feature id for the '<em><b>Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__JOUR = 0;

	/**
	 * The feature id for the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__HEURE_DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__HEURE_FIN = 2;

	/**
	 * The feature id for the '<em><b>Salle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__SALLE = 3;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__RESPONSABLE = 4;

	/**
	 * The number of structural features of the '<em>Programmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Contenu Defini</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Tranche Horaire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION___TRANCHE_HORAIRE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Horaire Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION___HORAIRE_VALID__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Programmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link mymetamodel.TYPE <em>TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.TYPE
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getTYPE()
	 * @generated
	 */
	int TYPE = 12;

	/**
	 * The meta object id for the '{@link mymetamodel.SEXE <em>SEXE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.SEXE
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getSEXE()
	 * @generated
	 */
	int SEXE = 13;

	/**
	 * The meta object id for the '{@link mymetamodel.JOUR <em>JOUR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.JOUR
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getJOUR()
	 * @generated
	 */
	int JOUR = 14;


	/**
	 * Returns the meta object for class '{@link mymetamodel.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see mymetamodel.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Departement#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formation</em>'.
	 * @see mymetamodel.Departement#getFormation()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Formation();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Departement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Departement#getDescription()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Departement#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsable</em>'.
	 * @see mymetamodel.Departement#getResponsable()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Responsable();

	/**
	 * Returns the meta object for the reference '{@link mymetamodel.Departement#getChef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chef</em>'.
	 * @see mymetamodel.Departement#getChef()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Chef();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Departement#atLeastOneFormation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Formation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One Formation</em>' operation.
	 * @see mymetamodel.Departement#atLeastOneFormation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__AtLeastOneFormation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Departement#auMoins1Responsable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins1 Responsable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins1 Responsable</em>' operation.
	 * @see mymetamodel.Departement#auMoins1Responsable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__AuMoins1Responsable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Departement#uniqueDepName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Dep Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Dep Name</em>' operation.
	 * @see mymetamodel.Departement#uniqueDepName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__UniqueDepName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Departement#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Departement#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Departement#UniqueFormationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Formation List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Formation List</em>' operation.
	 * @see mymetamodel.Departement#UniqueFormationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__UniqueFormationList__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see mymetamodel.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Formation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Formation#getNom()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Formation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Formation#getDescription()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Formation#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Niveau</em>'.
	 * @see mymetamodel.Formation#getNiveau()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Niveau();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Formation#getDebouche <em>Debouche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Debouche</em>'.
	 * @see mymetamodel.Formation#getDebouche()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Debouche();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.Formation#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsable</em>'.
	 * @see mymetamodel.Formation#getResponsable()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Responsable();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Formation#getSpecialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialite</em>'.
	 * @see mymetamodel.Formation#getSpecialite()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Specialite();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Formation#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Formation#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Formation#nomUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Unique</em>' operation.
	 * @see mymetamodel.Formation#nomUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__NomUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Formation#auMoins1Niveau(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins1 Niveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins1 Niveau</em>' operation.
	 * @see mymetamodel.Formation#auMoins1Niveau(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__AuMoins1Niveau__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Formation#niveauDistinct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Niveau Distinct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Niveau Distinct</em>' operation.
	 * @see mymetamodel.Formation#niveauDistinct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__NiveauDistinct__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Niveau</em>'.
	 * @see mymetamodel.Niveau
	 * @generated
	 */
	EClass getNiveau();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Niveau#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mymetamodel.Niveau#getNumero()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Niveau#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Niveau#getNom()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Niveau#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Niveau#getDescription()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Niveau#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestre</em>'.
	 * @see mymetamodel.Niveau#getSemestre()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Semestre();

	/**
	 * Returns the meta object for the container reference '{@link mymetamodel.Niveau#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formation</em>'.
	 * @see mymetamodel.Niveau#getFormation()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Formation();

	/**
	 * Returns the meta object for the reference '{@link mymetamodel.Niveau#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see mymetamodel.Niveau#getResponsable()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Responsable();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.Niveau#getSpecialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialite</em>'.
	 * @see mymetamodel.Niveau#getSpecialite()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Specialite();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#multiSpecialite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Multi Specialite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multi Specialite</em>' operation.
	 * @see mymetamodel.Niveau#multiSpecialite(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__MultiSpecialite__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#associeSemestre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Associe Semestre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Associe Semestre</em>' operation.
	 * @see mymetamodel.Niveau#associeSemestre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__AssocieSemestre__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#auMoins1Responsable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins1 Responsable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins1 Responsable</em>' operation.
	 * @see mymetamodel.Niveau#auMoins1Responsable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__AuMoins1Responsable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#semestreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Semestre Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Semestre Unique</em>' operation.
	 * @see mymetamodel.Niveau#semestreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__SemestreUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Niveau#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#associeFormation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Associe Formation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Associe Formation</em>' operation.
	 * @see mymetamodel.Niveau#associeFormation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__AssocieFormation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#numeroSemestreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Numero Semestre Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Numero Semestre Unique</em>' operation.
	 * @see mymetamodel.Niveau#numeroSemestreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__NumeroSemestreUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Niveau#NotSpecialityWthDiffLevelWthSameName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Speciality Wth Diff Level Wth Same Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Speciality Wth Diff Level Wth Same Name</em>' operation.
	 * @see mymetamodel.Niveau#NotSpecialityWthDiffLevelWthSameName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNiveau__NotSpecialityWthDiffLevelWthSameName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Specialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialite</em>'.
	 * @see mymetamodel.Specialite
	 * @generated
	 */
	EClass getSpecialite();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Specialite#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Specialite#getNom()
	 * @see #getSpecialite()
	 * @generated
	 */
	EAttribute getSpecialite_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Specialite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Specialite#getDescription()
	 * @see #getSpecialite()
	 * @generated
	 */
	EAttribute getSpecialite_Description();

	/**
	 * Returns the meta object for the reference '{@link mymetamodel.Specialite#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see mymetamodel.Specialite#getResponsable()
	 * @see #getSpecialite()
	 * @generated
	 */
	EReference getSpecialite_Responsable();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Specialite#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Specialite#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecialite__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Specialite#nomUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Unique</em>' operation.
	 * @see mymetamodel.Specialite#nomUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecialite__NomUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see mymetamodel.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semestre#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mymetamodel.Semestre#getNumero()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semestre#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Semestre#getDescription()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Description();

	/**
	 * Returns the meta object for the container reference '{@link mymetamodel.Semestre#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Niveau</em>'.
	 * @see mymetamodel.Semestre#getNiveau()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Niveau();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semestre#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see mymetamodel.Semestre#getDateDebut()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semestre#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see mymetamodel.Semestre#getDateFin()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_DateFin();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Semestre#getSemainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semainier</em>'.
	 * @see mymetamodel.Semestre#getSemainier()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Semainier();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semestre#getNbSemaine <em>Nb Semaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Semaine</em>'.
	 * @see mymetamodel.Semestre#getNbSemaine()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_NbSemaine();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Semestre#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ue</em>'.
	 * @see mymetamodel.Semestre#getUe()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Ue();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semestre#numeroUniqueParNiveau(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Numero Unique Par Niveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Numero Unique Par Niveau</em>' operation.
	 * @see mymetamodel.Semestre#numeroUniqueParNiveau(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemestre__NumeroUniqueParNiveau__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semestre#nombreSemaine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre Semaine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre Semaine</em>' operation.
	 * @see mymetamodel.Semestre#nombreSemaine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemestre__NombreSemaine__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semestre#AssocieNiveau(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Associe Niveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Associe Niveau</em>' operation.
	 * @see mymetamodel.Semestre#AssocieNiveau(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemestre__AssocieNiveau__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semestre#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Semestre#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemestre__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semestre#auMoins1Ue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins1 Ue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins1 Ue</em>' operation.
	 * @see mymetamodel.Semestre#auMoins1Ue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemestre__AuMoins1Ue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semestre#NombreSeancesValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre Seances Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre Seances Valide</em>' operation.
	 * @see mymetamodel.Semestre#NombreSeancesValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemestre__NombreSeancesValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Semainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semainier</em>'.
	 * @see mymetamodel.Semainier
	 * @generated
	 */
	EClass getSemainier();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semainier#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mymetamodel.Semainier#getNumero()
	 * @see #getSemainier()
	 * @generated
	 */
	EAttribute getSemainier_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semainier#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see mymetamodel.Semainier#getDateDebut()
	 * @see #getSemainier()
	 * @generated
	 */
	EAttribute getSemainier_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semainier#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see mymetamodel.Semainier#getDateFin()
	 * @see #getSemainier()
	 * @generated
	 */
	EAttribute getSemainier_DateFin();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Semainier#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see mymetamodel.Semainier#getContenu()
	 * @see #getSemainier()
	 * @generated
	 */
	EAttribute getSemainier_Contenu();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Semainier#getProgrammation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmation</em>'.
	 * @see mymetamodel.Semainier#getProgrammation()
	 * @see #getSemainier()
	 * @generated
	 */
	EReference getSemainier_Programmation();

	/**
	 * Returns the meta object for the container reference '{@link mymetamodel.Semainier#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semestre</em>'.
	 * @see mymetamodel.Semainier#getSemestre()
	 * @see #getSemainier()
	 * @generated
	 */
	EReference getSemainier_Semestre();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semainier#ContenuDefini(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contenu Defini</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contenu Defini</em>' operation.
	 * @see mymetamodel.Semainier#ContenuDefini(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemainier__ContenuDefini__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semainier#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Semainier#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemainier__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semainier#SemainierValideDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Semainier Valide Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Semainier Valide Date</em>' operation.
	 * @see mymetamodel.Semainier#SemainierValideDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemainier__SemainierValideDate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semainier#DatesSeancesValides(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dates Seances Valides</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dates Seances Valides</em>' operation.
	 * @see mymetamodel.Semainier#DatesSeancesValides(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemainier__DatesSeancesValides__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Semainier#pourUnSeulSemestre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Pour Un Seul Semestre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pour Un Seul Semestre</em>' operation.
	 * @see mymetamodel.Semainier#pourUnSeulSemestre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSemainier__PourUnSeulSemestre__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see mymetamodel.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.UE#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.UE#getNom()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.UE#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see mymetamodel.UE#getCode()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Code();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.UE#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see mymetamodel.UE#getCredit()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Credit();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.UE#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.UE#getDescription()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Description();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.UE#getObjectif <em>Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objectif</em>'.
	 * @see mymetamodel.UE#getObjectif()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Objectif();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.UE#getPrerequis <em>Prerequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequis</em>'.
	 * @see mymetamodel.UE#getPrerequis()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Prerequis();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.UE#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressource</em>'.
	 * @see mymetamodel.UE#getRessource()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Ressource();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.UE#getSemainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semainier</em>'.
	 * @see mymetamodel.UE#getSemainier()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Semainier();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.UE#getProgrammation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programmation</em>'.
	 * @see mymetamodel.UE#getProgrammation()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Programmation();

	/**
	 * Returns the meta object for the reference '{@link mymetamodel.UE#getSpecialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialite</em>'.
	 * @see mymetamodel.UE#getSpecialite()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Specialite();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.UE#isIsOptionel <em>Is Optionel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optionel</em>'.
	 * @see mymetamodel.UE#isIsOptionel()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_IsOptionel();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.UE#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsable</em>'.
	 * @see mymetamodel.UE#getResponsable()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Responsable();

	/**
	 * Returns the meta object for the container reference '{@link mymetamodel.UE#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semestre</em>'.
	 * @see mymetamodel.UE#getSemestre()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Semestre();

	/**
	 * Returns the meta object for the '{@link mymetamodel.UE#plusieursRessources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Plusieurs Ressources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plusieurs Ressources</em>' operation.
	 * @see mymetamodel.UE#plusieursRessources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__PlusieursRessources__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.UE#EnseignantsValides(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Enseignants Valides</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enseignants Valides</em>' operation.
	 * @see mymetamodel.UE#EnseignantsValides(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__EnseignantsValides__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.UE#auMoins1Responsable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins1 Responsable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins1 Responsable</em>' operation.
	 * @see mymetamodel.UE#auMoins1Responsable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__AuMoins1Responsable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.UE#dans1SeulSemestre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dans1 Seul Semestre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dans1 Seul Semestre</em>' operation.
	 * @see mymetamodel.UE#dans1SeulSemestre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__Dans1SeulSemestre__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.UE#semanierValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Semanier Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Semanier Valide</em>' operation.
	 * @see mymetamodel.UE#semanierValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__SemanierValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.UE#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.UE#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see mymetamodel.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Ressource#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Ressource#getNom()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Ressource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mymetamodel.Ressource#getType()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Type();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Ressource#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see mymetamodel.Ressource#getChemin()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Chemin();

	/**
	 * Returns the meta object for the container reference '{@link mymetamodel.Ressource#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ue</em>'.
	 * @see mymetamodel.Ressource#getUe()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Ue();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Ressource#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Ressource#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRessource__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Ressource#nomUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Unique</em>' operation.
	 * @see mymetamodel.Ressource#nomUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRessource__NomUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Ressource#uneSeuleUe(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Une Seule Ue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Une Seule Ue</em>' operation.
	 * @see mymetamodel.Ressource#uneSeuleUe(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRessource__UneSeuleUe__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsable</em>'.
	 * @see mymetamodel.Responsable
	 * @generated
	 */
	EClass getResponsable();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Responsable#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Responsable#getNom()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Responsable#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see mymetamodel.Responsable#getTelephone()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Responsable#getSexe <em>Sexe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sexe</em>'.
	 * @see mymetamodel.Responsable#getSexe()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Sexe();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Responsable#getFonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fonction</em>'.
	 * @see mymetamodel.Responsable#getFonction()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Fonction();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Responsable#getDateNaissance <em>Date Naissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Naissance</em>'.
	 * @see mymetamodel.Responsable#getDateNaissance()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_DateNaissance();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Responsable#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see mymetamodel.Responsable#getMail()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Mail();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.Responsable#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formation</em>'.
	 * @see mymetamodel.Responsable#getFormation()
	 * @see #getResponsable()
	 * @generated
	 */
	EReference getResponsable_Formation();

	/**
	 * Returns the meta object for the reference list '{@link mymetamodel.Responsable#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ue</em>'.
	 * @see mymetamodel.Responsable#getUe()
	 * @see #getResponsable()
	 * @generated
	 */
	EReference getResponsable_Ue();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Responsable#UesDansFormationsOuIntervient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Ues Dans Formations Ou Intervient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ues Dans Formations Ou Intervient</em>' operation.
	 * @see mymetamodel.Responsable#UesDansFormationsOuIntervient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResponsable__UesDansFormationsOuIntervient__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.prerequis <em>prerequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>prerequis</em>'.
	 * @see mymetamodel.prerequis
	 * @generated
	 */
	EClass getprerequis();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.prerequis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.prerequis#getDescription()
	 * @see #getprerequis()
	 * @generated
	 */
	EAttribute getprerequis_Description();

	/**
	 * Returns the meta object for the '{@link mymetamodel.prerequis#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.prerequis#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getprerequis__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Debouche <em>Debouche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debouche</em>'.
	 * @see mymetamodel.Debouche
	 * @generated
	 */
	EClass getDebouche();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Debouche#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.Debouche#getNom()
	 * @see #getDebouche()
	 * @generated
	 */
	EAttribute getDebouche_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Debouche#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Debouche#getDescription()
	 * @see #getDebouche()
	 * @generated
	 */
	EAttribute getDebouche_Description();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Debouche#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Named</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Named</em>' operation.
	 * @see mymetamodel.Debouche#Named(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDebouche__Named__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Programmation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmation</em>'.
	 * @see mymetamodel.Programmation
	 * @generated
	 */
	EClass getProgrammation();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Programmation#getJour <em>Jour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jour</em>'.
	 * @see mymetamodel.Programmation#getJour()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Jour();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Programmation#getHeureDebut <em>Heure Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Debut</em>'.
	 * @see mymetamodel.Programmation#getHeureDebut()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_HeureDebut();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Programmation#getHeureFin <em>Heure Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Fin</em>'.
	 * @see mymetamodel.Programmation#getHeureFin()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_HeureFin();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Programmation#getSalle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salle</em>'.
	 * @see mymetamodel.Programmation#getSalle()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Salle();

	/**
	 * Returns the meta object for the reference '{@link mymetamodel.Programmation#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see mymetamodel.Programmation#getResponsable()
	 * @see #getProgrammation()
	 * @generated
	 */
	EReference getProgrammation_Responsable();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Programmation#ContenuDefini(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contenu Defini</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contenu Defini</em>' operation.
	 * @see mymetamodel.Programmation#ContenuDefini(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProgrammation__ContenuDefini__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Programmation#trancheHoraire(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tranche Horaire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tranche Horaire</em>' operation.
	 * @see mymetamodel.Programmation#trancheHoraire(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProgrammation__TrancheHoraire__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mymetamodel.Programmation#HoraireValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Horaire Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Horaire Valid</em>' operation.
	 * @see mymetamodel.Programmation#HoraireValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProgrammation__HoraireValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link mymetamodel.TYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TYPE</em>'.
	 * @see mymetamodel.TYPE
	 * @generated
	 */
	EEnum getTYPE();

	/**
	 * Returns the meta object for enum '{@link mymetamodel.SEXE <em>SEXE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SEXE</em>'.
	 * @see mymetamodel.SEXE
	 * @generated
	 */
	EEnum getSEXE();

	/**
	 * Returns the meta object for enum '{@link mymetamodel.JOUR <em>JOUR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JOUR</em>'.
	 * @see mymetamodel.JOUR
	 * @generated
	 */
	EEnum getJOUR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MymetamodelFactory getMymetamodelFactory();

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
		 * The meta object literal for the '{@link mymetamodel.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.DepartementImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Formation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__FORMATION = eINSTANCE.getDepartement_Formation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__DESCRIPTION = eINSTANCE.getDepartement_Description();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__RESPONSABLE = eINSTANCE.getDepartement_Responsable();

		/**
		 * The meta object literal for the '<em><b>Chef</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__CHEF = eINSTANCE.getDepartement_Chef();

		/**
		 * The meta object literal for the '<em><b>At Least One Formation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___AT_LEAST_ONE_FORMATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__AtLeastOneFormation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Au Moins1 Responsable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__AuMoins1Responsable__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Dep Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___UNIQUE_DEP_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__UniqueDepName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Formation List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___UNIQUE_FORMATION_LIST__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__UniqueFormationList__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.FormationImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NOM = eINSTANCE.getFormation_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__DESCRIPTION = eINSTANCE.getFormation_Description();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__NIVEAU = eINSTANCE.getFormation_Niveau();

		/**
		 * The meta object literal for the '<em><b>Debouche</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__DEBOUCHE = eINSTANCE.getFormation_Debouche();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__RESPONSABLE = eINSTANCE.getFormation_Responsable();

		/**
		 * The meta object literal for the '<em><b>Specialite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SPECIALITE = eINSTANCE.getFormation_Specialite();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormation__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormation__NomUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Au Moins1 Niveau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___AU_MOINS1_NIVEAU__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormation__AuMoins1Niveau__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Niveau Distinct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___NIVEAU_DISTINCT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFormation__NiveauDistinct__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.NiveauImpl <em>Niveau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.NiveauImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getNiveau()
		 * @generated
		 */
		EClass NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__NUMERO = eINSTANCE.getNiveau_Numero();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__NOM = eINSTANCE.getNiveau_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__DESCRIPTION = eINSTANCE.getNiveau_Description();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SEMESTRE = eINSTANCE.getNiveau_Semestre();

		/**
		 * The meta object literal for the '<em><b>Formation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__FORMATION = eINSTANCE.getNiveau_Formation();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__RESPONSABLE = eINSTANCE.getNiveau_Responsable();

		/**
		 * The meta object literal for the '<em><b>Specialite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SPECIALITE = eINSTANCE.getNiveau_Specialite();

		/**
		 * The meta object literal for the '<em><b>Multi Specialite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___MULTI_SPECIALITE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__MultiSpecialite__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Associe Semestre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___ASSOCIE_SEMESTRE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__AssocieSemestre__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Au Moins1 Responsable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__AuMoins1Responsable__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Semestre Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__SemestreUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Associe Formation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___ASSOCIE_FORMATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__AssocieFormation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Numero Semestre Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___NUMERO_SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__NumeroSemestreUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Not Speciality Wth Diff Level Wth Same Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NIVEAU___NOT_SPECIALITY_WTH_DIFF_LEVEL_WTH_SAME_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNiveau__NotSpecialityWthDiffLevelWthSameName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.SpecialiteImpl <em>Specialite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.SpecialiteImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getSpecialite()
		 * @generated
		 */
		EClass SPECIALITE = eINSTANCE.getSpecialite();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALITE__NOM = eINSTANCE.getSpecialite_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALITE__DESCRIPTION = eINSTANCE.getSpecialite_Description();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALITE__RESPONSABLE = eINSTANCE.getSpecialite_Responsable();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIALITE___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSpecialite__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIALITE___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSpecialite__NomUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.SemestreImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NUMERO = eINSTANCE.getSemestre_Numero();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__DESCRIPTION = eINSTANCE.getSemestre_Description();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__NIVEAU = eINSTANCE.getSemestre_Niveau();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__DATE_DEBUT = eINSTANCE.getSemestre_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__DATE_FIN = eINSTANCE.getSemestre_DateFin();

		/**
		 * The meta object literal for the '<em><b>Semainier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__SEMAINIER = eINSTANCE.getSemestre_Semainier();

		/**
		 * The meta object literal for the '<em><b>Nb Semaine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NB_SEMAINE = eINSTANCE.getSemestre_NbSemaine();

		/**
		 * The meta object literal for the '<em><b>Ue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UE = eINSTANCE.getSemestre_Ue();

		/**
		 * The meta object literal for the '<em><b>Numero Unique Par Niveau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTRE___NUMERO_UNIQUE_PAR_NIVEAU__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemestre__NumeroUniqueParNiveau__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nombre Semaine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTRE___NOMBRE_SEMAINE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemestre__NombreSemaine__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Associe Niveau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTRE___ASSOCIE_NIVEAU__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemestre__AssocieNiveau__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTRE___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemestre__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Au Moins1 Ue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTRE___AU_MOINS1_UE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemestre__AuMoins1Ue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nombre Seances Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTRE___NOMBRE_SEANCES_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemestre__NombreSeancesValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.SemainierImpl <em>Semainier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.SemainierImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getSemainier()
		 * @generated
		 */
		EClass SEMAINIER = eINSTANCE.getSemainier();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINIER__NUMERO = eINSTANCE.getSemainier_Numero();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINIER__DATE_DEBUT = eINSTANCE.getSemainier_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINIER__DATE_FIN = eINSTANCE.getSemainier_DateFin();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMAINIER__CONTENU = eINSTANCE.getSemainier_Contenu();

		/**
		 * The meta object literal for the '<em><b>Programmation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAINIER__PROGRAMMATION = eINSTANCE.getSemainier_Programmation();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAINIER__SEMESTRE = eINSTANCE.getSemainier_Semestre();

		/**
		 * The meta object literal for the '<em><b>Contenu Defini</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMAINIER___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemainier__ContenuDefini__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMAINIER___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemainier__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Semainier Valide Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMAINIER___SEMAINIER_VALIDE_DATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemainier__SemainierValideDate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dates Seances Valides</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMAINIER___DATES_SEANCES_VALIDES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemainier__DatesSeancesValides__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Pour Un Seul Semestre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMAINIER___POUR_UN_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSemainier__PourUnSeulSemestre__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.UEImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NOM = eINSTANCE.getUE_Nom();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CODE = eINSTANCE.getUE_Code();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CREDIT = eINSTANCE.getUE_Credit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__DESCRIPTION = eINSTANCE.getUE_Description();

		/**
		 * The meta object literal for the '<em><b>Objectif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__OBJECTIF = eINSTANCE.getUE_Objectif();

		/**
		 * The meta object literal for the '<em><b>Prerequis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__PREREQUIS = eINSTANCE.getUE_Prerequis();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESSOURCE = eINSTANCE.getUE_Ressource();

		/**
		 * The meta object literal for the '<em><b>Semainier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__SEMAINIER = eINSTANCE.getUE_Semainier();

		/**
		 * The meta object literal for the '<em><b>Programmation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__PROGRAMMATION = eINSTANCE.getUE_Programmation();

		/**
		 * The meta object literal for the '<em><b>Specialite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__SPECIALITE = eINSTANCE.getUE_Specialite();

		/**
		 * The meta object literal for the '<em><b>Is Optionel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__IS_OPTIONEL = eINSTANCE.getUE_IsOptionel();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESPONSABLE = eINSTANCE.getUE_Responsable();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__SEMESTRE = eINSTANCE.getUE_Semestre();

		/**
		 * The meta object literal for the '<em><b>Plusieurs Ressources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___PLUSIEURS_RESSOURCES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__PlusieursRessources__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Enseignants Valides</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___ENSEIGNANTS_VALIDES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__EnseignantsValides__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Au Moins1 Responsable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__AuMoins1Responsable__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Dans1 Seul Semestre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___DANS1_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__Dans1SeulSemestre__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Semanier Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___SEMANIER_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__SemanierValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.RessourceImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NOM = eINSTANCE.getRessource_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__TYPE = eINSTANCE.getRessource_Type();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__CHEMIN = eINSTANCE.getRessource_Chemin();

		/**
		 * The meta object literal for the '<em><b>Ue</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__UE = eINSTANCE.getRessource_Ue();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRessource__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRessource__NomUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Une Seule Ue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___UNE_SEULE_UE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRessource__UneSeuleUe__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.ResponsableImpl <em>Responsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.ResponsableImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getResponsable()
		 * @generated
		 */
		EClass RESPONSABLE = eINSTANCE.getResponsable();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__NOM = eINSTANCE.getResponsable_Nom();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__TELEPHONE = eINSTANCE.getResponsable_Telephone();

		/**
		 * The meta object literal for the '<em><b>Sexe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__SEXE = eINSTANCE.getResponsable_Sexe();

		/**
		 * The meta object literal for the '<em><b>Fonction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__FONCTION = eINSTANCE.getResponsable_Fonction();

		/**
		 * The meta object literal for the '<em><b>Date Naissance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__DATE_NAISSANCE = eINSTANCE.getResponsable_DateNaissance();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__MAIL = eINSTANCE.getResponsable_Mail();

		/**
		 * The meta object literal for the '<em><b>Formation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSABLE__FORMATION = eINSTANCE.getResponsable_Formation();

		/**
		 * The meta object literal for the '<em><b>Ue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSABLE__UE = eINSTANCE.getResponsable_Ue();

		/**
		 * The meta object literal for the '<em><b>Ues Dans Formations Ou Intervient</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESPONSABLE___UES_DANS_FORMATIONS_OU_INTERVIENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResponsable__UesDansFormationsOuIntervient__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.prerequisImpl <em>prerequis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.prerequisImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getprerequis()
		 * @generated
		 */
		EClass PREREQUIS = eINSTANCE.getprerequis();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUIS__DESCRIPTION = eINSTANCE.getprerequis_Description();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREREQUIS___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getprerequis__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.DeboucheImpl <em>Debouche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.DeboucheImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getDebouche()
		 * @generated
		 */
		EClass DEBOUCHE = eINSTANCE.getDebouche();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBOUCHE__NOM = eINSTANCE.getDebouche_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBOUCHE__DESCRIPTION = eINSTANCE.getDebouche_Description();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEBOUCHE___NAMED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDebouche__Named__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.ProgrammationImpl <em>Programmation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.ProgrammationImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getProgrammation()
		 * @generated
		 */
		EClass PROGRAMMATION = eINSTANCE.getProgrammation();

		/**
		 * The meta object literal for the '<em><b>Jour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__JOUR = eINSTANCE.getProgrammation_Jour();

		/**
		 * The meta object literal for the '<em><b>Heure Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__HEURE_DEBUT = eINSTANCE.getProgrammation_HeureDebut();

		/**
		 * The meta object literal for the '<em><b>Heure Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__HEURE_FIN = eINSTANCE.getProgrammation_HeureFin();

		/**
		 * The meta object literal for the '<em><b>Salle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__SALLE = eINSTANCE.getProgrammation_Salle();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMMATION__RESPONSABLE = eINSTANCE.getProgrammation_Responsable();

		/**
		 * The meta object literal for the '<em><b>Contenu Defini</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMMATION___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProgrammation__ContenuDefini__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tranche Horaire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMMATION___TRANCHE_HORAIRE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProgrammation__TrancheHoraire__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Horaire Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMMATION___HORAIRE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProgrammation__HoraireValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mymetamodel.TYPE <em>TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.TYPE
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getTYPE()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getTYPE();

		/**
		 * The meta object literal for the '{@link mymetamodel.SEXE <em>SEXE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.SEXE
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getSEXE()
		 * @generated
		 */
		EEnum SEXE = eINSTANCE.getSEXE();

		/**
		 * The meta object literal for the '{@link mymetamodel.JOUR <em>JOUR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.JOUR
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getJOUR()
		 * @generated
		 */
		EEnum JOUR = eINSTANCE.getJOUR();

	}

} //MymetamodelPackage
