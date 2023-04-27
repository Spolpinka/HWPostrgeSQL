package pro.sky.hwpostrgesql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmloyeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateData() {
        String sql = "UPDATE employee SET first_name = ?, last_name = ? WHERE условие";
        jdbcTemplate.update(sql, "новое_значение1", "новое_значение2");
    }

}
