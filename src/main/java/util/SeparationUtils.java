package util;

import entity.AllDataList;
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
     * @param sortedOutputList
     * @return
     */
    public static ShareAndRest findShareAndRest(List<String> sortedOutputList, int bindUnit) {

        ShareAndRest shareAndRest = new ShareAndRest();

        return shareAndRest;
    }
}
