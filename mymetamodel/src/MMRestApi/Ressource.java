/**
 */
package MMRestApi;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CLASSE RESSOURCE
 * 
 * nom : le nom de la ressource
 * URI : l'URI de la ressource
 * description : une description de la ressource
 * méthodes : les méthodes HTTP supportées par la ressource
 * opérations : les opérations disponibles sur la ressource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.Ressource#getOperation <em>Operation</em>}</li>
 *   <li>{@link MMRestApi.Ressource#getNom <em>Nom</em>}</li>
 *   <li>{@link MMRestApi.Ressource#getDescription <em>Description</em>}</li>
 *   <li>{@link MMRestApi.Ressource#getUri <em>Uri</em>}</li>
 *   <li>{@link MMRestApi.Ressource#getPropriete <em>Propriete</em>}</li>
 *   <li>{@link MMRestApi.Ressource#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see MMRestApi.MMRestApiPackage#getRessource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='at_least_one_operation'"
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getRessource_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see MMRestApi.MMRestApiPackage#getRessource_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link MMRestApi.Ressource#getNom <em>Nom</em>}' attribute.
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
	 * @see MMRestApi.MMRestApiPackage#getRessource_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MMRestApi.Ressource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.URI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getRessource_Uri()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<URI> getUri();

	/**
	 * Returns the value of the '<em><b>Propriete</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.Propriete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriete</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getRessource_Propriete()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propriete> getPropriete();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' attribute.
	 * @see #setProps(EList)
	 * @see MMRestApi.MMRestApiPackage#getRessource_Props()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<Propriete> getProps();

	/**
	 * Sets the value of the '{@link MMRestApi.Ressource#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(EList<Propriete> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclType().allInstances()-&gt;isUnique(nom)'"
	 * @generated
	 */
	boolean unique_name(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.operation-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean at_least_one_operation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ressource
