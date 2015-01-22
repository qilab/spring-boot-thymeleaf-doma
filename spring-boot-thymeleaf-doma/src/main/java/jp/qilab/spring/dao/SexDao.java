package jp.qilab.spring.dao;

import java.util.List;

import jp.qilab.spring.annotation.ConfigAutowireable;
import jp.qilab.spring.domain.Sex;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@ConfigAutowireable
public interface SexDao {

	@Select
	List<Sex> selectAll();
}
