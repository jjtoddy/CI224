package com;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Created by JT on 03/04/2017.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByFirstName(@Param("firstName") String firstName);
    List<Employee> findByLastName(@Param("lastName") String lastName);
    List<Employee> findByJob(@Param("job") String job);
    List<Employee> findByShiftDay(@Param("shiftDay") String shiftDay);
    List<Employee> findByTimeOfShift(@Param("timeOfShift") String timeOfShift);
}