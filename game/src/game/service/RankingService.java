/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.service;

import game.Models.IRankingDao;
import game.Models.RankingDao;
import game.entity.RankingDto;
import java.util.List;

/**
 *
 * @author Masaomi
 */
public class RankingService {
    
    public List<RankingDto> getRanking() {
        IRankingDao dao = new RankingDao();
        List<RankingDto> ranking = dao.getAll();
        return ranking;
    }
    
}
