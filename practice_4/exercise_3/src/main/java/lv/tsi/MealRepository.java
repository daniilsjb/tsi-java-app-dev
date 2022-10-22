package lv.tsi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MealRepository extends CrudRepository<Meal, Long> {

}
