package dev.blinder.springbootpractice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    protected final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers(){
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @PostMapping
    public SoftwareEngineer createSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        return softwareEngineerService.createSoftwareEngineer(softwareEngineer);
    }
}
