package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ConvertDataController {

    /**
     * 입력값에 대해 규칙에 맟게 변환된 몫과 나머지 출력 기능
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String convertTextArea() {


        return "Wait";
    }
}
