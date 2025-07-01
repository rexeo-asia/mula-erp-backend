package com.mulaerp.repository;

import com.mulaerp.entity.WorkOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkOrderRepository {
    List<WorkOrder> findAll();
    Optional<WorkOrder> findById(String id);
    WorkOrder save(WorkOrder workOrder);
    void deleteById(String id);
    List<WorkOrder> findByStatus(String status);
    List<WorkOrder> findByAssignedTo(String assignedTo);
}
