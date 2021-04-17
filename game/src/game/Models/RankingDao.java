/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.Models;

import game.entity.RankingDto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Masaomi
 */
public class RankingDao implements IRankingDao {

    private final String FILE_PATH = "./DataStore/ranking.txt";

    /**
     * Read Rankng from File
     *
     * @return List of RankingDto
     */
    @Override
    public List<RankingDto> getAll() {

        List<RankingDto> rankings = new ArrayList<>();
        File file = new File(FILE_PATH);
        
        if (!file.exists()) {
            System.err.println("File does not exist");
            return rankings;
        }
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";

            while ((line = br.readLine()) != null) {
                System.out.println("has line to read");
                String[] props = line.split(",");

                RankingDto dto = new RankingDto();
                //TODO: need to handle parse error
                dto.setRank(Integer.parseInt(props[0]));
                dto.setName(props[1]);
                dto.setScore(Integer.parseInt(props[2]));
                rankings.add(dto);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RankingDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RankingDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rankings;
    }

}
