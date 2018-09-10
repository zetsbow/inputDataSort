package controller;

import entity.ShareandRest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ConvertDataService;
import service.logic.ConvertDataServiceLogic;

@Controller
public class ConvertDataController {

    ConvertDataService convertDataService = new ConvertDataServiceLogic();

    /**
     * 입력값에 대해 규칙에 맟게 변환된 몫과 나머지 출력 기능
     * @return
     */
    @RequestMapping("/")
    @ResponseBody
    public ShareandRest convertTextArea() {

        //TODO 화면 미구현으로 인한 InputData 처리
        String inputData = "1qS24ds";
        return convertDataService.convertTextArea(inputData);
    }
}
