public class solution {
    public static void main(String[] args) {
//        (人口估算）美国人口调査局基于以下假设进行人口估算：
//        每 7 秒有一个人诞生
//        每 13 秒有一个人死亡
//        每 45 秒有一个移民迁入
//        编写一个程序，显示未来 5 年的每年的人口数。假设当前的人口是312 032 486, 每年有365天。
//        提示：Java 中，两个整数相除，结果还是整数，小数部分被去掉。例如，5/4等于 1 (而不是1.25 ), 10/4 等于 2(而不是 2.5 )。
//        如果想得到有小数部分的精确结果，进行除法运算的两 个值之一必须是一个具有小数点的数值。例如，5.0/4 等于 1.25, 10/4.0 等于 2.5。
        long personNum = 312032486;
        System.out.println("当前美国人口数为：" + personNum);
        long bornNum = 0;  //出生人数
        long deathNum = 0;  //死亡人数
        long imigNum = 0;  //迁入人数
        System.out.println("人口估算结果如下：");
        for(int i = 1; i <= 5;i ++){
            long time = 365 * 24 * 60 * 60 * i;
            bornNum = time / 7;
            deathNum = time / 13;
            imigNum = time / 45;
            personNum += (bornNum - deathNum + imigNum);
            System.out.printf("第%d年的人口数目为：",i);
            System.out.println(personNum);
        }
    }
}
