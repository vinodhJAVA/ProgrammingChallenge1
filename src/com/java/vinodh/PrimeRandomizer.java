package com.java.vinodh;

import java.util.concurrent.BlockingQueue;

public class PrimeRandomizer extends Thread {

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

	public boolean isPrime(int num) {
		int temp;
		if (num == 1) {
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void run() {
		if (q1 != null && q1.size() > 0) {
			try {
				int num = q1.take();
				if (isPrime(num)) {
					q2.put(num + "," + true);
				} else {
					q2.put(num + "," + false);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			run();
		}
	}
}
