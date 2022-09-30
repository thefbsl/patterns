

public class Main {
    public static void main(String[] args) {
        ChannelAuthor admin = new ChannelAuthor();
        User user1 = new User("Shawn");
        User user2 = new User("Sam");
        admin.addNewPost();
        admin.addNewPost();
        admin.deletePost();
        admin.follow(user1);
        admin.follow(user2);
        admin.addNewPost();
        admin.addNewPost();
        admin.unfollow(user2);
        admin.addNewPost();
        admin.deletePost();
    }
}