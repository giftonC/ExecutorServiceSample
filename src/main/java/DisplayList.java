package main.java;

import java.util.List;

public class DisplayList implements Runnable {

	private List<Model> list ;
	
	public DisplayList(List list) {
		this.list=list;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(Model model:list)
		if("pool-1-thread-3".equalsIgnoreCase(Thread.currentThread().getName()))
		System.out.println(Thread.currentThread().getName()+ "-->"+ model.getCount());

	}

}
