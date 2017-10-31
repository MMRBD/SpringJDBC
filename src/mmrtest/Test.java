package mmrtest;


import mmrdao.EmployeeDao;
import mmrmodel.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hi");
        ApplicationContext context = new ClassPathXmlApplicationContext("mmrtest/springjdbc.xml");
        System.out.println("Hi");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("dataSource");
        
        System.out.println(employeeDao.saveEmployee(new Employee("MMR", 30000)));
    }
}
