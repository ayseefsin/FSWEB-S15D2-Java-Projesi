import com.aysin.Enums.Priority;
import com.aysin.Enums.Status;
import com.aysin.Task;
import com.aysin.TaskData;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Task t1 = new Task("backend", "hard project","ann", Priority.MED, Status.ASSIGNED);
        Task t2 = new Task("frontend", "design project", "bob",Priority.LOW, Status.ASSIGNED);
        Task t3 = new Task("library", "virtual library","carol", Priority.HIGH, Status.ASSIGNED);
        Task t4 = new Task("food application", "calory base food","unassigned" ,Priority.LOW, Status.IN_QUEUE);
        Task t5 = new Task("e-commerce", "shoping project","unassigned" ,Priority.LOW,Status.IN_QUEUE);
        Task t6 = new Task("aysin", "social media","unassigned" ,Priority.HIGH,Status.IN_QUEUE);
        Task t7 = new Task("library", "virtual library","ann", Priority.HIGH, Status.ASSIGNED);
        Task t8 = new Task("hospital","construction", "bob" ,Priority.HIGH,Status.ASSIGNED);
        Task t9 = new Task("hospital","construction", "ann" ,Priority.HIGH,Status.ASSIGNED);
        TaskData.makeAssigned(t1);
        TaskData.makeAssigned(t2);
        TaskData.makeAssigned(t3);
        TaskData.makeAssigned(t4);
        TaskData.makeAssigned(t5);
        TaskData.makeAssigned(t6);
        TaskData.makeAssigned(t7);
        TaskData.makeAssigned(t8);
        TaskData.makeAssigned(t9);
        System.out.println("All project" + (TaskData.getUnion(TaskData.getAnnsTasks(),TaskData.getBobsTasks(),
                TaskData.getBobsTasks(),TaskData.getUnAssignedTasks())));
        System.out.println("*******************************");
        System.out.println("Bob's project" + TaskData.getBobsTasks());
        System.out.println("*******************************");
        System.out.println("Unassigned Tasks: " + TaskData.getUnAssignedTasks()) ;
        System.out.println("*******************************");
        System.out.println("difference" + TaskData.getDifference(TaskData.getBobsTasks(),TaskData.getCarolsTasks()));
        System.out.println("*******************************");
        System.out.println("intersection" + TaskData.getIntersection(TaskData.getBobsTasks(), TaskData.getAnnsTasks()));



    }

}