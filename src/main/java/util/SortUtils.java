package util;

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
    public static List<String> toArrayListByUpperCaseFirst(List<String> alphabetList) {
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
        return alphabetList;
    }

    public static List<String> sortedAlphabetNumberListCross(List<String> numbers, List<String> sortedAlphabets) {
        return null;
    }

//    public static void main(String[] args) {
//    }
}
