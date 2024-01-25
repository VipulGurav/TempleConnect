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
//import com.templeconnect.project.model.PaymentMaster;
//import com.templeconnect.project.services.PaymentRepository;
//
//@RestController
//@RequestMapping("/payments")
//public class PaymentController {
// 
//    // Inject a service to handle CRUD operations on PaymentMaster resources.
//    @Autowired
//    private PaymentRepository paymentRepo;
//
//    // HTTP endpoint to create a new PaymentMaster resource.
//    @PostMapping
//    public ResponseEntity<PaymentMaster> createPayment(@RequestBody PaymentMaster paymentMaster) {
//        PaymentMaster savedPaymentMaster = paymentRepo.save(paymentMaster);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedPaymentMaster);
//    }
//
//    // HTTP endpoint to retrieve a PaymentMaster resource by its ID.
//    @GetMapping("/{id}")
//    public ResponseEntity<PaymentMaster> getPaymentById(@PathVariable("id") Long id) {
//        PaymentMaster paymentMaster = paymentRepo.getById(id); 
//        if (paymentMaster != null) {
//            return ResponseEntity.ok(paymentMaster);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to update an existing PaymentMaster resource.
//    @PutMapping("/{id}")
//    public ResponseEntity<PaymentMaster> updatePayment(@PathVariable("id") Long id, @RequestBody PaymentMaster paymentMaster) {
//        PaymentMaster updatedPaymentMaster = paymentRepo.save(paymentMaster);
//        if (updatedPaymentMaster != null) {
//            return ResponseEntity.ok(updatedPaymentMaster);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    // HTTP endpoint to delete a PaymentMaster resource by its ID.
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletePayment(@PathVariable("id") Long id) {
//         paymentRepo.deleteById(id);
//         return ResponseEntity.noContent().build();
//
//    }
//
//    // HTTP endpoint to retrieve a list of all PaymentMaster resources.
//    @GetMapping
//    public ResponseEntity<List<PaymentMaster>> getAllPayments() {
//        List<PaymentMaster> payments = paymentRepo.findAll();
//        return ResponseEntity.ok(payments);
//    }
//
//}
