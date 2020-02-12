package com.projectpmdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SatuanModel {
  private int id;
  private String name;
  private String cari;
  public SatuanModel(int id, String name) {
	  this.id=id;
	  this.name=name;
  }
}
