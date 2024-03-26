package services.impl;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest.IServiceQuestionnaireChargerListeQuestMock1;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest.IServiceQuestionnaireChargerListeQuestMockLangue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest.IserviceQuestionnaireChargerListeQuestMockFormat;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.services.interfaces.IservicesQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.MockTest.IServiceQuestionnaireChargerListeQuestMock2;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.FormatIncorrect;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.SmartQuiz.utiles.Exceptions.LangueNonReconnue;

import static org.junit.jupiter.api.Assertions.assertThrows;


import java.io.FileNotFoundException;

class ChargerQuestionnaireTest {


    @Test
    void testFichierIntrouvableException() {
        IServiceQuestionnaireChargerListeQuestMock1 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock1();

        assertThrows(FileNotFoundException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("url/fictive/nonExistant.csv");
        });
    }

    @Test
    void testFichierVideException() {
        IServiceQuestionnaireChargerListeQuestMock2 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock2();

        assertThrows(FichierVideException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("/home/etudiants/info/zgueddou/IdeaProjects/R4.02-2024-4_LesFootX-questionnaire-SME/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr4/LesFootX/ressources/fichiervide.csv");
        });
    }
    @Test
    void testLangueNonReconnueException() {
        IservicesQuestionnaire iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMockLangue();
        assertThrows(LangueNonReconnue.class, () -> {
            iQuestionnaire.chargerQuestionnaire("url/fictive.csv");
        });
    }


    @Test
    void testFormatFichierInvalideException() {
        IserviceQuestionnaireChargerListeQuestMockFormat iQuestionnaire = new IserviceQuestionnaireChargerListeQuestMockFormat();

        assertThrows(FormatIncorrect.class, () -> {
            iQuestionnaire.chargerQuestionnaire("chemin/vers/fichierAvecMauvaisFormat.csv");
        });
    }
}

