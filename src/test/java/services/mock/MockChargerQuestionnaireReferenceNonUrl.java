package services.mock;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces.IservicesQuestionnaire;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.*;

import java.util.List;

public class MockChargerQuestionnaireReferenceNonUrl implements IservicesQuestionnaire {



    @Override
    public List<QuestionnaireDTO> chargerQuestionnaire(String addresseFichierCSV) throws NombreColoneIncorrect, FormatIncorrect, IdQuestionnaireNonInteger, IdQuestionNonInteger, LangueNonReconnue, NiveauNonReconnue, ReferenceNonUrl {
        return null;
    }
}
