package ci.inphb.EquipementManagement;

import ci.inphb.Entities.EquipementRx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/NetInvent/EquipementManage")
public class EquipementController {
    @Autowired
    private EquipementService equipementService;

    @PostMapping("/AjouterEquipement")
    public EquipementRx AjouterEquipement( @RequestBody EquipementRx equipementRx){
        return equipementService.addEquipementRx(equipementRx);
    }
    @GetMapping("/ListeEquipement")
    public List<EquipementRx> ListeEquipement(){
        return equipementService.getAllEquipemenRx();
    }
    @GetMapping("/ConsulterDetail/{id}")
    public EquipementRx getOneEquipement( @PathVariable Long id){
        return equipementService.getEquipementRx(id);
    }
    @PutMapping("/Miseajour/{id}")
    public EquipementRx MiseAjourEquipement(@RequestBody EquipementRx equipementRx, Long id){
        return equipementService.updateEquipementRx(equipementRx,id);
      }
    @DeleteMapping("/Supprimer/{id}")
    public void SupprimerEquipement(Long id){
            equipementService.deleteEquipementRx(id);
    }
}
