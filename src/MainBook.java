//Задача 1
//Напишите автотесты с использованием JUnit для задачи 1 из предыдущего домашнего задания.
//
//Создайте компаратор, который позволит сортировать книги по названию,
//при одинаковых названиях - по автору (и там, и там - по алфавиту)
//
//Проверьте краевые случаи, предусмотрите разные варианты.

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

//    Book book1 = new Book(null, null, 0);
//    Book book2 = new Book(null, null, 0);
//    myBestBooks.add(book1);
//    myBestBooks.add(book2);
//    System.out.println(myBestBooks);

    Collections.sort(myBestBooks);
    showBookList(myBestBooks);


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