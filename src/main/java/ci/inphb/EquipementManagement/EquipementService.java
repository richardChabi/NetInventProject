package ci.inphb.EquipementManagement;

import ci.inphb.Entities.EquipementRx;
import org.apache.juli.logging.Log;

import java.util.List;

public interface EquipementService {
    public EquipementRx addEquipementRx(EquipementRx equipementRx);
    public EquipementRx getEquipementRx(Long id);
    public List<EquipementRx> getAllEquipemenRx();
    public EquipementRx updateEquipementRx(EquipementRx equipementRx, Long id);
    public void deleteEquipementRx(Long id);
}
