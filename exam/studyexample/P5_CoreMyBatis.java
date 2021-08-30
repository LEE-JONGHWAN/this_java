package studyexample;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class P5_CoreMyBatis {
	public static void main(String[] args) {
		try {
			P5_CoreMyBatis main = new P5_CoreMyBatis();
			
			int count = main.getSpeciesCount();
			System.out.println("--- 애완동물 품종 수 ---\n" + count);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
	}
	public Integer getSpeciesCount() throws Exception {
		return getSqlSession().selectOne("getSpecisCounts");
	}


	private static SqlSession getSqlSession() throws Exception {
		String resource = "core-mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
			new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory.openSession();
	}
}
