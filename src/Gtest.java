import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @ author zhu
 * @ date 2020/6/10 19:11
 * -
 */

public class Gtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year =sc.nextInt();
        int month=sc.nextInt();
        int sum=0,flag=0,monthDay=0;
        int i=0;
        for(i=1900;i<year;++i){
            if(i%400==0||(i%4==0&&i%100!=0)){
               sum+=366;
            }else{
                sum+=365;
            }
        }
        if(year%400==0||(year%100!=0&&year%4==0)){
            flag=1;
        }
        for(i=1;i<=month;++i){
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(i!=month) {
                        sum += 31;
                    }else{
                        monthDay=31;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(i!=month) {
                        sum += 30;
                    }else{
                        monthDay=30;
                    }
                    break;
                case 2: {
                    if (flag == 1) {
                        monthDay=29;
                        if(month!=i)
                            sum += 29;
                    } else {
                        monthDay=28;
                        if(month!=i){
                            sum += 28;
                        }

                    }
                }
            }

        }
        sum+=1;
        int week=sum%=7;
        System.out.println("周日\t周一\t周二\t周三\t周四\t周五\t周六");
        for(i=0;i<week;++i){
            System.out.print("\t");
        }
        for(i=1;i<=monthDay;++i){
            System.out.printf("%2d\t",i);//     System.out.printf("%-2d\t",i);左对齐
        //    System.out.print(i+"\t");
            week++;
            if(week%7==0){
                System.out.println();
            }
        }
        System.out.println();
        //周一在前
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        week=sum%=7;
        for(i=1;i<week;++i){
            System.out.print("\t");
        }
    for(i=1;i<=monthDay;++i){
            System.out.printf("%2d\t",i);//     System.out.printf("%-2d\t",i);左对齐
            //    System.out.print(i+"\t");
            week++;
            if(week%7==1){
                System.out.println();
            }
        }


    }
}
