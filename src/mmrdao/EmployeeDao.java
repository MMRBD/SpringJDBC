package mmrdao;

import mmrmodel.Employee;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

    DataSource dataSource;
    JdbcTemplate jdbcTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int saveEmployee(Employee employee) {
        String sql = "INSERT INTO employee(name, salary) VALUES('" + employee.getName() + "', '" + employee.getSalary() + "')";

        return jdbcTemplate.update(sql);
    }
}
