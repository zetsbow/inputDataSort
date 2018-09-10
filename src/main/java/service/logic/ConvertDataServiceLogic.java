package service.logic;

import entity.ShareandRest;
import service.ConvertDataService;

public class ConvertDataServiceLogic implements ConvertDataService {

    /**
     * 입력값에 대한 변환작업 서비스
     * @param inputData
     * @return
     */
    @Override
    public ShareandRest convertTextArea(String inputData) {
        //TODO 구현계획
        //정렬방식중 병합방식을 이용할 예정. 속성별로 분리 후 합치면서 요구사항에 맞게 정렬
        //1.input값을 숫자, 대문자, 소문자로 3그룹으로 분리
        //2.대문자와 소문자를 병합
        //3.병합된 데이터와 숫자를 병합
        //4.출력 묶음단위를 고려 후 리턴값 반환(몫 + 나머지)
        return null;
    }
}
