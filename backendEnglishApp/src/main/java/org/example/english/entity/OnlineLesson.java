package org.example.english.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="online_lessons")
public class OnlineLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String lessonName;

    @Column(nullable = false)
    private String teacherName;  // Имя преподавателя

    @Column(nullable = false)
    private String lessonTime;  // Время проведения урока

    @Column(nullable = false)
    private String teacherTime;  // Время работы преподавателя

    @Column(nullable = false)
    private String level;  // Уровень (например, beginner, intermediate, advanced)

    @Column(nullable = false)
    private String lessonType;  // Тип урока (например, индивидуальный или групповой)

    @Column(nullable = false)
    private String platform;  // Платформа для проведения урока (например, Zoom, Skype)

    @Column(nullable = false)
    private String lessonLink;  // Ссылка на урок

    @Column(nullable = true)
    private String recordingLink;  // Ссылка на запись урока (если доступно)

    @Column(nullable = true)
    private String description;  // Описание урока

    @Column(nullable = false)
    private int maxStudents;  // Максимальное количество студентов

    @Column(nullable = false)
    private double price;  // Цена за урок
}
