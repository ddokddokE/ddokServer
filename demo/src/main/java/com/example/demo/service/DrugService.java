package com.example.demo.service;

import com.example.demo.domain.BarCodeData;
import com.example.demo.repository.DrugRepository;
//import com.example.demo.repository.MediRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DrugService {
    private DrugRepository drugRepository;
    public List<BarCodeData> getItemNameList(){
        return drugRepository.findAll();
    }


}



