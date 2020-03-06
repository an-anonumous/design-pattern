package Structural.Flyweight;

public class Book implements Resource {

  private String name;
  private String author;
  private String publishingHouse;
  private String Url;
  private Double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublishingHouse() {
    return publishingHouse;
  }

  public void setPublishingHouse(String publishingHouse) {
    this.publishingHouse = publishingHouse;
  }

  public String getUrl() {
    return Url;
  }

  public void setUrl(String url) {
    Url = url;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String getResourceUrl() {
    return Url;
  }

  @Override
  public String toString() {
    return "Book{"
        + "name='"
        + name
        + '\''
        + ", author='"
        + author
        + '\''
        + ", publishingHouse='"
        + publishingHouse
        + '\''
        + ", Url='"
        + Url
        + '\''
        + ", price="
        + price
        + '}';
  }
}
