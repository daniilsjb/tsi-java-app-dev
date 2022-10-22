package lv.tsi;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
class Meal {

    @Id
    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String description;

    @JsonProperty
    private BigDecimal price;

    @JsonProperty
    private Boolean spicy;

    @JsonProperty
    private Boolean vegan;
}
