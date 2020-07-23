package com.karan.Dao;

import com.karan.Bean.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpDao {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Emp p) {
        String query = "insert into emp99 (ename,eid) values('" + p.getEname() + "'," +
                "" + p.getEid() + ")";

        return template.update(query);
    }

    public int viewRecord(Emp p) {
        String query = "update Emp99 set name='" + p.getEname() + " eid=" + p.getEid() + "' " +
                "where id=" + p.getEid() + "";

        return template.update(query);
    }

    public int delete(int eid) {
        String query = "delete from Emp99 where eid=" + eid + "";
        return template.update(query);
    }

    public Emp getEmpById(int eid) {
        String sql = "select   * from Emp99 where eid=?";
        return template.queryForObject(sql, new Object[]{eid}, new BeanPropertyRowMapper<Emp>(Emp.class));
    }

    public List<Emp> getEmployees() {
        return template.query("select * from Emp99", new RowMapper<Emp>() {
            public Emp mapRow(ResultSet rs, int row) throws SQLException {
                Emp e = new Emp();
                // e.setId(rs.getInt(1));
                e.setEname(rs.getString(1));
                e.setEid(rs.getInt(2));

                return e;
            }
        });

    }
}
