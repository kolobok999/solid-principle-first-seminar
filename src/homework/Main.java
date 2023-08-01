package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserReporter reporter = new UserReporter(user);
        UserSaver saver = new UserSaver(user);
        PersistManager manager = new PersistManager(new Persister());
        reporter.report();
        saver.save(manager);
    }
}