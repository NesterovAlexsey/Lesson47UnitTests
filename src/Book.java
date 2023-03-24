public class Book implements Comparable<Book> {

  private final String author;

  private final String bookName;

  private final int numberOfPages;

  public Book(String author, String bookName, int numberOfPages) {
    this.author = author;
    this.bookName = bookName;
    this.numberOfPages = numberOfPages;
  }

  @Override
  public int compareTo(Book other) {
    if (author.compareTo(other.author) < 0) {
      return -1;
    }
    if (author.compareTo(other.author) > 0) {
      return 1;
    }
    return bookName.compareTo(other.bookName);
  }

  @Override
  public String toString() {
    return author + ", " + bookName + ", " + numberOfPages + " pages;";
  }

  public String getAuthor() {
    return author;
  }

  public String getBookName() {
    return bookName;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }
}
