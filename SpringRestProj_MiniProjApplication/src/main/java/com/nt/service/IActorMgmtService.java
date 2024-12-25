package com.nt.service;

import java.util.List;

import com.nt.model.Actor;

public interface IActorMgmtService {
public String save(Actor actor);
public Iterable<Actor>getAllActor();
public Actor getByid(int id);
public List<Actor>PartialAcess(String s1,String s2);
public String update(Actor acot) throws ActorNotFoundException;
public String deleterecord(int id) throws ActorNotFoundException;
public String updateActorMobileNo(int id,long newMobileNo) throws ActorNotFoundException;
}
