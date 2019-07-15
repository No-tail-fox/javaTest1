## 通过 Main类运行整个程序
## DealList d= (DealList) SortFactory.getMethod("deal");
##        SortList s= (SortList) SortFactory.getMethod("sort");
##        Map<Integer, ArrayList<Integer>> map= s.deal(d.deal(list));
##        System.out.println(map.toString());
## 这里的map对象就是获取到的处理之后并且排序的信息
## 通过工厂创建DealList类，DealList类是单纯的对list的数据分组到对应的map里，而SortList类则是对处理后的map数据进行排序
