package com.projectpmdb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartNumberModel {
	
	private int id;
	private String part_number;
	private String part_name;
	private int part_stock;
	private int part_uom;
	private String part_date;
	private int satuan_id;
	private String part_date2;
	private String satuan;
	private String cari;
	
	public PartNumberModel(int id, String part_number, String part_name, int part_stock, int part_uom,
			String part_date) {
		
		this.id = id;
		this.part_number = part_number;
		this.part_name = part_name;
		this.part_stock = part_stock;
		this.part_uom = part_uom;
		this.part_date = part_date;
		
		//klik kanan source=>generate constructor using fields, keluar list column, di uncentang part_date2 dan satuan
	}
	
	
	
}
