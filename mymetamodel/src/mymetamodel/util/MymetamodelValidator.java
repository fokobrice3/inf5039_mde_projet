/**
 */
package mymetamodel.util;

import java.util.Map;

import mymetamodel.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelPackage
 * @generated
 */
public class MymetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MymetamodelValidator INSTANCE = new MymetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mymetamodel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Formation' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__AT_LEAST_ONE_FORMATION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins1 Responsable' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__AU_MOINS1_RESPONSABLE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Dep Name' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__UNIQUE_DEP_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__NAMED = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Formation List' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__UNIQUE_FORMATION_LIST = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__NAMED = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Unique' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__NOM_UNIQUE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins1 Niveau' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__AU_MOINS1_NIVEAU = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Niveau Distinct' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__NIVEAU_DISTINCT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multi Specialite' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__MULTI_SPECIALITE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Associe Semestre' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__ASSOCIE_SEMESTRE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins1 Responsable' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__AU_MOINS1_RESPONSABLE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Semestre Unique' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__SEMESTRE_UNIQUE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__NAMED = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Associe Formation' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__ASSOCIE_FORMATION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Numero Semestre Unique' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__NUMERO_SEMESTRE_UNIQUE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Speciality Wth Diff Level Wth Same Name' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__NOT_SPECIALITY_WTH_DIFF_LEVEL_WTH_SAME_NAME = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Specialite'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIALITE__NAMED = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Unique' of 'Specialite'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIALITE__NOM_UNIQUE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Numero Unique Par Niveau' of 'Semestre'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMESTRE__NUMERO_UNIQUE_PAR_NIVEAU = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre Semaine' of 'Semestre'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMESTRE__NOMBRE_SEMAINE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Associe Niveau' of 'Semestre'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMESTRE__ASSOCIE_NIVEAU = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Semestre'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMESTRE__NAMED = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins1 Ue' of 'Semestre'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMESTRE__AU_MOINS1_UE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre Seances Valide' of 'Semestre'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMESTRE__NOMBRE_SEANCES_VALIDE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contenu Defini' of 'Semainier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMAINIER__CONTENU_DEFINI = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Semainier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMAINIER__NAMED = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Semainier Valide Date' of 'Semainier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMAINIER__SEMAINIER_VALIDE_DATE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dates Seances Valides' of 'Semainier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMAINIER__DATES_SEANCES_VALIDES = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Pour Un Seul Semestre' of 'Semainier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEMAINIER__POUR_UN_SEUL_SEMESTRE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plusieurs Ressources' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__PLUSIEURS_RESSOURCES = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Enseignants Valides' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__ENSEIGNANTS_VALIDES = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins1 Responsable' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__AU_MOINS1_RESPONSABLE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dans1 Seul Semestre' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__DANS1_SEUL_SEMESTRE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Semanier Valide' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__SEMANIER_VALIDE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__NAMED = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Ressource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESSOURCE__NAMED = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Unique' of 'Ressource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESSOURCE__NOM_UNIQUE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Une Seule Ue' of 'Ressource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESSOURCE__UNE_SEULE_UE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ues Dans Formations Ou Intervient' of 'Responsable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSABLE__UES_DANS_FORMATIONS_OU_INTERVIENT = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'prerequis'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PREREQUIS__NAMED = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Named' of 'Debouche'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEBOUCHE__NAMED = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contenu Defini' of 'Programmation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGRAMMATION__CONTENU_DEFINI = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tranche Horaire' of 'Programmation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGRAMMATION__TRANCHE_HORAIRE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Horaire Valid' of 'Programmation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGRAMMATION__HORAIRE_VALID = 45;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 45;

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
	public MymetamodelValidator() {
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
	  return MymetamodelPackage.eINSTANCE;
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
			case MymetamodelPackage.DEPARTEMENT:
				return validateDepartement((Departement)value, diagnostics, context);
			case MymetamodelPackage.FORMATION:
				return validateFormation((Formation)value, diagnostics, context);
			case MymetamodelPackage.NIVEAU:
				return validateNiveau((Niveau)value, diagnostics, context);
			case MymetamodelPackage.SPECIALITE:
				return validateSpecialite((Specialite)value, diagnostics, context);
			case MymetamodelPackage.SEMESTRE:
				return validateSemestre((Semestre)value, diagnostics, context);
			case MymetamodelPackage.SEMAINIER:
				return validateSemainier((Semainier)value, diagnostics, context);
			case MymetamodelPackage.UE:
				return validateUE((UE)value, diagnostics, context);
			case MymetamodelPackage.RESSOURCE:
				return validateRessource((Ressource)value, diagnostics, context);
			case MymetamodelPackage.RESPONSABLE:
				return validateResponsable((Responsable)value, diagnostics, context);
			case MymetamodelPackage.PREREQUIS:
				return validateprerequis((prerequis)value, diagnostics, context);
			case MymetamodelPackage.DEBOUCHE:
				return validateDebouche((Debouche)value, diagnostics, context);
			case MymetamodelPackage.PROGRAMMATION:
				return validateProgrammation((Programmation)value, diagnostics, context);
			case MymetamodelPackage.TYPE:
				return validateTYPE((TYPE)value, diagnostics, context);
			case MymetamodelPackage.SEXE:
				return validateSEXE((SEXE)value, diagnostics, context);
			case MymetamodelPackage.JOUR:
				return validateJOUR((JOUR)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(departement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_UniqueFormationList(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_atLeastOneFormation(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_auMoins1Responsable(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_uniqueDepName(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_Named(departement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueFormationList constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_UniqueFormationList(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.UniqueFormationList(diagnostics, context);
	}

	/**
	 * Validates the atLeastOneFormation constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_atLeastOneFormation(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.atLeastOneFormation(diagnostics, context);
	}

	/**
	 * Validates the auMoins1Responsable constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_auMoins1Responsable(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.auMoins1Responsable(diagnostics, context);
	}

	/**
	 * Validates the uniqueDepName constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_uniqueDepName(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.uniqueDepName(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_Named(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.Named(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormation_niveauDistinct(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormation_Named(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormation_nomUnique(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormation_auMoins1Niveau(formation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the niveauDistinct constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_niveauDistinct(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formation.niveauDistinct(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_Named(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formation.Named(diagnostics, context);
	}

	/**
	 * Validates the nomUnique constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_nomUnique(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formation.nomUnique(diagnostics, context);
	}

	/**
	 * Validates the auMoins1Niveau constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_auMoins1Niveau(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formation.auMoins1Niveau(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(niveau, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_NotSpecialityWthDiffLevelWthSameName(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_multiSpecialite(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_associeSemestre(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_auMoins1Responsable(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_semestreUnique(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_Named(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_associeFormation(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_numeroSemestreUnique(niveau, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NotSpecialityWthDiffLevelWthSameName constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_NotSpecialityWthDiffLevelWthSameName(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.NotSpecialityWthDiffLevelWthSameName(diagnostics, context);
	}

	/**
	 * Validates the multiSpecialite constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_multiSpecialite(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.multiSpecialite(diagnostics, context);
	}

	/**
	 * Validates the associeSemestre constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_associeSemestre(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.associeSemestre(diagnostics, context);
	}

	/**
	 * Validates the auMoins1Responsable constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_auMoins1Responsable(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.auMoins1Responsable(diagnostics, context);
	}

	/**
	 * Validates the semestreUnique constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_semestreUnique(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.semestreUnique(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_Named(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.Named(diagnostics, context);
	}

	/**
	 * Validates the associeFormation constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_associeFormation(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.associeFormation(diagnostics, context);
	}

	/**
	 * Validates the numeroSemestreUnique constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_numeroSemestreUnique(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.numeroSemestreUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite(Specialite specialite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialite_nomUnique(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialite_Named(specialite, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomUnique constraint of '<em>Specialite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite_nomUnique(Specialite specialite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return specialite.nomUnique(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Specialite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite_Named(Specialite specialite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return specialite.Named(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semestre, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemestre_NombreSeancesValide(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemestre_numeroUniqueParNiveau(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemestre_nombreSemaine(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemestre_AssocieNiveau(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemestre_Named(semestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemestre_auMoins1Ue(semestre, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NombreSeancesValide constraint of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre_NombreSeancesValide(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semestre.NombreSeancesValide(diagnostics, context);
	}

	/**
	 * Validates the numeroUniqueParNiveau constraint of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre_numeroUniqueParNiveau(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semestre.numeroUniqueParNiveau(diagnostics, context);
	}

	/**
	 * Validates the nombreSemaine constraint of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre_nombreSemaine(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semestre.nombreSemaine(diagnostics, context);
	}

	/**
	 * Validates the AssocieNiveau constraint of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre_AssocieNiveau(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semestre.AssocieNiveau(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre_Named(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semestre.Named(diagnostics, context);
	}

	/**
	 * Validates the auMoins1Ue constraint of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre_auMoins1Ue(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semestre.auMoins1Ue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemainier(Semainier semainier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semainier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemainier_pourUnSeulSemestre(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemainier_ContenuDefini(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemainier_Named(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemainier_SemainierValideDate(semainier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemainier_DatesSeancesValides(semainier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the pourUnSeulSemestre constraint of '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemainier_pourUnSeulSemestre(Semainier semainier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semainier.pourUnSeulSemestre(diagnostics, context);
	}

	/**
	 * Validates the ContenuDefini constraint of '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemainier_ContenuDefini(Semainier semainier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semainier.ContenuDefini(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemainier_Named(Semainier semainier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semainier.Named(diagnostics, context);
	}

	/**
	 * Validates the SemainierValideDate constraint of '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemainier_SemainierValideDate(Semainier semainier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semainier.SemainierValideDate(diagnostics, context);
	}

	/**
	 * Validates the DatesSeancesValides constraint of '<em>Semainier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemainier_DatesSeancesValides(Semainier semainier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return semainier.DatesSeancesValides(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUE_Named(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUE_plusieursRessources(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUE_EnseignantsValides(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUE_auMoins1Responsable(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUE_dans1SeulSemestre(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUE_semanierValide(ue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Named constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_Named(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.Named(diagnostics, context);
	}

	/**
	 * Validates the plusieursRessources constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_plusieursRessources(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.plusieursRessources(diagnostics, context);
	}

	/**
	 * Validates the EnseignantsValides constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_EnseignantsValides(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.EnseignantsValides(diagnostics, context);
	}

	/**
	 * Validates the auMoins1Responsable constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_auMoins1Responsable(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.auMoins1Responsable(diagnostics, context);
	}

	/**
	 * Validates the dans1SeulSemestre constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_dans1SeulSemestre(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.dans1SeulSemestre(diagnostics, context);
	}

	/**
	 * Validates the semanierValide constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_semanierValide(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.semanierValide(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRessource_uneSeuleUe(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRessource_Named(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRessource_nomUnique(ressource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uneSeuleUe constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_uneSeuleUe(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ressource.uneSeuleUe(diagnostics, context);
	}

	/**
	 * Validates the Named constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_Named(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ressource.Named(diagnostics, context);
	}

	/**
	 * Validates the nomUnique constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_nomUnique(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ressource.nomUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsable(Responsable responsable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responsable, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsable_UesDansFormationsOuIntervient(responsable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UesDansFormationsOuIntervient constraint of '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsable_UesDansFormationsOuIntervient(Responsable responsable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsable.UesDansFormationsOuIntervient(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateprerequis(prerequis prerequis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prerequis, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prerequis, diagnostics, context);
		if (result || diagnostics != null) result &= validateprerequis_Named(prerequis, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Named constraint of '<em>prerequis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateprerequis_Named(prerequis prerequis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prerequis.Named(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebouche(Debouche debouche, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(debouche, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(debouche, diagnostics, context);
		if (result || diagnostics != null) result &= validateDebouche_Named(debouche, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Named constraint of '<em>Debouche</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebouche_Named(Debouche debouche, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return debouche.Named(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammation(Programmation programmation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programmation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgrammation_HoraireValid(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgrammation_ContenuDefini(programmation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgrammation_trancheHoraire(programmation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HoraireValid constraint of '<em>Programmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammation_HoraireValid(Programmation programmation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return programmation.HoraireValid(diagnostics, context);
	}

	/**
	 * Validates the ContenuDefini constraint of '<em>Programmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammation_ContenuDefini(Programmation programmation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return programmation.ContenuDefini(diagnostics, context);
	}

	/**
	 * Validates the trancheHoraire constraint of '<em>Programmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammation_trancheHoraire(Programmation programmation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return programmation.trancheHoraire(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTYPE(TYPE type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSEXE(SEXE sexe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJOUR(JOUR jour, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //MymetamodelValidator
