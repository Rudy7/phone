
package com.phone.jse.domain;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class PhoneController {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null;
		IPhoneBean iPhone = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[MENU]\n"
											+ "0.전화끊기\n "
											+ "1.전화걸기\n "
											+ "2.휴대폰\n"
											+ "3.아이폰")) { 
			case "0":
				JOptionPane.showMessageDialog(null, "연결이 끊었습니다.");
				return;                  // 0이면 종료라서 무조건 리턴이다.  실수함. 
			case "1":
				// 어디 제품? -> 금성전화기
				// 누구에게 겁니까?
				// 답 : [금성 전화기]으로, [홍길동]에게 전화를 걸다.
				phone = new PhoneBean();
				phone.setCompany(JOptionPane.showInputDialog("어디제품?"));
				phone.setCall(JOptionPane.showInputDialog("누구에게 겁니까?"));
				JOptionPane.showMessageDialog(null,                                 //phoneBean.getCall()은  빈클래스의 (~에게 전화를 걸다)부분을 포함하게 된다. 
						phone.toString());
//						phone.getCompany() +"을 가지고,\t "+ phone.getCall());
				break;
			case "2":
				// 휴대폰 맞습니까?(맞으면 true, 틀리면 false)
				// 어디 제품? -> 노키아 휴대폰
				// 누구에게 겁니까?
				// 답 : [정지]상태에서 [노키아] 휴대폰으로 [홍길동]에게 전화를 걸다.
				celPhone = new CelPhoneBean();
				celPhone.setMove(  (JOptionPane.showInputDialog("휴대폰 맞습니까? (맞으면 y, 틀리면 n)").equals("y"))      ? "이동중에" : "정지중에");
				celPhone.setCompany(JOptionPane.showInputDialog("어디 제품?"));   //휴대폰이 맞으면 이동중에./  휴대폰이 아니면 정지중에 메시지를 호출하고 싶어서 삼항연사자를 이용한다. 
				celPhone.setCall(JOptionPane.showInputDialog("누구에거 겁니까?"));
				JOptionPane.showMessageDialog(null, 
									  celPhone.toString());
//									  celPhone.getMove()
//									+ celPhone.getCompany()
//									+ celPhone.getCall());
//			
			case "3":
				// 누구에게 문자 보냅니까?
				// 뭐라고 보낼까요?

				//[스마트폰]이기 때문에 [이동]상태에서 [아이폰]으로 [홍길동]에게 데이터를 써써 
				//[안녕]이라고 문자를 보냄 
				iPhone = new IPhoneBean();
				iPhone.setCall(JOptionPane.showInputDialog("누구에게 문자 보냅니까?"));
				iPhone.setData(JOptionPane.showInputDialog("뭐라고 보낼까요?"));   //휴대폰이 맞으면 이동중에./  휴대폰이 아니면 정지중에 메시지를 호출하고 싶어서 삼항연사자를 이용한다. 
				JOptionPane.showMessageDialog(null, iPhone.toString());
				
				
				break;

			}
		}

	}

}		
		
		

