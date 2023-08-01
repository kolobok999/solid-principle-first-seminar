package homework;

public class Persister implements Persistable {


    public void save(User user) {
        System.out.println("Save user: " + user.name());
    }
}
