package com.dhkim.guestbook;

import java.util.List;
import java.sql.*;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.dhkim.guestbook.Board;;

public class BoardDAO {

/*private DataSource dataSource;

  private JdbcTemplate jdbcTemplate;

 

  public DataSource getDataSource(){

  return dataSource;

  }

  public void setDataSource(DataSource dataSource) {

  this.dataSource = dataSource;

  // datasource를 가지고 JdbcTemplate를 생성한다.

  this.jdbcTemplate = new JdbcTemplate(dataSource);

  }

  // insert 수행

  public int add(Emp emp){

  String sql = "insert into emp(name,title,email,phone) values(?, ?, ?, ?)";

  // 입력 받은 emp객체를 update 실행 인자로 사용하기 위해 Object[]로 변경.

  Object[] args = {emp.getName(),emp.getTitle(),emp.getEmail(),emp.getPhone()};

  return jdbcTemplate.update(sql,args);

  }

  // name에 해당하는 데이터 조회

  public Emp getEmp(String name){

  String sql = "select * from emp where name = ?";

  // RowMapper는 ResultSet의 레코드와 객체를 매핑시키는 역할을 한다.

  RowMapper mapper = new RowMapper(){

 public Object mapRow(ResultSet rs, int rowNum) throws SQLException{

Emp emp = new Emp();

emp.setName(rs.getString("name"));

emp.setTitle(rs.getString("title"));

emp.setEmail(rs.getString("email"));

emp.setPhone(rs.getString("phone"));

return emp;

 }

  };

  // 입력 받은 name을 queryForObject 실행 인자로 사용하기 위해 Object[]로 변경.

  Object[] args = {name};

  return (Emp)jdbcTemplate.queryForObject(sql, args, mapper);

  }

  // 전체 데이터 조회

  public List<Emp> searchAll(){

  String sql = "select * from emp";

  // RowMapper는 ResultSet의 레코드와 객체를 매핑시키는 역할을 한다.

  RowMapper mapper = new RowMapper(){

 public Object mapRow(ResultSet rs, int rowNum) throws SQLException{

Emp emp = new Emp();

emp.setName(rs.getString("name"));

emp.setTitle(rs.getString("title"));

emp.setEmail(rs.getString("email"));

emp.setPhone(rs.getString("phone"));

return emp;

 }

  };

  return jdbcTemplate.query(sql, mapper);

  }*/
	
}
