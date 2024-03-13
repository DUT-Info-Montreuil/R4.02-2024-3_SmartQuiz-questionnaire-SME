package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Enum.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Enum.Langue;

import java.util.Objects;

public class QuestionnaireDTO {

    private int id;
    private Langue langue;
    private String libelle;
    private String reponse;
    private Difficulte difficulte;
    private String explication;
    private String reference;

    public QuestionnaireDTO(int id, Langue langue, String libelle, String reponse, Difficulte difficulte, String explication, String reference) {
        this.id = id;
        this.langue = langue;
        this.libelle = libelle;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnaireDTO that = (QuestionnaireDTO) o;
        return id == that.id && langue == that.langue && Objects.equals(libelle, that.libelle) && Objects.equals(reponse, that.reponse) && difficulte == that.difficulte && Objects.equals(explication, that.explication) && Objects.equals(reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, langue, libelle, reponse, difficulte, explication, reference);
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "id=" + id +
                ", langue=" + langue +
                ", libelle='" + libelle + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte=" + difficulte +
                ", explication='" + explication + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
