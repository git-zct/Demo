/**
 * @ author zhu
 * @ date 2020/6/7 14:20
 * -
 */

import java.util.Scanner;
public class shuzu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=sc.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("366");
        }else{
            System.out.println("365");
        }
    }

}
