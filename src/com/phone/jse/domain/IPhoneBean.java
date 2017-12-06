package com.phone.jse.domain;

public class IPhoneBean extends CelPhoneBean{
	private String data;
	
	private final static String KIND = "스마트폰", BRAND = "아이폰" ;
	
	public void setData(String data) {
		setMove("이동");
		this.data = data;
	}
	public String getData() {
		return data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		String super.getCompany();
		CelPhoneBean celPhone = new CelPhoneBean();
		return String.format(" [%s]이기 때문에\n"
						   + " [%s]상태에서\n"
						   + " [%s]으로 [%s]에게\n "
						   + " [%s]이라고 문자를 보냄", 
							KIND, getMove(), BRAND, super.getCall(), getData());
	}
	//[스마트폰]이기 때문에 [이동]상태에서 [아이폰]으로 [홍길동]에게 [안녕]이라고 문자를 보냄 
	//[]안의 값은 변수이다. 
	
	
}
