package test.main.objects;

import java.util.ArrayList;

import test.main.common.Member;

public class ObjectsUtils {

	public static void membersCheckEqualOverride() {
		ArrayList<Member> members = new ArrayList<Member>();
	
		members.add(new Member("John", 21));
		members.add(new Member("Lucy", 25));
		members.add(new Member("Willi", 40));
	
		Member finding = new Member("Willi", 0);
	
		System.out.println(members.contains(finding));
	
		for (Member itm : members) {
			if (itm.getName().equals(finding.getName())) {
				System.out.println("found");
			}
		}
	}

}
