/*
 * Kan
 */
package u51ccu9896.shared;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * 事务相关测试类基类，默认所有测试方法执行完毕后回滚.
 * 
 * @author KanYong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context-unittest.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class TransactionalContextTests extends
		AbstractTransactionalJUnit4SpringContextTests {
	/** The logger. */
	protected final Logger logger = Logger.getLogger(this.getClass());

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
	}
}
