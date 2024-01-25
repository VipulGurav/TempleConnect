//package com.templeconnect.project.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable; 
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.templeconnect.project.model.TempleServiceMaster;
//import com.templeconnect.project.services.TempleServiceRepository;
//
//@RestController 
//@RequestMapping("/templeservices")
//public class TempleServiceController {
//
//    // Inject a service to handle CRUD operations on TempleService resources.
//    @Autowired
//    private TempleServiceRepository templeServiceRepo;
//
//    // HTTP endpoint to create a new TempleService resource.
//    @PostMapping
//    public ResponseEntity<TempleServiceMaster> createTempleService(@RequestBody TempleServiceMaster templeService) {
//        TempleServiceMaster savedTempleService = templeServiceRepo.createTempleServiceRepo(templeService);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedTempleService);
//    }
//
//    // HTTP endpoint to retrieve a TempleService resource by its ID.
//    @GetMapping("/{id}")
//    public ResponseEntity<TempleServiceMaster> getTempleServiceById(@PathVariable("id") Long id) {
//        TempleServiceMaster templeService = templeServiceRepo.getTempleServiceById(id);
//        if (templeService != null) {
//            return ResponseEntity.ok(templeService);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to update an existing TempleService resource. 
//    @PutMapping("/{id}")
//    public ResponseEntity<TempleServiceMaster> updateTempleService(@PathVariable("id") Long id, @RequestBody TempleServiceMaster templeService) {
//        TempleServiceMaster updatedTempleService = templeServiceRepo.updateTempleService(id, templeService);
//        if (updatedTempleService != null) {
//            return ResponseEntity.ok(updatedTempleService);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to delete a TempleService resource by its ID.
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteTempleService(@PathVariable("id") Long id) {
//        boolean deleted = templeServiceRepo.deleteTempleService(id);
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to retrieve a list of all TempleService resources.
//    @GetMapping
//    public ResponseEntity<List<TempleServiceMaster>> getAllTempleServices() {
//        List<TempleServiceMaster> templeServices = templeServiceRepo.getAllTempleServices();
//        return ResponseEntity.ok(templeServices);
//    }
//
//}
//
//
