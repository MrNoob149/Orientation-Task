## Orientation Task 4_1 
### Question 
Using an example case (health centre, bank, etc.), discuss the meaning and characterisation of all the performance
measures discussed in the lesson material using the concepts of the target system.

### ANSWER
The example that will be used for this question is a bank
In a bank system:
- whenever a new customer arrive, that customer will be called A, which is arrived clients count (arrival count)
- The amount of customers that have worked and left from the bank, that is called C, which is clients serviced count (completed count)
- The total time when the customer arrive and leave is called B, which is active time in service point (busy time)
- The total time of the stimulation is called T

We will then have derived variables (from the previous variables) are:
- U: service point utilization related to the max capacity, U = B/T
- X: service throughput, number of clients serviced related to the time, X = C/T
- S: service time, average service time in the service point, S = B/C

We will then have additional variables:
- R𝑖: response time, the time from the customer's arrival at the service queue to the end of the service
  (𝑖 indicates that this is the lead time experienced by a given customer)

- W: waiting time, cumulative response times sum of all clients

- R: response time, average throughput time at the service point, R = W/C

- N: average queue length at the service point (including the served) N = W/T