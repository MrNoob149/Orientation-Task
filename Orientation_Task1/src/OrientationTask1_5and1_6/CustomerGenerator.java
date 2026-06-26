package OrientationTask1_5and1_6;

import java.util.random.RandomGenerator;

public class CustomerGenerator {
    public static void Generator(int amount, ServicePoint servicePoint) {

        for (int i = 0; i < amount; i++) {
            Customer customer = new Customer(i);
            servicePoint.addtoQueue(customer);
            System.out.println("Customer with ID " + customer.getId() + " added");
        }

    }

}
