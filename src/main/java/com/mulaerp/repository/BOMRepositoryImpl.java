package com.mulaerp.repository;

import com.mulaerp.entity.BillOfMaterials;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class BOMRepositoryImpl implements BOMRepository {
    
    private final Map<String, BillOfMaterials> storage = new ConcurrentHashMap<>();

    @Override
    public List<BillOfMaterials> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<BillOfMaterials> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public BillOfMaterials save(BillOfMaterials bom) {
        storage.put(bom.getId(), bom);
        return bom;
    }

    @Override
    public void deleteById(String id) {
        storage.remove(id);
    }
}
