package com.priyashi.mainpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import com.priyashi.anotation.AnnnotationOnMethod;
import com.priyashi.anotation.TypeHeader;

public class UseCustomAnnotation {

	public static void main(String [] args) {
		Class<SetCustomAnnotation> classObject = SetCustomAnnotation.class;
		
		readAnnotation(classObject);
		//To check annotation on method pls uncomenet below line 
		Method [] methods= classObject.getMethods();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("*************************  Method annotation ******************************  ");
		System.out.print("\n");
		System.out.print("\n");
		readAnootationFromMethod(methods);
	}

	private static void readAnootationFromMethod(Method[] methods) {
		try {
			for (Method method : methods) {
				// checks if MethodInfo annotation is present for the method
				if (method
						.isAnnotationPresent(com.priyashi.anotation.AnnnotationOnMethod.class)) {
					try {
						// iterates all the annotations available in the method
						for (Annotation anno : method.getDeclaredAnnotations()) {
							AnnnotationOnMethod ann=(AnnnotationOnMethod) anno;
							System.out.println("Method Developer: " + ann.developer());
							System.out.println("Method Last Modified: " + ann.lastModified());

							// teamMembers returned as String []
							System.out.print("Method Writer Team members: ");
							for (String member : ann.teamMembers())
								System.out.print(member + ", ");
							System.out.print("\n");

							System.out.println("Method Meaning of Life: "+ ann.meaningOfLife());
						}
						
					} catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void readAnnotation(AnnotatedElement element) {
		try {
			System.out.println("Annotation element values: \n");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("*************************  Class annotation ******************************  ");
			System.out.print("\n");
			System.out.print("\n");
			if (element.isAnnotationPresent(TypeHeader.class)) {
				// getAnnotation returns Annotation type
				Annotation singleAnnotation =
						element.getAnnotation(TypeHeader.class);
				TypeHeader header = (TypeHeader) singleAnnotation;

				System.out.println("Developer: " + header.developer());
				System.out.println("Last Modified: " + header.lastModified());

				// teamMembers returned as String []
				System.out.print("Team members: ");
				for (String member : header.teamMembers())
					System.out.print(member + ", ");
				System.out.print("\n");

				System.out.println("Meaning of Life: "+ header.meaningOfLife());
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}


}
