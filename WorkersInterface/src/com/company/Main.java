package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Workers> Dataworkers = new ArrayList<>();
        FixedWorker fixedWorker1 = new FixedWorker(1, 3000, "Lucius"  );
        FixedWorker fixedWorker2 = new FixedWorker(2, 3500, "Vanya");
        FixedWorker fixedWorker3 = new FixedWorker(3, 5000, "Harry");

        HourlyWorker hourlyWorker1 = new HourlyWorker(4, 8890, "Sasha");
        HourlyWorker hourlyWorker2 = new HourlyWorker(5, 5554, "Artem");
        HourlyWorker hourlyWorker3 = new HourlyWorker(6, 9904, "Maksim");
        Dataworkers.add(fixedWorker1);
        Dataworkers.add(fixedWorker2);
        Dataworkers.add(fixedWorker3);
        Dataworkers.add(hourlyWorker1);
        Dataworkers.add(hourlyWorker2);
        Dataworkers.add(hourlyWorker3);
//        Arrays.sort(workers, new Comparator<T>() {
//            @Override
//            public int compare(fixedWorker1 o1, T o2) {
//
//            }
//        });
     Collections.sort(Dataworkers, new Comparator<Workers>() {
         @Override
         public int compare(Workers o1, Workers o2) {
             return 0; }
     });
//       workers.add(new FixedWorker());
//        for (Workers w : workers) {
//            w.setID(in.nextInt());
//        }

        System.out.println(Dataworkers);
    }
}
