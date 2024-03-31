package org.example.entity;
import javax.persistence.*;

@Entity
@Table(name="employee")

public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empName;
    private String empRole;

    public employee( String emp_name, String emp_role) {
        //this.emp_id = emp_id;
        this.empName = emp_name;
        this.empRole = emp_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
}
