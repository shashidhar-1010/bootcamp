import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.example.Employee;
import org.example.Employeeman;
import org.example.InvalidException;
import org.junit.Test;

public class EmployeemanTest {


    @Test
    public void testAddEmployee() {
        EmployeemanTest employeeManager = new EmployeemanTest();
        try {
            employeeManager.addEmployee("shashidhar", "Reddy", 59000);
            assertEquals(1, employeeManager.getEmployeeCount());
        } catch (InvalidException e) {
            assertNull(e);
        }
    }

    private void assertNull(InvalidException e) {
    }

    private int getEmployeeCount() {

    }

    private void addEmployee(String shashidhar, String Reddy, int i) {
    }

    @Test
    public void testAddEmployeeWithInvalidSalary() {
        Employeeman employeeMan = new Employeeman();
        try {
            employeeMan.addEmployee("shashidhar", "Reddy", 36000);
            assertNull(employeeMan.getEmployee("Shashidhar"));
        } catch (InvalidException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testGetEmployeeWithHighSalary() {
        Employeeman employeeMan = new Employeeman();
        try {
            employeeMan.addEmployee("shashidhar", "Reddy", 59000);
            employeeMan.addEmployee("shashi", "Reddy", 98000);
            employeeMan.addEmployee("reddy", "shashi", 50000);
            Employee highestPaid = employeeMan.getEmployeeWithHighSalary();
            assertNotNull(highestPaid);
            assertEquals("shashidhar", highestPaid.getFirstName());
            assertEquals("Reddy", highestPaid.getLastName());
            assertEquals(59000, highestPaid.getSalary(), 0);
        } catch (InvalidException e) {
            assertNull(e);
        }
    }

    private void assertNotNull(Employee highestPaid) {
    }
}