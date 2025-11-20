package dev.blinder.springbootpractice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    // CRUD Operations
    // Read All
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }


    // Read by ID
    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElse(null);
    }


    // Create
    public SoftwareEngineer createSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        return softwareEngineerRepository.save(softwareEngineer);
    }

    //
    public SoftwareEngineer updateSoftwareEngineer(Integer id, SoftwareEngineer softwareEngineer) {
        if (softwareEngineerRepository.existsById(id)) {
            softwareEngineer.setId(id);
            return softwareEngineerRepository.save(softwareEngineer);
        }
        return null;
    }

    public void deleteSoftwareEngineer(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }
}
