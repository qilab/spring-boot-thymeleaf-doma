package jp.qilab.spring.dao;

import java.util.List;

import jp.qilab.spring.annotation.ConfigAutowireable;
import jp.qilab.spring.dto.MemberGroupDto;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@ConfigAutowireable
public interface MemberDao {

	@Select
	public List<MemberGroupDto> selectAllWithGroupByNameKanaAndGroupId(String nameKana, Integer groupId);
}
