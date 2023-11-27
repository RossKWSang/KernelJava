package com.example.kernelJava.domain.schoolproject.controller;

import com.example.kernelJava.domain.schoolproject.model.SubjectGradeDTO;
import com.example.kernelJava.domain.schoolproject.db.Student;
import com.example.kernelJava.domain.schoolproject.service.SchoolProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/school")
@RequiredArgsConstructor
public class SchoolProjectController {

    private final SchoolProjectService schoolProjectService;

    @GetMapping("/student")
    public String getScoreByStudent(
            @RequestParam(name = "student", defaultValue = "김영롱") String studentName,
            Model model
    ) {
        Student student = schoolProjectService.getStudentByName(studentName);
        model.addAttribute(student);
        return "school-student";
    }
    @GetMapping("/subject")
    public String getScoreBySubject(
            @RequestParam(name = "subject", defaultValue = "국어") String subjectName,
            Model model
    ) {
        List<SubjectGradeDTO> subjects = schoolProjectService.getSubjectGradeDtoList(subjectName);
        model.addAttribute("subjects", subjects);
        return "school-subject";
    }
}
