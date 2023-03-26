/**
 */
package MMRestApi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.API#getBase_url <em>Base url</em>}</li>
 *   <li>{@link MMRestApi.API#getNom <em>Nom</em>}</li>
 *   <li>{@link MMRestApi.API#getRessource <em>Ressource</em>}</li>
 *   <li>{@link MMRestApi.API#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see MMRestApi.MMRestApiPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
	/**
	 * Returns the value of the '<em><b>Base url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base url</em>' attribute.
	 * @see #setBase_url(String)
	 * @see MMRestApi.MMRestApiPackage#getAPI_Base_url()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getBase_url();

	/**
	 * Sets the value of the '{@link MMRestApi.API#getBase_url <em>Base url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base url</em>' attribute.
	 * @see #getBase_url()
	 * @generated
	 */
	void setBase_url(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see MMRestApi.MMRestApiPackage#getAPI_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link MMRestApi.API#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getAPI_Ressource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessource();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MMRestApi.MMRestApiPackage#getAPI_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MMRestApi.API#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // API
