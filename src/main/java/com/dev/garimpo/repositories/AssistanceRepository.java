package com.dev.garimpo.repositories;

import com.dev.garimpo.domain.assistance.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssistanceRepository extends JpaRepository<Assistance, String> {
}
