package ru.diasoft.service;

import org.springframework.stereotype.Service;
import ru.diasoft.rest.dto.BookDto;

import java.util.List;

@Service
public class BookPrinterSout implements BookPrinter {
    @Override
    public void printBook(BookDto bookDto) {

        StringBuilder stringBuilder = buildPrintableBook(bookDto);

        System.out.println(stringBuilder);
    }

    @Override
    public void printBookList(List<BookDto> bookDtoList) {

        StringBuilder stringBuilder = new StringBuilder();

        for (BookDto bookDto : bookDtoList) {
            stringBuilder.append(buildPrintableBook(bookDto)).append("\n");
        }

        System.out.println(stringBuilder);
    }

    private StringBuilder buildPrintableBook(BookDto bookDto) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nНазвание книги : ").append(bookDto.getName())
                .append("\nАвтор книги : ").append(bookDto.getAuthorDto().getName())
                .append("\nЖанр книги : ").append(bookDto.getGenreDto().getName());
        return stringBuilder;
    }
}
