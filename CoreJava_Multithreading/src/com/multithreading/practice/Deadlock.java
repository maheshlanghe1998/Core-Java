package com.multithreading.practice;

public class Deadlock {

	public static void main(String[] args) {

		final String resource1 = "hii";
		final String resource2 = "hello";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("thread1:locked resource1");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
				}

				synchronized (resource2) {
					System.out.println("thread1:waiting for resource 2");
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("thread2:locked resource1");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
				}

				synchronized (resource1) {
					System.out.println("thread2:waiting for resource 1");
				}
			}
		};

		t1.start();
		t2.start();

	}

}
