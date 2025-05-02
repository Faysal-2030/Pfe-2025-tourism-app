package com.tourism.citytours.controller;

import com.tourism.citytours.model.Transfer;
import com.tourism.citytours.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @GetMapping
    public List<Transfer> getAllTransfers() {
        return transferService.getAll();
    }

    @GetMapping("/{id}")
    public Transfer getTransferById(@PathVariable Long id) {
        return transferService.getById(id);
    }

    @PostMapping
    public Transfer createTransfer(@RequestBody Transfer transfer) {
        return transferService.create(transfer);
    }

    @PutMapping("/{id}")
    public Transfer updateTransfer(@PathVariable Long id, @RequestBody Transfer transfer) {
        return transferService.update(id, transfer);
    }

    @DeleteMapping("/{id}")
    public void deleteTransfer(@PathVariable Long id) {
        transferService.delete(id);
    }
}
