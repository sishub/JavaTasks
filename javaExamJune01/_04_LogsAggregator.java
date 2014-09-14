package javaExamJune01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class _04_LogsAggregator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		TreeMap<String, Integer> durations = new TreeMap<String, Integer>();
		TreeMap<String, TreeSet<String>> ipAddresses = new TreeMap<String, TreeSet<String>>();

		for (int i = 0; i < n; i++) {
			String inputInfo = input.nextLine();
			String[] information = inputInfo.split(" ");
			String ip = information[0];
			String user = information[1];
			int duration = Integer.parseInt(information[2]);

			Integer previosDuration = durations.get(user);
			if (!durations.containsKey(user)) {
				durations.put(user, duration);
			} else {
				durations.put(user, previosDuration + duration);
			}
			
			TreeSet<String> ipSet = ipAddresses.get(user);
			if (ipSet == null) {
				ipSet=new TreeSet<String>();
			}
			ipSet.add(ip);
			ipAddresses.put(user,ipSet);

		
		}
		for (Entry<String, Integer> userAndDuration : durations.entrySet()) {
			String user = userAndDuration.getKey();
			int duration = userAndDuration.getValue();
			TreeSet<String> ipSet = ipAddresses.get(user);
			System.out.println(user + ": " + duration + " " + ipSet);
		}

	}
}
