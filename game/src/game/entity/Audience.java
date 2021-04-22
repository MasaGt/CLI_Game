/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entity;

import java.util.List;
import java.util.Random;

/**
 * Audiemce object.
 *
 * @author Masaomi
 */
public class Audience extends Lifeline {

    public Audience(String name) {
        super(name);
    }

    /**
     * Show the result of poll. The highest percentage should be for the correct
     * answer. Totla parcentage should be 100%.
     * @param quiz
     */
    @Override
    public void execute(QuizInfo quiz) {

        if (!this.getIsAvailable()) {
            return;
        }

        Random rand = new Random();

        List<OptionDto> options = quiz.getOption();

        int total = 100;
        //randForCorrect will be between 51 to 100 so that it should be  heighest.
        int randForCorrect = rand.nextInt(49) + 51;
        int left = total - randForCorrect;
        int randForOther = rand.nextInt(left);

        //allocate each parcentage to each option
        for (int i = 0; i < options.size(); i++) {
            //index is for diaply purpose.
            int index = i + 1;

            //check which otion is the correct answer
            if (quiz.getQuiz().getAnswer() == options.get(i).getId()) {
                System.out.println(index + ": " + randForCorrect + "%");
                randForCorrect = 0;
            } else {
                if (i == options.size() - 1 || randForCorrect != 0) {
                    //allocate the rest of parcentage to the last wrong option so that % will be 100% in totoal.
                    /*
                    * if the condition is only (i == options.size() - 1).
                    * It will cause a following bug.
                    * If the correct option is the last option, i == options.size() - 1 will always return fasle.
                    *
                    * e.g. options are option1, option2, option3, option4 and correct option is option4
                    * the left percentage should be allocated to option3.
                    * However, optioin3 fall in else scope because option3 is not the last option.
                    */
                    System.out.println(index + ": " + left + "%");
                } else {
                    System.out.println(index + ": " + randForOther + "%");
                    left -= randForOther;
                    randForOther = rand.nextInt(left);
                }
            }
        }
    }
}
