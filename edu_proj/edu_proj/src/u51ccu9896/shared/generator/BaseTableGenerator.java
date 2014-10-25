/*
 * Kan
 */
package u51ccu9896.shared.generator;

import java.util.Properties;

import org.hibernate.MappingException;
import org.hibernate.dialect.Dialect;
import org.hibernate.id.enhanced.TableGenerator;
import org.hibernate.type.IntegerType;
import org.hibernate.type.Type;

// TODO: Auto-generated Javadoc
/**
 * 扩展基于数据库表的主键生成策略.
 *
 * @author KanYong
 */
public class BaseTableGenerator extends TableGenerator {
	
	/** 默认主键生成表. */
	public static final String DEFAULT_TABLE_NAME = "sys_id_generator";

	/** 默认主键列对应列名. */
	public static final String DEFAULT_SEGMENT_COLUMN_NAME = "gen_name";

	/** 默认主键值对应列名. */
	public static final String DEFAULT_VALUE_COLUMN_NAME = "gen_value";
	
	/** 默认主键值初始值. */
	public static final int DEFAULT_INITIAL_VALUE = 1;

	/** 默认主键值增长速度. */
	public static final int DEFAULT_INCREMENT_SIZE = 1;

	/** 默认主键值优化策略. */
	public static final String DEFAULT_OPTIMIZER = "pooled-lo";

	/* (non-Javadoc)
	 * @see org.hibernate.id.enhanced.TableGenerator#configure(org.hibernate.type.Type, java.util.Properties, org.hibernate.dialect.Dialect)
	 */
	@Override
	public void configure(Type type, Properties params, Dialect dialect)
			throws MappingException {
		super.configure(new IntegerType(), params, dialect);
	}

}
