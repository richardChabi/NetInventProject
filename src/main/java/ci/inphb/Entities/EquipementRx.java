package ci.inphb.Entities;

import jakarta.persistence.*;

@Table
@Entity
public class EquipementRx {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Integer numSerie;
    private String nbrPort;
    private Integer IDSousRX;
    private Integer prix;
    private Float versionMicroLogiciel;
    private String protocole;
    private Integer contactFournisseur;
    private Integer dureeGarantie;
    private Boolean priseADistance;

    public EquipementRx(Integer numSerie, String nbrPort, Integer IDSousRX,
                        Integer prix, Float versionMicroLogiciel, String protocole,
                        Integer contactFournisseur,
                        Integer dureeGarantie, Boolean priseADistance) {
        this.numSerie = numSerie;
        this.nbrPort = nbrPort;
        this.IDSousRX = IDSousRX;
        this.prix = prix;
        this.versionMicroLogiciel = versionMicroLogiciel;
        this.protocole = protocole;
        this.contactFournisseur = contactFournisseur;
        this.dureeGarantie = dureeGarantie;
        this.priseADistance = priseADistance;
    }

    public EquipementRx() {

    }

    public Long getId() {
        return Id;
    }

    public Integer getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(Integer numSerie) {
        this.numSerie = numSerie;
    }

    public String getNbrPort() {
        return nbrPort;
    }

    public void setNbrPort(String nbrPort) {
        this.nbrPort = nbrPort;
    }

    public Integer getIDSousRX() {
        return IDSousRX;
    }

    public void setIDSousRX(Integer IDSousRX) {
        this.IDSousRX = IDSousRX;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Float getVersionMicroLogiciel() {
        return versionMicroLogiciel;
    }

    public void setVersionMicroLogiciel(Float versionMicroLogiciel) {
        this.versionMicroLogiciel = versionMicroLogiciel;
    }

    public String getProtocole() {
        return protocole;
    }

    public void setProtocole(String protocole) {
        this.protocole = protocole;
    }

    public Integer getContactFournisseur() {
        return contactFournisseur;
    }

    public void setContactFournisseur(Integer contactFournisseur) {
        this.contactFournisseur = contactFournisseur;
    }

    public Integer getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(Integer dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public Boolean getPriseADistance() {
        return priseADistance;
    }

    public void setPriseADistance(Boolean priseADistance) {
        this.priseADistance = priseADistance;
    }
}
