package factory;

import static constants.Constants.*;

public class EmployeeFactory {

    // Get Employee Based on EmployeeType
    public static Employee getEmployeeBasedOnType(String employeeType) {
        if (employeeType.equals(WEB_DEVELOPER)) {
            return new WebDeveloper();
        } else if (employeeType.equals(ANDROID_DEVELOPER)) {
            return new AndroidDeveloper();
        }

        return null;
    }
}
