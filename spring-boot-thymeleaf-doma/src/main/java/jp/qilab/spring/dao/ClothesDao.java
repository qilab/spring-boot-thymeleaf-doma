package jp.qilab.spring.dao;

import java.util.List;

import jp.qilab.spring.annotation.ConfigAutowireable;
import jp.qilab.spring.dto.ClothesDto;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@ConfigAutowireable
public interface ClothesDao {

	@Select
	List<ClothesDto> selectByClothesColorIdAndSexId(Integer clothesColorId, Integer sexId);
}
