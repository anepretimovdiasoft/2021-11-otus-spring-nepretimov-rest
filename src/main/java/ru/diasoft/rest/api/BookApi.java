package ru.diasoft.rest.api;

import ru.diasoft.rest.dto.BookDto;

import java.util.List;

public interface BookApi {

    List<BookDto> requestBookList();

    BookDto requestBook(int id);

    void deleteBook(int id);

}
