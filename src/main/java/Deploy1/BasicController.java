package Deploy1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class BasicController {

    @GetMapping("/name")
    public String getName() {
        return "Paolo";
    }
}
