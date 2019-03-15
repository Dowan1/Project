package Model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Cca implements Serializable{
	private Long anum;
	private Long bnum;
	private Long cnum;
	private String cname;
	
	public Long getAnum() {
		return anum;
	}
	public void setAnum(Long anum) {
		this.anum = anum;
	}
	public Long getBnum() {
		return bnum;
	}
	public void setBnum(Long bnum) {
		this.bnum = bnum;
	}
	public Long getCnum() {
		return cnum;
	}
	public void setCnum(Long cnum) {
		this.cnum = cnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
