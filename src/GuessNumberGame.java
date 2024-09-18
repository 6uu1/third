import java.util.Scanner;//接受输入
import java.util.Random;//生成随机数

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalfenshu = 0;// 扩展加上算分功能
        int rounds = 3;

        // 进行三轮猜数字游戏
        for (int round = 1; round <= rounds; round++) {
            System.out.println("第 " + round + " 轮游戏开始！");
            int numberToGuess = random.nextInt(100) + 1; // 随机生成1到100的数字
            int guessCount = 0;
            int userGuess = 0;
            boolean guessedCorrectly = false;

            // 用户猜数字
            while (!guessedCorrectly) {
                System.out.print("请输入你的猜测：");
                userGuess = scanner.nextInt();
                guessCount++;

                if (userGuess > numberToGuess) {
                    System.out.println("太大了！");
                } else if (userGuess < numberToGuess) {
                    System.out.println("太小了！");
                } else {
                    System.out.println("恭喜你，猜中了！");
                    guessedCorrectly = true;
                }
            }

            // 下面的平均分是参考了ai写的

            // 根据猜测次数评分，猜的次数越少分数越高
            int fenshu = Math.max(100 - (guessCount - 1) * 10, 0); // 最低分为0
            System.out.println("第 " + round + " 轮游戏结束，你的得分是：" + fenshu);
            totalfenshu += fenshu;
        }

        // 计算平均分
        double averagefenshu = totalfenshu / (double) rounds;
        System.out.println("3轮游戏结束，你的平均得分是：" + averagefenshu);

        scanner.close();
    }
}
