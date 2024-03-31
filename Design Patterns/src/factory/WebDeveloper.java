package factory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting Web Developer Salary !!");
        return 50000;
    }
}
