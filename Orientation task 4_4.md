## Orientation Task 4-4

### Question 
Write an algorithm in Java or pseudocode for the main loop of the simulator:

The main loop does all the things required for a three-phase simulation (presented in a section).

Think in general terms (don't think in detail) and present a general solution. No need for target system concepts

### Answer 

A-Phase: simulation executive <br>
    - Inspect the event list  
    - Execute the earliest event in the event list  


B-Phase: <br>
    - Execute all events that can occur at the current stimulation time <br>


C-Phase: <br>
    - Attempt to execute all current events in the current stimulation time <br> 
    - If there are no events in the current stimulation time left to execute <br>
        + return to A-phase 
