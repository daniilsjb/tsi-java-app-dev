package lv.tsi.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Float price;

    @Column(nullable = false)
    private String pictureUrl;

    @Column(nullable = false)
    private ProductCategory category;

    public Product() {

    }

    public Product(String name, String description, Float price, String pictureUrl, ProductCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.pictureUrl = pictureUrl;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public ProductCategory getCategory() {
        return category;
    }

    static public class Builder {
        private String name;
        private String description;
        private Float price;
        private String pictureUrl;
        private ProductCategory category;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder price(Float price) {
            this.price = price;
            return this;
        }

        public Builder pictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }

        public Builder category(ProductCategory category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(name, description, price, pictureUrl, category);
        }
    }
}
