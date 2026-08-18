package RelationshipBetweenClasses.Aggregation;

import java.util.List;

public class Department {
    public List<Employee> employees;

    public Department(List<Employee> employees){
        this.employees = employees;
    }
}
