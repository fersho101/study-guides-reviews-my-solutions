package org.fercho.oca.review04.q07.my.school;

public class Classroom {
	private int roomNumber;
	protected String teacherName;
	static int globalKey = 54321;
	public int floor = 3;

	Classroom(int r, String t) {
		roomNumber = r;
		teacherName = t;
	}
}
