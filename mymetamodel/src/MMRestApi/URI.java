/**
 */
package MMRestApi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CLASSE URI
 * 
 * template : le template d'URI associé à la ressource
 * méthodes : les méthodes HTTP supportées par l'URI
 * opérations : les opérations disponibles sur l'URI
 * variables : les variables définies dans le template d'URI. Chaque variable a un nom, un type et une description.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.URI#getUri_template <em>Uri template</em>}</li>
 *   <li>{@link MMRestApi.URI#getVariable <em>Variable</em>}</li>
 *   <li>{@link MMRestApi.URI#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see MMRestApi.MMRestApiPackage#getURI()
 * @model
 * @generated
 */
public interface URI extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri template</em>' attribute.
	 * @see #setUri_template(String)
	 * @see MMRestApi.MMRestApiPackage#getURI_Uri_template()
	 * @model id="true"
	 * @generated
	 */
	String getUri_template();

	/**
	 * Sets the value of the '{@link MMRestApi.URI#getUri_template <em>Uri template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri template</em>' attribute.
	 * @see #getUri_template()
	 * @generated
	 */
	void setUri_template(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.Parametre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getURI_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametre> getVariable();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link MMRestApi.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see MMRestApi.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see MMRestApi.MMRestApiPackage#getURI_Method()
	 * @model
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link MMRestApi.URI#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see MMRestApi.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

} // URI
