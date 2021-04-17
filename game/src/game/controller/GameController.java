/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.controller;

import game.entity.Player;
import game.entity.RankingDto;
import game.service.RankingService;
import game.views.StartView;
import java.util.List;

/**
 *
 * @author Masaomi
 */
public class GameController {
    private Player player;
    
    public void initGame() {
        RankingService service = new RankingService();
        List<RankingDto> ranking = service.getRanking();
        StartView view = new StartView(ranking);
    }
}
