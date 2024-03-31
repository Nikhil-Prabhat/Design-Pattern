package builder;

public class User {

    private final String userId;
    private final String userName;
    private final String emailId;

    // initialise
    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    // Create inner class for object creation
    public static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        private UserBuilder() {

        }

        public static UserBuilder getBuilder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        // create a build method
        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
