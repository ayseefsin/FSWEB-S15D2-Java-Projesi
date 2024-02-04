package com.aysin;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private static Set<Task> annsTasks=new HashSet<>();
    private static Set<Task> bobsTasks=new HashSet<>();
    private static Set<Task> carolsTasks=new HashSet<>();
    private static Set<Task> unAssignedTasks=new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unAssignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unAssignedTasks = unAssignedTasks;
    }



    public static Set<Task> getUnion (Set < Task >...sets){
        HashSet<Task> total = new LinkedHashSet<>();
        for (Set<Task> taskSet : sets) {
            total.addAll(taskSet);
        }
        return total;
    }

    public static Set<Task> getDifference(Set<Task> set1 , Set<Task> set2){
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public static Set<Task> getIntersection(Set<Task> set1 , Set<Task> set2){
        Set<Task> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static Set<Task> getTasks(String string){
        if(string.equalsIgnoreCase("ann")){
            return annsTasks;
        } else if (string.equalsIgnoreCase("bob")) {
            return bobsTasks;
        } else if (string.equalsIgnoreCase("carol")) {
            return carolsTasks;
        } else if (string.equalsIgnoreCase("all")) {
            return getUnion(annsTasks,bobsTasks, carolsTasks);
        }
        return new HashSet<>();
    }

    public static Set<Task> getIntersect(){return null;}

    public static void makeAssigned(Task task){

        if(task==null){
            System.out.println("Task cannot be null!");
        }
        if (task.getAssignee().equalsIgnoreCase("ann")) {
            annsTasks.add(task);
        }
        if (task.getAssignee().equalsIgnoreCase("bob")){
            bobsTasks.add(task);
        }

       if(task.getAssignee().equalsIgnoreCase("carol")){
           carolsTasks.add(task);
       };
       if(task.getAssignee().equalsIgnoreCase("unassigned")){
           unAssignedTasks.add(task);
       };
       if(task.getAssignee()==null){
           unAssignedTasks.add(task);
       }
    }

    public static Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public static Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public static Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public static Set<Task> getUnAssignedTasks() {
        return unAssignedTasks;
    }
}


