package OrientationTask1_5and1_6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int nextId = 1;
    public static void main(String[] args){

        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator.Generator(5, servicePoint);

        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> CustomerList = new LinkedList<>();

        Customer customer = new Customer(nextId);
        nextId++;

        try {
            Thread.sleep(1000);  // 1000 ms = 1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        customer.setEndTime(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
        System.out.println((i + 1) + ". customer ID: " + customer.getId());
        System.out.println("Waiting time: " + customer.waitingTime());
        //System.out.println("Time taking: " + );

        int choice;
            System.out.println("Customer Queue");
            System.out.println("--------------------");
            System.out.println();

            while (true) {
                System.out.println("Choose an action:");
                System.out.println("[1] Add a customer");
                System.out.println("[2] Remove a customer");
                System.out.println("[3] Exit");

                System.out.print("> ");
                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == 1) {
                    CustomerList.addFirst(customer);
                } else if (answer ==2) {
                    CustomerList.removeLast();
                } else if (answer == 3) {
                    System.out.println(customer.getId());
                    break;
                }

            }
            ServicePoint.serve();
        }
    }
}