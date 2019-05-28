package kr.or.ddit.lprod.model;

public class LprodVO {

	private int lprodId;
	private String lprodGu;
	private String lprodNm;
	
	
	public LprodVO(int id, String gu, String nm) {
		super();
		this.lprodId=id;
		this.lprodGu=gu;
		this.lprodNm=nm;
	}
	
	public int getLprodId() {
		return lprodId;
	}
	public void setLprodId(int lprodId) {
		this.lprodId = lprodId;
	}
	public String getLprodGu() {
		return lprodGu;
	}
	public void setLprodGu(String lprodGu) {
		this.lprodGu = lprodGu;
	}
	public String getLprodNm() {
		return lprodNm;
	}
	public void setLprodNm(String lprodNm) {
		this.lprodNm = lprodNm;
	}
	@Override
	public String toString() {
		return "LprodVO [lprodId=" + lprodId + ", lprodGu=" + lprodGu + ", lprodNm=" + lprodNm + "]";
	}
	
	
	
	
	
	
	
	
	
}
