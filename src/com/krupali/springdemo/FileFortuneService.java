package com.krupali.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "src/FortuneData.txt";
	private ArrayList<String> arrayList;

	private Random myRandom = new Random();
	
	public FileFortuneService() {
		
		System.out.println("insdie FileFortuneService constructor");
		
	}
	
	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("inside init of file fortune service");
		File data = new File(fileName);
		System.out.println("Reading fortunes from file: " + data);
		System.out.println("Does file exists?:"+data.exists());
		arrayList = new ArrayList<String>();
		if(data.exists())
		{
			try
			{
				BufferedReader br = new BufferedReader(new FileReader(data));
				String tempLine;
				while((tempLine=br.readLine())!=null)
				{
					System.out.println(tempLine);
					arrayList.add(tempLine);
				}
						
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(arrayList.size());
		
		return arrayList.get(index);
	}

}
