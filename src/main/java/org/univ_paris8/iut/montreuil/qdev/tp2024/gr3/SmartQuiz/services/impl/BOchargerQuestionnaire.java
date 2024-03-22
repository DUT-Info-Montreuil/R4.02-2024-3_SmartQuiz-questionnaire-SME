package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FormatIncorrect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BOchargerQuestionnaire {

    public static List<QuestionBO> BOchargerQuestionnaire(String adresse) throws FileNotFoundException, FormatIncorrect {
        List<QuestionBO> questionnaires = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(adresse));
            String line;
            while ((line = br.readLine()) != null) {
                QuestionBO questionBO = getQuestionBO(line);
                questionnaires.add(questionBO);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return questionnaires;
    }

    private static QuestionBO getQuestionBO(String line) throws FormatIncorrect {
        String[] donnees = line.split(";"); // Séparer les données par ";"
        List<String> ligneDonnees = new ArrayList<>();
        for (String donnee : donnees) {
            ligneDonnees.add(donnee.trim()); // Ajouter chaque donnée dans la liste en enlevant les espaces
        }
        if (ligneDonnees.size() != 8 ){
            throw new FormatIncorrect("Le format et incorrect");
        }
        QuestionBO questionBO = new QuestionBO(new ArrayList<>());
        questionBO.addLigneDonneCSV(ligneDonnees);
        return questionBO;
    }

}
