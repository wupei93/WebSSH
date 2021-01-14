package cn.objectspace.webssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RouterController {
    @RequestMapping("/websshpage")
    public String websshpage(@RequestParam("initCmd") String initCmd,
                             @RequestParam("title") String title,
                             Model model){
        model.addAttribute("initCmd",initCmd);
        model.addAttribute("title",title);
        return "webssh";
    }
}
