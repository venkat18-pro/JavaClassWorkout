package com.java.allclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	public String name;
	public int id;
	
	public Demo(String name, int id){
		this.name = name;
		this.id = id;
	}
}

public class SeriAndDesri {

	public static void main(String[] args) {
		Demo obj = new Demo("venkat", 49);  
		String fileName = "venkatesh.txt"; 
		
		try {
			FileOutputStream fileStream = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileStream);
			
			out.writeObject(obj);
			
			out.close();
			fileStream.close();
			
			System.out.println("Object has been Serializable.");
			
		}catch(IOException e) {
			System.out.println("IOException.");
		}
		
		Demo obj1 = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			obj1 = (Demo)in.readObject();
			
			in.close();
			file.close();
		}catch(Exception e) {
			System.out.println("Exception.");
		}
		System.out.println("Object ahs been Desrializable.");
		System.out.println("Name: "+obj1.name);
		System.out.println("ID: "+obj1.id);
	}
	

}
