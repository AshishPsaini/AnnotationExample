package com.priyashi.mainpackage;

import java.util.Calendar;

import com.priyashi.anotation.AnnnotationOnMethod;
import com.priyashi.anotation.TypeHeader;

//This is the annotation being applied to a class
@TypeHeader(developer = "Yo Yo ",lastModified = ""+Calendar.DAY_OF_MONTH+"/"+Calendar.MONTH+"/"+Calendar.YEAR,
teamMembers = { "Ashish Saini ", "Pooja Joshi ", "Priya" },
meaningOfLife = 42)
public class SetCustomAnnotation {
	
	
	@AnnnotationOnMethod(developer = "Method developer my yoyo",lastModified = ""+Calendar.DAY_OF_MONTH+"/"+Calendar.MONTH+"/"+Calendar.YEAR,
			teamMembers = { "Ashish Saini ","Priya", "Pooja Joshi " ,"Gurmi"},
			meaningOfLife = 52)
	public void  annotationOnMethod()
	{
		System.out.println ("/n method " );
		
		
	}

}
