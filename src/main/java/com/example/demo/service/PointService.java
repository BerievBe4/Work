package com.example.demo.service;

import com.example.demo.model.Point;
import com.example.demo.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {


    private final PointRepository pointRepository;

    @Autowired
    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }



    public Point getPoint(Integer id){
        return this.pointRepository.findById(id).orElse(null);
    }

    public List<Point> getPoints(){
        return this.pointRepository.findAll();
    }

    public Point savePoint(Point point){
        return this.pointRepository.save(point);
    }

    public void deletePoint(Integer id){
        this.pointRepository.deleteById(id);
    }
}
