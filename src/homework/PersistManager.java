package homework;

public class PersistManager {
    private final Persistable persistable;

    public PersistManager(Persistable persistable) {
        this.persistable = persistable;
    }

    public void saveUser(User user) {
        persistable.save(user);
    }
}
