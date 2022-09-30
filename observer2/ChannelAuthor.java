import java.util.ArrayList;
import java.util.List;

public class ChannelAuthor implements Post{
    private List<Observer> followers = new ArrayList<>();
    private String message;

    public void addNewPost(){
        this.message = "new post was added";
        System.out.println(this.message);
        notifyFollowers();
    }

    public void deletePost(){
        this.message = "a post was deleted";
        System.out.println(this.message);
        notifyFollowers();
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
    public void notifyFollowers() {
        for(Observer observer: followers){
            observer.manageChanges(message);
        }
    }
}
