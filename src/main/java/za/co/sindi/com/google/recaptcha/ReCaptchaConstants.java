/**
 * 
 */
package za.co.sindi.com.google.recaptcha;

/**
 * @author Buhake Sindi
 * @since 13 September 2023
 */
public final class ReCaptchaConstants {

	public static final String RECAPTCHA_API_SERVER_URL = "www.google.com/recaptcha/api";
	public static final String RECAPTCHA_SITEVERIFY_URL = " https://" + RECAPTCHA_API_SERVER_URL + "/siteverify";
	
	//Client-side response token
	public static final String RECAPTCHA_CLIENT_RESPONSE = "g-recaptcha-response";
	
	// **** JSON response keys ****
	public static final String RECAPTCHA_JSON_RESPONSE_SUCCESS_KEY = "success";
	public static final String RECAPTCHA_JSON_RESPONSE_SCORE_KEY = "score";
	public static final String RECAPTCHA_JSON_RESPONSE_ACTION_KEY = "action";
	public static final String RECAPTCHA_JSON_RESPONSE_CHALLENGE_TS_KEY = "challenge_ts";
	public static final String RECAPTCHA_JSON_RESPONSE_HOSTNAME_KEY = "hostname";
	public static final String RECAPTCHA_JSON_RESPONSE_APK_PACKAGE_NAME_KEY = "apk_package_name";
	public static final String RECAPTCHA_JSON_RESPONSE_ERROR_CODES_KEY = "error_codes";
	
	private ReCaptchaConstants() {
		throw new AssertionError("Private Constructor.");
	}
}
