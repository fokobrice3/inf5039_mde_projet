/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * une formation proposée dans le portail pédagogique avec un nom, une description, une liste de niveaux, une liste de débouchés, une liste de spécialités, une liste de semestres, etc.
 * ?	Identifié par son nom et possède une description
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Formation#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.Formation#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.Formation#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mymetamodel.Formation#getDebouche <em>Debouche</em>}</li>
 *   <li>{@link mymetamodel.Formation#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.Formation#getSpecialite <em>Specialite</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getFormation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='niveauDistinct'"
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getFormation_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.Formation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mymetamodel.MymetamodelPackage#getFormation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mymetamodel.Formation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Niveau}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Niveau#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getFormation_Niveau()
	 * @see mymetamodel.Niveau#getFormation
	 * @model opposite="formation" containment="true" required="true"
	 * @generated
	 */
	EList<Niveau> getNiveau();

	/**
	 * Returns the value of the '<em><b>Debouche</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Debouche}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debouche</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getFormation_Debouche()
	 * @model containment="true"
	 * @generated
	 */
	EList<Debouche> getDebouche();

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.Responsable}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Responsable#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getFormation_Responsable()
	 * @see mymetamodel.Responsable#getFormation
	 * @model opposite="formation"
	 * @generated
	 */
	EList<Responsable> getResponsable();

	/**
	 * Returns the value of the '<em><b>Specialite</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Specialite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getFormation_Specialite()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialite> getSpecialite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nom &lt;&gt; null and self.description &lt;&gt; null'"
	 * @generated
	 */
	boolean Named(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclType().allInstances()-&gt;isUnique(nom)'"
	 * @generated
	 */
	boolean nomUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.niveau-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean auMoins1Niveau(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.niveau-&gt;forAll(n1, n2 |n1 &lt;&gt; n2 implies n1.numero &lt;&gt; n2.numero and n1.nom &lt;&gt; n2.nom)'"
	 * @generated
	 */
	boolean niveauDistinct(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Formation
