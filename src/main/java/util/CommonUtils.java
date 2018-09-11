package util;

import entity.DataType;

import java.util.ArrayList;
import java.util.List;

/**
 * 잡다한 공통 Util 모음
 */
public class CommonUtils {

    /**
     * List를 concat 하여 String으로 return
     * StringBuilder 사용
     * @param sortedOutputs
     * @return
     */
    public static String convertListToString(List<String> sortedOutputs) {
        StringBuilder result = new StringBuilder();

        for (String sortedOutput : sortedOutputs) {
            result.append(sortedOutput);
        }
        return result.toString();
    }

    /**
     * List를 concat 하여 String으로 return
     * StringBuilder 사용
     * dataType에 따른 몫 또는 나머지값만 출력
     * @param sortedOutputs
     * @param bindUnit
     * @return
     */
    public static String convertListToString(List<String> sortedOutputs, int bindUnit, DataType dataType) {

        int outputSize = sortedOutputs.size();
        int rest = outputSize % bindUnit;
        int targetSize = outputSize - rest;
        StringBuilder result = new StringBuilder();

        if (dataType.equals(DataType.SHARE)) {
            for (int i = 0; i < targetSize; i++) {
                result.append(sortedOutputs.get(i));
            }
        } else if (dataType.equals(DataType.REST)) {
            for (int i = targetSize; i < outputSize; i++) {
                result.append(sortedOutputs.get(i));
            }
        }

        return result.toString();
    }

    /**
     * 개발환경상 빠른 테스트를 위한 테스트수행
     * @param args
     */
   /* public static void main(String[] args) {

        List<String> sortedOutputs = new ArrayList<String>();
        sortedOutputs.add("1");
        sortedOutputs.add("2");
        sortedOutputs.add("3");
        sortedOutputs.add("4");
        sortedOutputs.add("5");
        sortedOutputs.add("6");
        sortedOutputs.add("7");
        int bindUnit = 1;
        DataType dataType = DataType.SHARE;

        int outputSize = sortedOutputs.size();
        int rest = outputSize % bindUnit;
        int targetSize = outputSize - rest;
        StringBuilder result = new StringBuilder();

        if (dataType.equals(DataType.SHARE)) {
            for (int i = 0; i < targetSize; i++) {
                result.append(sortedOutputs.get(i));
            }
        } else if (dataType.equals(DataType.REST)) {
            for (int i = targetSize; i < outputSize; i++) {
                result.append(sortedOutputs.get(i));
            }
        }
        System.out.println(result);

    }*/
}
