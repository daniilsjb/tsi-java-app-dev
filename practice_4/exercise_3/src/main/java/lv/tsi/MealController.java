package lv.tsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MealController {

    private final MealRepository repository;

    @Autowired
    public MealController(MealRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/meals")
    public ResponseEntity<Iterable<Meal>> findMeals() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/meals/{id}")
    public ResponseEntity<Meal> findMeal(@PathVariable Long id) {
        return ResponseEntity.of(repository.findById(id));
    }
}
