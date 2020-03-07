package Structural.Flyweight;

public class Movie implements Resource {
  private String Url;
  private String name;
  private String director;
  private String Introduction;

  @Override
  public String getResourceUrl() {
    return Url;
  }

  public String getUrl() {
    return Url;
  }

  public void setUrl(String url) {
    Url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getIntroduction() {
    return Introduction;
  }

  public void setIntroduction(String introduction) {
    Introduction = introduction;
  }

  @Override
  public String toString() {
    return "Movie{"
        + "Url='"
        + Url
        + '\''
        + ", name='"
        + name
        + '\''
        + ", director='"
        + director
        + '\''
        + ", Introduction='"
        + Introduction
        + '\''
        + '}';
  }
}
