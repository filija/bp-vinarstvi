package filipek.jakub.vinarstvi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kuba on 24.9.16.
 */

@Controller
public class ViewController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String indexPage(){
        return "home";
    }

}
