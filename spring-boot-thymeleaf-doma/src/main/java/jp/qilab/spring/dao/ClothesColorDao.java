package jp.qilab.spring.dao;

import java.util.List;

import jp.qilab.spring.annotation.ConfigAutowireable;
import jp.qilab.spring.domain.ClothesColor;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@ConfigAutowireable
public interface ClothesColorDao {

	@Select
	List<ClothesColor> selectAll();
}
