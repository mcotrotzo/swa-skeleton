package at.qe.skeleton.ui.controllers;

import at.qe.skeleton.model.Userx;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuditLog {


    private List<Userx> deletedUser = new ArrayList<>();
    public List<Userx> getDeletedUser(){
        return deletedUser;
    }
    public void addDeletedUser(Userx action){
        deletedUser.add(action);
    }
}
