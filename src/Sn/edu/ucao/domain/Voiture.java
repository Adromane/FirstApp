package Sn.edu.ucao.domain;

public class Voiture {

    private String marque;
    private String model;
    private String typeTransmission;
    private String couleur;


    public Voiture() {
    }

    public Voiture(String marque, String model, String typeTransmission, String couleur) {
        this.marque = marque;
        this.model = model;
        this.typeTransmission = typeTransmission;
        this.couleur = couleur;
    }

    public Voiture(String typeTransmission, String couleur) {
        this.typeTransmission = typeTransmission;
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
