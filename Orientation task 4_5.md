## Orientation Task 4_5 
### Question 
Using the names of the simulator classes, explain the simulator <br>

a) what A-phase coding means? <br>
b) what coding B-events mean? <br>
c) what coding C events means?

You can also write Java or pseudocode.

Present a general solution. No need for the target system concepts.

### Answer
**Code:** <br> 
A-Phase: simulation executive <br>
- Inspect the event list  
- Execute the earliest event in the event list


B-Phase: <br>
- Execute all events that can occur at the current stimulation time <br>


C-Phase: <br>
- Attempt to execute all current events in the current stimulation time <br>
- If there are no events in the current stimulation time left to execute <br>
+ return to A-phase

**Explaination:**
- A-Phase: The stimulation will check for all events in the eventlist 
and then execute the events in the event list in chronological from the earliest event. Once finished, the stimulation will move to B-phase
<br>
- B-Phase: The stimulation will execute all the B-events in the curent stimulation time then move to C-Phase
<br>
- C-Phase:
The stimulation will execute all the C-events. If There are no more C-events, the simulator returns to the A-Phase to process the next event.