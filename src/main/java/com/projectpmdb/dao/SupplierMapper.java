package com.projectpmdb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.projectpmdb.model.SupplierModel;;

@Mapper
public interface SupplierMapper {

	@Select("SELECT * FROM t_suplier")
    List<SupplierModel> selectAllSupplier();	
	
	@Insert("INSERT INTO t_suplier(nama,alamat,no_tel) VALUES (#{nama},#{alamat},#{no_tel});")
	void addSupplierMapper(SupplierModel supplierModel);
	
	@Delete("DELETE FROM t_suplier WHERE id=#{id}")
	void deleteSupplierMapper(int id);
	
}
