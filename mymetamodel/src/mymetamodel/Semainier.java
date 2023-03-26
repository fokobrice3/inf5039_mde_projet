/**
 */
package mymetamodel;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semainier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * chaque instance de l'entité Semainier représente une semaine de cours pour une UE donnée. Chaque semaine est liée à l'UE et au semestre correspondant. Le contenu du semainier est stocké sous forme de chaîne de caractères. Les dates de début et de fin permettent de délimiter la semaine.
 * ?	Identifié par son numéro
 * ?	Possède une date de début, une date de fin et un contenu
 * ?	Le contenu décrit le semainier
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Semainier#getNumero <em>Numero</em>}</li>
 *   <li>{@link mymetamodel.Semainier#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mymetamodel.Semainier#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mymetamodel.Semainier#getContenu <em>Contenu</em>}</li>
 *   <li>{@link mymetamodel.Semainier#getProgrammation <em>Programmation</em>}</li>
 *   <li>{@link mymetamodel.Semainier#getSemestre <em>Semestre</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getSemainier()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pourUnSeulSemestre'"
 * @generated
 */
public interface Semainier extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see mymetamodel.MymetamodelPackage#getSemainier_Numero()
	 * @model required="true"
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link mymetamodel.Semainier#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see mymetamodel.MymetamodelPackage#getSemainier_DateDebut()
	 * @model
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link mymetamodel.Semainier#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see mymetamodel.MymetamodelPackage#getSemainier_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link mymetamodel.Semainier#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see mymetamodel.MymetamodelPackage#getSemainier_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link mymetamodel.Semainier#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

	/**
	 * Returns the value of the '<em><b>Programmation</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Programmation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmation</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getSemainier_Programmation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programmation> getProgrammation();

	/**
	 * Returns the value of the '<em><b>Semestre</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Semestre#getSemainier <em>Semainier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestre</em>' container reference.
	 * @see #setSemestre(Semestre)
	 * @see mymetamodel.MymetamodelPackage#getSemainier_Semestre()
	 * @see mymetamodel.Semestre#getSemainier
	 * @model opposite="semainier" required="true" transient="false"
	 * @generated
	 */
	Semestre getSemestre();

	/**
	 * Sets the value of the '{@link mymetamodel.Semainier#getSemestre <em>Semestre</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semestre</em>' container reference.
	 * @see #getSemestre()
	 * @generated
	 */
	void setSemestre(Semestre value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.contenu &lt;&gt; null'"
	 * @generated
	 */
	boolean ContenuDefini(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.numero &lt;&gt; null'"
	 * @generated
	 */
	boolean Named(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.dateDebut &lt; self.dateFin'"
	 * @generated
	 */
	boolean SemainierValideDate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.dateDebut &gt;= self.semestre.dateDebut and self.dateFin &lt;= self.semestre.dateFin'"
	 * @generated
	 */
	boolean DatesSeancesValides(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.semestre-&gt;size() = 1'"
	 * @generated
	 */
	boolean pourUnSeulSemestre(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Semainier
