/**
 */
package MMRestApi;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CLASSE OPERATION
 * 
 * nom : le nom de l'opération
 * méthode : la méthode HTTP associée à l'opération
 * URI : l'URI de l'opération
 * description : une description de l'opération
 * paramètres : les paramètres d'entrée de l'opération
 * réponses : les réponses possibles de l'opération
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.Operation#getMethode <em>Methode</em>}</li>
 *   <li>{@link MMRestApi.Operation#getNom <em>Nom</em>}</li>
 *   <li>{@link MMRestApi.Operation#getParametre <em>Parametre</em>}</li>
 *   <li>{@link MMRestApi.Operation#getType <em>Type</em>}</li>
 *   <li>{@link MMRestApi.Operation#getUri <em>Uri</em>}</li>
 *   <li>{@link MMRestApi.Operation#getReponse <em>Reponse</em>}</li>
 * </ul>
 *
 * @see MMRestApi.MMRestApiPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='http_method_consistency'"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Methode</b></em>' attribute.
	 * The literals are from the enumeration {@link MMRestApi.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode</em>' attribute.
	 * @see MMRestApi.HttpMethod
	 * @see #setMethode(HttpMethod)
	 * @see MMRestApi.MMRestApiPackage#getOperation_Methode()
	 * @model
	 * @generated
	 */
	HttpMethod getMethode();

	/**
	 * Sets the value of the '{@link MMRestApi.Operation#getMethode <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode</em>' attribute.
	 * @see MMRestApi.HttpMethod
	 * @see #getMethode()
	 * @generated
	 */
	void setMethode(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see MMRestApi.MMRestApiPackage#getOperation_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link MMRestApi.Operation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Parametre</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.Parametre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametre</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getOperation_Parametre()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametre> getParametre();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MMRestApi.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MMRestApi.OperationType
	 * @see #setType(OperationType)
	 * @see MMRestApi.MMRestApiPackage#getOperation_Type()
	 * @model
	 * @generated
	 */
	OperationType getType();

	/**
	 * Sets the value of the '{@link MMRestApi.Operation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MMRestApi.OperationType
	 * @see #getType()
	 * @generated
	 */
	void setType(OperationType value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' reference.
	 * @see #setUri(URI)
	 * @see MMRestApi.MMRestApiPackage#getOperation_Uri()
	 * @model required="true"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link MMRestApi.Operation#getUri <em>Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference list.
	 * The list contents are of type {@link MMRestApi.Reponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference list.
	 * @see MMRestApi.MMRestApiPackage#getOperation_Reponse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reponse> getReponse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.uri-&gt;size() = 1'"
	 * @generated
	 */
	boolean one_uri(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.uri-&gt;forAll(u | u.variable-&gt;forAll(v |u.uri_template.indexOf(v.nom) &lt;&gt; -1))'"
	 * @generated
	 */
	boolean uris_have_defined_variable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type &lt;&gt; OperationType::READ or self.methode &lt;&gt; HttpMethod::POST and self.methode &lt;&gt; HttpMethod::PUT and self.methode &lt;&gt; HttpMethod::PATCH and self.methode &lt;&gt; HttpMethod::DELETE'"
	 * @generated
	 */
	boolean read_not_modify(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.methode.oclIsUndefined() implies self.uri.method = self.methode'"
	 * @generated
	 */
	boolean have_httpMethod(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type &lt;&gt; OperationType::READ or (self.methode &lt;&gt; HttpMethod::POST and self.methode &lt;&gt; HttpMethod::PUT and self.methode &lt;&gt; HttpMethod::PATCH and self.methode &lt;&gt; HttpMethod::DELETE)'"
	 * @generated
	 */
	boolean read_operation_http_method(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(self.type = OperationType::READ and (self.methode = HttpMethod::GET or self.methode = HttpMethod::HEAD)) or (self.type = OperationType::WRITE and (self.methode = HttpMethod::POST or self.methode = HttpMethod::PUT or self.methode = HttpMethod::PATCH or self.methode = HttpMethod::DELETE))'"
	 * @generated
	 */
	boolean http_method_consistency(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Operation
