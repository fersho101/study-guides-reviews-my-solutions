package org.fercho.oca.review04.q07.my.city;

import org.fercho.oca.review04.q07.my.school.*;

public class School {
	public static void main(String[] args) {
		System.out.println(Classroom.globalKey);
		Classroom room = new Classroom(101, "Mrs. Anderson");

		System.out.println(room.roomNumber);
		System.out.println(room.floor);
		System.out.println(room.teacherName);
	}
}
