package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest;


import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces.IservicesQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FormatIncorrect;

import java.util.List;

public class IServiceQuestionnaireChargerListeQuestMock2 implements IservicesQuestionnaire {
    @Override
    public List<QuestionnaireDTO> chargerQuestionnaire(String url) throws FormatIncorrect, FichierVideException {
        throw new FichierVideException("Fichier vide: " + url);
    }
}