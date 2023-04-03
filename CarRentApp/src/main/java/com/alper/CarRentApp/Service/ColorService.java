package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.Color;
import com.alper.CarRentApp.Repository.view.IColorRepository;
import com.alper.CarRentApp.dto.request.SaveColorRequestDpo;
import com.alper.CarRentApp.mapper.IColorMapper;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ColorService extends ServiceManager<Color,Long> {

    private IColorRepository repository;

    public ColorService(IColorRepository repository){
        super(repository);
        this.repository= repository;
    }

    public Color save(SaveColorRequestDpo dto){
        return save(IColorMapper.INSTANCE.toColor(dto));
    }
}
