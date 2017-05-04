package com.java.vinodh;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> q1 = new LinkedBlockingQueue<Integer>();
		BlockingQueue<String> q2 = new LinkedBlockingQueue<String>();

		PrimeRandomizer p = new PrimeRandomizer();
		p.setQ1(q1);
		p.setQ2(q2);
		Randomizer r = new Randomizer();
		r.setQ1(q1);
		r.setQ2(q2);
		System.out.println("Checking with Random numbers from 1-100 "
				+ "whether Prime or not ");
		
		r.start();
		p.start();
		Thread.sleep(5000);

	}
}
