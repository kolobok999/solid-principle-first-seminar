package homework;

public class UserSaver {
    private final User user;

    public UserSaver(User user) {
        this.user = user;
    }

    public void save(PersistManager manager){
        manager.saveUser(user);
    }
}
