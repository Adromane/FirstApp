package Sn.edu.ucao.domain;

import jdk.jshell.ImportSnippet;

import java.time.LocalDate;

public class Personne {
        private String nom;
        private String prenom;
        private String adresse;
        private LocalDate dateNaissance;
        public Personne(){

        }
        public Personne(String nom, String prenom){
            this.nom = nom;
            this.prenom = prenom;
        }

        public Personne(String adresse){
            this.adresse = adresse;

        }

        public String getNom(){

            return this.nom;
        }
        public String getPrenom() {
            return this.prenom;

        }

        public String setNom(String nom){
            return this.nom;
        }

        public  String setPrenom(String prenom){
            return this.prenom;
        }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
