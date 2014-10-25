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
 * The Class PropertiesUtil.
 */
public class PropertiesUtil {
	
	/** The Constant PROPERTIES_FILE_NAME. */
	private static final String PROPERTIES_FILE_NAME = "scms-config.properties";

	/** The properties. */
	private static Properties properties;

	/**
	 * Load properties.
	 */
	public static final void loadProperties() {
		properties = new Properties();
		try {
			InputStream in = ClassLoader
					.getSystemResourceAsStream(PROPERTIES_FILE_NAME);
			properties.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the property.
	 *
	 * @param key the key
	 * @return the property
	 */
	public static final String getProperty(String key) {
		return properties.getProperty(key);
	}

	/**
	 * The Interface Keys.
	 */
	public interface Keys {
		
		/** The default password. */
		String DEFAULT_PASSWORD = "authorization.default_password";
		
		/** The super admin account. */
		String SUPER_ADMIN_ACCOUNT = "authorization.super_admin.account";
	}
}
