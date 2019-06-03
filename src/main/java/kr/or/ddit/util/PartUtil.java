package kr.or.ddit.util;

public class PartUtil {

	
	/**
	 * 
	* Method : getFileName
	* 작성자 : PC09
	* 변경이력 :
	* @param contentDisposition
	* @return
	* Method 설명 : contentDisposition에서 파일명을 반환한다
	 */
	public static String getFileName(String contentDisposition) {
		// form-data; name="profile"; filename="sally.png"
		String[] splited = contentDisposition.split("; ");
		for(String split : splited)
			if(split.startsWith("filename=")) {
				int startIndex = split.indexOf("\"")+1;
				int lastIndex = split.lastIndexOf("\"");
				return split.substring(startIndex, lastIndex);//이상 ,미만
			}
		
		return "";

	}

	/**
	 * 
	* Method : getExt
	* 작성자 : PC09
	* 변경이력 :
	* @param fileName
	* @return
	* Method 설명 : 파일명으로부터 파일 확장자를 반환
	 */
	public static String getExt(String fileName) {
		
//		String[] splited = fileName.split("\\.");
//		if(splited.length == 1)
//			return "";
//		else 
//			return splited[splited.length-1];
		
		//lastIndexOf()는 찾는 문자가 없으면 -1을 반환
		int startIndex = fileName.lastIndexOf(".")+1;
		
		if(startIndex == 0)
			return "";
		else
			return fileName.substring(startIndex);
			
		
		
		
	}
	
	
	
	
	
}
