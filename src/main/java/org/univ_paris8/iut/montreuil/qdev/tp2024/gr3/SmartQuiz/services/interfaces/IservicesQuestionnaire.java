package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.*;

import java.util.List;

public interface IservicesQuestionnaire {

    public List<QuestionBO> chargerQuestionnaire(String addresseFichierCSV) throws NombreColoneIncorrect, FormatIncorrect;

}
