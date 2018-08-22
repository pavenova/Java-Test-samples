package test.main.stackoverflow.pseudohasmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataContainer {
	Map<String, Member> membersMap;
	ArrayList<Attachment> attachments;
	
	public DataContainer() {
		this.membersMap = new HashMap<String, Member>();
		this.attachments = new ArrayList<Attachment>();
	}
	
	public DataContainer(Map<String, Member> membersMap, ArrayList<Attachment> attachments) {
		super();
		this.membersMap = membersMap;
		this.attachments = attachments;
	}

	public Map<String, Member> getMembersMap() {
		return membersMap;
	}

	public void setMembersMap(Map<String, Member> membersMap) {
		this.membersMap = membersMap;
	}

	public ArrayList<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(ArrayList<Attachment> attachments) {
		this.attachments = attachments;
	}
	
	public void addAttachment(Attachment newItem) {
		this.attachments.add(newItem);
	}
	
	public void addMember(Member newMember) {
		this.membersMap.put(newMember.getAddress(), newMember);
	}
	
	public Member getMemberByAddress(String address) {
		return this.membersMap.get(address);
	}
}
