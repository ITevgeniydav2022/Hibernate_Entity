import dao.CityDao;
import dao.EmployeeDao;
import dao.impl.CityDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.City;
import model.Employee;
import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        CityDao cityDao = new CityDaoImpl();

        City city = new City("Краснодар");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anna", "Ivanova", "woman", 24, city));
        employees.add(new Employee("Anton", "Pestov", "man", 55, city));
        employees.add(new Employee("Sergey", "Petrosyan", "man", 67, city));
        employees.add(new Employee("Evgeny", "Ivanov", "man", 25, city));
        employees.add(new Employee("Semion", "Gotov", "man", 25, city));
        employees.add(new Employee("Evgeny", "Davydov", "man", 42, city));
        employees.add(new Employee("Sergey", "Ivanov", "man", 30, city));
        city.setEmployees(employees);
        cityDao.add(city);
        employeeDao.findAll().forEach(System.out::println);
        cityDao.delete(city);
        employeeDao.findAll().forEach(System.out::println);
    }
}
