package com.nt.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Actor;
import com.nt.repo.IActorRepo;
@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {
@Autowired
private IActorRepo a;
	@Override
	public String save(Actor actor) {
		System.out.println("ActorMgmtServiceImpl.save()");
		Actor actors=a.save(actor);
		return "Actor is registered with id value::"+actors.getActorid();
	}
	@Override
	public Iterable<Actor> getAllActor() {
		Iterable<Actor>it=a.findAll();
	    Collections.sort((List<Actor>)it,(t1,t2)->t2.getActorid().compareTo(t1.getActorid()));
	     
		return it;
	}
	@Override
	public Actor getByid(int id) {
         
		return a.findById(id).orElseThrow(()->new IllegalArgumentException());
	}
	@Override
	public List<Actor> PartialAcess( String s1, String s2) {
        List<Actor>list=a.getActorsByCategories(s1, s2);
		return list;
	}
	@Override
	public String update(Actor acot) throws ActorNotFoundException {
        Optional<Actor>opt=a.findById(acot.getActorid());
        if(opt.isPresent()) {
        	a.save(acot);
    		return "deta save sucessfully with the id";

        }else {
        	throw new ActorNotFoundException();
        }
	}
	@Override
	public String deleterecord(int id) throws ActorNotFoundException {
      Optional<Actor> actor=a.findById(id);
      if(actor.isPresent()) {
    	  a.deleteById(id);
    	  return "actor information is deleted";
      }else {
    	  throw new ActorNotFoundException("actor not found");
      }
		
	}
	@Override
	public String updateActorMobileNo(int id, long newMobileNo) throws ActorNotFoundException {
           Optional<Actor>opt=a.findById(id);
           if(opt.isPresent()) {
        	   Actor actor=opt.get();
        	   actor.setMobileNo(newMobileNo);
        	   a.save(actor);
        	   return "actor information is updated";
        			   
           }else {
		        throw new ActorNotFoundException("actor not found");
           }
	}

}
