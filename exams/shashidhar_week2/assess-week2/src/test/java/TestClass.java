import org.example.BadEmployeeException;
import org.example.Employee;
import org.example.EmployeeManager;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestClass {

    @Test
    public void verifyEmployeesCreation() throws BadEmployeeException {
        EmployeeManager employeeManager = new EmployeeManager();
        int totalEmployees = employeeManager.getEmployees().size();
        assertEquals(6,totalEmployees);
    }

    @Test
    public void verifyHighestSalary() throws BadEmployeeException {
        EmployeeManager employeeManager = new EmployeeManager();
        assertEquals(500000, employeeManager.getHighestSalary());

    }

    @Test
    public void checkExceptionIsThrown() {
        assertThrows(BadEmployeeException.class, () -> {
            new Employee("A",20000, 2);
        });
    }
}
