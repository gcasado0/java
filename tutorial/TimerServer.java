package tutorial;
/*
Suppose you have written a time server that periodically notifies its clients 
of the current date and time. Write an interface the server could use to enforce 
a particular protocol on its clients.
*/

import java.time.*;

public interface TimerServer {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLocalDateTime();    
    void setNotificationPeriod(int seconds);

}
