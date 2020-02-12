package com.projectpmdb.service;

import java.util.List;

import com.projectpmdb.model.SupplierModel;

public interface SupplierService {

	List<SupplierModel> selectAllSupplier();
	void addSupplier(SupplierModel supplierModel);
	void getSupplier
	void deleteSupplier(int id);
}
