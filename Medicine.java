//parentclass
package com.bl.chemistshop;

import java.util.Arrays;
import java.util.Date;

public class Medicine {

	enum Type{
		HOMEOPATHY, ALLOPATHY, AYURVEDIC
	}
	
	Type type;
	String companyName;
	Date mfgDate;
	Date expDate;
	String[] composition;
	@Override
	public String toString() {
		return "Medicine [type=" + type + ", companyName=" + companyName + ", mfgDate=" + mfgDate + ", expDate="
				+ expDate + ", composition=" + Arrays.toString(composition) + "]";
	}	
}