
import java.util.List;

public class Client implements Observer{
    private String name;
    public Client(String name) {
        this.name = name;
    }

    @Override
    public void manageChanges(List<String> items) {
        System.out.println(name + " -*-*-*-*- Current items -*-*-*-*-");
        for(String item: items){
            System.out.println(item);
        }
    }
}

