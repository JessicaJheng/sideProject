import java.awt.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import javax.swing.*;

public class sideProject extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(5, 3, getWidth() - 10, getHeight() - 10);
        g.setColor(Color.BLACK);
//        g.drawLine(5,10,getWidth()-5,10); //上邊線
//        g.drawLine(5,10,5,getHeight()-5); //左邊線
//        g.drawLine(5,getHeight()-5,getWidth()-5,getHeight()-5); //下邊線
//        g.drawLine(getWidth()-5,10,getWidth()-5,getHeight()-5); //右邊線
        g.drawRect(5, 3, getWidth() - 10, getHeight() - 10);

    }

    public static void main(String args[]) {
        //開啟一個標題為共通記帳本的視窗
        JFrame window = new JFrame("共通記帳本");
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(new sideProject());

        JLabel label = new JLabel("多人記帳App", JLabel.CENTER);
        label.setBackground(Color.orange);
        label.setOpaque(true);

        Color currentBackground = label.getBackground();
        System.out.println(currentBackground);
        if (currentBackground.equals(currentBackground)) {
            label.setForeground(Color.BLACK); //字體顏色設定
            label.setBackground(currentBackground); //字的背景顏色設定
        }

        window.add(label, BorderLayout.NORTH); //字體位置設定
        window.setVisible(true);
       // System.out.println("請輸入使用人數: ");

        Scanner s = new Scanner(System.in);
        int averageNumber;
        ArrayList<String> names = new ArrayList<>();
        boolean isNumberConfirmed = false;


        // 確認使用人數
        while (!isNumberConfirmed) {
            System.out.print("請輸入使用人數: ");
            if (s.hasNextInt()) {
                averageNumber = s.nextInt();
                s.nextLine(); // 清除緩衝區中的換行符

                System.out.println("本次使用人數是" + averageNumber + "人，對嗎?");
                System.out.print("請輸入是或否: ");
                String userAns = s.nextLine().trim();

                if (userAns.equals("是")) {
                    System.out.println("很棒，讓我們繼續完成其他設定: ");
                    isNumberConfirmed = true;

                    // 讓用戶輸入使用者名稱
                    names.clear(); // 清空之前的名稱列表
                    System.out.println("請輸入使用者名稱:");
                    for (int i = 0; i < averageNumber; i++) {
                        System.out.print("使用者 " + (i + 1) + " 名稱: ");
                        names.add(s.nextLine());
                    }
                } else if (userAns.equals("否")) {
                    System.out.println("請重新輸入使用人數。");
                } else {
                    System.out.println("請輸入有效的答案（是或否）。");
                }
            } else {
                System.out.println("請輸入一個有效的整數人數！");
                s.next(); // 清除無效的輸入
            }
        }

        // 顯示修正後的使用者名稱
        System.out.println("使用者名稱為: " + names);
    }
}
