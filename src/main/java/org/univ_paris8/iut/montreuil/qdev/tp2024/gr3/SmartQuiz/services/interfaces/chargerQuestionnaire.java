package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.*;

import java.util.List;

public interface chargerQuestionnaire {

    public QuestionBO BOchargerQuestionnaire(String addresseFichierCSV) throws NombreColoneIncorrect;

    public List<QuestionnaireDTO> QuestionBoVersDTOMapper(List<QuestionBO> questionBOList) throws IdQuestionnaireNonInteger, IdQuestionNonInteger, LangueNonReconnue, NiveauNonReconnue, ReferenceNonUrl;


}
