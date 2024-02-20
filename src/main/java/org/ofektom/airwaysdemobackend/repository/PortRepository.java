package org.ofektom.airwaysdemobackend.repository;

import org.ofektom.airwaysdemobackend.model.Port;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortRepository extends JpaRepository<Port, Long> {
}
