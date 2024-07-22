package com.example.jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY = """
            INSERT INTO course (id, name, author) VALUES (?, ?, ?);
            """;

    private static final String UPDATE_QUERY = """
            UPDATE course SET name = ?, author = ? WHERE id = ?;
            """;

    private static final String DELETE_QUERY = """
            DELETE FROM course WHERE id = ?;
            """;

            private static final String SELECT_QUERY = """
                SELECT id, name, author FROM course WHERE id = ?;
                """;
    public void insert(Course c) {
        springJdbcTemplate.update(INSERT_QUERY, c.getId(), c.getName(), c.getAuthor());
    }

    public void update(Course c) {
        springJdbcTemplate.update(UPDATE_QUERY, c.getName(), c.getAuthor(), c.getId());
    }

    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
    public Course findbyID(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
