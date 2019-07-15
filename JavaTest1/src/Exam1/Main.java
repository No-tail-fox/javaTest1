package Exam1;

import javafx.scene.paint.RadialGradient;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Main
{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<50;i++)
        {
            int value= (int) (Math.random()*100);
            list.add(value);
        }
        DealList d= (DealList) SortFactory.getMethod("deal");
        SortList s= (SortList) SortFactory.getMethod("sort");
        Map<Integer, ArrayList<Integer>> map= s.deal(d.deal(list));
        System.out.println(map.toString());
    }
}
