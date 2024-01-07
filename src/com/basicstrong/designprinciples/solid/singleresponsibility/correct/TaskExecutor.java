package com.basicstrong.designprinciples.solid.singleresponsibility.correct;

//Used as a marker Interface
interface TaskScheduling{}
class TaskSchedulingComputing implements TaskScheduling {
    public String compute() {
        return "Computing data based on user input";
    }

}

class TaskSchedulingSaving implements TaskScheduling {
    public String save() {
        return "Saving data based on user input";
    }
}


class TaskSchedulingNotification implements TaskScheduling {
    public String sendNotification() {
        return "notifying user after saving";
    }

}

class SchedulingApplication {
    TaskSchedulingComputing taskSchedulingComputing;
    TaskSchedulingSaving taskSchedulingSaving;
    TaskSchedulingNotification taskSchedulingNotification;

    public SchedulingApplication(TaskSchedulingComputing taskSchedulingComputing, TaskSchedulingSaving taskSchedulingSaving, TaskSchedulingNotification taskSchedulingNotification) {
        this.taskSchedulingComputing = taskSchedulingComputing;
        this.taskSchedulingSaving = taskSchedulingSaving;
        this.taskSchedulingNotification = taskSchedulingNotification;
    }

    public void schedule() {
        System.out.println(taskSchedulingComputing.compute());
        System.out.println(taskSchedulingSaving.save());
        System.out.println(taskSchedulingNotification.sendNotification());
    }
}

public class TaskExecutor {

    public static void main(String[] args) {
        SchedulingApplication schedulingApplication1 = new SchedulingApplication(
                new TaskSchedulingComputing(), new TaskSchedulingSaving(), new TaskSchedulingNotification());
        schedulingApplication1.schedule();
    }
}
