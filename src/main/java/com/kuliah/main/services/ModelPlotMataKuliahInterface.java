package com.kuliah.main.services;

import java.util.List;

import com.kuliah.main.entity.PlotMataKuliah;

public interface ModelPlotMataKuliahInterface {
	public List<PlotMataKuliah> getAllPlotMataKuliah();
	
	
	public PlotMataKuliah addPlotMataKuliah(PlotMataKuliah plotmatakuliah);
	
	public void deletePlotMataKuliah(String id);
	
	public PlotMataKuliah cariPlotMataKuliah(String id);

}
