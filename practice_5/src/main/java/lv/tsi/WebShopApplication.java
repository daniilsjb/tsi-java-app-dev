package lv.tsi;

import lv.tsi.model.Product;
import lv.tsi.model.ProductCategory;
import lv.tsi.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class WebShopApplication {

    private final ProductRepository repository;

    @Autowired
    public WebShopApplication(ProductRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebShopApplication.class, args);
    }

    @Bean
    public void populateDatabase() {
        repository.save(new Product.Builder()
            .name("MacBook Air")
            .description("Power. It's in the Air.")
            .pictureUrl("https://www.apple.com/v/macbook-air/o/images/overview/hero_mba_m1__mfge6fbp7t2m_large.jpg")
            .category(ProductCategory.COMPUTER)
            .price(999.0F)
            .build());

        repository.save(new Product.Builder()
            .name("Xiaomi 12")
            .description("Elegance in the palm of your hand.")
            .pictureUrl("https://i01.appmifile.com/webfile/globalimg/products/responsive/xiaomi-12-pc/pc-charge.jpg")
            .category(ProductCategory.SMARTPHONE)
            .price(546.98F)
            .build());

        repository.save(new Product.Builder()
            .name("Amazon Echo")
            .description("Manage your calendar, follow along with recipes, catch up on news and more with Alexa.")
            .pictureUrl("https://m.media-amazon.com/images/I/61jEKl2Zy8L._AC_SL1000_.jpg")
            .category(ProductCategory.SMART_HOME_DEVICE)
            .price(59.99F)
            .build());
    }
}
