package dont;

import java.util.Scanner;

public class AIDemo {
    public static void aI(){
        Scanner sc=new Scanner(System.in);
        String Str="1";
        while(true){
            Str=sc.next();
            Str=Str.replace("你能听懂我说话？","当然了！我可是最流行的AI！");
            Str=Str.replace("你的名字是？","叫我宝宝好啦，嘻嘻（。。。）");
            Str=Str.replace("人工智障？","呜呜呜。。。。。\n我不是！！！");
            Str=Str.replace("吗？","！");
            Str=Str.replace("你好！","你好！");
            Str=Str.replace("嘿，打电话给siri","没有这个人。。。");
            Str=Str.replace("废物啊！！！","溜了溜了。。。。。");
            System.out.println(Str);
        }
    }
   public void su() {
       int j;
       for (int i = 2; i <= 100; i++)
       {
           j = 2;
           while (i % j != 0) {
               j++;
           }
           if (j == i)
           {
               System.out.println(i);
           }
       }

   }
    public static void main(String[] args) {
        aI();
    }
}
