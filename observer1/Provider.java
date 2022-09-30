import java.util.ArrayList;
import java.util.List;

public class Provider implements Subject{
    private List<Observer> followers = new ArrayList<>();
    private List<String> items = new ArrayList<>();

    public void addNewItem(String item){
        items.add(item);
        sendMessage();
    }

    public void deleteItem(String item){
        items.remove(item);
        sendMessage();
    }

    @Override
    public void follow(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void unfollow(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void sendMessage() {
        for(Observer observer: followers){
            observer.manageChanges(items);
        }
    }


}
