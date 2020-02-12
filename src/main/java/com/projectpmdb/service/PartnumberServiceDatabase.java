package com.projectpmdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectpmdb.dao.PartNumberMapper;
import com.projectpmdb.model.PartNumberModel;

@Service
public class PartnumberServiceDatabase implements PartNumberService{

	@Autowired
	PartNumberMapper partNumberMapper;
	
	@Override
	public List<PartNumberModel> selectAll() {
		// TODO Auto-generated method stub
		return partNumberMapper.ambilSemua();
	}

	@Override
	public void addPartNumber(PartNumberModel partNumberModel) {
		// TODO Auto-generated method stub
        partNumberMapper.simpanData(partNumberModel);
	}

	@Override
	public void updatePartNumber(PartNumberModel partNumberModel) {
		partNumberMapper.updateData(partNumberModel);
	}

	@Override
	public void deletePartNumber(int idPartNumber) {
		partNumberMapper.deleteData(idPartNumber);
		
	}

	@Override
	public PartNumberModel selectView(int idPartNumber) {
		// TODO Auto-generated method stub
		return partNumberMapper.selectId(idPartNumber);
	}

	

	@Override
	public List<PartNumberModel> selectByDate(String date1, String date2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartNumberModel getView(int id) {
		// TODO Auto-generated method stub
		return partNumberMapper.selectView(id);
	}

	@Override
	public List<PartNumberModel> selectDate(String date1, String date2) {
		// TODO Auto-generated method stub
		return partNumberMapper.ambilDate(date1, date2);
	}

	@Override
	public List<PartNumberModel> getCariBarang(String part_name) {
		// TODO Auto-generated method stub
		return partNumberMapper.ambilNamaBarang('%'+part_name+'%');
		
	}

}

