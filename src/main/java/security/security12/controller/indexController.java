package security.security12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // view를 리턴
public class  indexController {

    @GetMapping({"","/"})
    public String index(){
        return "index.html";
    }
}
