package Exam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DealList implements GetsortList{
    public Map<Integer,ArrayList<Integer>> deal(ArrayList<Integer> list) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
        for(int i:list){
            int value=i/10;
            ArrayList<Integer> result=map.get(value);
            if(result==null)
            {
                result=new ArrayList<Integer>();
            }
            result.add(i);
            map.put(value,result);
        }
        return map;
    }

    public Map<Integer, ArrayList<Integer>> deal(Map<Integer, ArrayList<Integer>> map) {
        return null;
    }
}
