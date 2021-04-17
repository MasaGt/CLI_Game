/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.views;

import game.entity.RankingDto;
import java.util.List;

/**
 *
 * @author Masaomi
 */
public class StartView {

    public StartView(List<RankingDto> ranking) {
        welcom();
        if (ranking != null) {
            showRanking(ranking);
        }
    }
    
    private void welcom() {
        System.out.println("Welcome to the game");
    }
    
    private void showRanking(List<RankingDto> ranking) {
        for (RankingDto dto : ranking) {
            //TODO: use formatter to display ranking
            System.out.println(dto.getRank() + ": " +  dto.getName() + ", prize:" + dto.getScore());
        }
    }
}
