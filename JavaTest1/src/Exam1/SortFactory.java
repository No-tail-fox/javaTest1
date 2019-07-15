package Exam1;

public class SortFactory {
    public static Object getMethod(String method) {
        if (method == "deal") {
            return new DealList();
        } else if (method == "sort") {
            return new SortList();
        }
        return null;
    }
}
