/**
 */
package mymetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>JOUR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumération des jours de Lundi à Samedi.
 * <!-- end-model-doc -->
 * @see mymetamodel.MymetamodelPackage#getJOUR()
 * @model
 * @generated
 */
public enum JOUR implements Enumerator {
	/**
	 * The '<em><b>Lundi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUNDI_VALUE
	 * @generated
	 * @ordered
	 */
	LUNDI(0, "Lundi", "Lundi"),

	/**
	 * The '<em><b>Mardi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARDI_VALUE
	 * @generated
	 * @ordered
	 */
	MARDI(1, "Mardi", "Mardi"),

	/**
	 * The '<em><b>Mercredi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCREDI_VALUE
	 * @generated
	 * @ordered
	 */
	MERCREDI(2, "Mercredi", "Mercredi"),

	/**
	 * The '<em><b>Jeudi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JEUDI_VALUE
	 * @generated
	 * @ordered
	 */
	JEUDI(3, "Jeudi", "Jeudi"),

	/**
	 * The '<em><b>Vendredi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDREDI_VALUE
	 * @generated
	 * @ordered
	 */
	VENDREDI(4, "Vendredi", "Vendredi"),

	/**
	 * The '<em><b>Samedi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMEDI_VALUE
	 * @generated
	 * @ordered
	 */
	SAMEDI(5, "Samedi", "Samedi");

	/**
	 * The '<em><b>Lundi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUNDI
	 * @model name="Lundi"
	 * @generated
	 * @ordered
	 */
	public static final int LUNDI_VALUE = 0;

	/**
	 * The '<em><b>Mardi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARDI
	 * @model name="Mardi"
	 * @generated
	 * @ordered
	 */
	public static final int MARDI_VALUE = 1;

	/**
	 * The '<em><b>Mercredi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCREDI
	 * @model name="Mercredi"
	 * @generated
	 * @ordered
	 */
	public static final int MERCREDI_VALUE = 2;

	/**
	 * The '<em><b>Jeudi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JEUDI
	 * @model name="Jeudi"
	 * @generated
	 * @ordered
	 */
	public static final int JEUDI_VALUE = 3;

	/**
	 * The '<em><b>Vendredi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDREDI
	 * @model name="Vendredi"
	 * @generated
	 * @ordered
	 */
	public static final int VENDREDI_VALUE = 4;

	/**
	 * The '<em><b>Samedi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMEDI
	 * @model name="Samedi"
	 * @generated
	 * @ordered
	 */
	public static final int SAMEDI_VALUE = 5;

	/**
	 * An array of all the '<em><b>JOUR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JOUR[] VALUES_ARRAY =
		new JOUR[] {
			LUNDI,
			MARDI,
			MERCREDI,
			JEUDI,
			VENDREDI,
			SAMEDI,
		};

	/**
	 * A public read-only list of all the '<em><b>JOUR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JOUR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>JOUR</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JOUR get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JOUR result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JOUR</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JOUR getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JOUR result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JOUR</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JOUR get(int value) {
		switch (value) {
			case LUNDI_VALUE: return LUNDI;
			case MARDI_VALUE: return MARDI;
			case MERCREDI_VALUE: return MERCREDI;
			case JEUDI_VALUE: return JEUDI;
			case VENDREDI_VALUE: return VENDREDI;
			case SAMEDI_VALUE: return SAMEDI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JOUR(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //JOUR
