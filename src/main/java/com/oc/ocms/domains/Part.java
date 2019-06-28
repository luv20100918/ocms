package com.oc.ocms.domains;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Date;

public class Part {

    @Id
    @GeneratedValue
    private Long id;

    private String partname;

    private String partType;

    @ElementCollection
    private Collection<String> partContents;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Date createDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private Date lastModifiedDate;
}
