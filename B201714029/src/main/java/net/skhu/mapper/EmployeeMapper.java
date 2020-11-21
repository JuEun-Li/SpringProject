package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Employee;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee WHERE id = #{id}")
    Employee findOne(int id);

    @Select(" select e.id, e.employeeNo, e.name, e.departmentId, e.salary, e.sex, d.title " +
    		" from employee e left join department d " +
    		" on e.departmentId = d.id;            ")
    List<Employee> findAll();
    
    @Select("SELECT * FROM employee WHERE salary = #{salary}")
    Employee findBySalary(int salary);
    
    @Select("SELECT * FROM employee WHERE sex = #{sex}")
    Employee findBySex(String sex);

    @Insert("INSERT Employee (id, employeeNo, name, departmentId, salary, sex, title)     " +
            "VALUES (#{id}, #{employeeNo}, #{name}, #{departmentId}, #{salary}, #{sex}, #{title}) ")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(Employee employee);

    @Delete("DELETE FROM Employee WHERE id = #{id}")
    void delete(int id);
}

