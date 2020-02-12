package com.projectpmdb.service;

import java.util.List;

import com.projectpmdb.model.PartNumberModel;

public interface PartNumberService {
	
	List<PartNumberModel> selectAll();             //nga pake parameter krn list PN
	void addPartNumber(PartNumberModel partNumberModel);
	void updatePartNumber(PartNumberModel partNumberModel);
	void deletePartNumber(int idPartNumber);
	
	PartNumberModel selectView(int idPartNumber);  //parameter id krn satu PN, baiknya 1 form 1 service, spt edit dan view buat masing2 service 
	PartNumberModel getView(int id);
    
	List<PartNumberModel> getCariBarang(String part_name);
	
	List<PartNumberModel> selectDate(String date1,String date2); 

	List<PartNumberModel> selectByDate(String date1, String date2); 
	

}
