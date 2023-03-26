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
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Semestre : un semestre pour un niveau donné.
 * ?	Identifié par son numéro et possède une description, une date de début et une date de fin
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Semestre#getNumero <em>Numero</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getSemainier <em>Semainier</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getNbSemaine <em>Nb Semaine</em>}</li>
 *   <li>{@link mymetamodel.Semestre#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getSemestre()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NombreSeancesValide'"
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see mymetamodel.MymetamodelPackage#getSemestre_Numero()
	 * @model required="true"
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link mymetamodel.Semestre#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mymetamodel.MymetamodelPackage#getSemestre_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mymetamodel.Semestre#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Niveau#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' container reference.
	 * @see #setNiveau(Niveau)
	 * @see mymetamodel.MymetamodelPackage#getSemestre_Niveau()
	 * @see mymetamodel.Niveau#getSemestre
	 * @model opposite="semestre" required="true" transient="false"
	 * @generated
	 */
	Niveau getNiveau();

	/**
	 * Sets the value of the '{@link mymetamodel.Semestre#getNiveau <em>Niveau</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' container reference.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(Niveau value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see mymetamodel.MymetamodelPackage#getSemestre_DateDebut()
	 * @model
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link mymetamodel.Semestre#getDateDebut <em>Date Debut</em>}' attribute.
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
	 * @see mymetamodel.MymetamodelPackage#getSemestre_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link mymetamodel.Semestre#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Semainier</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Semainier}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Semainier#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semainier</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getSemestre_Semainier()
	 * @see mymetamodel.Semainier#getSemestre
	 * @model opposite="semestre" containment="true"
	 * @generated
	 */
	EList<Semainier> getSemainier();

	/**
	 * Returns the value of the '<em><b>Nb Semaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Semaine</em>' attribute.
	 * @see #setNbSemaine(int)
	 * @see mymetamodel.MymetamodelPackage#getSemestre_NbSemaine()
	 * @model required="true"
	 * @generated
	 */
	int getNbSemaine();

	/**
	 * Sets the value of the '{@link mymetamodel.Semestre#getNbSemaine <em>Nb Semaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Semaine</em>' attribute.
	 * @see #getNbSemaine()
	 * @generated
	 */
	void setNbSemaine(int value);

	/**
	 * Returns the value of the '<em><b>Ue</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.UE}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.UE#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getSemestre_Ue()
	 * @see mymetamodel.UE#getSemestre
	 * @model opposite="semestre" containment="true"
	 * @generated
	 */
	EList<UE> getUe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.niveau.semestre-&gt;forAll(s | s &lt;&gt; self implies s.numero &lt;&gt; self.numero)'"
	 * @generated
	 */
	boolean numeroUniqueParNiveau(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nbSemaine &gt;= 1 and self.nbSemaine &lt;= 24'"
	 * @generated
	 */
	boolean nombreSemaine(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.niveau &lt;&gt; null and self.niveau-&gt;size() = 1'"
	 * @generated
	 */
	boolean AssocieNiveau(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.numero &lt;&gt; null and self.description &lt;&gt; null'"
	 * @generated
	 */
	boolean Named(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.ue-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean auMoins1Ue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.semainier-&gt;size() &lt;= self.nbSemaine'"
	 * @generated
	 */
	boolean NombreSeancesValide(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Semestre
