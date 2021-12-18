package systems.hexon.petclinic.services;

import systems.hexon.petclinic.models.Pet;

import java.util.Set;

/**********************************************************************************************************************
*                                   Copyright (C) 2021 Duy Kh. Van Ba duyvbkh134@gmail.com                             *
*                                                                                                                      *
*                                This file is part of Pet Clinic (Spring Boot Learning Demo).                          *
*                                                                                                                      *
*                                 -----------------PROPRIETARY INFORMATION-----------------                            *
*                                                                                                                      *
*                                                 Pet Clinic can NOT be copied                                         *
*                                                                                                                      *
*                              and/or distributed without the express permission of Duy Kh. Van Ba                     *
**********************************************************************************************************************/

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
