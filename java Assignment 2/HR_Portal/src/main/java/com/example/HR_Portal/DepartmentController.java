package com.example.HR_Portal;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    public DepartmentService departmentService;

    
@GetMapping
public String getAllDepartments(Model model){
    List<Department>departments=departmentService.getAllDepartments();
    model.addAttribute("departments", departments);
    return "department-list";

}

@GetMapping("/add")
public String showAddDepartmentForm(Model model){
    model.addAttribute("department",new Department());
    return "department-form";
}

@GetMapping("/edit/{id}")
public String showEditDepartmentForm(@PathVariable Long id,Model model){
    Optional<Department>department=departmentService.getDepartmentById(id);
    if(department.isPresent()){
        model.addAttribute("department", department.get());
    
    return "department-form";
    }
    else{
        return "redirect:/departments";
    }
}

@PostMapping("/save")
public String saveDepartment(@ModelAttribute("department")Department department){
departmentService.saveDepartment(department);
return "redirect:/departments";
}

@GetMapping("/delete/{id}")
public String deleteDepartment(@PathVariable Long id,RedirectAttributes redirectAttributes){
    try{
            departmentService.deleteDepartment(id);
            redirectAttributes.addFlashAttribute("message", "Department deleted successfully.");

    }catch(NoSuchElementException e){
            redirectAttributes.addFlashAttribute("errorMessage", "Department not found.");
    }catch(Exception e){
            redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while deleting the department.");
    }
    return "redirect:/departments";
}

}
