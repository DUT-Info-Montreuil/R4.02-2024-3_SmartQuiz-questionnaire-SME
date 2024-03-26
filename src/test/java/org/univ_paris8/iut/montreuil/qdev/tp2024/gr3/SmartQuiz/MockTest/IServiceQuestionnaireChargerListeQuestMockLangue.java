package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces.IservicesQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.LangueNonReconnue;

import java.util.List;

public class IServiceQuestionnaireChargerListeQuestMockLangue implements IservicesQuestionnaire {
    @Override
    public List<QuestionnaireDTO> chargerQuestionnaire(String url) throws LangueNonReconnue {
        throw new LangueNonReconnue("Langue non reconnue dans le fichier: " + url);
    }
}
