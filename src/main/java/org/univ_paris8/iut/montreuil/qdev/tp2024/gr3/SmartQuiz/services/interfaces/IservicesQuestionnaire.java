package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.*;

import java.io.FileNotFoundException;
import java.util.List;

public interface IservicesQuestionnaire {

    public List<QuestionnaireDTO> chargerQuestionnaire(String addresseFichierCSV) throws NombreColoneIncorrect, FormatIncorrect, IdQuestionnaireNonInteger, IdQuestionNonInteger, LangueNonReconnue, NiveauNonReconnue, ReferenceNonUrl, FileNotFoundException, FichierVideException;

}
