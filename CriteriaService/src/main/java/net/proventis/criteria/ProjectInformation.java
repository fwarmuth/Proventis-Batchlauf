/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.proventis.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gd
 */
public class ProjectInformation {

    private String project;
    private List<TaskInformation> tasks;

    private String emailAddressProjectLeader;
    private String projectLeaderName;
  

    public ProjectInformation() {
        tasks = new ArrayList<TaskInformation>();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<TaskInformation> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskInformation> tasks) {
        this.tasks = tasks;
    }

        public String getEmailAddressProjectLeader() {
        return emailAddressProjectLeader;
    }

    public void setEmailAddressProjectLeader(String emailAddressProjectLeader) {
        this.emailAddressProjectLeader = emailAddressProjectLeader;
    }

    public void addTask(TaskInformation task){
        tasks.add(task);
    }

    public String getProjectLeaderName() {
        return projectLeaderName;
    }

    public void setProjectLeaderName(String projectLeaderName) {
        this.projectLeaderName = projectLeaderName;
    }



    @Override
    public String toString(){
        StringBuilder info = new StringBuilder();
        info.append("Project[project: ").append(project).append(" with Tasks:{\n");
        for (TaskInformation taskInformation : tasks) {
            info.append(taskInformation.toString()).append("\n");
        }
        info.append("}]");
        return info.toString();
    }




}
