package musicFestival;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Act {
	private String name;
	private int start;
	private int end;
	public Group[] groups;

	public Act(String name, int start, int end, int numOfGroups) {
		this.setEnd(end);
		this.setName(name);
		this.setStart(start);
		groups = new Group[numOfGroups];
	}

	public String getName() {
		return this.name;
	}

	public int getStart() {
		return this.start;
	}

	public int getEnd() {
		return this.end;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z0-9 ]+")) {
			this.name = name;
		} else {
			System.out.println("Invalid act name!");
		}
	}

	public void setStart(int start) {
		if (start > 0 && start <= 23) {
			this.start = start;
		} else {
			System.out.println("Invalid hours!");
		}
	}

	public void setEnd(int end) {
		if (end > 0 && end <= 23) {
			this.end = end;
		} else {
			System.out.println("Invalid minutes!");
		}
	}

	public static void actsInfo(Act ac) {
		System.out.println(
				ac.getName() + " start on Monday at " + ac.getStart() + ":00 and end at " + ac.getEnd() + ":30");
		System.out.println();
		for (int i = 0; i < ac.groups.length; i++) {
			System.out.println("Group :: \t\t" + ac.groups[i].getName());

			if (ac.groups[i].vocalsInGroup != null) {
				for (int j = 0; j < ac.groups[i].vocalsInGroup.length; j++) {
					System.out.println(
							ac.groups[i].getName() + " singer :: \t" + ac.groups[i].vocalsInGroup[j].getName());
				}
			}

			for (int j = 0; j < ac.groups[i].musicplayers.length; j++) {
				System.out
						.println(ac.groups[i].getName() + " musicplayers :: \t" + ac.groups[i].musicplayers[j].getName()
								+ " (" + ac.groups[i].musicplayers[j].getMusicInstrument() + ")");
			}

			for (int j = 0; j < ac.groups[i].songs.length; j++) {
				System.out.println(ac.groups[i].getName() + " songs :: \t\t" + ac.groups[i].songs[j].getTitle());
			}

			System.out.println();

		}

	}

}
