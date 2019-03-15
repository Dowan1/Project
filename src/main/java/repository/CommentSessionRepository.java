package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Model.Comment;
import Model.DTO.CommentDTO;

public class CommentSessionRepository extends AbstractRepository{
	private SqlSession sqlSession;
	private final String namespace = "repository.mapper.Comment1Mapper";
	public Integer insertComment(Comment comment) {
		System.out.println(comment.getUserId());
		Integer result = null;
		sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".insertComment";
		result = sqlSession.insert(statement, comment);
		if(result > 0) sqlSession.commit();
		else sqlSession.rollback();
		sqlSession.close();
		return result;
	}
	public List<CommentDTO> selectCommentByCondition(Comment comment){
		sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".selectCommentCondition";
		List<CommentDTO> result = sqlSession.selectList(statement, comment);
		sqlSession.close();
		return result;
	}
	public Integer deleteComment(Long commentNo1) {
		System.out.println(commentNo1);
		Integer result = null;
		sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".deleteComment";
		result = sqlSession.delete(statement, commentNo1);
		if(result > 0) sqlSession.commit();
		else sqlSession.rollback();
		sqlSession.close();
		return result;
	}
	
}
