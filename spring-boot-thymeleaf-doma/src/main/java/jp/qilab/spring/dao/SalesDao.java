package jp.qilab.spring.dao;

import java.util.List;

import jp.qilab.spring.annotation.ConfigAutowireable;
import jp.qilab.spring.dto.resultset.SalesWithItemResultSet;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@ConfigAutowireable
public interface SalesDao {

	@Select
	public List<SalesWithItemResultSet> findWithItemById(Integer id);
}
