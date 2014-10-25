/*
 * Kan
 */
package u51ccu9896.system;

import org.junit.Assert;
import org.junit.Test;

import u51ccu9896.shared.GenericContextTests;
import u51ccu9896.shared.util.MessageUtil;
import u51ccu9896.shared.util.PropertiesUtil;

// TODO: Auto-generated Javadoc
/**
 * 空测试类，仅用来加载Spring Context，创建Bean和表.
 * 
 * @author Kan Yong
 */
public class TestUtil extends GenericContextTests {

	/**
	 * .
	 */
	@Test
	public void test_loadProperties() {
		String defaultPass = PropertiesUtil
				.getProperty(PropertiesUtil.Keys.DEFAULT_PASSWORD);
		Assert.assertNotNull(defaultPass);
		logger.info(defaultPass);
	}

	/**
	 * .
	 */
	@Test
	public void test_loadMessage() {
		String message = MessageUtil
				.getMessage(MessageUtil.Keys.AUTHORIZATION_LOGIN_INCORRECTPASSWORD);
		Assert.assertNotNull(message);
		logger.info(message);
	}
}
