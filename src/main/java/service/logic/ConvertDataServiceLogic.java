package service.logic;

import entity.AllDataList;
import entity.ShareAndRest;
import service.ConvertDataService;
import util.SeparationUtils;
import util.SortUtils;

import java.util.List;

public class ConvertDataServiceLogic implements ConvertDataService {

    /**
     * 입력값에 대한 변환작업 서비스
     * @param inputData
     * @return
     */
    @Override
    public ShareAndRest convertTextArea(String inputData, int bindUnit) {
        //TODO 구현계획
        //정렬방식중 병합방식을 이용할 예정. 속성별로 분리 후 합치면서 요구사항에 맞게 정렬
        //1.input값에서 숫자, 알파벳을 List로 추출
        AllDataList allDataList = SeparationUtils.selectRequestTypeDataList(inputData);

        //2.알파벳 List 내부정렬
        SortUtils.sortAlphabetByUpperCaseFirstAsc(allDataList.getAlphabets());
        //2-1 숫자 List 정렬
        SortUtils.sortNumberListAsc(allDataList.getNumbers());

        //3.정렬된 알파벳List와 숫자List를 병합
        List<String> sortedOutputList = SortUtils.sortedAlphabetNumberListCross(allDataList.getAlphabets(), allDataList.getNumbers());

        //4.출력 묶음단위를 고려 후 리턴값 반환(몫 + 나머지)
        ShareAndRest shareAndRest = SeparationUtils.findShareAndRest(sortedOutputList, bindUnit);

        return shareAndRest;
    }
}
