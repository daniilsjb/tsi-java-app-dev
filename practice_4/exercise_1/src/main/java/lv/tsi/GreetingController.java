package lv.tsi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

    @GetMapping(value = "/greeting")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "Spring") String name) {
        return new Greeting("Hello, my name is " + name + "!");
    }
}
