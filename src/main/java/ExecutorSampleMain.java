package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSampleMain {

	public static void main(String args[]) {
		
		ArrayList<Model> modelList = new ArrayList<Model>();
		
		for(int i=1 ;i<=300;i++) {
			
			Model model = new Model();
			model.setCount(i);
			model.setStatus("Pending");
			modelList.add(model);
		}
		
		List<Model>[]  modelListArray = new List[3];
		List<Model> firstList=  modelList.subList(0, 100);
		List<Model> secondList=  modelList.subList(100, 200);
		List<Model> thirdList=  modelList.subList(200, 300);
		modelListArray[0]=firstList;
		modelListArray[1]=secondList;
		modelListArray[2]=thirdList;
		
		
		ExecutorService executor =Executors.newFixedThreadPool(3);
		
			for(List<Model> model: modelListArray) {
				executor.execute(new DisplayList(model));
			}
			
	}
	
	
	
}
