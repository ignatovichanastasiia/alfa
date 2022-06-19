package ru.ignatovichanastasiia.alfa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.ignatovichanastasiia.alfa.outserve.infc.CourseOutserve;
import ru.ignatovichanastasiia.alfa.outserve.infc.GifOutserve;
import ru.ignatovichanastasiia.alfa.service.infc.CourseService;

/**
 *
 * @author ignatovichanastasiia
 */
@Qualifier("CourseService")
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    @Qualifier("CourseOutserve")
    private CourseOutserve courseout;
    @Autowired
    @Qualifier("GifOutserve")
    private GifOutserve gifout;

    @Override
    public String getGif(String id) {
        Double courseToThisDay = getCourseToThisDay(id);
        Double courseToYesterday = getCourseToYesterday(id);
        Boolean vector = false;
        if (courseToThisDay >= courseToYesterday) {
            vector = true;
        }
        return gifout.getUpOrDownGif(vector);
    }
    
    
    @Override
    public String getGifJS(String id){
        return getGif(id);
    }

    @Override
    public String getJsonGif(String id) {
        Double courseToThisDay = getCourseToThisDay(id);
        Double courseToYesterday = getCourseToYesterday(id);
        Boolean vector = false;
        if (courseToThisDay >= courseToYesterday) {
            vector = true;
        }
        return gifout.getUpOrDownJsonGif(vector);
    }

    private Double getCourseToThisDay(String id) {
        Double crs = courseout.getCourseToThisDay(id);
        if(crs==null){
            throw new NullPointerException("Double (this day course) is null");
        }
        return crs;
    }

    private Double getCourseToYesterday(String id) {
        Double crsY = courseout.getCourseToYesterday(id);
        if(crsY==null){
            throw new NullPointerException("Double (yesterday course) is null");
        }
        return crsY;
    }

}
