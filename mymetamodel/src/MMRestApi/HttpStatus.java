/**
 */
package MMRestApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Http Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MMRestApi.MMRestApiPackage#getHttpStatus()
 * @model
 * @generated
 */
public enum HttpStatus implements Enumerator {
	/**
	 * The '<em><b>Not Found 404</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND_404_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND_404(0, "NotFound_404", "404NotFound"),

	/**
	 * The '<em><b>OK 200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_200_VALUE
	 * @generated
	 * @ordered
	 */
	OK_200(1, "OK_200", "OK_200"),

	/**
	 * The '<em><b>Unauthorized 401</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAUTHORIZED_401_VALUE
	 * @generated
	 * @ordered
	 */
	UNAUTHORIZED_401(2, "Unauthorized_401", "Unauthorized_401"),

	/**
	 * The '<em><b>Accepted 202</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_202_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED_202(3, "Accepted_202", "Accepted_202"),

	/**
	 * The '<em><b>Created 201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_201_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED_201(4, "Created_201", "Created_201"),

	/**
	 * The '<em><b>No Content 204</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT_204_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTENT_204(5, "NoContent_204", "NoContent_204"),

	/**
	 * The '<em><b>Bad Request 400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST_400_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_REQUEST_400(6, "BadRequest_400", "BadRequest_400"),

	/**
	 * The '<em><b>Forbidden 403</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN_403_VALUE
	 * @generated
	 * @ordered
	 */
	FORBIDDEN_403(7, "Forbidden_403", "Forbidden_403"),

	/**
	 * The '<em><b>Request Timeout 408</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TIMEOUT_408_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TIMEOUT_408(8, "RequestTimeout_408", "RequestTimeout_408"),

	/**
	 * The '<em><b>Internal Server Error 500</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_SERVER_ERROR_500_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_SERVER_ERROR_500(9, "InternalServerError_500", "InternalServerError_500");

	/**
	 * The '<em><b>Not Found 404</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND_404
	 * @model name="NotFound_404" literal="404NotFound"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_404_VALUE = 0;

	/**
	 * The '<em><b>OK 200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_200_VALUE = 1;

	/**
	 * The '<em><b>Unauthorized 401</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAUTHORIZED_401
	 * @model name="Unauthorized_401"
	 * @generated
	 * @ordered
	 */
	public static final int UNAUTHORIZED_401_VALUE = 2;

	/**
	 * The '<em><b>Accepted 202</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_202
	 * @model name="Accepted_202"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_202_VALUE = 3;

	/**
	 * The '<em><b>Created 201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_201
	 * @model name="Created_201"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_201_VALUE = 4;

	/**
	 * The '<em><b>No Content 204</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT_204
	 * @model name="NoContent_204"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTENT_204_VALUE = 5;

	/**
	 * The '<em><b>Bad Request 400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_REQUEST_400
	 * @model name="BadRequest_400"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_REQUEST_400_VALUE = 6;

	/**
	 * The '<em><b>Forbidden 403</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN_403
	 * @model name="Forbidden_403"
	 * @generated
	 * @ordered
	 */
	public static final int FORBIDDEN_403_VALUE = 7;

	/**
	 * The '<em><b>Request Timeout 408</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TIMEOUT_408
	 * @model name="RequestTimeout_408"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TIMEOUT_408_VALUE = 8;

	/**
	 * The '<em><b>Internal Server Error 500</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_SERVER_ERROR_500
	 * @model name="InternalServerError_500"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_SERVER_ERROR_500_VALUE = 9;

	/**
	 * An array of all the '<em><b>Http Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HttpStatus[] VALUES_ARRAY =
		new HttpStatus[] {
			NOT_FOUND_404,
			OK_200,
			UNAUTHORIZED_401,
			ACCEPTED_202,
			CREATED_201,
			NO_CONTENT_204,
			BAD_REQUEST_400,
			FORBIDDEN_403,
			REQUEST_TIMEOUT_408,
			INTERNAL_SERVER_ERROR_500,
		};

	/**
	 * A public read-only list of all the '<em><b>Http Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HttpStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Http Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HttpStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HttpStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Http Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HttpStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HttpStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Http Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HttpStatus get(int value) {
		switch (value) {
			case NOT_FOUND_404_VALUE: return NOT_FOUND_404;
			case OK_200_VALUE: return OK_200;
			case UNAUTHORIZED_401_VALUE: return UNAUTHORIZED_401;
			case ACCEPTED_202_VALUE: return ACCEPTED_202;
			case CREATED_201_VALUE: return CREATED_201;
			case NO_CONTENT_204_VALUE: return NO_CONTENT_204;
			case BAD_REQUEST_400_VALUE: return BAD_REQUEST_400;
			case FORBIDDEN_403_VALUE: return FORBIDDEN_403;
			case REQUEST_TIMEOUT_408_VALUE: return REQUEST_TIMEOUT_408;
			case INTERNAL_SERVER_ERROR_500_VALUE: return INTERNAL_SERVER_ERROR_500;
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
	private HttpStatus(int value, String name, String literal) {
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
	
} //HttpStatus
