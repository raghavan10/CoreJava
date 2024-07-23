package com.ronit.assignment5;

public class TaskScheduler {

	public void scheduleTask(Task task, int interval) {
		new Thread(() -> {
		      while (interval >= 0) {
		        try {
		          task.execute();
		          Thread.sleep(interval * 1000); 
		        } catch (Exception e) {
		          System.out.println("Exception raised "+e.getMessage());
		          break;
		        }
		      }
		    }).start();
		
	}

}
