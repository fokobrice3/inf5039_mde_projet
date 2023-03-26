/**
 */
package MMRestApi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.Reponse#getStatus <em>Status</em>}</li>
 *   <li>{@link MMRestApi.Reponse#getDescription <em>Description</em>}</li>
 *   <li>{@link MMRestApi.Reponse#getHeaders <em>Headers</em>}</li>
 *   <li>{@link MMRestApi.Reponse#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see MMRestApi.MMRestApiPackage#getReponse()
 * @model
 * @generated
 */
public interface Reponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link MMRestApi.HttpStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see MMRestApi.HttpStatus
	 * @see #setStatus(HttpStatus)
	 * @see MMRestApi.MMRestApiPackage#getReponse_Status()
	 * @model
	 * @generated
	 */
	HttpStatus getStatus();

	/**
	 * Sets the value of the '{@link MMRestApi.Reponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see MMRestApi.HttpStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(HttpStatus value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MMRestApi.MMRestApiPackage#getReponse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MMRestApi.Reponse#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content-Type: text/html; charset=UTF-8;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Headers</em>' attribute.
	 * @see #setHeaders(String)
	 * @see MMRestApi.MMRestApiPackage#getReponse_Headers()
	 * @model
	 * @generated
	 */
	String getHeaders();

	/**
	 * Sets the value of the '{@link MMRestApi.Reponse#getHeaders <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' attribute.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * resultat de la reponse HTTP dans un JSON.Stringify
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see MMRestApi.MMRestApiPackage#getReponse_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link MMRestApi.Reponse#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Reponse
