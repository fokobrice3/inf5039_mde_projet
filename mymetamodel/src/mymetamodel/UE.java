/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unité d'Enseignement (UE) : une unité d'enseignement pour un semestre donné.
 * ?	Identifié par son code
 * ?	Possède un nom, un crédit, une description, son objectif et un Boolean qui indique si elle est optionnelle ou obligatoire
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.UE#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.UE#getCode <em>Code</em>}</li>
 *   <li>{@link mymetamodel.UE#getCredit <em>Credit</em>}</li>
 *   <li>{@link mymetamodel.UE#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.UE#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link mymetamodel.UE#getPrerequis <em>Prerequis</em>}</li>
 *   <li>{@link mymetamodel.UE#getRessource <em>Ressource</em>}</li>
 *   <li>{@link mymetamodel.UE#getSemainier <em>Semainier</em>}</li>
 *   <li>{@link mymetamodel.UE#getProgrammation <em>Programmation</em>}</li>
 *   <li>{@link mymetamodel.UE#getSpecialite <em>Specialite</em>}</li>
 *   <li>{@link mymetamodel.UE#isIsOptionel <em>Is Optionel</em>}</li>
 *   <li>{@link mymetamodel.UE#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.UE#getSemestre <em>Semestre</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getUE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Named'"
 * @generated
 */
public interface UE extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getUE_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see mymetamodel.MymetamodelPackage#getUE_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(int)
	 * @see mymetamodel.MymetamodelPackage#getUE_Credit()
	 * @model required="true"
	 * @generated
	 */
	int getCredit();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mymetamodel.MymetamodelPackage#getUE_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif</em>' attribute.
	 * @see #setObjectif(String)
	 * @see mymetamodel.MymetamodelPackage#getUE_Objectif()
	 * @model
	 * @generated
	 */
	String getObjectif();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getObjectif <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectif</em>' attribute.
	 * @see #getObjectif()
	 * @generated
	 */
	void setObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Prerequis</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.prerequis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequis</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getUE_Prerequis()
	 * @model containment="true"
	 * @generated
	 */
	EList<prerequis> getPrerequis();

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Ressource}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Ressource#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getUE_Ressource()
	 * @see mymetamodel.Ressource#getUe
	 * @model opposite="ue" containment="true"
	 * @generated
	 */
	EList<Ressource> getRessource();

	/**
	 * Returns the value of the '<em><b>Semainier</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.Semainier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semainier</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getUE_Semainier()
	 * @model
	 * @generated
	 */
	EList<Semainier> getSemainier();

	/**
	 * Returns the value of the '<em><b>Programmation</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.Programmation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmation</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getUE_Programmation()
	 * @model required="true"
	 * @generated
	 */
	EList<Programmation> getProgrammation();

	/**
	 * Returns the value of the '<em><b>Specialite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite</em>' reference.
	 * @see #setSpecialite(Specialite)
	 * @see mymetamodel.MymetamodelPackage#getUE_Specialite()
	 * @model
	 * @generated
	 */
	Specialite getSpecialite();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getSpecialite <em>Specialite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialite</em>' reference.
	 * @see #getSpecialite()
	 * @generated
	 */
	void setSpecialite(Specialite value);

	/**
	 * Returns the value of the '<em><b>Is Optionel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optionel</em>' attribute.
	 * @see #setIsOptionel(boolean)
	 * @see mymetamodel.MymetamodelPackage#getUE_IsOptionel()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOptionel();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#isIsOptionel <em>Is Optionel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optionel</em>' attribute.
	 * @see #isIsOptionel()
	 * @generated
	 */
	void setIsOptionel(boolean value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.Responsable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getUE_Responsable()
	 * @model required="true"
	 * @generated
	 */
	EList<Responsable> getResponsable();

	/**
	 * Returns the value of the '<em><b>Semestre</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Semestre#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestre</em>' container reference.
	 * @see #setSemestre(Semestre)
	 * @see mymetamodel.MymetamodelPackage#getUE_Semestre()
	 * @see mymetamodel.Semestre#getUe
	 * @model opposite="ue" required="true" transient="false"
	 * @generated
	 */
	Semestre getSemestre();

	/**
	 * Sets the value of the '{@link mymetamodel.UE#getSemestre <em>Semestre</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semestre</em>' container reference.
	 * @see #getSemestre()
	 * @generated
	 */
	void setSemestre(Semestre value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.ressource-&gt;size() &gt;= 0'"
	 * @generated
	 */
	boolean plusieursRessources(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.programmation-&gt;forAll(p | self.responsable-&gt;includes(p.responsable))'"
	 * @generated
	 */
	boolean EnseignantsValides(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.responsable-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean auMoins1Responsable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.responsable-&gt;size() = 1'"
	 * @generated
	 */
	boolean dans1SeulSemestre(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.semainier-&gt;forAll(sem | self.semestre.semainier-&gt;includes(sem))'"
	 * @generated
	 */
	boolean semanierValide(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nom &lt;&gt; null and self.description &lt;&gt; null and self.isOptionel &lt;&gt; null'"
	 * @generated
	 */
	boolean Named(DiagnosticChain diagnostics, Map<Object, Object> context);

} // UE
