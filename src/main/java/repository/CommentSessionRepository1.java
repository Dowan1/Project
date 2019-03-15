package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Aca;
import Model.AuthInfo;
import Model.Bcar;
import Model.Cca;
import Model.Comment;
import Model.DTO.CommentDTO;
import Model.DTO.Member;

@Repository
public class CommentSessionRepository1 {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "CommentMapper";

	//Ajax이용
	public Member memberselect(AuthInfo authInfo) {
		System.out.println("CommentSessionRepository1 : "+ authInfo.getId());
		return sqlSession.selectOne("CommentMapper.selectMember", authInfo);
	}
	public List<Bcar> blist(Aca acar){
		return sqlSession.selectList("CommentMapper.blist", acar);
	}
	public List<Cca> clist(Bcar bcar){
		return sqlSession.selectList("CommentMapper.clist", bcar);
	}
	
	
	
	
	public Integer insertComment(Comment comment) {
		return sqlSession.insert("CommentMapper.insertComment", comment);

	}
	public List<CommentDTO> selectCommentByCondition(Comment comment){
		return sqlSession.selectList(
				"CommentMapper.selectCommentCondition", comment);
	}
	public Integer deleteComment(Long commentNo1) {
		System.out.println(commentNo1);
		Integer result = null;
		String statement = namespace + ".deleteComment";
		result = sqlSession.delete(statement, commentNo1);
		return result;
	}
}
