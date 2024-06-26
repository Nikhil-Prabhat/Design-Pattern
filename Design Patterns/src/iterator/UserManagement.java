package iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getUser(int index) {
        return this.userList.get(index);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(this.userList);
    }
}
