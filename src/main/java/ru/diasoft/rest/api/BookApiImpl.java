package ru.diasoft.rest.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import ru.diasoft.rest.dto.BookDto;

import java.net.URI;
import java.util.List;

@Component
@PropertySource(value = "application.yml")
public class BookApiImpl implements BookApi {

    private final String bookUri;

    private RestOperations restOperations = new RestTemplate();

    public BookApiImpl(@Value(value = "${host.name}") String host) {

        bookUri = host + "book/";
    }

    @Override
    public List<BookDto> requestBookList() {

        RequestEntity<List<BookDto>> requestEntity = new RequestEntity<>(HttpMethod.GET, URI.create(bookUri));

        ResponseEntity<List<BookDto>> responseEntity = restOperations.exchange(
                requestEntity,
                new ParameterizedTypeReference<>() {
                });

        return responseEntity.getBody();
    }

    @Override
    public BookDto requestBook(int id) {

        String uriString = bookUri + id;

        return restOperations.getForObject(uriString, BookDto.class);
    }

    @Override
    public void deleteBook(int id) {

        restOperations.delete(URI.create(bookUri + id));
    }
}
