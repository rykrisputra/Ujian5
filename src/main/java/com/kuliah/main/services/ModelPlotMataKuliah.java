package com.kuliah.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.repository.PlotMataKuliahRepository;

@Service
public class ModelPlotMataKuliah implements ModelPlotMataKuliahInterface{

	@Autowired
	PlotMataKuliahRepository plotMataKuliahRepo;
	
	@Override
	public List<PlotMataKuliah> getAllPlotMataKuliah() {
		// TODO Auto-generated method stub
		return (List<PlotMataKuliah>) this.plotMataKuliahRepo.findAll();
	}

	@Override
	public PlotMataKuliah addPlotMataKuliah(PlotMataKuliah plotmatakuliah) {
		// TODO Auto-generated method stub
		return this.plotMataKuliahRepo.save(plotmatakuliah);
	}

	@Override
	public void deletePlotMataKuliah(String id) {
		// TODO Auto-generated method stub
		this.plotMataKuliahRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public PlotMataKuliah cariPlotMataKuliah(String id) {
		// TODO Auto-generated method stub
		return this.plotMataKuliahRepo.findById(Long.parseLong(id)).get();
	}

}
