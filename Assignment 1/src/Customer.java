
public class Customer {
	private String name, memberType;
	private boolean member = false;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String type) {
		this.memberType = type;
		setMember(!type.isEmpty());
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nIs member: %s\nMember type: %s", getName(), (isMember() ? "Yes" : "No"), getMemberType());
	}
}
