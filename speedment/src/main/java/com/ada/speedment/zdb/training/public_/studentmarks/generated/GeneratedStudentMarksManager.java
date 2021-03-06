package com.ada.speedment.zdb.training.public_.studentmarks.generated;

import com.ada.speedment.zdb.training.public_.studentmarks.StudentMarks;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.ada.speedment.zdb.training.public_.studentmarks.StudentMarks} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStudentMarksManager extends Manager<StudentMarks> {
    
    TableIdentifier<StudentMarks> IDENTIFIER = TableIdentifier.of("Training", "public", "StudentMarks");
    List<Field<StudentMarks>> FIELDS = unmodifiableList(asList(
        StudentMarks.MARKS_ID,
        StudentMarks.STUDENT_ID,
        StudentMarks.PHYSICS,
        StudentMarks.CHEMISTRY,
        StudentMarks.MATHS,
        StudentMarks.ENGLISH
    ));
    
    @Override
    default Class<StudentMarks> getEntityClass() {
        return StudentMarks.class;
    }
}