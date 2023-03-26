/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Une programmation est un jour, une salle une heure de debut et une heure de  fin à laquelle a été programme une unité d'enseignemet dans un semanier d'un semestre.
 * ?	Représentée par le jour, l’heure de début, l’heure de fin et la salle ou est prévu le cours
 * ?	Elle a un enseignant responsable qui doit tenir la seance(cours)
 * Exemple :
 * Programmation : Lundi 10H-12H S008
 * ? Dr Paul Martin
 * ? INF5049
 * ? Semanier 1
 * ? Semestre 2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Programmation#getJour <em>Jour</em>}</li>
 *   <li>{@link mymetamodel.Programmation#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link mymetamodel.Programmation#getHeureFin <em>Heure Fin</em>}</li>
 *   <li>{@link mymetamodel.Programmation#getSalle <em>Salle</em>}</li>
 *   <li>{@link mymetamodel.Programmation#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getProgrammation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HoraireValid'"
 * @generated
 */
public interface Programmation extends EObject {
	/**
	 * Returns the value of the '<em><b>Jour</b></em>' attribute.
	 * The literals are from the enumeration {@link mymetamodel.JOUR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jour</em>' attribute.
	 * @see mymetamodel.JOUR
	 * @see #setJour(JOUR)
	 * @see mymetamodel.MymetamodelPackage#getProgrammation_Jour()
	 * @model
	 * @generated
	 */
	JOUR getJour();

	/**
	 * Sets the value of the '{@link mymetamodel.Programmation#getJour <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jour</em>' attribute.
	 * @see mymetamodel.JOUR
	 * @see #getJour()
	 * @generated
	 */
	void setJour(JOUR value);

	/**
	 * Returns the value of the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut</em>' attribute.
	 * @see #setHeureDebut(int)
	 * @see mymetamodel.MymetamodelPackage#getProgrammation_HeureDebut()
	 * @model required="true"
	 * @generated
	 */
	int getHeureDebut();

	/**
	 * Sets the value of the '{@link mymetamodel.Programmation#getHeureDebut <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut</em>' attribute.
	 * @see #getHeureDebut()
	 * @generated
	 */
	void setHeureDebut(int value);

	/**
	 * Returns the value of the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin</em>' attribute.
	 * @see #setHeureFin(int)
	 * @see mymetamodel.MymetamodelPackage#getProgrammation_HeureFin()
	 * @model required="true"
	 * @generated
	 */
	int getHeureFin();

	/**
	 * Sets the value of the '{@link mymetamodel.Programmation#getHeureFin <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin</em>' attribute.
	 * @see #getHeureFin()
	 * @generated
	 */
	void setHeureFin(int value);

	/**
	 * Returns the value of the '<em><b>Salle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle</em>' attribute.
	 * @see #setSalle(String)
	 * @see mymetamodel.MymetamodelPackage#getProgrammation_Salle()
	 * @model
	 * @generated
	 */
	String getSalle();

	/**
	 * Sets the value of the '{@link mymetamodel.Programmation#getSalle <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle</em>' attribute.
	 * @see #getSalle()
	 * @generated
	 */
	void setSalle(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Responsable)
	 * @see mymetamodel.MymetamodelPackage#getProgrammation_Responsable()
	 * @model
	 * @generated
	 */
	Responsable getResponsable();

	/**
	 * Sets the value of the '{@link mymetamodel.Programmation#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Responsable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.jour &lt;&gt; null and self.heureDebut &lt;&gt; null and self.heureFin &lt;&gt; null and self.salle &lt;&gt; null'"
	 * @generated
	 */
	boolean ContenuDefini(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.heureDebut &lt;= 20 and self.heureDebut &gt;= 7 and self.heureFin &lt;= 21 and self.heureFin &gt;= 8'"
	 * @generated
	 */
	boolean trancheHoraire(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.heureDebut &lt; self.heureFin and self.heureFin - self.heureDebut &gt;= 1'"
	 * @generated
	 */
	boolean HoraireValid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Programmation
