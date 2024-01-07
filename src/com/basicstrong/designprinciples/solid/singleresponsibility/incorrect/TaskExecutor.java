package com.basicstrong.designprinciples.solid.singleresponsibility.incorrect;

class TaskScheduling {
    public String compute() {
        return "Computing data based on user input";
    }

    public String save() {
        return "Saving data based on user input";
    }

    public String sendNotification() {
        return "notifying user after saving";
    }
}

class SchedulingApplication {
    TaskScheduling taskScheduling;
    public SchedulingApplication(TaskScheduling taskScheduling) {
        this.taskScheduling = taskScheduling;
    }

    public void schedule() {
        System.out.println(taskScheduling.compute());
        System.out.println(taskScheduling.save());
        System.out.println(taskScheduling.sendNotification());
    }
}

public class TaskExecutor {

    public static void main(String[] args) {
        SchedulingApplication schedulingApplication1 = new SchedulingApplication(new TaskScheduling());
        schedulingApplication1.schedule();
    }
}
