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

  // datasource�� ������ JdbcTemplate�� �����Ѵ�.

  this.jdbcTemplate = new JdbcTemplate(dataSource);

  }

  // insert ����

  public int add(Emp emp){

  String sql = "insert into emp(name,title,email,phone) values(?, ?, ?, ?)";

  // �Է� ���� emp��ü�� update ���� ���ڷ� ����ϱ� ���� Object[]�� ����.

  Object[] args = {emp.getName(),emp.getTitle(),emp.getEmail(),emp.getPhone()};

  return jdbcTemplate.update(sql,args);

  }

  // name�� �ش��ϴ� ������ ��ȸ

  public Emp getEmp(String name){

  String sql = "select * from emp where name = ?";

  // RowMapper�� ResultSet�� ���ڵ�� ��ü�� ���ν�Ű�� ������ �Ѵ�.

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

  // �Է� ���� name�� queryForObject ���� ���ڷ� ����ϱ� ���� Object[]�� ����.

  Object[] args = {name};

  return (Emp)jdbcTemplate.queryForObject(sql, args, mapper);

  }

  // ��ü ������ ��ȸ

  public List<Emp> searchAll(){

  String sql = "select * from emp";

  // RowMapper�� ResultSet�� ���ڵ�� ��ü�� ���ν�Ű�� ������ �Ѵ�.

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
