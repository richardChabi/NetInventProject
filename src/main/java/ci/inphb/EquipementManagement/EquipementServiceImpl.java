package ci.inphb.EquipementManagement;

import ci.inphb.Entities.EquipementRx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipementServiceImpl implements EquipementService {
    @Autowired
    private EquipementRepository equipementRepository;
    @Override
    public EquipementRx addEquipementRx(EquipementRx equipementRx) {
        return equipementRepository.save(equipementRx);
    }

    @Override
    public EquipementRx getEquipementRx(Long id) {
        return equipementRepository.findById(id).get();
    }

    @Override
    public List<EquipementRx> getAllEquipemenRx() {
        return equipementRepository.findAll();
    }

    @Override
    public EquipementRx updateEquipementRx(EquipementRx equipementRx, Long id) {
        EquipementRx equipementUpdate = equipementRepository.findById(id).get();
        equipementUpdate.setDureeGarantie(equipementRx.getDureeGarantie());
        equipementUpdate.setNbrPort(equipementRx.getNbrPort());
        equipementUpdate.setVersionMicroLogiciel(equipementRx.getVersionMicroLogiciel());
        equipementUpdate.setNbrPort(equipementRx.getNbrPort());
        return equipementRepository.saveAndFlush(equipementUpdate);
    }

    @Override
    public void deleteEquipementRx(Long id) {
        equipementRepository.deleteById(id);
    }
}
