import java.util.List;

public interface Observer {
    void manageChanges(List<String> items);
}