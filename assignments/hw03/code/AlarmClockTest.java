// package alarmClock;
//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.Scanner;
public class AlarmClockTest {
	public static void main(String[] args) {
		AlarmClock clock = new AlarmClock();
		Scanner input = new Scanner(System.in);
		System.out.print("Please set an alarm: ");
		int alarmTime = input.nextInt();
		clock.setAlarmTime(alarmTime);
		clock.setAlarmState(true);
		while (clock.getAlarmState()) {
			clock.forwardTime(10);
			if (clock.isRinging()) {
				System.out.println("Ringing!");
				System.out.println("What should we do [1-2]?");
				System.out.printf("\t1. Snooze\n");
				System.out.printf("\t2. Dismiss\n");
				int action = input.nextInt();
				switch (action) {
					case 1: clock.snoozeAlarm(300); break;
					case 2: clock.dismiss(); break;
				}
			}
		}
		System.out.println("Good morning!");
		input.close();
	}
}
