package ci.inphb.EquipementManagement;

import ci.inphb.Entities.EquipementRx;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends
        JpaRepository<EquipementRx,Long> {
}
