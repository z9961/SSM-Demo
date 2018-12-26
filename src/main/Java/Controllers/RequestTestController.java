package Controllers;

//import Entity.Project;
import Entity.Test;
import Entity.Users;
import Service.IUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @Autowired
    private IUserBiz userBiz;

    @RequestMapping(value = "test")
    @ResponseBody
    public String TestString(){

        List<String> ttt = new ArrayList<String>();
        ttt.add("771");
        ttt.add("992");

        int u = userBiz.insert(ttt);
        return u+"";
    }
}
