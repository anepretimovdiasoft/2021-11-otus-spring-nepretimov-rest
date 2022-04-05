package ru.diasoft.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private int id;

    private String name;

    private AuthorDto authorDto;

    private GenreDto genreDto;

    private List<CommentDto> commentDtoList;
}
