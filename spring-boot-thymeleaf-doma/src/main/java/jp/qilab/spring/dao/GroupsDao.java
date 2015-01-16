package jp.qilab.spring.dao;

import java.util.List;

import jp.qilab.spring.annotation.ConfigAutowireable;
import jp.qilab.spring.domain.Groups;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@ConfigAutowireable
public interface GroupsDao {

	@Select
	List<Groups> selectAll();
}
