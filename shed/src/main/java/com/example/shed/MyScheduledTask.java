package com.example.shed;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor="PT2S")
public class MyScheduledTask {

    @Scheduled(fixedRate=3000) 
    @SchedulerLock(name = "myScheduledTask", lockAtLeastFor = "PT3S", lockAtMostFor ="PT3S")
    public void executeTask() {
        // Task logic here
        System.out.println("Executing scheduled task");
    }
}
