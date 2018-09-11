package util;

import entity.AllDataList;
import entity.DataType;
import entity.ShareAndRest;

import java.util.ArrayList;
import java.util.List;

/**
 * 특정한 조건에의한 분리에 관한 Util 모음
 */
public class SeparationUtils {

    /**
     * InputType에 해당하는 데이터를 List로 추출
     * @param inputData
     * @return AllDataList
     */
    public static AllDataList selectRequestTypeDataList(String inputData) {

        AllDataList allDataList = new AllDataList();
        String [] inputArr = inputData.split("");
        List<String> numberDatas = new ArrayList<String>();
        List<String> alphabets = new ArrayList<String>();

        for (String input : inputArr) {
            if (isNumber(input)) {
                numberDatas.add(input);
            } else if (isAlphabet(input)) {
                alphabets.add(input);
            }
        }
        allDataList.setNumbers(numberDatas);
        allDataList.setAlphabets(alphabets);

        return allDataList;
    }

    /**
     * input이 숫자인지 판별(정규표현식)
     * @param input
     */
    private static boolean isNumber(String input) {

        if (input.matches("^[0-9]*$")) {
            return true;
        }
        return false;
    }

    /**
     * input이 알파벳인지 판별(정규표현식)
     * @param input
     */
    private static boolean isAlphabet(String input) {

        if (input.matches("^[a-zA-Z]*$")) {
            return true;
        }
        return false;
    }

    /**
     * 출력묶음단위에 해당하는 몫과 나머지를 조회
     * @param sortedOutputs
     * @return
     */
    public static ShareAndRest findShareAndRest(List<String> sortedOutputs, int bindUnit) {

        //input size
        int inputSize = sortedOutputs.size();

        ShareAndRest shareAndRest = new ShareAndRest();

        if (inputSize < bindUnit) {
            //1. 출력묶음 단위가 input의 size보다 크면 몫은 null, 나머지는 input 전체
            shareAndRest.setRest(CommonUtils.convertListToString(sortedOutputs));
        } else if (inputSize == bindUnit) {
            //2. 출력묶음 단위가 input size와 동일하면 몫은 input 전체 나머지는 null
            shareAndRest.setShare(CommonUtils.convertListToString(sortedOutputs));
        } else {
            //3. 출력묶음 단위가 input size보다 작으면 몫은 나머지를 제외한 input 나머지는 나머지
            shareAndRest.setShare(CommonUtils.convertListToString(sortedOutputs, bindUnit, DataType.SHARE));
            shareAndRest.setRest(CommonUtils.convertListToString(sortedOutputs, bindUnit, DataType.REST));
        }

        return shareAndRest;
    }
}
