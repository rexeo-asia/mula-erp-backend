package com.mulaerp.repository;

import com.mulaerp.entity.BillOfMaterials;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BOMRepository {
    List<BillOfMaterials> findAll();
    Optional<BillOfMaterials> findById(String id);
    BillOfMaterials save(BillOfMaterials bom);
    void deleteById(String id);
}
