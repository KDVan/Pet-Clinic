package systems.hexon.petclinic.services.map;

import systems.hexon.petclinic.models.BaseEntity;

import java.util.*;

/**********************************************************************************************************************\
*                                   Copyright (C) 2021 Duy Kh. Van Ba duyvbkh134@gmail.com                             *
*                                                                                                                      *
*                                This file is part of Pet Clinic (Spring Boot Learning Demo).                          *
*                                                                                                                      *
*                                 -----------------PROPRIETARY INFORMATION-----------------                            *
*                                                                                                                      *
*                                                 Pet Clinic can NOT be copied                                         *
*                                                                                                                      *
*                              and/or distributed without the express permission of Duy Kh. Van Ba                     *
\**********************************************************************************************************************/

public abstract class AbstractMappedService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId()
    {
        long nextId;

        try{
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}
