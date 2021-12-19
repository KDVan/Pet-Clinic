package systems.hexon.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners.html", "/owners/index.html", "/owners/index"})
    public String listOwners() {
        return "owners/index";
    }
}
