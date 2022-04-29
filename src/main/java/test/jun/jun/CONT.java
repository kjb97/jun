package test.jun.jun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CONT {

    @GetMapping("j")
    public String jjj(){
        return "jun";
    }

    @GetMapping("/jup")
    public String jtest(){
        return "version upgrade jun";
    }
}
