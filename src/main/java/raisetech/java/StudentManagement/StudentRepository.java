package raisetech.java.StudentManagement;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public  interface StudentRepository {


  @Select("SELECT * FROM person WHERE name = #{name}")
  Student searchByName(String name);

  @Insert("INSERT into person (name,age) values(#{name},#{age})")
  void registerStudent(String name, int age);

  @Update("UPDATE person SET age = #{age} WHERE name = #{name}")
  void updateStudent(String name,int age);

  @Delete("DELETE FROM person WHERE name = #{name}")
  void deleteStudent(String name);
}
