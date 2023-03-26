/**
 */
package mymetamodel.impl;

import mymetamodel.Debouche;
import mymetamodel.Departement;
import mymetamodel.Formation;
import mymetamodel.MymetamodelFactory;
import mymetamodel.MymetamodelPackage;
import mymetamodel.Niveau;
import mymetamodel.Programmation;
import mymetamodel.Responsable;
import mymetamodel.Ressource;
import mymetamodel.Semainier;
import mymetamodel.Semestre;
import mymetamodel.Specialite;
import mymetamodel.prerequis;

import mymetamodel.util.MymetamodelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class MymetamodelPackageImpl extends EPackageImpl implements MymetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niveauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semainierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueEClass = null;

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
	private EClass responsableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deboucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sexeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jourEEnum = null;

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
	 * @see mymetamodel.MymetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MymetamodelPackageImpl() {
		super(eNS_URI, MymetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MymetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MymetamodelPackage init() {
		if (isInited) return (MymetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MymetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMymetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MymetamodelPackageImpl theMymetamodelPackage = registeredMymetamodelPackage instanceof MymetamodelPackageImpl ? (MymetamodelPackageImpl)registeredMymetamodelPackage : new MymetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMymetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMymetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMymetamodelPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MymetamodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMymetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MymetamodelPackage.eNS_URI, theMymetamodelPackage);
		return theMymetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartement() {
		return departementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Nom() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Formation() {
		return (EReference)departementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Description() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Responsable() {
		return (EReference)departementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Chef() {
		return (EReference)departementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__AtLeastOneFormation__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__AuMoins1Responsable__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__UniqueDepName__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Named__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__UniqueFormationList__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Nom() {
		return (EAttribute)formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Description() {
		return (EAttribute)formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Niveau() {
		return (EReference)formationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Debouche() {
		return (EReference)formationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Responsable() {
		return (EReference)formationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Specialite() {
		return (EReference)formationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormation__Named__DiagnosticChain_Map() {
		return formationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormation__NomUnique__DiagnosticChain_Map() {
		return formationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormation__AuMoins1Niveau__DiagnosticChain_Map() {
		return formationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormation__NiveauDistinct__DiagnosticChain_Map() {
		return formationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNiveau() {
		return niveauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Numero() {
		return (EAttribute)niveauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Nom() {
		return (EAttribute)niveauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Description() {
		return (EAttribute)niveauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Semestre() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Formation() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Responsable() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Specialite() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__MultiSpecialite__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__AssocieSemestre__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__AuMoins1Responsable__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__SemestreUnique__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__Named__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__AssocieFormation__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__NumeroSemestreUnique__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNiveau__NotSpecialityWthDiffLevelWthSameName__DiagnosticChain_Map() {
		return niveauEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialite() {
		return specialiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialite_Nom() {
		return (EAttribute)specialiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialite_Description() {
		return (EAttribute)specialiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialite_Responsable() {
		return (EReference)specialiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecialite__Named__DiagnosticChain_Map() {
		return specialiteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecialite__NomUnique__DiagnosticChain_Map() {
		return specialiteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemestre() {
		return semestreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_Numero() {
		return (EAttribute)semestreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_Description() {
		return (EAttribute)semestreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Niveau() {
		return (EReference)semestreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_DateDebut() {
		return (EAttribute)semestreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_DateFin() {
		return (EAttribute)semestreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Semainier() {
		return (EReference)semestreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_NbSemaine() {
		return (EAttribute)semestreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Ue() {
		return (EReference)semestreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemestre__NumeroUniqueParNiveau__DiagnosticChain_Map() {
		return semestreEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemestre__NombreSemaine__DiagnosticChain_Map() {
		return semestreEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemestre__AssocieNiveau__DiagnosticChain_Map() {
		return semestreEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemestre__Named__DiagnosticChain_Map() {
		return semestreEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemestre__AuMoins1Ue__DiagnosticChain_Map() {
		return semestreEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemestre__NombreSeancesValide__DiagnosticChain_Map() {
		return semestreEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemainier() {
		return semainierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemainier_Numero() {
		return (EAttribute)semainierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemainier_DateDebut() {
		return (EAttribute)semainierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemainier_DateFin() {
		return (EAttribute)semainierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemainier_Contenu() {
		return (EAttribute)semainierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemainier_Programmation() {
		return (EReference)semainierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemainier_Semestre() {
		return (EReference)semainierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemainier__ContenuDefini__DiagnosticChain_Map() {
		return semainierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemainier__Named__DiagnosticChain_Map() {
		return semainierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemainier__SemainierValideDate__DiagnosticChain_Map() {
		return semainierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemainier__DatesSeancesValides__DiagnosticChain_Map() {
		return semainierEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemainier__PourUnSeulSemestre__DiagnosticChain_Map() {
		return semainierEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUE() {
		return ueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Nom() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Code() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Credit() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Description() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Objectif() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Prerequis() {
		return (EReference)ueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Ressource() {
		return (EReference)ueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Semainier() {
		return (EReference)ueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Programmation() {
		return (EReference)ueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Specialite() {
		return (EReference)ueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_IsOptionel() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Responsable() {
		return (EReference)ueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Semestre() {
		return (EReference)ueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUE__PlusieursRessources__DiagnosticChain_Map() {
		return ueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUE__EnseignantsValides__DiagnosticChain_Map() {
		return ueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUE__AuMoins1Responsable__DiagnosticChain_Map() {
		return ueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUE__Dans1SeulSemestre__DiagnosticChain_Map() {
		return ueEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUE__SemanierValide__DiagnosticChain_Map() {
		return ueEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUE__Named__DiagnosticChain_Map() {
		return ueEClass.getEOperations().get(5);
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
	public EAttribute getRessource_Nom() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Type() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Chemin() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessource_Ue() {
		return (EReference)ressourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessource__Named__DiagnosticChain_Map() {
		return ressourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessource__NomUnique__DiagnosticChain_Map() {
		return ressourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessource__UneSeuleUe__DiagnosticChain_Map() {
		return ressourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsable() {
		return responsableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsable_Nom() {
		return (EAttribute)responsableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsable_Telephone() {
		return (EAttribute)responsableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsable_Sexe() {
		return (EAttribute)responsableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsable_Fonction() {
		return (EAttribute)responsableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsable_DateNaissance() {
		return (EAttribute)responsableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsable_Mail() {
		return (EAttribute)responsableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsable_Formation() {
		return (EReference)responsableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsable_Ue() {
		return (EReference)responsableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResponsable__UesDansFormationsOuIntervient__DiagnosticChain_Map() {
		return responsableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprerequis() {
		return prerequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprerequis_Description() {
		return (EAttribute)prerequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getprerequis__Named__DiagnosticChain_Map() {
		return prerequisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebouche() {
		return deboucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebouche_Nom() {
		return (EAttribute)deboucheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebouche_Description() {
		return (EAttribute)deboucheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDebouche__Named__DiagnosticChain_Map() {
		return deboucheEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammation() {
		return programmationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_Jour() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_HeureDebut() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_HeureFin() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_Salle() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammation_Responsable() {
		return (EReference)programmationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgrammation__ContenuDefini__DiagnosticChain_Map() {
		return programmationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgrammation__TrancheHoraire__DiagnosticChain_Map() {
		return programmationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProgrammation__HoraireValid__DiagnosticChain_Map() {
		return programmationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTYPE() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSEXE() {
		return sexeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJOUR() {
		return jourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MymetamodelFactory getMymetamodelFactory() {
		return (MymetamodelFactory)getEFactoryInstance();
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
		departementEClass = createEClass(DEPARTEMENT);
		createEAttribute(departementEClass, DEPARTEMENT__NOM);
		createEReference(departementEClass, DEPARTEMENT__FORMATION);
		createEAttribute(departementEClass, DEPARTEMENT__DESCRIPTION);
		createEReference(departementEClass, DEPARTEMENT__RESPONSABLE);
		createEReference(departementEClass, DEPARTEMENT__CHEF);
		createEOperation(departementEClass, DEPARTEMENT___AT_LEAST_ONE_FORMATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___UNIQUE_DEP_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___UNIQUE_FORMATION_LIST__DIAGNOSTICCHAIN_MAP);

		formationEClass = createEClass(FORMATION);
		createEAttribute(formationEClass, FORMATION__NOM);
		createEAttribute(formationEClass, FORMATION__DESCRIPTION);
		createEReference(formationEClass, FORMATION__NIVEAU);
		createEReference(formationEClass, FORMATION__DEBOUCHE);
		createEReference(formationEClass, FORMATION__RESPONSABLE);
		createEReference(formationEClass, FORMATION__SPECIALITE);
		createEOperation(formationEClass, FORMATION___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(formationEClass, FORMATION___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(formationEClass, FORMATION___AU_MOINS1_NIVEAU__DIAGNOSTICCHAIN_MAP);
		createEOperation(formationEClass, FORMATION___NIVEAU_DISTINCT__DIAGNOSTICCHAIN_MAP);

		niveauEClass = createEClass(NIVEAU);
		createEAttribute(niveauEClass, NIVEAU__NUMERO);
		createEAttribute(niveauEClass, NIVEAU__NOM);
		createEAttribute(niveauEClass, NIVEAU__DESCRIPTION);
		createEReference(niveauEClass, NIVEAU__SEMESTRE);
		createEReference(niveauEClass, NIVEAU__FORMATION);
		createEReference(niveauEClass, NIVEAU__RESPONSABLE);
		createEReference(niveauEClass, NIVEAU__SPECIALITE);
		createEOperation(niveauEClass, NIVEAU___MULTI_SPECIALITE__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___ASSOCIE_SEMESTRE__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___ASSOCIE_FORMATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___NUMERO_SEMESTRE_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(niveauEClass, NIVEAU___NOT_SPECIALITY_WTH_DIFF_LEVEL_WTH_SAME_NAME__DIAGNOSTICCHAIN_MAP);

		specialiteEClass = createEClass(SPECIALITE);
		createEAttribute(specialiteEClass, SPECIALITE__NOM);
		createEAttribute(specialiteEClass, SPECIALITE__DESCRIPTION);
		createEReference(specialiteEClass, SPECIALITE__RESPONSABLE);
		createEOperation(specialiteEClass, SPECIALITE___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(specialiteEClass, SPECIALITE___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP);

		semestreEClass = createEClass(SEMESTRE);
		createEAttribute(semestreEClass, SEMESTRE__NUMERO);
		createEAttribute(semestreEClass, SEMESTRE__DESCRIPTION);
		createEReference(semestreEClass, SEMESTRE__NIVEAU);
		createEAttribute(semestreEClass, SEMESTRE__DATE_DEBUT);
		createEAttribute(semestreEClass, SEMESTRE__DATE_FIN);
		createEReference(semestreEClass, SEMESTRE__SEMAINIER);
		createEAttribute(semestreEClass, SEMESTRE__NB_SEMAINE);
		createEReference(semestreEClass, SEMESTRE__UE);
		createEOperation(semestreEClass, SEMESTRE___NUMERO_UNIQUE_PAR_NIVEAU__DIAGNOSTICCHAIN_MAP);
		createEOperation(semestreEClass, SEMESTRE___NOMBRE_SEMAINE__DIAGNOSTICCHAIN_MAP);
		createEOperation(semestreEClass, SEMESTRE___ASSOCIE_NIVEAU__DIAGNOSTICCHAIN_MAP);
		createEOperation(semestreEClass, SEMESTRE___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(semestreEClass, SEMESTRE___AU_MOINS1_UE__DIAGNOSTICCHAIN_MAP);
		createEOperation(semestreEClass, SEMESTRE___NOMBRE_SEANCES_VALIDE__DIAGNOSTICCHAIN_MAP);

		semainierEClass = createEClass(SEMAINIER);
		createEAttribute(semainierEClass, SEMAINIER__NUMERO);
		createEAttribute(semainierEClass, SEMAINIER__DATE_DEBUT);
		createEAttribute(semainierEClass, SEMAINIER__DATE_FIN);
		createEAttribute(semainierEClass, SEMAINIER__CONTENU);
		createEReference(semainierEClass, SEMAINIER__PROGRAMMATION);
		createEReference(semainierEClass, SEMAINIER__SEMESTRE);
		createEOperation(semainierEClass, SEMAINIER___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP);
		createEOperation(semainierEClass, SEMAINIER___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(semainierEClass, SEMAINIER___SEMAINIER_VALIDE_DATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(semainierEClass, SEMAINIER___DATES_SEANCES_VALIDES__DIAGNOSTICCHAIN_MAP);
		createEOperation(semainierEClass, SEMAINIER___POUR_UN_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP);

		ueEClass = createEClass(UE);
		createEAttribute(ueEClass, UE__NOM);
		createEAttribute(ueEClass, UE__CODE);
		createEAttribute(ueEClass, UE__CREDIT);
		createEAttribute(ueEClass, UE__DESCRIPTION);
		createEAttribute(ueEClass, UE__OBJECTIF);
		createEReference(ueEClass, UE__PREREQUIS);
		createEReference(ueEClass, UE__RESSOURCE);
		createEReference(ueEClass, UE__SEMAINIER);
		createEReference(ueEClass, UE__PROGRAMMATION);
		createEReference(ueEClass, UE__SPECIALITE);
		createEAttribute(ueEClass, UE__IS_OPTIONEL);
		createEReference(ueEClass, UE__RESPONSABLE);
		createEReference(ueEClass, UE__SEMESTRE);
		createEOperation(ueEClass, UE___PLUSIEURS_RESSOURCES__DIAGNOSTICCHAIN_MAP);
		createEOperation(ueEClass, UE___ENSEIGNANTS_VALIDES__DIAGNOSTICCHAIN_MAP);
		createEOperation(ueEClass, UE___AU_MOINS1_RESPONSABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(ueEClass, UE___DANS1_SEUL_SEMESTRE__DIAGNOSTICCHAIN_MAP);
		createEOperation(ueEClass, UE___SEMANIER_VALIDE__DIAGNOSTICCHAIN_MAP);
		createEOperation(ueEClass, UE___NAMED__DIAGNOSTICCHAIN_MAP);

		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__NOM);
		createEAttribute(ressourceEClass, RESSOURCE__TYPE);
		createEAttribute(ressourceEClass, RESSOURCE__CHEMIN);
		createEReference(ressourceEClass, RESSOURCE__UE);
		createEOperation(ressourceEClass, RESSOURCE___NAMED__DIAGNOSTICCHAIN_MAP);
		createEOperation(ressourceEClass, RESSOURCE___NOM_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(ressourceEClass, RESSOURCE___UNE_SEULE_UE__DIAGNOSTICCHAIN_MAP);

		responsableEClass = createEClass(RESPONSABLE);
		createEAttribute(responsableEClass, RESPONSABLE__NOM);
		createEAttribute(responsableEClass, RESPONSABLE__TELEPHONE);
		createEAttribute(responsableEClass, RESPONSABLE__SEXE);
		createEAttribute(responsableEClass, RESPONSABLE__FONCTION);
		createEAttribute(responsableEClass, RESPONSABLE__DATE_NAISSANCE);
		createEAttribute(responsableEClass, RESPONSABLE__MAIL);
		createEReference(responsableEClass, RESPONSABLE__FORMATION);
		createEReference(responsableEClass, RESPONSABLE__UE);
		createEOperation(responsableEClass, RESPONSABLE___UES_DANS_FORMATIONS_OU_INTERVIENT__DIAGNOSTICCHAIN_MAP);

		prerequisEClass = createEClass(PREREQUIS);
		createEAttribute(prerequisEClass, PREREQUIS__DESCRIPTION);
		createEOperation(prerequisEClass, PREREQUIS___NAMED__DIAGNOSTICCHAIN_MAP);

		deboucheEClass = createEClass(DEBOUCHE);
		createEAttribute(deboucheEClass, DEBOUCHE__NOM);
		createEAttribute(deboucheEClass, DEBOUCHE__DESCRIPTION);
		createEOperation(deboucheEClass, DEBOUCHE___NAMED__DIAGNOSTICCHAIN_MAP);

		programmationEClass = createEClass(PROGRAMMATION);
		createEAttribute(programmationEClass, PROGRAMMATION__JOUR);
		createEAttribute(programmationEClass, PROGRAMMATION__HEURE_DEBUT);
		createEAttribute(programmationEClass, PROGRAMMATION__HEURE_FIN);
		createEAttribute(programmationEClass, PROGRAMMATION__SALLE);
		createEReference(programmationEClass, PROGRAMMATION__RESPONSABLE);
		createEOperation(programmationEClass, PROGRAMMATION___CONTENU_DEFINI__DIAGNOSTICCHAIN_MAP);
		createEOperation(programmationEClass, PROGRAMMATION___TRANCHE_HORAIRE__DIAGNOSTICCHAIN_MAP);
		createEOperation(programmationEClass, PROGRAMMATION___HORAIRE_VALID__DIAGNOSTICCHAIN_MAP);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		sexeEEnum = createEEnum(SEXE);
		jourEEnum = createEEnum(JOUR);
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
		initEClass(departementEClass, Departement.class, "Departement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartement_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Formation(), this.getFormation(), null, "formation", null, 1, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Responsable(), this.getResponsable(), null, "responsable", null, 0, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Chef(), this.getResponsable(), null, "chef", null, 1, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDepartement__AtLeastOneFormation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atLeastOneFormation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__AuMoins1Responsable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoins1Responsable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__UniqueDepName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueDepName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__UniqueFormationList__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueFormationList", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(formationEClass, Formation.class, "Formation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormation_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Niveau(), this.getNiveau(), this.getNiveau_Formation(), "niveau", null, 1, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Debouche(), this.getDebouche(), null, "debouche", null, 0, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Responsable(), this.getResponsable(), this.getResponsable_Formation(), "responsable", null, 0, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Specialite(), this.getSpecialite(), null, "specialite", null, 0, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFormation__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFormation__NomUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nomUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFormation__AuMoins1Niveau__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoins1Niveau", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFormation__NiveauDistinct__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "niveauDistinct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(niveauEClass, Niveau.class, "Niveau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNiveau_Numero(), ecorePackage.getEInt(), "numero", null, 1, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNiveau_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNiveau_Description(), ecorePackage.getEString(), "description", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Semestre(), this.getSemestre(), this.getSemestre_Niveau(), "semestre", null, 0, -1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Formation(), this.getFormation(), this.getFormation_Niveau(), "formation", null, 1, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Responsable(), this.getResponsable(), null, "responsable", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Specialite(), this.getSpecialite(), null, "specialite", null, 0, -1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNiveau__MultiSpecialite__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiSpecialite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__AssocieSemestre__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associeSemestre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__AuMoins1Responsable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoins1Responsable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__SemestreUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "semestreUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__AssocieFormation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associeFormation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__NumeroSemestreUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numeroSemestreUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNiveau__NotSpecialityWthDiffLevelWthSameName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NotSpecialityWthDiffLevelWthSameName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(specialiteEClass, Specialite.class, "Specialite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialite_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Specialite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialite_Description(), ecorePackage.getEString(), "description", null, 0, 1, Specialite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialite_Responsable(), this.getResponsable(), null, "responsable", null, 0, 1, Specialite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSpecialite__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpecialite__NomUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nomUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(semestreEClass, Semestre.class, "Semestre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemestre_Numero(), ecorePackage.getEInt(), "numero", null, 1, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemestre_Description(), ecorePackage.getEString(), "description", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemestre_Niveau(), this.getNiveau(), this.getNiveau_Semestre(), "niveau", null, 1, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemestre_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemestre_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemestre_Semainier(), this.getSemainier(), this.getSemainier_Semestre(), "semainier", null, 0, -1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemestre_NbSemaine(), ecorePackage.getEInt(), "nbSemaine", null, 1, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemestre_Ue(), this.getUE(), this.getUE_Semestre(), "ue", null, 0, -1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSemestre__NumeroUniqueParNiveau__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numeroUniqueParNiveau", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemestre__NombreSemaine__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nombreSemaine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemestre__AssocieNiveau__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AssocieNiveau", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemestre__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemestre__AuMoins1Ue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoins1Ue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemestre__NombreSeancesValide__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NombreSeancesValide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(semainierEClass, Semainier.class, "Semainier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemainier_Numero(), ecorePackage.getEInt(), "numero", null, 1, 1, Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemainier_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 0, 1, Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemainier_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemainier_Contenu(), ecorePackage.getEString(), "contenu", null, 0, 1, Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemainier_Programmation(), this.getProgrammation(), null, "programmation", null, 0, -1, Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemainier_Semestre(), this.getSemestre(), this.getSemestre_Semainier(), "semestre", null, 1, 1, Semainier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSemainier__ContenuDefini__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContenuDefini", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemainier__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemainier__SemainierValideDate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SemainierValideDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemainier__DatesSeancesValides__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DatesSeancesValides", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSemainier__PourUnSeulSemestre__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "pourUnSeulSemestre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ueEClass, mymetamodel.UE.class, "UE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUE_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Code(), ecorePackage.getEString(), "code", null, 0, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Credit(), ecorePackage.getEInt(), "credit", null, 1, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Description(), ecorePackage.getEString(), "description", null, 0, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Objectif(), ecorePackage.getEString(), "objectif", null, 0, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Prerequis(), this.getprerequis(), null, "prerequis", null, 0, -1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Ressource(), this.getRessource(), this.getRessource_Ue(), "ressource", null, 0, -1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Semainier(), this.getSemainier(), null, "semainier", null, 0, -1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Programmation(), this.getProgrammation(), null, "programmation", null, 1, -1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Specialite(), this.getSpecialite(), null, "specialite", null, 0, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_IsOptionel(), ecorePackage.getEBoolean(), "isOptionel", null, 1, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Responsable(), this.getResponsable(), null, "responsable", null, 1, -1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Semestre(), this.getSemestre(), this.getSemestre_Ue(), "semestre", null, 1, 1, mymetamodel.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUE__PlusieursRessources__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "plusieursRessources", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUE__EnseignantsValides__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "EnseignantsValides", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUE__AuMoins1Responsable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoins1Responsable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUE__Dans1SeulSemestre__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "dans1SeulSemestre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUE__SemanierValide__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "semanierValide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUE__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_Type(), this.getTYPE(), "type", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRessource_Ue(), this.getUE(), this.getUE_Ressource(), "ue", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRessource__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRessource__NomUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nomUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRessource__UneSeuleUe__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uneSeuleUe", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(responsableEClass, Responsable.class, "Responsable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponsable_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsable_Telephone(), ecorePackage.getEInt(), "telephone", null, 1, 1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsable_Sexe(), this.getSEXE(), "sexe", null, 0, 1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsable_Fonction(), ecorePackage.getEString(), "fonction", null, 0, 1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsable_DateNaissance(), ecorePackage.getEDate(), "dateNaissance", null, 0, 1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsable_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsable_Formation(), this.getFormation(), this.getFormation_Responsable(), "formation", null, 0, -1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsable_Ue(), this.getUE(), null, "ue", null, 0, -1, Responsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getResponsable__UesDansFormationsOuIntervient__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UesDansFormationsOuIntervient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(prerequisEClass, prerequis.class, "prerequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getprerequis_Description(), ecorePackage.getEString(), "description", null, 1, 1, prerequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getprerequis__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deboucheEClass, Debouche.class, "Debouche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDebouche_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Debouche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDebouche_Description(), ecorePackage.getEString(), "description", null, 0, 1, Debouche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDebouche__Named__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Named", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programmationEClass, Programmation.class, "Programmation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgrammation_Jour(), this.getJOUR(), "jour", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammation_HeureDebut(), ecorePackage.getEInt(), "heureDebut", null, 1, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammation_HeureFin(), ecorePackage.getEInt(), "heureFin", null, 1, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammation_Salle(), ecorePackage.getEString(), "salle", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammation_Responsable(), this.getResponsable(), null, "responsable", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProgrammation__ContenuDefini__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContenuDefini", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProgrammation__TrancheHoraire__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "trancheHoraire", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProgrammation__HoraireValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "HoraireValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, mymetamodel.TYPE.class, "TYPE");
		addEEnumLiteral(typeEEnum, mymetamodel.TYPE.VIDEO);
		addEEnumLiteral(typeEEnum, mymetamodel.TYPE.AUDIO);
		addEEnumLiteral(typeEEnum, mymetamodel.TYPE.SLIDE);
		addEEnumLiteral(typeEEnum, mymetamodel.TYPE.CODE);
		addEEnumLiteral(typeEEnum, mymetamodel.TYPE.PDF);
		addEEnumLiteral(typeEEnum, mymetamodel.TYPE.OTHERS);

		initEEnum(sexeEEnum, mymetamodel.SEXE.class, "SEXE");
		addEEnumLiteral(sexeEEnum, mymetamodel.SEXE.HOMME);
		addEEnumLiteral(sexeEEnum, mymetamodel.SEXE.FEMME);

		initEEnum(jourEEnum, mymetamodel.JOUR.class, "JOUR");
		addEEnumLiteral(jourEEnum, mymetamodel.JOUR.LUNDI);
		addEEnumLiteral(jourEEnum, mymetamodel.JOUR.MARDI);
		addEEnumLiteral(jourEEnum, mymetamodel.JOUR.MERCREDI);
		addEEnumLiteral(jourEEnum, mymetamodel.JOUR.JEUDI);
		addEEnumLiteral(jourEEnum, mymetamodel.JOUR.VENDREDI);
		addEEnumLiteral(jourEEnum, mymetamodel.JOUR.SAMEDI);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		  (departementEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueFormationList"
		   });
		addAnnotation
		  (formationEClass,
		   source,
		   new String[] {
			   "constraints", "niveauDistinct"
		   });
		addAnnotation
		  (niveauEClass,
		   source,
		   new String[] {
			   "constraints", "NotSpecialityWthDiffLevelWthSameName"
		   });
		addAnnotation
		  (specialiteEClass,
		   source,
		   new String[] {
			   "constraints", "nomUnique"
		   });
		addAnnotation
		  (semestreEClass,
		   source,
		   new String[] {
			   "constraints", "NombreSeancesValide"
		   });
		addAnnotation
		  (semainierEClass,
		   source,
		   new String[] {
			   "constraints", "pourUnSeulSemestre"
		   });
		addAnnotation
		  (ueEClass,
		   source,
		   new String[] {
			   "constraints", "Named"
		   });
		addAnnotation
		  (ressourceEClass,
		   source,
		   new String[] {
			   "constraints", "uneSeuleUe"
		   });
		addAnnotation
		  (responsableEClass,
		   source,
		   new String[] {
			   "constraints", "UesDansFormationsOuIntervient"
		   });
		addAnnotation
		  (prerequisEClass,
		   source,
		   new String[] {
			   "constraints", "Named"
		   });
		addAnnotation
		  (deboucheEClass,
		   source,
		   new String[] {
			   "constraints", "Named"
		   });
		addAnnotation
		  (programmationEClass,
		   source,
		   new String[] {
			   "constraints", "HoraireValid"
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
		  (getDepartement__AtLeastOneFormation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.formation->size() > 0"
		   });
		addAnnotation
		  (getDepartement__AuMoins1Responsable__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.responsable->notEmpty()"
		   });
		addAnnotation
		  (getDepartement__UniqueDepName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.oclType().allInstances()->forAll(id1, id2 |id1 <> id2 implies id1.nom <> id2.nom)"
		   });
		addAnnotation
		  (getDepartement__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nom <> null"
		   });
		addAnnotation
		  (getDepartement__UniqueFormationList__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.formation->forAll(f1, f2 |f1 <> f2 implies f1.nom <> f2.nom)"
		   });
		addAnnotation
		  (getFormation__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nom <> null and self.description <> null"
		   });
		addAnnotation
		  (getFormation__NomUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.oclType().allInstances()->isUnique(nom)"
		   });
		addAnnotation
		  (getFormation__AuMoins1Niveau__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.niveau->size() >= 1"
		   });
		addAnnotation
		  (getFormation__NiveauDistinct__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.niveau->forAll(n1, n2 |n1 <> n2 implies n1.numero <> n2.numero and n1.nom <> n2.nom)"
		   });
		addAnnotation
		  (getNiveau__MultiSpecialite__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.specialite->size() >= 0"
		   });
		addAnnotation
		  (getNiveau__AssocieSemestre__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.semestre->notEmpty()"
		   });
		addAnnotation
		  (getNiveau__AuMoins1Responsable__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.responsable->notEmpty()"
		   });
		addAnnotation
		  (getNiveau__SemestreUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.semestre->forAll(s1, s2 |s1 <> s2 implies s1.numero <> s2.numero)"
		   });
		addAnnotation
		  (getNiveau__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.numero <> null and self.nom <> null"
		   });
		addAnnotation
		  (getNiveau__AssocieFormation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.formation->notEmpty()"
		   });
		addAnnotation
		  (getNiveau__NumeroSemestreUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.semestre->forAll(s1, s2 | s1 <> s2 implies s1.numero <> s2.numero)"
		   });
		addAnnotation
		  (getNiveau__NotSpecialityWthDiffLevelWthSameName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self->select(n | n.formation = self.formation)->select(n | n <> self)->forAll(n | n.specialite->select(s | s.nom = self.nom)->size() = 0)"
		   });
		addAnnotation
		  (getSpecialite__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nom <> null"
		   });
		addAnnotation
		  (getSpecialite__NomUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.oclType().allInstances()->isUnique(nom)"
		   });
		addAnnotation
		  (getSemestre__NumeroUniqueParNiveau__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.niveau.semestre->forAll(s | s <> self implies s.numero <> self.numero)"
		   });
		addAnnotation
		  (getSemestre__NombreSemaine__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nbSemaine >= 1 and self.nbSemaine <= 24"
		   });
		addAnnotation
		  (getSemestre__AssocieNiveau__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.niveau <> null and self.niveau->size() = 1"
		   });
		addAnnotation
		  (getSemestre__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.numero <> null and self.description <> null"
		   });
		addAnnotation
		  (getSemestre__AuMoins1Ue__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.ue->size() >= 1"
		   });
		addAnnotation
		  (getSemestre__NombreSeancesValide__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.semainier->size() <= self.nbSemaine"
		   });
		addAnnotation
		  (getSemainier__ContenuDefini__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.contenu <> null"
		   });
		addAnnotation
		  (getSemainier__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.numero <> null"
		   });
		addAnnotation
		  (getSemainier__SemainierValideDate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.dateDebut < self.dateFin"
		   });
		addAnnotation
		  (getSemainier__DatesSeancesValides__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.dateDebut >= self.semestre.dateDebut and self.dateFin <= self.semestre.dateFin"
		   });
		addAnnotation
		  (getSemainier__PourUnSeulSemestre__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.semestre->size() = 1"
		   });
		addAnnotation
		  (getUE__PlusieursRessources__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.ressource->size() >= 0"
		   });
		addAnnotation
		  (getUE__EnseignantsValides__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.programmation->forAll(p | self.responsable->includes(p.responsable))"
		   });
		addAnnotation
		  (getUE__AuMoins1Responsable__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.responsable->size() >= 1"
		   });
		addAnnotation
		  (getUE__Dans1SeulSemestre__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.responsable->size() = 1"
		   });
		addAnnotation
		  (getUE__SemanierValide__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.semainier->forAll(sem | self.semestre.semainier->includes(sem))"
		   });
		addAnnotation
		  (getUE__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nom <> null and self.description <> null and self.isOptionel <> null"
		   });
		addAnnotation
		  (getRessource__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nom <> null and self.type <> null and self.chemin <> null"
		   });
		addAnnotation
		  (getRessource__NomUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.oclType().allInstances()->isUnique(nom)"
		   });
		addAnnotation
		  (getRessource__UneSeuleUe__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.ue->size() = 1"
		   });
		addAnnotation
		  (getResponsable__UesDansFormationsOuIntervient__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.ue->forAll(u | self.formation->includes(u.semestre.niveau.formation))"
		   });
		addAnnotation
		  (getprerequis__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.description <> null"
		   });
		addAnnotation
		  (getDebouche__Named__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.nom <> null"
		   });
		addAnnotation
		  (getProgrammation__ContenuDefini__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.jour <> null and self.heureDebut <> null and self.heureFin <> null and self.salle <> null"
		   });
		addAnnotation
		  (getProgrammation__TrancheHoraire__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.heureDebut <= 20 and self.heureDebut >= 7 and self.heureFin <= 21 and self.heureFin >= 8"
		   });
		addAnnotation
		  (getProgrammation__HoraireValid__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.heureDebut < self.heureFin and self.heureFin - self.heureDebut >= 1"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getResponsable_Formation(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //MymetamodelPackageImpl
