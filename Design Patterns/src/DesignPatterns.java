import abstractfactory.AndroidDevFactory;
import abstractfactory.WebDevFactory;
import adapter.*;
import factory.Employee;
import factory.EmployeeFactory;
import iterator.MyIterator;
import iterator.User;
import iterator.UserManagement;
import observer.Subscriber;
import observer.YoutubeChannel;
import prototype.NetworkConnection;
import singleton.Jalebi;
import singleton.Samosa;

import java.lang.reflect.Constructor;

import static constants.Constants.*;

public class DesignPatterns {
    public static void main(String[] args) throws Exception {

//        testSingletonDesignPattern();
//        testBreakingCaseOfSingletonDesignPattern();
//        testFactoryDesignPattern();
//        testAbstractFactoryDesignPattern();
//        testBuilderPattern();
//        testPrototypeDesignPattern();
//        testObserverDesignPattern();
//        testIteratorDesignPattern();
        testAdapterDesignPattern();

    }

    // Singleton Pattern
    private static void testSingletonDesignPattern() {
        Samosa samosa1 = Samosa.getSamosa();
        Samosa samosa2 = Samosa.getSamosa();

        if (samosa1.hashCode() == samosa2.hashCode()) {
            System.out.println("Singleton Samosa Objects are Same !!");
        }

        Jalebi jalebi1 = Jalebi.getJalebi();
        Jalebi jalebi2 = Jalebi.getJalebi();

        if (jalebi1.hashCode() == jalebi2.hashCode()) {
            System.out.println("Singleton Jablei Objects are same !!");
        }
    }

    // One of the ways to break singleton design pattern
    private static void testBreakingCaseOfSingletonDesignPattern() throws Exception {
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Constructor<Samosa> declaredConstructor = Samosa.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(Boolean.TRUE);
        Samosa samosa2 = declaredConstructor.newInstance();
        System.out.println(samosa2.hashCode());
    }

    // Factory Design Pattern
    // We don't need to tightly couple the objects while creation. It is automatically created based on EmployeeType
    private static void testFactoryDesignPattern() {
        Employee androidDeveloper = EmployeeFactory.getEmployeeBasedOnType(ANDROID_DEVELOPER);
        int androidDeveloperSalary = androidDeveloper.getSalary();
        System.out.println("Android Developer Salary : " + androidDeveloperSalary);

        Employee webDeveloper = EmployeeFactory.getEmployeeBasedOnType(WEB_DEVELOPER);
        int webDeveloperSalary = webDeveloper.getSalary();
        System.out.println("Web Developer Salary : " + webDeveloperSalary);
    }

    // In this design pattern, event the Employee Factory is not aware about object creation logic.
    // If we want, we can create new object Manager extending EmployeeAbstractFactory
    private static void testAbstractFactoryDesignPattern() {
        abstractfactory.Employee androidDeveloper = abstractfactory.EmployeeFactory.getEmployee(new AndroidDevFactory());
        androidDeveloper.getName();

        abstractfactory.Employee webDeveloper = abstractfactory.EmployeeFactory.getEmployee(new WebDevFactory());
        webDeveloper.getName();
    }

    private static void testBuilderPattern() {
        builder.User user = builder.User.UserBuilder.getBuilder()
                .setUserId(ANDROID_DEV_USER_ID)
                .setUserName(ANDROID_DEVELOPER)
                .setEmailId(ANDROID_DEV_EMAIL_ID)
                .build();

        System.out.println(user.getUserId() + " : " + user.getUserName() + " : " + user.getEmailId());
    }

    private static void testPrototypeDesignPattern() throws Exception {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(NETWORK_CONNECTION_IP);
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        // We want to reuse the cloned object for new implementation
        // Below objects will aleady have the cost consuming operation results due to cloning
        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
        NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();

        // Remove one of the domains from original network connection
        // We will see the removal in all the subsequent objects.
        // To fix this , we need to add custom logic for cloning
        networkConnection.getDomainsList().remove(0);
        System.out.println(networkConnection);

        System.out.println(networkConnection2);
        System.out.println(networkConnection3);
    }

    private static void testObserverDesignPattern() {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        Subscriber aman = new Subscriber(AMAN_AS_USER);
        Subscriber raman = new Subscriber(RAMAN_AS_USER);

        // Subscribe to channel
        youtubeChannel.subscribe(aman);
        youtubeChannel.subscribe(raman);

        // All the subscribers should be notified
        youtubeChannel.notifyChanges();
    }

    private static void testIteratorDesignPattern() {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new iterator.User(AMAN_AS_USER, AMAN_USER_ID));
        userManagement.addUser(new iterator.User(RAMAN_AS_USER, RAMAN_USER_ID));

        MyIterator userManagementIterator = userManagement.getIterator();
        while (userManagementIterator.hasNext()) {
            User user = (User) userManagementIterator.next();
            System.out.println(user.getName());
        }
    }

    private static void testAdapterDesignPattern() {
     /*   AppleCharger appleCharger = new AppleChargerImpl();
        Iphone13 iphone13 = new Iphone13(appleCharger);
        iphone13.chargeIphone();
     */

        // But we want Iphone to be charged with Android Charger
        AppleCharger adapterCharger = new AdapterCharger(new AndroidChargerImpl());
        Iphone13 iphone13 = new Iphone13(adapterCharger);
        iphone13.chargeIphone();

    }
}