package io.turntabl.projectservice.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turntabl.projectservice.models.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class ProjectController {

    @ApiOperation("Getting all the projects")
    @GetMapping("projects")
    public Project getProject_id() {
        Project p1 = new Project();
        p1.setCustomer_id(23);
        p1.setDescription("Dummy description");
        p1.setName("No name");
        p1.setProject_id(12);

        return p1;
    }

//    public Project getCustomer_id();
//    public getDescription()
//    public getName()


    }



