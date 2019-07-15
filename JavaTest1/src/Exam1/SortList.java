package Exam1;

import java.util.ArrayList;
import java.util.Map;

public class SortList implements GetsortList {
    public Map<Integer, ArrayList<Integer>> deal(ArrayList<Integer> list) {
        return null;
    }

    public Map<Integer, ArrayList<Integer>> deal(Map<Integer, ArrayList<Integer>> map) {
        for(int index:map.keySet()){
            ArrayList<Integer> list=map.get(index);
            for(int j=list.size();j>0;j--)
                for(int i=0;i<j-1;i++){
                if(list.get(i)>list.get(i+1)){
                    int temp=list.get(i+1);
                    list.set(i+1,list.get(i));
                    list.set(i,temp);
                }
            }
            for(int i:list)
            {
                System.out.print( i+"   ");
            }
            System.out.println("");
        }
        return map;
    }
}
