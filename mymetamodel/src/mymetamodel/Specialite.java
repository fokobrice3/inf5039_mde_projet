/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * une spécialisation possible pour un niveau donné (par exemple, Informatique, Biologie, Géologie).
 * ?	Identifié par son nom et possède une description
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Specialite#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.Specialite#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.Specialite#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getSpecialite()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomUnique'"
 * @generated
 */
public interface Specialite extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getSpecialite_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.Specialite#getNom <em>Nom</em>}' attribute.
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
	 * @see mymetamodel.MymetamodelPackage#getSpecialite_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mymetamodel.Specialite#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Responsable)
	 * @see mymetamodel.MymetamodelPackage#getSpecialite_Responsable()
	 * @model
	 * @generated
	 */
	Responsable getResponsable();

	/**
	 * Sets the value of the '{@link mymetamodel.Specialite#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Responsable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nom &lt;&gt; null'"
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

} // Specialite
