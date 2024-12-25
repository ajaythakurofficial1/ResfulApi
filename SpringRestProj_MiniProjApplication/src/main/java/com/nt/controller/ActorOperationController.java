package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Actor;
import com.nt.service.ActorNotFoundException;
import com.nt.service.IActorMgmtService;

@RestController
@RequestMapping("/ajay")
public class ActorOperationController {

    @Autowired
    private IActorMgmtService service;

    @PostMapping("/save")
    public ResponseEntity<String> saveActor(@RequestBody Actor actor) {
        try {
            String msg = service.save(actor);
            return new ResponseEntity<>(msg, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/report")
    public ResponseEntity<?> fetchAllActors() {
        try {
            Iterable<Actor> list = service.getAllActor();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> fetchActorById(@PathVariable int id) {
        try {
            Actor actor = service.getByid(id);
            return new ResponseEntity<>(actor, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get2/{category1}/{category2}")
    public ResponseEntity<?> fetchActorByCategories(@PathVariable String category1, @PathVariable String category2) {
        try {
            List<Actor> list = service.PartialAcess(category1, category2);
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/put")
    public ResponseEntity<String> updateActor(@RequestBody Actor actor) {
        try {
            String msg = service.save(actor); // Ensure this method is appropriate for updating actors.
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteActor(@PathVariable int id) throws ActorNotFoundException {
       // try {
            String msg = service.deleterecord(id);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        /*} catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }*/
    }

    @PatchMapping("/updateMobileNo/{id}/{newNo}")
    public ResponseEntity<String> changeActorMobileNo(@PathVariable("id") int id, @PathVariable("newNo") Long newNo) {
        try {
            String msg = service.updateActorMobileNo(id, newNo);
            return new ResponseEntity<>(msg, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}



//@GetMapping("/report")
//public ResponseEntity<Iterable<Actor>>fetchAllActor(){
//	try {
//		//use service
//		Iterable<Actor>list=service.getAllActor();
//	     return new ResponseEntity<Iterable<Actor>>(list,HttpStatus.OK);
//	}catch(Exception e) {
//		e.printStackTrace();
//	   return new ResponseEntity(HttpStatus.OK);
//	}
//}