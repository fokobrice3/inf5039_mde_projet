/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represente le departement d'une plateforme pédagogique.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Departement#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.Departement#getFormation <em>Formation</em>}</li>
 *   <li>{@link mymetamodel.Departement#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.Departement#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.Departement#getChef <em>Chef</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getDepartement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueFormationList'"
 * @generated
 */
public interface Departement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getDepartement_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.Departement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Formation</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getDepartement_Formation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formation> getFormation();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mymetamodel.MymetamodelPackage#getDepartement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mymetamodel.Departement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Responsable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getDepartement_Responsable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Responsable> getResponsable();

	/**
	 * Returns the value of the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef</em>' reference.
	 * @see #setChef(Responsable)
	 * @see mymetamodel.MymetamodelPackage#getDepartement_Chef()
	 * @model required="true"
	 * @generated
	 */
	Responsable getChef();

	/**
	 * Sets the value of the '{@link mymetamodel.Departement#getChef <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef</em>' reference.
	 * @see #getChef()
	 * @generated
	 */
	void setChef(Responsable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.formation-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean atLeastOneFormation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.responsable-&gt;notEmpty()'"
	 * @generated
	 */
	boolean auMoins1Responsable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclType().allInstances()-&gt;forAll(id1, id2 |id1 &lt;&gt; id2 implies id1.nom &lt;&gt; id2.nom)'"
	 * @generated
	 */
	boolean uniqueDepName(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.formation-&gt;forAll(f1, f2 |f1 &lt;&gt; f2 implies f1.nom &lt;&gt; f2.nom)'"
	 * @generated
	 */
	boolean UniqueFormationList(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Departement
