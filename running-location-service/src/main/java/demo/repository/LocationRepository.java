package demo.repository;

import demo.domain.Location;
import demo.enums.RunnerMovementType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    Page<Location> findByRunnerMovementType(@Param("movementType") RunnerMovementType movementType, Pageable pageable);
}
