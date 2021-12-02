//datalayaer
package com.bl.chemistshop;

import java.util.ArrayList;
import java.util.List;

public class MedicineStore extends Medicine {		
	private List<Medicine> medicineList = new ArrayList();
	
    public List getMedicineList() {
    	return medicineList;
    }
	
	public void add(Medicine medicine){
		medicineList.add(medicine);
	}
	
	public void remove(Medicine medicine){
		medicineList.remove(medicine);
	}
}
