package Model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Comment implements Serializable{
	private Long commentNo;
	private String userId;
	private String commentContent;
	
	public Comment() {}
	public Comment(Long commentNo, String userId, String commentContent) {
		super();
		this.commentNo = commentNo;
		this.userId = userId;
		this.commentContent = commentContent;
	}
	public Long getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(Long commentNo) {
		this.commentNo = commentNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	
}
