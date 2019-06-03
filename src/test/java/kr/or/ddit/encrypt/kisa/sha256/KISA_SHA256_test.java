package kr.or.ddit.encrypt.kisa.sha256;

import static org.junit.Assert.*;

import org.junit.Test;

public class KISA_SHA256_test {

	/**
	 * 
	* Method : sha256Test
	* 작성자 : PC09
	* 변경이력 :
	* Method 설명 : 복호화가 불가능한 hash 알고리즘
	 */
	@Test
	public void sha256Test() {
		/***Given***/
		String plainText = "brown1234";
		
		/***When***/
		//plainText 암호화
		String encrypText = KISA_SHA256.encrypt(plainText);
		
		/***Then***/
		
		
		
	}

}
