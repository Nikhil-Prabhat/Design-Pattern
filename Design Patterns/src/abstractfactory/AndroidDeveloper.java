package abstractfactory;

import constants.Constants;
public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public String getName() {
        System.out.println("I am Android Dev !!");
        return Constants.ANDROID_DEVELOPER;
    }
}
