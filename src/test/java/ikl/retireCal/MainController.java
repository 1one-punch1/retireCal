package ikl.retireCal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

//    LocalDate a..ikl.retireCal.input_day(mm, yyyyRetire_Y);


    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
