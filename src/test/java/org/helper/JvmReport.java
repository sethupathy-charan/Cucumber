package org.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jasonpath) {
		File f = new File("D:\\Eclipse\\Workspace\\CucumberProject\\src\\test\\resources\\Reports\\JVM\\JVMreport.jvm");
		
		List<String> s=new ArrayList<>();
		s.add(jasonpath);
		
		Configuration c=new Configuration(f, jasonpath);
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("OS", "Windows 10");
	
		
		ReportBuilder r=new ReportBuilder(s,c);
		r.generateReports();
	}
       
}
