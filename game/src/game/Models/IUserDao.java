/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.Models;

import game.entity.Player;

/**
 *
 * @author Masaomi
 */
public interface IUserDao {
    
    void regiter(Player player);
    int getNewId();
    
}
