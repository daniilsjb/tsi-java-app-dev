package lv.tsi;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Book {

    @Id
    @JsonProperty
    private Long id;

    @JsonProperty
    private String author;

    @JsonProperty
    private String name;

    @JsonProperty
    private int copies;
}
