package com.ada.speedment.zdb.training.public_.student.generated;

import com.ada.speedment.zdb.training.public_.student.Student;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.ada.speedment.zdb.training.public_.student.Student}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStudentImpl implements Student {
    
    private long studentId;
    private String studentName;
    private String address;
    private String guardianName;
    private String email;
    private String phoneNo;
    private boolean active;
    
    protected GeneratedStudentImpl() {}
    
    @Override
    public long getStudentId() {
        return studentId;
    }
    
    @Override
    public String getStudentName() {
        return studentName;
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    @Override
    public String getGuardianName() {
        return guardianName;
    }
    
    @Override
    public String getEmail() {
        return email;
    }
    
    @Override
    public String getPhoneNo() {
        return phoneNo;
    }
    
    @Override
    public boolean getActive() {
        return active;
    }
    
    @Override
    public Student setStudentId(long studentId) {
        this.studentId = studentId;
        return this;
    }
    
    @Override
    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }
    
    @Override
    public Student setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public Student setGuardianName(String guardianName) {
        this.guardianName = guardianName;
        return this;
    }
    
    @Override
    public Student setEmail(String email) {
        this.email = email;
        return this;
    }
    
    @Override
    public Student setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    
    @Override
    public Student setActive(boolean active) {
        this.active = active;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("studentId = "    + Objects.toString(getStudentId()));
        sj.add("studentName = "  + Objects.toString(getStudentName()));
        sj.add("address = "      + Objects.toString(getAddress()));
        sj.add("guardianName = " + Objects.toString(getGuardianName()));
        sj.add("email = "        + Objects.toString(getEmail()));
        sj.add("phoneNo = "      + Objects.toString(getPhoneNo()));
        sj.add("active = "       + Objects.toString(getActive()));
        return "StudentImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Student)) { return false; }
        final Student thatStudent = (Student)that;
        if (this.getStudentId() != thatStudent.getStudentId()) { return false; }
        if (!Objects.equals(this.getStudentName(), thatStudent.getStudentName())) { return false; }
        if (!Objects.equals(this.getAddress(), thatStudent.getAddress())) { return false; }
        if (!Objects.equals(this.getGuardianName(), thatStudent.getGuardianName())) { return false; }
        if (!Objects.equals(this.getEmail(), thatStudent.getEmail())) { return false; }
        if (!Objects.equals(this.getPhoneNo(), thatStudent.getPhoneNo())) { return false; }
        if (this.getActive() != thatStudent.getActive()) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getStudentId());
        hash = 31 * hash + Objects.hashCode(getStudentName());
        hash = 31 * hash + Objects.hashCode(getAddress());
        hash = 31 * hash + Objects.hashCode(getGuardianName());
        hash = 31 * hash + Objects.hashCode(getEmail());
        hash = 31 * hash + Objects.hashCode(getPhoneNo());
        hash = 31 * hash + Boolean.hashCode(getActive());
        return hash;
    }
}