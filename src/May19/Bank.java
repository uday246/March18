package May19;

import java.util.*;

import com.sun.jmx.remote.internal.ArrayQueue;
public class Bank {/**
   * Bank.java
   * This class represents a Bank and simulates its customer service operation
   * using a queue.
   */
   public static void main(String [] args) {

   //maximum size of queue
   int qCapacity = Integer.parseInt(args[0]);

   //number of simulation hours
   int simHours = Integer.parseInt(args[1]);

   //average number of customers per hour
   int custPerHour = Integer.parseInt(args[2]);

   //Run simulation
   simulation(qCapacity, simHours, custPerHour);
   }

   /**
   * This methods performs a simulation of a Bank operation using a queue and
   * prints the results.
   * @param qCapacity The fixed capacity of the queue to be used.
   * @param simHours The number of hours that the simulation should run.
   * @param custPerHour The expected number of customers to arrive per hour.
   */
   private static void simulation(int qCapacity, int simHours, int custPerHour) {
   //Constant
   final int MIN_PER_HR=60;

   //A queue that will hold and manage objects of type Customer.
   Queue<Customer> line = new ArrayQueue<Customer>(qCapacity);

   //For how many cycles should the simulation run. We assume that each
   //cycle takes one minute.
   int cycleLimit = MIN_PER_HR*simHours;

   //The average number of minutes that will pass until the next customer
   //arrives.
   float minPerCust = ((float)MIN_PER_HR)/custPerHour;

   //The number of customers that were turned away because the line (queue)
   //was full at the time they arrived.
   int turnAways = 0;

   //Number of customers that arrived.
   int customers = 0;

   //Number of customers that were served.
   int served = 0;

   //Total number of customers that entered the line (queue).
   int sumLine = 0;

   //Waiting time until the next customer is served.
   int waitTime = 0;

   //Total time that all the customers waited int he line.
   int lineWait = 0;

   //Simulation
   for (int cycle = 0; cycle < cycleLimit; cycle++) {
   if (newCustomer(minPerCust)) {
   if (line.isFull()) {
   turnAways++;
   } else {
   customers++;
   Customer customer = new Customer();
   customer.set(cycle);
   line.enqueue(customer);
   }
   }

   if (waitTime <= 0 && !line.isEmpty()) {
   Customer customer = (Customer) line.dequeue();
   waitTime = customer.procTime();
   lineWait += cycle - customer.when();
   served++;
   }

   if (waitTime > 0) {
   waitTime--;
   }

   sumLine += line.size();
   }

   //Print the simulation results.
   if (customers > 0) {
   System.out.println("\nCustomers accepted: " + customers);
   System.out.println(" Customers served: " + served);
   System.out.println(" Customers waiting: " + line.size());
   System.out.println(" Turnaways: " + turnAways);
   System.out.println("Average queue size: " + (float) sumLine / cycleLimit);
   System.out.println(" Average wait time: " + (float) lineWait / served + " minutes");
   } else {
   System.out.println("No customers!");
   }
   }

   /**
   * This method decides if a new customer has arrived at each time based on
   * the customer arrival rate.
   * @param minPerCust Number of minutes between two customer arrivals.
   * @return true if a new customer has arrived, otherwise false.
   */
   private static boolean newCustomer(float minPerCust) {
   return (Math.random() * minPerCust < 1);
   }
   }