package ru.diasoft.service;

import ru.diasoft.rest.dto.BookDto;

import java.util.List;

public interface BookPrinter {

    void printBook(BookDto bookDto);

    void printBookList(List<BookDto> bookDtoList);

}
