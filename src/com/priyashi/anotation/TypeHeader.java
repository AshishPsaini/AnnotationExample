package com.priyashi.anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// This is the annotation to be processed
//Default for Target is all Java Elements
//Change retention policy to RUNTIME (default is CLASS)

//@Target(ElementType.METHOD) ............if we apply anotation on method 
//@Target(ElementType.FIELD)..............annotation for Class filed or class member 
//@Target(ElementType.PACKAGE).............annotation package 
///By default it apply on class ..........i am using default ElementType as a class
@Retention(RetentionPolicy.RUNTIME)

public @interface TypeHeader {
//Default value specified for developer attribute
String developer() default "Ashish Saini";
String lastModified();
String [] teamMembers();
int meaningOfLife();
}