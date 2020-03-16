package Structral.Flyweight;

public class Book implements IPublication {
    private String name;
    private int id;
    private String author;
    private String publishingHouse;
    private String info;

    public Book(String name, int id, String author, String publishingHouse, String info) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Book{"
                + "name='"
                + name
                + '\''
                + ", id="
                + id
                + ", author='"
                + author
                + '\''
                + ", publishingHouse='"
                + publishingHouse
                + '\''
                + ", info='"
                + info
                + '\''
                + '}';
    }

    @Override
    public void display() {
        toString();
    }
}
