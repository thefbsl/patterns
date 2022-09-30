
public interface Subject {
    void follow(Observer observer);
    void unfollow(Observer observer);
    void sendMessage();
}
