package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 정렬에 관한 Util 모음
 */
public class SortUtils {

    /**
     * 알파벳 List를 오름차순으로 정렬(대문자 우선)
     * ex> AaBbCcDd
     * @param alphabetList
     * @return List<String>
     */
    public static void sortAlphabetByUpperCaseFirstAsc(List<String> alphabetList) {
        Collections.sort(alphabetList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1_up = o1.toUpperCase();
                String o2_up = o2.toUpperCase();

                int result = o1_up.compareTo(o2_up);

                if (result != 0) {
                    return result;
                } else {
                    return  o1.compareTo(o2);
                }
            }
        });
    }

    /**
     * 정렬된 알파벳 과 숫자 List를 교차로 조합된 새로운 List로 반환
     * 우선순위는 알파벳이며, 모든 element 소진 시 나머지 List의 남은 element는 그대로 append
     * @param numbers
     * @param alphabets
     * @return
     */
    public static List<String> sortedAlphabetNumberListCross(List<String> alphabets, List<String> numbers) {

        List<String> mergeDatas = new ArrayList<String>();

        int numberListSize = numbers.size();
        int alphabetListSize = alphabets.size();
        int maxSize = alphabets.size() < numbers.size() ? numbers.size() : alphabets.size();

        for (int i = 0; i < maxSize; i++) {
            if (i < alphabetListSize) {
                //알파벳 LIst add
                mergeDatas.add(alphabets.get(i));
            }
            if (i < numberListSize) {
                //숫자 LIst add
                mergeDatas.add(numbers.get(i));
            }
        }

        return mergeDatas;
    }

    /**
     * 숫자 List를 오름차순으로 정렬
     * @param numbers
     */
    public static void sortNumberListAsc(List<String> numbers) {
        Collections.sort(numbers);
    }

    /*public static void main(String[] args) {

        List<String> numbers = new ArrayList<String>();
        numbers.add("2");
        numbers.add("5");
        numbers.add("3");
        numbers.add("7");

        Collections.sort(numbers);

        for (String number : numbers) {
            System.out.println(number);
        }

    }*/
}
