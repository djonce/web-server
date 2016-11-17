package tech.wangjie.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjie on 2016/11/10
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "index";
    }
}
