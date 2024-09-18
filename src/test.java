//写一个小游戏，用上调用其他函数的功能示范
public class test {
    public static void main(String[] args) {
        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("请输入一个1-100的数字：");
        int number = (int) (Math.random() * 100 + 1);
        int guess = 0;
        while (guess != number) {
            guess = new java.util.Scanner(System.in).nextInt();
            if (guess > number) {
                System.out.println("大了");
            } else if (guess < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜对了");
            }
        }
    }
}