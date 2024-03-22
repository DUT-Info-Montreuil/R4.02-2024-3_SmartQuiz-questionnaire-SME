package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.dto.QuestionnaireDTO;
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
        List<QuestionnaireDTO> questionnaires = new ArrayList<>();

        for (QuestionBO questionBO : questionBOList) {
            for (List<String> ligneDonnees : questionBO.getDonneCSV()) {
                // Ignorer la première donnée de chaque ligne
                try {
                    int id = Integer.parseInt(ligneDonnees.get(1)); // 2ème colonne
                    Langue langue;
                    switch (ligneDonnees.get(2)) {
                        case "fr":
                            langue = Langue.FRANÇAIS;
                            break;
                        default:
                            throw new LangueNonReconnue("Langue non reconnue : " + ligneDonnees.get(2));
                    }
                    String libelle = ligneDonnees.get(3); // 4ème colonne
                    String reponse = ligneDonnees.get(4); // 5ème colonne
                    Difficulte difficulte;
                    switch (ligneDonnees.get(5)) {
                        case "1":
                            difficulte = Difficulte.SIMPLE;
                            break;
                        case "2":
                            difficulte = Difficulte.INTERMEDIAIRE;
                            break;
                        case "3":
                            difficulte = Difficulte.EXEPERTE;
                            break;
                        default:
                            throw new NiveauNonReconnue("Niveau de difficulté non reconnu : " + ligneDonnees.get(5));
                    }
                    String explication = ligneDonnees.get(6); // 7ème colonne
                    String reference = ligneDonnees.get(7); // 8ème colonne

                    // Créer un objet QuestionnaireDTO et l'ajouter à la liste
                    QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(id, langue, libelle, reponse, difficulte, explication, reference);
                    questionnaires.add(questionnaireDTO);
                } catch (NumberFormatException e) {
                    throw new IdQuestionNonInteger("L'identifiant de questionnaire n'est pas un entier valide.");
                } catch (IllegalArgumentException e) {
                    throw new LangueNonReconnue("Langue non reconnue : " + e.getMessage());
                }
            }
        }
        return questionnaires;
    }
}
