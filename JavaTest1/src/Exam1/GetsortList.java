package Exam1;

import java.util.ArrayList;
import java.util.Map;

public interface GetsortList {
    Map<Integer,ArrayList<Integer>> deal(ArrayList<Integer> list);
    Map<Integer,ArrayList<Integer>> deal(Map<Integer, ArrayList<Integer>> map);
}
