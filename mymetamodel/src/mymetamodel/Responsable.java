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
 * A representation of the model object '<em><b>Responsable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ?	Une personne responsable d’un département(chef), d’une formation, d’un niveau, d’une spécialité ou d’une UE
 * ?	Identifié par son numéro de téléphone ou par son mail
 * ?	possède un nom, un sexe, une date de naissance et une fonction
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Responsable#getNom <em>Nom</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getSexe <em>Sexe</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getDateNaissance <em>Date Naissance</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getMail <em>Mail</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getFormation <em>Formation</em>}</li>
 *   <li>{@link mymetamodel.Responsable#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getResponsable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UesDansFormationsOuIntervient'"
 * @generated
 */
public interface Responsable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mymetamodel.Responsable#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(int)
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Telephone()
	 * @model required="true"
	 * @generated
	 */
	int getTelephone();

	/**
	 * Sets the value of the '{@link mymetamodel.Responsable#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(int value);

	/**
	 * Returns the value of the '<em><b>Sexe</b></em>' attribute.
	 * The literals are from the enumeration {@link mymetamodel.SEXE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexe</em>' attribute.
	 * @see mymetamodel.SEXE
	 * @see #setSexe(SEXE)
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Sexe()
	 * @model
	 * @generated
	 */
	SEXE getSexe();

	/**
	 * Sets the value of the '{@link mymetamodel.Responsable#getSexe <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexe</em>' attribute.
	 * @see mymetamodel.SEXE
	 * @see #getSexe()
	 * @generated
	 */
	void setSexe(SEXE value);

	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see #setFonction(String)
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Fonction()
	 * @model
	 * @generated
	 */
	String getFonction();

	/**
	 * Sets the value of the '{@link mymetamodel.Responsable#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(String value);

	/**
	 * Returns the value of the '<em><b>Date Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Naissance</em>' attribute.
	 * @see #setDateNaissance(Date)
	 * @see mymetamodel.MymetamodelPackage#getResponsable_DateNaissance()
	 * @model
	 * @generated
	 */
	Date getDateNaissance();

	/**
	 * Sets the value of the '{@link mymetamodel.Responsable#getDateNaissance <em>Date Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Naissance</em>' attribute.
	 * @see #getDateNaissance()
	 * @generated
	 */
	void setDateNaissance(Date value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link mymetamodel.Responsable#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Formation</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.Formation}.
	 * It is bidirectional and its opposite is '{@link mymetamodel.Formation#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Formation()
	 * @see mymetamodel.Formation#getResponsable
	 * @model opposite="responsable" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Formation> getFormation();

	/**
	 * Returns the value of the '<em><b>Ue</b></em>' reference list.
	 * The list contents are of type {@link mymetamodel.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue</em>' reference list.
	 * @see mymetamodel.MymetamodelPackage#getResponsable_Ue()
	 * @model
	 * @generated
	 */
	EList<UE> getUe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.ue-&gt;forAll(u | self.formation-&gt;includes(u.semestre.niveau.formation))'"
	 * @generated
	 */
	boolean UesDansFormationsOuIntervient(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Responsable
