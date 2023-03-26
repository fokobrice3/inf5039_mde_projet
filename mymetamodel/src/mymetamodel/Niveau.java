/**
 */
package mymetamodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Niveau : représentant les différents niveaux (Licence, Master, Doctorat) associés ou non à des spécialités avec un nom, une liste de semestres, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Niveau#getNumero <em>Numero</em>}</li>
 *   <li>{@link mymetamodel.Niveau#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.Niveau#getDescription <em>Description</em>}</li>
 *   <li>{@link mymetamodel.Niveau#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link mymetamodel.Niveau#getFormation <em>Formation</em>}</li>
 *   <li>{@link mymetamodel.Niveau#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link mymetamodel.Niveau#getSpecialite <em>Specialite</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getNiveau()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotSpecialityWthDiffLevelWthSameName'"
 * @generated
 */
public interface Niveau extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Numero()
	 * @model required="true"
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link mymetamodel.Niveau#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.Niveau#getNom <em>Nom</em>}' attribute.
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
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mymetamodel.Niveau#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Semestre</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Semestre}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Semestre#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestre</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Semestre()
	 * @see mymetamodel.Semestre#getNiveau
	 * @model opposite="niveau" containment="true"
	 * @generated
	 */
	EList<Semestre> getSemestre();

	/**
	 * Returns the value of the '<em><b>Formation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Formation#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation</em>' container reference.
	 * @see #setFormation(Formation)
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Formation()
	 * @see mymetamodel.Formation#getNiveau
	 * @model opposite="niveau" required="true" transient="false"
	 * @generated
	 */
	Formation getFormation();

	/**
	 * Sets the value of the '{@link mymetamodel.Niveau#getFormation <em>Formation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formation</em>' container reference.
	 * @see #getFormation()
	 * @generated
	 */
	void setFormation(Formation value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Responsable)
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Responsable()
	 * @model
	 * @generated
	 */
	Responsable getResponsable();

	/**
	 * Sets the value of the '{@link mymetamodel.Niveau#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Responsable value);

	/**
	 * Returns the value of the '<em><b>Specialite</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.Specialite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getNiveau_Specialite()
	 * @model
	 * @generated
	 */
	EList<Specialite> getSpecialite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.specialite-&gt;size() &gt;= 0'"
	 * @generated
	 */
	boolean multiSpecialite(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.semestre-&gt;notEmpty()'"
	 * @generated
	 */
	boolean associeSemestre(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.semestre-&gt;forAll(s1, s2 |s1 &lt;&gt; s2 implies s1.numero &lt;&gt; s2.numero)'"
	 * @generated
	 */
	boolean semestreUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.numero &lt;&gt; null and self.nom &lt;&gt; null'"
	 * @generated
	 */
	boolean Named(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.formation-&gt;notEmpty()'"
	 * @generated
	 */
	boolean associeFormation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.semestre-&gt;forAll(s1, s2 | s1 &lt;&gt; s2 implies s1.numero &lt;&gt; s2.numero)'"
	 * @generated
	 */
	boolean numeroSemestreUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self-&gt;select(n | n.formation = self.formation)-&gt;select(n | n &lt;&gt; self)-&gt;forAll(n | n.specialite-&gt;select(s | s.nom = self.nom)-&gt;size() = 0)'"
	 * @generated
	 */
	boolean NotSpecialityWthDiffLevelWthSameName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Niveau
