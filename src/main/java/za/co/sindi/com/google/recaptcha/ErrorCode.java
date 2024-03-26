/**
 * 
 */
package za.co.sindi.com.google.recaptcha;

/**
 * @author Buhake Sindi
 * @since 12 September 2023
 */
public enum ErrorCode {

	MISSING_INPUT_SECRET("missing-input-secret", "The secret parameter is missing.")
	,INVALID_INPUT_SECRET("invalid-input-secret", "The secret parameter is invalid or malformed.")
	,MISSING_INPUT_RESPONSE("missing-input-response", "The response parameter is missing.")
	,INVALID_INPUT_RESPONSE("invalid-input-response", "The response parameter is invalid or malformed.")
	,BAD_REQUEST("bad-request", "The request is invalid or malformed.")
	,TIMEOUT_OR_DUPLICATE("timeout-or-duplicate", "The response is no longer valid: either is too old or has been used previously.")
	;
	private final String code;
	private final String description;
	
	/**
	 * @param code
	 * @param description
	 */
	private ErrorCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	public static ErrorCode of(final String code) {
		for (ErrorCode errorCode : values()) {
			if (errorCode.code.equals(code)) {
				return errorCode;
			}
		}
		
		throw new IllegalArgumentException(String.format("Unknown ReCaptcha Error code reference '%s'.", code));
	}
}
