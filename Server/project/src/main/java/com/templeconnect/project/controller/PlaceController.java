//package com.templeconnect.project.controller;
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
//import com.templeconnect.project.model.PlaceMaster;
//import com.templeconnect.project.services.PlaceRepository;
//
//@RestController
//@RequestMapping("/places")
//public class PlaceController {
//
//    // Inject a service to handle CRUD operations on Place resources.
//    @Autowired
//    private PlaceRepository placeRepo;
//
//    // HTTP endpoint to create a new Place resource.
//    @PostMapping
//    public ResponseEntity<PlaceMaster> createPlace(@RequestBody PlaceMaster place) {
//        PlaceMaster savedPlace = placeRepo.createPlace(place);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedPlace);
//    }
//
//    // HTTP endpoint to retrieve a Place resource by its ID.
//    @GetMapping("/{id}")
//    public ResponseEntity<PlaceMaster> getPlaceById(@PathVariable("id") Long id) {
//        PlaceMaster place = placeRepo.getPlaceById(id);
//        if (place != null) {
//            return ResponseEntity.ok(place);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to update an existing Place resource.
//    @PutMapping("/{id}")
//    public ResponseEntity<PlaceMaster> updatePlace(@PathVariable("id") Long id, @RequestBody PlaceMaster place) {
//        PlaceMaster updatedPlace = placeRepo.updatePlace(id, place);
//        if (updatedPlace != null) {
//            return ResponseEntity.ok(updatedPlace);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//  
//    // HTTP endpoint to delete a Place resource by its ID.
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletePlace(@PathVariable("id") Long id) {
//        boolean deleted = placeRepo.deletePlace(id);
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to retrieve a list of all Place resources.
//    @GetMapping
//    public ResponseEntity<List<PlaceMaster>> getAllPlaces() {
//        List<PlaceMaster> places = placeRepo.getAllPlaces();
//        return ResponseEntity.ok(places);
//    }
//
//}
