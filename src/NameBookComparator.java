import java.util.Comparator;

public class NameBookComparator implements Comparator<Book> {

  @Override
  public int compare(Book a, Book b){
    if (!a.getBookName().equals(b.getBookName())) {
      return a.getBookName().compareTo(b.getBookName());
    }
    if (!a.getAuthor().equals(b.getAuthor())) {
      return a.getAuthor().compareTo(b.getAuthor());
    }
    return a.getNumberOfPages() - b.getNumberOfPages();
  }
}
