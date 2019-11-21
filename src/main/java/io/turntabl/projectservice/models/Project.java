package io.turntabl.projectservice.models;


public class Project {

    private int project_id;
    private String description;
    private String name;
    private int  customer_id;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getDescription() {return description; }

    public void setDescription(String description) {this.description = description; }

    public String getName() {return name; }

    public void setName(String name) {this.name = name;}

}
