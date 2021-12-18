package systems.hexon.petclinic.models;

import java.io.Serializable;

/**********************************************************************************************************************\
 *                                   Copyright (C) 2021 Duy Kh. Van Ba duyvbkh134@gmail.com                             *
 *                                                                                                                      *
 *                                   This file is part of Document Management System (DoMa).                            *
 *                                                                                                                      *
 *                                 -----------------PROPRIETARY INFORMATION-----------------                            *
 *                                                                                                                      *
 *                                                 Pet Clinic can NOT be copied                                            *
 *                                                                                                                      *
 *                              and/or distributed without the express permission of Duy Kh. Van Ba                     *
 \**********************************************************************************************************************/

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
