package com.example.kernelJava.domain.schoolproject.service;

import com.example.kernelJava.domain.schoolproject.business.BasicGrade;
import com.example.kernelJava.domain.schoolproject.business.MajorGrade;
import com.example.kernelJava.domain.schoolproject.business.PassFailGrade;
import com.example.kernelJava.domain.schoolproject.model.SubjectGradeDTO;
import com.example.kernelJava.domain.schoolproject.business.strategy.BasicStrategy;
import com.example.kernelJava.domain.schoolproject.business.strategy.MajorStrategy;
import com.example.kernelJava.domain.schoolproject.business.strategy.PassFailStrategy;
import com.example.kernelJava.domain.schoolproject.db.*;
import com.example.kernelJava.domain.schoolproject.repository.SchoolRepository;
import com.example.kernelJava.domain.schoolproject.repository.StudentRepository;
import com.example.kernelJava.domain.schoolproject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SchoolProjectService {
    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    public School getSchoolById(Long id) {return schoolRepository.findById(1L).get();}

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public Subject getSubjectByName(String name) { return subjectRepository.findByName(name); }

    public List<SubjectGradeDTO> getSubjectGradeDtoList(String name) {
        List<SubjectGradeDTO> result = new ArrayList<>();
        Subject subject = subjectRepository.findByName(name);
        List<Score> scores = subject.getScores();
        for (int i=0; i < scores.size(); i++) {
            Score score = scores.get(i);
            Student student = score.getStudent();
            result.add(SubjectGradeDTO.builder()
                            .studentName(student.getName())
                            .studentId(student.getId())
                            .majorSubject(student.getMajorSubject().toString())
                            .score(score.getSubjectMark())
                            .grade(getGrade(score.getSubjectMark(), student.getMajorSubject().toString(), score.getSubject().getId()))
                    .build());
        }
        return result;
    }

    public String getGrade(int score, String majorSubject, Long subjectId) {
        if (majorSubject.equals("KOREAN") && subjectId == 100L || majorSubject.equals("MATH") && subjectId == 200L) {
            return new MajorGrade(score, new MajorStrategy()).getGrade();
        }
        if (subjectId == 300L) {
            return new PassFailGrade(score, new PassFailStrategy()).getGrade();
        }
        return new BasicGrade(score, new BasicStrategy()).getGrade();
    }

}
