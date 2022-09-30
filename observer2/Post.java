public interface Post {
    void follow(Observer observer);
    void unfollow(Observer observer);
    void notifyFollowers();
}
