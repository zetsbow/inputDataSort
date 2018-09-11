package service.logic;

import entity.InputType;
import entity.ShareandRest;
import service.ConvertDataService;
import util.SeparationUtils;
import util.SortUtils;

import java.util.ArrayList;
import java.util.List;

public class ConvertDataServiceLogic implements ConvertDataService {

    /**
     * 입력값에 대한 변환작업 서비스
     * @param inputData
     * @return
     */
    @Override
    public ShareandRest convertTextArea(String inputData) {
        ShareandRest shareandRest = new ShareandRest();
        //TODO 구현계획
        //정렬방식중 병합방식을 이용할 예정. 속성별로 분리 후 합치면서 요구사항에 맞게 정렬
        //1.input값에서 숫자, 알파벳을 List로 추출
        List<String> alphabets = SeparationUtils.selectRequestTypeDataList(inputData, InputType.ALPHABET);
        List<String> numbers = SeparationUtils.selectRequestTypeDataList(inputData, InputType.NUMBER);

        //2.알파벳 List 내부정렬
        List<String> sortedAlphabets = SortUtils.toArrayListByUpperCaseFirst(alphabets);
        //2-1 숫자 List 정렬

        //3.정렬된 알파벳List와 숫자List를 병합
        List<String> sortedOutputList = SortUtils.sortedAlphabetNumberListCross(numbers, sortedAlphabets);

        //4.출력 묶음단위를 고려 후 리턴값 반환(몫 + 나머지)
        return shareandRest;
    }
}
