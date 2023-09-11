package practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Students stu = new Students();
//        for (int i = 0; i < n; i++) {
//            stu.hin = sc.nextFloat();
//            stu.eng = sc.nextFloat();
//            stu.math = sc.nextFloat();
//            stu.science = sc.nextFloat();
//            Students.totalAverage  += stu.calcAverage();
//
//        }
//        System.out.println(Students.totalAverage/n);
        Solution sol = new Solution();
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(sol.summaryRanges(nums));
    }
}
