package com.example.springboot.service;

import com.example.springboot.domain.ResponsiveData;
import com.example.springboot.repository.IndexRepository;
import org.jboss.jandex.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {

    private final IndexRepository indexRepository;

    // final 생성자 주입
    public IndexService (IndexRepository indexRepository)  {
        this.indexRepository = indexRepository;
    }
    public List<ResponsiveData> findAllResponsiveData(){
        return indexRepository.findAllResponsiveData();
    }
}
