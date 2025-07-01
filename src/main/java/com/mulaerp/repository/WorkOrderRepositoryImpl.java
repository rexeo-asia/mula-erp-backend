package com.mulaerp.repository;

import com.mulaerp.entity.WorkOrder;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Repository
public class WorkOrderRepositoryImpl implements WorkOrderRepository {
    
    private final Map<String, WorkOrder> storage = new ConcurrentHashMap<>();

    @Override
    public List<WorkOrder> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<WorkOrder> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public WorkOrder save(WorkOrder workOrder) {
        storage.put(workOrder.getId(), workOrder);
        return workOrder;
    }

    @Override
    public void deleteById(String id) {
        storage.remove(id);
    }

    @Override
    public List<WorkOrder> findByStatus(String status) {
        return storage.values().stream()
                .filter(wo -> Objects.equals(wo.getStatus(), status))
                .collect(Collectors.toList());
    }

    @Override
    public List<WorkOrder> findByAssignedTo(String assignedTo) {
        return storage.values().stream()
                .filter(wo -> Objects.equals(wo.getAssignedTo(), assignedTo))
                .collect(Collectors.toList());
    }
}
