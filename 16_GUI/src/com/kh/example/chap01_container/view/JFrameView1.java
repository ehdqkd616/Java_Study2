package com.kh.example.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// 컨테이너 생성 방법 1 : JFrame 상속
public class JFrameView1 extends JFrame{
	
	public JFrameView1() {
		
		// 프레임 이름 지정 2 : 부모 셍상자 이용
		super("super 이름 지정");
		
		// 프레임 크기 지정
		this.setSize(800, 500);
		
		// 프레임을 보이게 설정
		setVisible(true);
		
		// 닫기 버튼을 눌렀을 때 프로세스도 함께 종료가 되도록 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 추가적인 설정
		// 프레임 위치 설정
		setLocation(300, 200);
		
		// 크기와 위치를 한 번에 지정
		setBounds(300, 200, 800, 500);
		
		// 프레임 이름 지정 1 : setTitle() 이용
		setTitle("My First Frame");
		
		// 프레임 로고 지정
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 프레임 사이즈 조정
		setResizable(false);
		
		
		
		
	}

	
}
