package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces.IservicesQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.NiveauNonReconnue;

import java.util.List;

public class IservicesQuestionnaireChargerListeQuestMockNiveauNonReconnue implements IservicesQuestionnaire {
    @Override
    public List<QuestionnaireDTO> chargerQuestionnaire(String url) throws NiveauNonReconnue {
        throw new NiveauNonReconnue("Niveau Non reconnue dans : " + url);
    }
}
