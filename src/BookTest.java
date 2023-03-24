import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

 //Test Plan:
//+ 1. Sort book by name
//2. Sort book by author, if the name is equal
//3. All books are equals
//4. No books in the List
//5. Book with empty name
//6. Book with empty author
//7. Book with 0 or Negative pages
//8. Limit for maximal page numbers
//9. Limit for maximal name Length
//10. Limit for maximal author length
//11. Check NumberOfPagesComparator

  @Test
  public void NameBookAuthorComparator(){
//    arrange
    Book book1 = new Book("A", "A-Book", 100);
    Book book2 = new Book("C", "C-Book", 120);
    Book book4 = new Book("D", "C-Book", 120);
    Book book3 = new Book("B", "B-Book", 110);


    List<Book> actual = new ArrayList<>();
    actual.add(book1);
    actual.add(book2);
    actual.add(book3);
    actual.add(book4);

    List<Book> expect = new ArrayList<>();
    expect.add(book1);
    expect.add(book3);
    expect.add(book2);
    expect.add(book4);
//    act
    actual.sort(new NameBookComparator());

//    assert
    assertEquals(expect, actual);
  }

}

