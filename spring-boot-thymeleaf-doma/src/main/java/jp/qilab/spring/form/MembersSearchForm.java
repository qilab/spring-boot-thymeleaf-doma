package jp.qilab.spring.form;

import lombok.Data;

@Data
public class MembersSearchForm {

	private String nameKana;
	
	private Integer groupsId;

	public String getNameKana() {
		return nameKana;
	}

	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	public Integer getGroupsId() {
		return groupsId;
	}

	public void setGroupsId(Integer groupsId) {
		this.groupsId = groupsId;
	}
	
}
