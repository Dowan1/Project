package Model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bcar implements Serializable {
	private Long anum;
	private Long bnum;
	private String bname;
	
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
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
