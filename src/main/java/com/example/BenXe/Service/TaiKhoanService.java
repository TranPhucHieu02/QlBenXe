package com.example.BenXe.Service;

import com.example.BenXe.Model.TaiKhoan;
import com.example.BenXe.Repository.ITaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanService {
    @Autowired
    private ITaiKhoanRepository taiKhoanRepository;
    public List<TaiKhoan> getAllTaiKhoan(){
        return taiKhoanRepository.findAll();
    }

}
