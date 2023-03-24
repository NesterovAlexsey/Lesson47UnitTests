//Задача 1
//Напишите автотесты с использованием JUnit для задачи 1 из предыдущего домашнего задания.
//
//Создайте компаратор, который позволит сортировать книги по названию,
//при одинаковых названиях - по автору (и там, и там - по алфавиту)
//
//Проверьте краевые случаи, предусмотрите разные варианты.

//Test Plan:
//1. Sort book by name
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBook {
  public static void main(String[] args) {

    List<Book> myBestBooks = new ArrayList<>();
    myBestBooks.add(new Book("Remark", "Three friends", 200));
    myBestBooks.add(new Book("Stephen Covey", "7 Effective skills", 300));
    myBestBooks.add(new Book("Достоевский", "Братья Карамазовы", 680));
    myBestBooks.add(new Book("Remark", "No change on the western front", 300));

    System.out.println("Sort by Author(in alphabet):");
    Collections.sort(myBestBooks);
    showBookList(myBestBooks);

    System.out.println("Sort by Book name(in alphabet):");
    myBestBooks.sort(new NameBookComparator());
    showBookList(myBestBooks);

    System.out.println("Sort by numbers of pages:");
    myBestBooks.sort(new NumberOfPagesComparator());
    showBookList(myBestBooks);
  }

  private static void showBookList(List<Book> myBestBook) {
    for (Book book : myBestBook) {
      System.out.println(book);
    }
    System.out.println();
  }
}