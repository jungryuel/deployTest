import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class TestController {

    @GetMapping("/actuator/health")
    public boolean health(){
        return true;
    }

    @GetMapping("/api/version")
        public String version(){
            return "v1";
        }
}
