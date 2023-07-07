package sub1;

import javax.swing.*;
import java.awt.*;

/*
 * 날짜 : 2023/07/07
 * 이름 : 김상엽
 * 내용 : Java Swing 실습하기
 *
 * GUI 프로그래밍
 *  - 사용자가 편리하게 프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
 *  - Java는 GUI 개발을 위해 Swing 라이브러리 지원
 * */
public class HelloSwing {
    public static void main(String[] args) {
        //윈도우 생성
        JFrame frame = new JFrame("Hello Swing");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setVisible(true);

        // 컨테이너 배치
        Container pane = frame.getContentPane();

        // 컴포넌트 배치
        JLabel label = new JLabel("Hello Swing");
        pane.add(label);

//        JButton button = new JButton("확인");
//        button.setPreferredSize(new Dimension(1,1));
//        pane.add(button);


    }

}
