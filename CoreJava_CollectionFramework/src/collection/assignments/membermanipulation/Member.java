package collection.assignments.membermanipulation;

public class Member {

	private int memberId;
	private String memberName;
	private String address;
	
	public Member(int memberId, String memberName, String address) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.address = address;
	}

	public Member() {
		
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
