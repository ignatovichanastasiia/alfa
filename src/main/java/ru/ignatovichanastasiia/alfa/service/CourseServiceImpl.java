
package ru.ignatovichanastasiia.alfa.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ignatovichanastasiia.alfa.controller.CourseController;
import ru.ignatovichanastasiia.alfa.outserve.CourseOutserveImpl;
import ru.ignatovichanastasiia.alfa.outserve.GifOutserveImpl;
import ru.ignatovichanastasiia.alfa.service.infc.CourseService;

/**
 *
 * @author ignatovichanastasiia
 */
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseController controller;
    @Autowired
    private CourseOutserveImpl courseout;
    @Autowired
    private GifOutserveImpl gifout;

    //�������� string � ������� �����
    @Override
    public String getInformation(String id){
        Double courseToThisDay = getCourseToThisDay(id);
        Double courseToYesterday = getCourseToYesterday(id);
        Boolean vector = false;
        if(courseToThisDay>=courseToYesterday){
            vector = true;
        }
        return getGif(vector);
    }
    
    //�����, ���������� ������ �� out ������ (�������� ���� �� �������)
    private Double getCourseToThisDay(String id){
        return courseout.getCourseToThisDay(id);
    }
    
    //�����, ���������� ������ �� out ������ (�������� ���� �� �����)
    private Double getCourseToYesterday(String id){
        return courseout.getCourseToYesterday(id);
    }
    
    //�����, ���������� ������ �� out �����
    private String getGif(Boolean vector){
        return gifout.getGif(vector);
    }

}
