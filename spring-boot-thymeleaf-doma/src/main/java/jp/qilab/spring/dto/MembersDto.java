package jp.qilab.spring.dto;

import java.util.List;

import lombok.Data;

@Data
public class MembersDto {

	private List<MemberGroupDto> memberGroupDtoList;
	private Integer count;
	
	public MembersDto() {
		super();
	}
	
	public MembersDto(List<MemberGroupDto> memberGroupDtoList) {
		this.memberGroupDtoList = memberGroupDtoList;
		if (memberGroupDtoList != null) {
			this.count = memberGroupDtoList.size();
		}
	}
	
	public List<MemberGroupDto> getMemberGroupDtoList() {
		return memberGroupDtoList;
	}
	public void setMemberGroupDtoList(List<MemberGroupDto> memberGroupDtoList) {
		this.memberGroupDtoList = memberGroupDtoList;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
