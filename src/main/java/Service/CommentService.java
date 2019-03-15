package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.Aca;
import Model.AuthInfo;
import Model.Bcar;
import Model.Cca;
import Model.Comment;
import Model.DTO.CommentDTO;
import Model.DTO.Member;
import repository.CommentSessionRepository1;

@Service
public class CommentService {

	@Autowired
	private CommentSessionRepository1 commentRepository1;
	
	//domino
	public void dominoSelectC(Bcar bca, Model model) {
		List<Cca> list = commentRepository1.clist(bca);
		model.addAttribute("list", list);
		
	}

	public void dominoSelectB(Aca acar,Model model) {
		List<Bcar> list = commentRepository1.blist(acar);
		model.addAttribute("list", list);
		
	}
	
	public void memberSelect(AuthInfo authInfo, Model model) {
		System.out.println(authInfo.getId());
		Member member = commentRepository1.memberselect(authInfo);
		int result = 0;
		if(member != null) {
			if(!member.getPassword().equals(authInfo.getPasswd())) {
				result = 2;
			}else {
				result =3;
			}
		}else{
			result = 1;
		}
		model.addAttribute("result", result);
	}
	
	public Integer insertComment(Comment comment,Model model) {
		Integer result = 0;
		result = commentRepository1.insertComment(comment);
		model.addAttribute("comment",comment);
		return result;
	}
	public String commenSelect(String commentNo, Model model) {
		String path = null;
		Long commentNo1 = null;
		Comment comment = new Comment();
		if(commentNo.trim()!="") {
			commentNo1 = Long.parseLong(commentNo);
			System.out.println(commentNo1);
			comment.setCommentNo(commentNo1);
		}
		List<CommentDTO> result = commentRepository1.selectCommentByCondition(comment);
		if(result != null) {
			model.addAttribute("result",result);
			path = "jsp/comment_select";
		}else {
			path = "redirect:/mybatis-spring-web/form.do";
		}
		return path;
	}
	public String commentDelete(String commentNo, Model model) {
		String path = null;
		Long commentNo1 = null;
		Integer result = null;
		if(commentNo.trim()!="") {
			commentNo1 = Long.parseLong(commentNo);
		}
		result = commentRepository1.deleteComment(commentNo1);
		if(result > 0) {
			model.addAttribute("result",result);
			path = "jsp/comment_delete";
		}else {
			path = "redirect:/mybatis-spring-web/form.do";
		}
		return path;
	}
}
