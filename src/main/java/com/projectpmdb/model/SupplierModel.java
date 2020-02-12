package com.projectpmdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierModel {
	private int id;
	private String nama;
	private String alamat;
    private String no_tel;
    
}
