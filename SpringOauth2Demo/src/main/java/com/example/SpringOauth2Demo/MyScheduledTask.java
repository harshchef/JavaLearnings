package com.example.SpringOauth2Demo;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MyScheduledTask {

    @Scheduled(cron = "0 0 * * * *")
    @SchedulerLock(name = "myScheduledTask", lockAtLeastFor = "PT5M", lockAtMostFor = "PT14M")
    public void executeTask() {
        // Task logic here
        System.out.println("Executing scheduled task");
    }
}
