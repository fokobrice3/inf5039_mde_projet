/**
 */
package MMRestApi.impl;

import MMRestApi.HttpMethod;
import MMRestApi.MMRestApiPackage;
import MMRestApi.Parametre;
import MMRestApi.URI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MMRestApi.impl.URIImpl#getUri_template <em>Uri template</em>}</li>
 *   <li>{@link MMRestApi.impl.URIImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link MMRestApi.impl.URIImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URIImpl extends MinimalEObjectImpl.Container implements URI {
	/**
	 * The default value of the '{@link #getUri_template() <em>Uri template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri_template()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri_template() <em>Uri template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri_template()
	 * @generated
	 * @ordered
	 */
	protected String uri_template = URI_TEMPLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Parametre> variable;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod method = METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMRestApiPackage.Literals.URI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri_template() {
		return uri_template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri_template(String newUri_template) {
		String oldUri_template = uri_template;
		uri_template = newUri_template;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMRestApiPackage.URI__URI_TEMPLATE, oldUri_template, uri_template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametre> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Parametre>(Parametre.class, this, MMRestApiPackage.URI__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HttpMethod newMethod) {
		HttpMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMRestApiPackage.URI__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MMRestApiPackage.URI__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MMRestApiPackage.URI__URI_TEMPLATE:
				return getUri_template();
			case MMRestApiPackage.URI__VARIABLE:
				return getVariable();
			case MMRestApiPackage.URI__METHOD:
				return getMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MMRestApiPackage.URI__URI_TEMPLATE:
				setUri_template((String)newValue);
				return;
			case MMRestApiPackage.URI__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Parametre>)newValue);
				return;
			case MMRestApiPackage.URI__METHOD:
				setMethod((HttpMethod)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MMRestApiPackage.URI__URI_TEMPLATE:
				setUri_template(URI_TEMPLATE_EDEFAULT);
				return;
			case MMRestApiPackage.URI__VARIABLE:
				getVariable().clear();
				return;
			case MMRestApiPackage.URI__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MMRestApiPackage.URI__URI_TEMPLATE:
				return URI_TEMPLATE_EDEFAULT == null ? uri_template != null : !URI_TEMPLATE_EDEFAULT.equals(uri_template);
			case MMRestApiPackage.URI__VARIABLE:
				return variable != null && !variable.isEmpty();
			case MMRestApiPackage.URI__METHOD:
				return method != METHOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uri_template: ");
		result.append(uri_template);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //URIImpl
