//controlLayer
package com.bl.chemistshop;

import java.util.Date;

public class Application extends Medicine {
	
	public static void main(String[] args) {
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("28/11/2021");
		crocin.expDate = new Date("28/11/2023");
		GluConD gluConD = new GluConD();
		gluConD.mfgDate = new Date("09/01/2021");
		gluConD.expDate = new Date("09/01/2023");
		PantopD pantopD = new PantopD();
		pantopD.mfgDate = new Date("23/12/2021");
		pantopD.expDate = new Date("11/12/2023");
		Aciloc aciloc =	new Aciloc();
		aciloc.mfgDate = new Date("28/11/2021");
		aciloc.expDate = new Date("28/11/2023");
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("28/11/2021");
		disprin.expDate = new Date("28/11/2023");
		
		MedicineStore medicineStore = new MedicineStore();
		
		medicineStore.add(crocin);
		medicineStore.add(gluConD);
		medicineStore.add(pantopD);
		medicineStore.add(aciloc);
		medicineStore.add(disprin);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(medicineStore.getMedicineList());
			
		medicineStore.remove(crocin);
		medicineStore.remove(gluConD);
		
		System.out.println("Printing after removal");
		userInterface.print(medicineStore.getMedicineList());		

		System.out.println("Printing All HOMEOPATHY Medicine");
		userInterface.printAllHomeopathy(medicineStore.getMedicineList());
		
		System.out.println("Printing All ALLOPATHY Medicine'");
		userInterface.printAllAllopathy(medicineStore.getMedicineList());
		
		System.out.println("Printing All AYURVEDIC  Medicine'");
		userInterface.printAllAyurvedic(medicineStore.getMedicineList());
	}
}
