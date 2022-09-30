
import java.util.List;

public class User implements Observer{
    private String name;
    public User(String name) {
        this.name = name;
    }

    @Override
    public void manageChanges(String message) {
        System.out.println(name + " " + message);
    }
}

