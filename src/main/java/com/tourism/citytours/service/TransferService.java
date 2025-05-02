package com.tourism.citytours.service;

import com.tourism.citytours.model.Transfer;
import com.tourism.citytours.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransferService {

    @Autowired
    private TransferRepository transferRepository;

    public List<Transfer> getAll() {
        return transferRepository.findAll();
    }

    public Transfer getById(Long id) {
        return transferRepository.findById(id).orElse(null);
    }

    public Transfer create(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    public Transfer update(Long id, Transfer transfer) {
        Transfer existingTransfer = getById(id);
        if (existingTransfer != null) {
            transfer.setId(id); // Assurez-vous que Transfer.java a un setId(Long id)
            return transferRepository.save(transfer);
        }
        return null;
    }

    public void delete(Long id) {
        transferRepository.deleteById(id);
    }
}
