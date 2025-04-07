package org.clover;

@CourseInfoAnnotation(name = "语文",courseIndex = 1,courseProfile = "",courseTag = "文科")
public class CloverCourse {
    @PersonInfoAnnotation(name = "clover",age = 21,gender = "男",languages = {"java"})
    private String author;

    @CourseInfoAnnotation(name = "语文",courseIndex = 1,courseProfile = "",courseTag = "文科")
    public void getCourseInfo(){
    }
}
