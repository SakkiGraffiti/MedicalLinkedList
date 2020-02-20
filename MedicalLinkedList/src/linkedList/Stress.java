package linkedList;

public class Stress {
	private int refNo;
	private String type;
	private float amt;
	
	public Stress() {
		super();
		
	}

	public Stress(int refNo, String type, float amt) {
		super();
		this.refNo = refNo;
		this.type = type;
		this.amt = amt;
	}
	
	public Stress(Stress Strs) {
		super();
		this.refNo = Strs.refNo;
		this.type = Strs.type;
		this.amt = Strs.amt;
	}
	
	
	public int getRefNo() {
		return refNo;
	}
	
	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public float getAmt() {
		return amt;
	}
	
	public void setAmt(float amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Stress [refNo= " + refNo + ", " + (type != null ? "type= " + type + ", " : "") + "amt= " + amt + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
		

}
