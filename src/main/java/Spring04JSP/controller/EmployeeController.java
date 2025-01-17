package Spring04JSP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/test")
    public String test() {
        return "/WEB-INF/test.jsp";
    }

    @GetMapping("/insert")
    public String insert() {
        return "/WEB-INF/insert.jsp";
    }

    @GetMapping("/index")
    public String index() {
        return "/WEB-INF/index.jsp";
    }

    @GetMapping("/update")
    public String update() {
        return "/WEB-INF/update.jsp";
    }

}
