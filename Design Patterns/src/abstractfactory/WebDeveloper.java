package abstractfactory;

import static constants.Constants.WEB_DEVELOPER;

public class WebDeveloper implements Employee {
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {
        System.out.println("I am Web Dev !!");
        return WEB_DEVELOPER;
    }
}
