package iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> userList;
    private int length;

    private int position = 0;

    public MyIteratorImpl(List<User> userList) {
        this.userList = userList;
        this.length = userList.size();
    }

    @Override
    public boolean hasNext() {
        return position >= length ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override
    public Object next() {
        User user = this.userList.get(position);
        ++position;
        return user;
    }
}
