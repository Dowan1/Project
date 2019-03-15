package Model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Aca implements Serializable {
	private Long anum;
	private String aname;
	
	public Long getAnum() {
		return anum;
	}
	public void setAnum(Long anum) {
		this.anum = anum;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}
