package Structral.Flyweight;

import java.util.Date;

public class Newspaper implements IPublication {

    private String name;
    private Date date;
    private String title;

    @Override
    public void display() {
        toString();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", title='" + title + '\'' +
                '}';
    }
}
