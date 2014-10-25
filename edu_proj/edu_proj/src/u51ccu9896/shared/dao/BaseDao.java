/*
 * Kan
 */
package u51ccu9896.shared.dao;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

import u51ccu9896.shared.exception.InvalidResultTypeException;
import u51ccu9896.shared.model.LogicallyDeletableModel;
import u51ccu9896.shared.model.TimeTrackedModel;

// TODO: Auto-generated Javadoc
/**
 * Dao基类.
 * 
 * @author Kan Yong
 */
public abstract class BaseDao {

	/** The Constant INVAILED_RESULT_TYPE_MESSAGE. */
	public static final String INVAILED_RESULT_TYPE_MESSAGE = "INVAILED_RESULT_TYPE";

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 获取Current Session.
	 * 
	 * @return the session
	 */
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 保存.
	 * 
	 * @param model
	 *            the model
	 */
	protected void create(Object model) {
		if (model instanceof TimeTrackedModel) {
			((TimeTrackedModel) model).setCreateTime(Calendar.getInstance()
					.getTime());
		}
		this.getSession().save(model);
	}

	/**
	 * 更新（自动更新Update Time）.
	 * 
	 * @param model
	 *            the model
	 */
	protected void update(Object model) {
		if (model instanceof TimeTrackedModel) {
			((TimeTrackedModel) model).setUpdateTime(Calendar.getInstance()
					.getTime());
		}
		this.getSession().update(model);
	}

	/**
	 * 物理刪除.
	 * 
	 * @param model
	 *            the model
	 */
	protected void delete(Object model) {
		this.getSession().delete(model);
	}

	/**
	 * 禁用.
	 * 
	 * @param model
	 *            the model
	 */
	protected void disable(Object model) {
		if (model instanceof LogicallyDeletableModel) {
			((LogicallyDeletableModel) model)
					.setInUse(false);
		}
		this.getSession().update(model);
	}

	/**
	 * Save or update.
	 * 
	 * @param model
	 *            the model
	 */
	protected void saveOrUpdate(Object model) {
		this.getSession().saveOrUpdate(model);
	}

	/**
	 * Find by pk.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param primaryKey the primary key
	 * @return the t
	 */
	@SuppressWarnings("unchecked")
	protected <T> T findByPK(Class<T> clazz, Serializable primaryKey) {
		return (T) this.getSession().get(clazz, primaryKey);
	}

	/**
	 * Find by model.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param query the query
	 * @return the t
	 */
	@SuppressWarnings("unchecked")
	protected <T> T findByModel(Class<T> clazz, Object query) {
		if (clazz == null) {
			throw new InvalidResultTypeException(INVAILED_RESULT_TYPE_MESSAGE);
		}
		Criteria criteria = getSession().createCriteria(clazz);

		if (query != null) {
			criteria.add(Example.create(query));
		}

		List<T> resultList = criteria.list();

		return (T) uniqueResult(resultList);
	}

	/**
	 * Find list.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param query the query
	 * @param page the page
	 * @param sort the sort
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	protected <T> List<T> findList(Class<T> clazz, Object query,
			Pagination page, Sorting sort) {
		if (clazz == null) {
			throw new InvalidResultTypeException(INVAILED_RESULT_TYPE_MESSAGE);
		}
		Criteria criteria = getSession().createCriteria(clazz);

		if (query != null) {
			criteria.add(Example.create(query));
		}

		if (sort != null) {
			criteria = addSorts(criteria, sort);
		}

		if (page != null) {
			criteria = addPagination(criteria, page);
		}
		List<T> resultList = criteria.list();
		return resultList;
	}

	/**
	 * 返回唯一值.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param list
	 *            the list
	 * @return the object
	 */
	protected <T> Object uniqueResult(List<T> list) {
		int size = list.size();
		if (size == 0)
			return null;
		Object first = list.get(0);
		for (int i = 1; i < size; i++) {
			if (list.get(i) != first) {
				throw new NonUniqueResultException(list.size());
			}
		}
		return first;
	}

	/**
	 * Adds the sort conditions.
	 *
	 * @param criteria            the criteria
	 * @param sorting the sorting
	 * @return the criteria
	 */
	protected Criteria addSorts(Criteria criteria, Sorting sorting) {
		if (sorting != null && sorting.getSorts().size() > 0) {
			for (int i = 0; i < sorting.getSorts().size(); i++) {
				String direction = sorting.getSorts().get(i).getDirection();
				if (Sorting.SORT_ASC.equals(direction)) {
					criteria.addOrder(Order.asc(sorting.getSorts().get(i)
							.getProperty()));
				} else if (Sorting.SORT_DESC.equals(direction)) {
					criteria.addOrder(Order.desc(sorting.getSorts().get(i)
							.getProperty()));
				}
			}
		}
		return criteria;
	}

	/**
	 * Adds the pagination.
	 *
	 * @param criteria            the criteria
	 * @param page the page
	 * @return the criteria
	 */
	protected Criteria addPagination(Criteria criteria, Pagination page) {
		criteria.setFirstResult(page.getStart());
		criteria.setMaxResults(page.getLimit());
		return criteria;
	}

	/**
	 * Flush transient model.
	 * 
	 * @param daoImpl
	 *            the dao impl
	 * @param modelToRefresh
	 *            the model to refresh
	 */
	public static void flushTransientModel(Object daoImpl, Object modelToRefresh) {
		if (daoImpl instanceof BaseDao) {
			BaseDao dao = (BaseDao) daoImpl;
			dao.getSession().flush();
			dao.getSession().refresh(modelToRefresh);
		}
	}
}
