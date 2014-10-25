/*
 * Kan
 */
package u51ccu9896.shared;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// TODO: Auto-generated Javadoc
/**
 * 非事务.
 * 
 * @author KanYong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context-unittest.xml")
public class GenericContextTests extends AbstractJUnit4SpringContextTests {
	/** The logger. */
	protected final Logger logger = Logger.getLogger(this.getClass());

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
	}
}
