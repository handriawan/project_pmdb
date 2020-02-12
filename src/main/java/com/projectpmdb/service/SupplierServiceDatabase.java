package com.projectpmdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectpmdb.dao.SupplierMapper;
import com.projectpmdb.model.SupplierModel;

@Service
public class SupplierServiceDatabase implements SupplierService{

	
	@Autowired
	SupplierMapper supplierMapper;
	@Override
	public List<SupplierModel> selectAllSupplier() {
		// TODO Auto-generated method stub
		return supplierMapper.selectAllSupplier();
	}
	@Override
	public void addSupplier(SupplierModel supplierModel) {
		// TODO Auto-generated method stub
		supplierMapper.addSupplierMapper(supplierModel);
	}
	
	@Override
	public void deleteSupplier(int id) {
		// TODO Auto-generated method stub
		supplierMapper.deleteSupplierMapper(id);
	}

}
