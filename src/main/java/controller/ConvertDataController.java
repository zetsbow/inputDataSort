package controller;

import entity.ShareAndRest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
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
    public ModelAndView view() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sort");
        return mv;
    }

    /**
     * 입력값에 대해 규칙에 맟게 변환된 몫과 나머지 출력 기능
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST )
    public ModelAndView sort(@ModelAttribute("inputData") String inputData, @ModelAttribute("bindUnit") String bindUnit) {
        ModelAndView mv = new ModelAndView();

        ShareAndRest shareAndRest = convertDataService.convertTextArea(inputData, Integer.valueOf(bindUnit));
        mv.addObject("inputData", inputData);
        mv.addObject("bindUnit", bindUnit);
        mv.addObject("shareAndRest", shareAndRest);
        mv.setViewName("sort");
        return mv;
    }
}
