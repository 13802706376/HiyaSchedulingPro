package com.hiya.ee.scheduling.quarzt;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HiyaJob implements Job
{
    public void execute(JobExecutionContext context) throws JobExecutionException
    {
        JobDetail detail = context.getJobDetail();
        String name = detail.getJobDataMap().getString("name");
        System.out.println("say hello to " + name + " at " + new Date());
    }
}