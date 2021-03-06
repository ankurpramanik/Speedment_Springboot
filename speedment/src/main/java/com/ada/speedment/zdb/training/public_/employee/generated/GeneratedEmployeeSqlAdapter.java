package com.ada.speedment.zdb.training.public_.employee.generated;

import static com.speedment.runtime.core.util.ResultSetUtil.getBoolean;
import static com.speedment.runtime.core.util.ResultSetUtil.getInt;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ada.speedment.zdb.training.public_.employee.Employee;
import com.ada.speedment.zdb.training.public_.employee.EmployeeImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

/**
 * The generated Sql Adapter for a {@link
 * com.ada.speedment.zdb.training.public_.employee.Employee} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedEmployeeSqlAdapter implements SqlAdapter<Employee> {
    
    private final TableIdentifier<Employee> tableIdentifier;
    
    protected GeneratedEmployeeSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("Training", "public", "Employee");
    }
    
    protected Employee apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setEmpId(        getInt(resultSet, 1 + offset))
            .setEmpFirstName( resultSet.getString(2 + offset))
            .setEmpLastName(  resultSet.getString(3 + offset))
            .setEmpAddress(   resultSet.getString(4 + offset))
            .setPhoneNo(      resultSet.getString(5 + offset))
            .setEmail(        resultSet.getString(6 + offset))
            .setActive(       getBoolean(resultSet, 7 + offset))
            ;
    }
    
    protected EmployeeImpl createEntity() {
        return new EmployeeImpl();
    }
    
    @Override
    public TableIdentifier<Employee> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Employee> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Employee> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}