package com.blogging.blogapp.exceptions;

import org.apache.logging.log4j.message.StringFormattedMessage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{

    String resourceName;
    String fieldName;
    long fieldValue;

    public ResourceNotFoundException(String resourceName,String fieldName ,long fieldValue) {
        super(String.format("%s not found with this %s : %s" , resourceName,fieldName ,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }


}

