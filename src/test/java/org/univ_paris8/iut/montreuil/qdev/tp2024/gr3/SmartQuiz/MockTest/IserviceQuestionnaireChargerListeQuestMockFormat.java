package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FormatIncorrect;

import java.io.IOException;

public class IserviceQuestionnaireChargerListeQuestMockFormat {
    public QuestionnaireDTO chargerQuestionnaire(String url) throws FormatIncorrect, IOException, FichierVideException {
        throw new FormatIncorrect("Fichier vide: " + url);
    }
}
