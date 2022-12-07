/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.dao.inter;

import com.mycompany.bean.User;
import java.util.List;

/**
 *
 * @author amila
 */
public interface UserDaoInter {
    public List<User> getAll();
    public User getById(int id);
    public boolean updateUser(User u);
    public boolean remove(User u);
}
