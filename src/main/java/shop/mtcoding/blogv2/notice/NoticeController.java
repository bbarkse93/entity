package shop.mtcoding.blogv2.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {

    @GetMapping("hello")
    public String joinForm() {
        return "user/userInformation";
    }
}
