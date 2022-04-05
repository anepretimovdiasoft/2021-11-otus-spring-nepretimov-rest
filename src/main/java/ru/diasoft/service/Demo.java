package ru.diasoft.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.diasoft.rest.api.BookApi;

@Component
@RequiredArgsConstructor
public class Demo {

    private final BookPrinter bookPrinter;
    private final BookApi bookApi;

    public void demo(){

        System.out.println("===Все книги===");
        bookPrinter.printBookList(bookApi.requestBookList());
        System.out.println();
        System.out.println("===Книга 1===");
        bookPrinter.printBook(bookApi.requestBook(1));

    }
}
