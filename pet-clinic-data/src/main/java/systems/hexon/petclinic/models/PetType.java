package systems.hexon.petclinic.models;

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

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
