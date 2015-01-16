package jp.qilab.spring.dto;

import java.util.Date;

import lombok.Data;

import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Data
public class MemberGroupDto {

	private String memberName;  // 名前（漢字）
	private String memberNameKana; // 名前（カナ）
	private String mailAddress;  // メールアドレス
	private Date joinDate;  // 入社年月日
	private String area;  // 拠点
	private String groupName;  // グループ
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNameKana() {
		return memberNameKana;
	}
	public void setMemberNameKana(String memberNameKana) {
		this.memberNameKana = memberNameKana;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}
