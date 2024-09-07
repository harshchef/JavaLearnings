package com.example.shed;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// Annotation
@Component
// Class
public class Scheduler {

    // Method
    // To trigger the scheduler every one minute between 19:00 PM to 19:59 PM
    @Scheduled(cron = "0 * 19 * * ?")
    public void scheduleTask() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        String strDate = dateFormat.format(new Date());
        System.out.println("Cron job Scheduler: Job running at - " + strDate);
    }

    // Fixed-rate scheduler task, runs every 2 seconds
    @Scheduled(fixedRate = 2000)
    public void scheduleTask1() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        String strDate = dateFormat.format(new Date());
        System.out.println("Fixed rate Scheduler: Task running at - " + strDate);
    }

    // Fixed-delay scheduler task, runs 3 seconds after the previous task completes, with an initial delay of 5 seconds
    @Scheduled(fixedDelay = 3000, initialDelay = 5000)
    public void scheduleTask2() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        String strDate = dateFormat.format(new Date());
        System.out.println("Fixed Delay Scheduler: Task running at - " + strDate);
    }
}
