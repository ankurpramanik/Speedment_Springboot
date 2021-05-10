package com.ada.speedment.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ada.speedment.model.StudentMarksJoin;
import com.ada.speedment.zdb.training.public_.student.Student;
import com.ada.speedment.zdb.training.public_.student.StudentManager;
import com.ada.speedment.zdb.training.public_.studentmarks.StudentMarks;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;

@RestController
public class StudentController {

	@Autowired
	private StudentManager studentManager;

	@Autowired
	private JoinComponent joinComponent;

	@GetMapping("/GetAllStudents")
	public ResponseEntity<List<Student>> getStudents() {

		List<Student> students = studentManager.stream().collect(Collectors.toList());

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);

	}

	@GetMapping("/GetAllStudentMarks")
	public ResponseEntity<List<StudentMarksJoin>> getAllStudentMarks() {

		Join<Tuple2<Student, StudentMarks>> stuMarks = joinComponent.from(StudentManager.IDENTIFIER)
				.innerJoinOn(StudentMarks.STUDENT_ID).equal(Student.STUDENT_ID).build(Tuples::of);

		List<StudentMarksJoin> stuM = stuMarks.stream().map(sm -> new StudentMarksJoin(

				sm.get0().getStudentId(),

				sm.get0().getStudentName(),

				sm.get0().getAddress(),

				sm.get0().getGuardianName(),

				sm.get0().getEmail(),

				sm.get0().getPhoneNo(),

				sm.get1().getPhysics(),

				sm.get1().getChemistry(),

				sm.get1().getMaths(),

				sm.get1().getEnglish()

		)).collect(Collectors.toList());

		return new ResponseEntity<List<StudentMarksJoin>>(stuM, HttpStatus.OK);

	}

	@GetMapping("/GetAllStudentMarksByStudentId/{studentId}")
	public ResponseEntity<List<StudentMarksJoin>> getStudentMarksByStudentId(
			@PathVariable("studentId") long studentId) {

		Join<Tuple2<Student, StudentMarks>> stuMarks = joinComponent.from(StudentManager.IDENTIFIER)
				.where(Student.STUDENT_ID.equal(studentId))

				.innerJoinOn(StudentMarks.STUDENT_ID).equal(Student.STUDENT_ID)

				.build(Tuples::of);

		List<StudentMarksJoin> stuM = stuMarks.stream().map(sm -> new StudentMarksJoin(

				sm.get0().getStudentId(),

				sm.get0().getStudentName(),

				sm.get0().getAddress(),

				sm.get0().getGuardianName(),

				sm.get0().getEmail(),

				sm.get0().getPhoneNo(),

				sm.get1().getPhysics(),

				sm.get1().getChemistry(),

				sm.get1().getMaths(),

				sm.get1().getEnglish()

		)).collect(Collectors.toList());

		return new ResponseEntity<List<StudentMarksJoin>>(stuM, HttpStatus.OK);

	}

}
