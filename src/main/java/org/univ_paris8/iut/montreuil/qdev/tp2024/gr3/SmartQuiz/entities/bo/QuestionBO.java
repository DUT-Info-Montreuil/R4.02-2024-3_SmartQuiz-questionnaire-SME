package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo;

import java.util.List;
import java.util.Objects;

public class QuestionBO {

    private List<List<String>> donneCSV;

    public QuestionBO(List<List<String>> donneCSV) {
        this.donneCSV = donneCSV;
    }

    public List<List<String>> getDonneCSV() {
        return donneCSV;
    }

    public void addLigneDonneCSV(List<String> donneCSV) {
        this.donneCSV.add(donneCSV);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionBO that = (QuestionBO) o;
        return Objects.equals(donneCSV, that.donneCSV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(donneCSV);
    }

    @Override
    public String toString() {
        return "QuestionnaireBO{" +
                "donneCSV=" + donneCSV +
                '}';
    }
}
