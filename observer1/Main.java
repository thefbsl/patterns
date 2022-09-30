

public class Main {
    public static void main(String[] args) {
        Provider provider = new Provider();
        Client client1 = new Client("Alex");
        Client client2 = new Client("Mike");
        provider.addNewItem("Computer");
        provider.follow(client1);
        provider.follow(client2);
        provider.addNewItem("Smartphone");
        provider.addNewItem("fridge");
        provider.unfollow(client1);
        provider.addNewItem("printer");
        provider.deleteItem("Smartphone");
    }
}