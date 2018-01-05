package devops.test.microservice;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelthCheckMicroService {

	@RequestMapping("/")
    public String home() {
        return "Devops Test Service started.";
    }
}
