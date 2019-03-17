package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.FestivalDTO;
import other.AutoPaging;
@Repository
public class FestivalRepository extends AbstractRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "FestivalMapper";
	
	
	public List<FestivalDTO> festivallist(FestivalDTO dto) {
		System.out.println("레포지토리");
		return sqlSession.selectList("FestivalMapper.selectlist",dto);
	}
	
	

}
