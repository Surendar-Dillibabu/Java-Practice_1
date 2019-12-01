package main.reflection.ex.pgms;

public class Books {

  private static final String publisherName = "Amazon";

  private String bookName;

  private String authorName;

  private int price;

  public Books(String bookName, String authorName, int price) {
    this.bookName = bookName;
    this.authorName = authorName;
    this.price = price;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  private String getPublisherName() {
    return publisherName;
  }

  @Override
  public String toString() {
    return "Books [bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
  }

  public void getCompleteDetails() {
    StringBuilder str = new StringBuilder("");
    str.append("bookName=").append(bookName).append(", authorName=").append(authorName).append(", price=")
        .append(price);
    str.append(", publisherName=").append(getPublisherName());
    System.out.println("Publisher name :" + str.toString());
  }
}
