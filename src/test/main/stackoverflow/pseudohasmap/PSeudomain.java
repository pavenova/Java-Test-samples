package test.main.stackoverflow.pseudohasmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PSeudomain {
	
	public static void fillMap() {
		Map<String, Member> membersMap= new HashMap<String, Member>();
		Member newMember = new Member("fooo Name", "fooo@whatever.foo");
		membersMap.put(newMember.getAddress(), newMember);
		
		Attachment newAtatchment = new Attachment("fooattach", "something");
		ArrayList<Attachment> attachments = new ArrayList<>();
		attachments.add(newAtatchment);
		
		
		DataContainer data = new DataContainer(membersMap, attachments);
		
		data.addMember(new Member("anotherMember", "fooo@foooo.foo"));
		data.addAttachment(new Attachment("another attachmetn", "anotherAtt value"));
	}

}
