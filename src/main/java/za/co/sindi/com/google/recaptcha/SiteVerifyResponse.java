/**
 * 
 */
package za.co.sindi.com.google.recaptcha;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Buhake Sindi
 * @since 12 September 2023
 */
public class SiteVerifyResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5782140269418330224L;
	
	private boolean success;
	private double score;
	private String action;
	private Date challengeTimestamp;
	private String hostname;
	private String apkPackageName;
	private ErrorCode[] errorCodes;
	
	/**
	 * @param success
	 * @param score
	 * @param action
	 * @param challengeTimestamp
	 * @param hostname
	 * @param apkPackageName
	 * @param errorCodes
	 */
	public SiteVerifyResponse(boolean success, double score, String action, Date challengeTimestamp, String hostname,
			String apkPackageName, ErrorCode[] errorCodes) {
		super();
		this.success = success;
		this.score = score;
		this.action = action;
		this.challengeTimestamp = challengeTimestamp;
		this.hostname = hostname;
		this.apkPackageName = apkPackageName;
		this.errorCodes = errorCodes;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @return the challengeTimestamp
	 */
	public Date getChallengeTimestamp() {
		return challengeTimestamp;
	}
	
	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}
	
	/**
	 * @return the apkPackageName
	 */
	public String getApkPackageName() {
		return apkPackageName;
	}
	
	/**
	 * @return the errorCodes
	 */
	public ErrorCode[] getErrorCodes() {
		return errorCodes;
	}
}
