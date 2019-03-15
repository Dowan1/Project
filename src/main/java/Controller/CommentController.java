package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Model.Aca;
import Model.AuthInfo;
import Model.Bcar;
import Model.Comment;
import Service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}
	
	/*Ajax 테스트*/
	@RequestMapping(value="/main1.bo", method = RequestMethod.GET )
	public String ajaxmain() {
		return "Ajax/AjaxTest1";
	}
	@RequestMapping(value="/main2.bo", method = RequestMethod.GET )
	public String ajaxmain1() {
		return "Ajax/ajaxTest2";
	}
	@RequestMapping(value="/main3.bo", method = RequestMethod.GET )
	public String ajaxmain2() {
		return "Ajax/AjaxTest3";
	}
	@RequestMapping(value="/AjaxTest.bo", method = RequestMethod.POST )
	public String ajaxTest() {
		return "Ajax/AjaxTest1Pro";
	}
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login() {
		return "login/loginForm";
	}
	@RequestMapping(value="/logn_pro.do", method = RequestMethod.POST )
	public String loginPro(AuthInfo authInfo,Model model) {
		commentService.memberSelect(authInfo, model);
		return "login/loginPro";
	}
	
	//domino
	@RequestMapping(value="/domino.do", method = RequestMethod.GET )
	public String domino() {
		return "domino/dominoMain";
	}
	@RequestMapping(value="/bcar.do", method = RequestMethod.POST )
	public String domino(Aca acar,Model model) {
		commentService.dominoSelectB(acar,model);
		return "domino/bcar";
	}
	@RequestMapping(value="/ccar.do", method = RequestMethod.POST )
	public String domino(Bcar bca,Model model) {
		commentService.dominoSelectC(bca,model);
		return "domino/ccar";
	}
	//위에까지가 Ajax
	
	
	
	@RequestMapping(value="/form.do", method = RequestMethod.GET )
	public String form(Model model) {
		model.addAttribute("comment", new Comment());
		return "jsp/comment_form";
	}
	@RequestMapping(value="comment_insert" , method = RequestMethod.POST)
	public String comment_insert(Comment comment,Model model) {
		Integer result = 0;
		result = commentService.insertComment(comment,model);
		if(result > 0) {
			return "jsp/comment_insert";
		}else {
			return "redirect:/mybatis-spring/form.do";
		}
	}
	@RequestMapping(value="/comment_select", method=RequestMethod.POST)
	public String comment_select(@RequestParam("commentNo") String commentNo, Model model) {
		String path = commentService.commenSelect(commentNo,model);
		return path;
	}
	@RequestMapping(value="/comment_delete", method=RequestMethod.POST)
	public String comment_delete(@RequestParam("commentNo") String commentNo, Model model) {
		String path = commentService.commentDelete(commentNo,model);
		return path;
	}
	
}
