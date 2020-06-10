/**
 * @ author zhu
 * @ date 2020/6/3 19:07
 * -
 */


public class test {
    public static void main(String[] args) {
        int i=0;
        String  s="good";
       switch(s){//可以是表达式也可以是变量，最终数据必须是byte short char int String(jdk6以上版本)
           case "good":
               System.out.println("ok");
           default:
               System.out.println("jj");
       }
    }
}
