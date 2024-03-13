package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto;

import java.util.List;
import java.util.Objects;

public class QuestionDTO {

    private List<QuestionnaireDTO> questions;

    public QuestionDTO(List<QuestionnaireDTO> questions) {
        this.questions = questions;
    }

    public List<QuestionnaireDTO> getQuestions() {
        return questions;
    }

    public void addQuestions(QuestionnaireDTO questions) {
        this.questions.add(questions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDTO that = (QuestionDTO) o;
        return Objects.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questions);
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "questions=" + questions +
                '}';
    }
}
