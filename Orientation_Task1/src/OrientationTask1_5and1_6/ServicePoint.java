package OrientationTask1_5and1_6;

import java.util.LinkedList;

public class ServicePoint {

    static LinkedList<Customer> CustomerList = new LinkedList<>();

    public void addtoQueue(Customer a) {
        CustomerList.addFirst(a);
    }

    public void removeFromQueue() {
        CustomerList.removeLast();
    }

    public static void serve() {
        while (!CustomerList.isEmpty()) {
            Customer customer = CustomerList.removeLast();
            int ServiceTime = (int) (Math.random() * 1000);
            int Time = (int) System.currentTimeMillis();


            try {
                Thread.sleep(1000);  // 1000 ms = 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                int Total_time = ServiceTime + Time;
                double AverageTime = (double) Total_time /5;
                System.out.println("The customer ID is " + customer.getId() + " The total time of service is " + Total_time);
                System.out.println("The average waiting time is " + AverageTime);
            }

        }
    }





