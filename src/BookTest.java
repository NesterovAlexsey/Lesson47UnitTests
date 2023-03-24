import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

  @Test
  public void NameBookComparator(){
//    arrange
    Book book1 = new Book("A", "A-Book", 100);
    Book book2 = new Book("C", "C-Book", 120);
    Book book3 = new Book("B", "B-Book", 110);

    List<Book> actual = new ArrayList<>();
    actual.add(book1);
    actual.add(book2);
    actual.add(book3);

    List<Book> expect = new ArrayList<>();
    expect.add(book1);
    expect.add(book3);
    expect.add(book2);
//    act
    actual.sort(new NameBookComparator());

//    assert
    assertEquals(expect, actual);
  }
}
