package repository;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class AbstractRepository1 {
	// 멤버필드에 static을 붙인 이유는 객체 생성시에 초기화 될 수 있게 하려고
	private static SqlSessionFactory sqlSessionFactory;
	static {
		setSqlSessionFactory();
	}
	// 멤버필드를 초기화 하기 위한 메소드
	private static void setSqlSessionFactory() {
		String resource = "mybatis-config1.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		}catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
