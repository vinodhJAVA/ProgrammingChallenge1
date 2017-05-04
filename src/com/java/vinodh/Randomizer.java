package com.java.vinodh;

import java.util.concurrent.BlockingQueue;
import java.util.Random;

public class Randomizer extends Thread {

	private BlockingQueue<Integer> q1;
	private BlockingQueue<String> q2;

	public void setQ1(BlockingQueue<Integer> q1) {
		this.q1 = q1;
	}

	public void setQ2(BlockingQueue<String> q2) {
		this.q2 = q2;
	}

	public BlockingQueue<Integer> getQ1() {
		return q1;
	}

	public BlockingQueue<String> getQ2() {
		return q2;
	}

	public int generate() {
		Random r = new Random();
		int value;
		return value = 1 + r.nextInt(100);
	}

	public void run() {

		int number = generate();
		
			try {
				q1.put(number);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		if (q2 != null && q2.size() > 0) {
			try{
				String result = q2.take();
				String[] s = result.split(",");
				if(s.length>0){
				System.out.println("Random Number is : " +s[0]+ 
						                "\t Is it Prime number : " + s[1]);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			while (true) {
				try {
					Thread.sleep(2000);
					run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
        }
}
