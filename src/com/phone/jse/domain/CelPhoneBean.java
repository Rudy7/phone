package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{  //셀룰러폰 의 약자. 핸드폰을 의미,  extends는 3인칭이다. 동사로
//	private boolean portable;  //포터블은 이동할 수 있다는 뜻이다.
	private String move;
//	private boolean portable;
//	
//	public void setPortable(boolean portable) { 
//		if(portable) {
//			this.setMove("이동 상채에서...");
//		}else {
//			this.setMove("정지 상태에서...");
//		}
//		this.portable = portable;
//	}
//	public boolean isPortable() {                  //블린의 경우는 get 대신에 is를 쓴다. 문법은 아니지만 미국얘들은 이렇게 한다. 
//		return portable;
//	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	@Override
	public String toString() {
		return String.format(
				"[%s] 상태에서\n"+
				"[%s] 휴대폰을 가지고,\n"+ 
				"[%s] 에게 전화를 걸다\n"
				,getMove(), getCompany(), getCall());
				
	}
	
	
}
