package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.mappers.QuestionnaireVersDTOMapper;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces.IservicesQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Enum.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Enum.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class chargerQuestionnaire implements IservicesQuestionnaire {
    @Override
    public List<QuestionnaireDTO> chargerQuestionnaire(String adresseFichierCSV) throws NombreColoneIncorrect, FormatIncorrect, IdQuestionnaireNonInteger, IdQuestionNonInteger, LangueNonReconnue, NiveauNonReconnue, ReferenceNonUrl, FileNotFoundException {
        List<QuestionBO> questionBOList = BOchargerQuestionnaire.BOchargerQuestionnaire(adresseFichierCSV);
        List<QuestionnaireDTO> questionnaires = QuestionnaireVersDTOMapper.QuestionBoVersDTOMapper(questionBOList);
        return questionnaires;
    }
}
