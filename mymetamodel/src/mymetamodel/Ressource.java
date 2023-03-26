/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ?	Une ressource d’une UE
 * ?	Identifié par son nom, possède un type (sa nature) et un chemin(url) pour le récupérer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Ressource#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.Ressource#getType <em>Type</em>}</li>
 *   <li>{@link mymetamodel.Ressource#getChemin <em>Chemin</em>}</li>
 *   <li>{@link mymetamodel.Ressource#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getRessource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uneSeuleUe'"
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getRessource_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.Ressource#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mymetamodel.TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mymetamodel.TYPE
	 * @see #setType(TYPE)
	 * @see mymetamodel.MymetamodelPackage#getRessource_Type()
	 * @model
	 * @generated
	 */
	TYPE getType();

	/**
	 * Sets the value of the '{@link mymetamodel.Ressource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mymetamodel.TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(TYPE value);

	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see mymetamodel.MymetamodelPackage#getRessource_Chemin()
	 * @model
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link mymetamodel.Ressource#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

	/**
	 * Returns the value of the '<em><b>Ue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mymetamodel.UE#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue</em>' container reference.
	 * @see #setUe(UE)
	 * @see mymetamodel.MymetamodelPackage#getRessource_Ue()
	 * @see mymetamodel.UE#getRessource
	 * @model opposite="ressource" transient="false"
	 * @generated
	 */
	UE getUe();

	/**
	 * Sets the value of the '{@link mymetamodel.Ressource#getUe <em>Ue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ue</em>' container reference.
	 * @see #getUe()
	 * @generated
	 */
	void setUe(UE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nom &lt;&gt; null and self.type &lt;&gt; null and self.chemin &lt;&gt; null'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.ue-&gt;size() = 1'"
	 * @generated
	 */
	boolean uneSeuleUe(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ressource
