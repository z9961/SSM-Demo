package Controllers;

//import Entity.Project;
import Entity.Users;
import Service.IUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @Autowired
    private IUserBiz userBiz;

    @RequestMapping(value = "test")
    @ResponseBody
    public String TestString(){
        Users u = userBiz.findUserByPhone("15610053553");
        return u.toString()+"|\n"+u.getAddressesByUphone().get(0).getAddress();
    }
}
