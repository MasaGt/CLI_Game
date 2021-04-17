/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.Models;

import game.entity.Player;
import java.io.FileReader;

/**
 *
 * @author Masaomi
 */
public class UserDao implements IUserDao{

    public final String filePath;

    public UserDao() {
        this.filePath = "";
    }
    
    @Override
    public void regiter(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNewId() {
        
        return 0;
    }
    
}
