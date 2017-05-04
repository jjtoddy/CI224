package com;

/**
 * Created by JT on 01/05/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employees/findByFirstname/{firstName}", method = RequestMethod.GET)
    public List<Employee> findByFirstName(@PathVariable("firstName") String firstName){
        return employeeRepository.findByFirstName(firstName);
    }

    @RequestMapping(value = "/employees/findByLastName/{lastName}", method = RequestMethod.GET)
    public List<Employee> findByLastName(@PathVariable("lastName") String lastName){
        return employeeRepository.findByLastName(lastName);
    }

    @RequestMapping(value = "/employees/findByJob/{date}", method=RequestMethod.GET)
    public List<Employee> findByJob(@PathVariable("date") String job){
        return employeeRepository.findByJob(job);
    }

    @RequestMapping(value = "/employees/findByShift/{shift}", method=RequestMethod.GET)
    public List<Employee> findByshift(@PathVariable("shift") String shiftDay){
        return employeeRepository.findByShiftDay(shiftDay);
    }
    @RequestMapping(value = "/employees/findByTimeOfShift/{shift}", method=RequestMethod.GET)
    public List<Employee> findByTimeOfShift(@PathVariable("shift") String timeOfShift){
        return employeeRepository.findByTimeOfShift(timeOfShift);
    }
}