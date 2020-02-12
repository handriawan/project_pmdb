package com.projectpmdb.service;

import java.util.List;
import com.projectpmdb.model.SatuanModel;


public interface SatuanService {
   List<SatuanModel> selectAllSatuan();
   void addSatuan(SatuanModel satuanModel);
   
   SatuanModel getIdSatuan(int id);
   SatuanModel getEdit(int id);
   void deleteSatuan(int satuan);
   void updatedSatuan(SatuanModel satuanModel);
   List<SatuanModel>cariSatuan(String cari); 
}
