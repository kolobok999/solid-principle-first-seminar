package homework;

public class UserReporter {
    User user;

    public UserReporter(User user) {
        this.user = user;
    }

    public void report(){
        System.out.println("Report for user: " + user.name());
    }
}
