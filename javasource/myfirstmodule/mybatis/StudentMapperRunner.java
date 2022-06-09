package myfirstmodule.mybatis;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import com.mendix.systemwideinterfaces.core.IContext;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class StudentMapperRunner {
  private static SqlSessionFactory sqlSessionFactory;

  public static void init() {
      InputStream inputSteam = StudentMapperRunner.class.getResourceAsStream("mybatis-config.xml");
      Reader reader = new InputStreamReader(inputSteam);
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
  }

  public List<OutStudent> selectByStudent(IContext context) {
    if (StudentMapperRunner.sqlSessionFactory == null) {
      StudentMapperRunner.init();
    }

    SqlSession sqlSession = null;
    sqlSession = StudentMapperRunner.sqlSessionFactory.openSession();
    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

    OutStudent search = new OutStudent();

    search.setSex(true);
    System.out.println("姓名和性别同时存在的查询");
    search.setName("明");
    List<OutStudent> studentsByNameAndSex = studentMapper.selectByStudentSelective(search);

    sqlSession.commit();
    sqlSession.close();

    return studentsByNameAndSex;
  }
}
