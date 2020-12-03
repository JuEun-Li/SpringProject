package net.skhu.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Register {
    int id;
    int studentId;
    int courseId;
    int grade;
    Date createDate;
    Student student; // 학생 테이블과 조인
    Course course; // 상동
}

