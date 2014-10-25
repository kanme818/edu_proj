/*
 * Kan
 */
package u51ccu9896.shared.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class MessageUtil.
 */
public class MessageUtil {
	
	/** The Constant LANGUAGE_FILE_NAME. */
	private static final String LANGUAGE_FILE_NAME = "message.properties";

	/** The messages. */
	private static Properties messages;

	/**
	 * Load messages.
	 */
	public static final void loadMessages() {
		messages = new Properties();
		try {
			InputStream in = ClassLoader
					.getSystemResourceAsStream(LANGUAGE_FILE_NAME);
			messages.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the message.
	 *
	 * @param key the key
	 * @return the message
	 */
	public static final String getMessage(String key) {
		return messages.getProperty(key);
	}

	/**
	 * The Interface Keys.
	 */
	public interface Keys {
		
		/** The authorization login incorrectpassword. */
		String AUTHORIZATION_LOGIN_INCORRECTPASSWORD = "authorization.login.incorrect_password";
	}
}
