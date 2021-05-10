package com.ada.speedment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentMarksJoin {

	private long studentId;
	private String studentName;
	private String address;
	private String guardianName;
	private String email;
	private String phoneNo;
	private long physics;
	private long chemistry;
	private long math;
	private long english;

}
