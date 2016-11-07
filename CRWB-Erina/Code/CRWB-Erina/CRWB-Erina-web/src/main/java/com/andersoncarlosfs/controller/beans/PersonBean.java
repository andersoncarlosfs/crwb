package com.andersoncarlosfs.controller.beans;

import com.andersoncarlosfs.controller.services.PersonService;
import com.andersoncarlosfs.model.AbstractController;
import com.andersoncarlosfs.model.AbstractConverter;
import com.andersoncarlosfs.model.daos.PersonDAO;
import com.andersoncarlosfs.model.entities.Person;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
@Named
@SessionScoped
public class PersonBean extends AbstractController<PersonService, PersonDAO, Person, java.lang.Long> {

    /**
     *
     */
    @FacesConverter(forClass = Person.class)
    public static class PersonConverter extends AbstractConverter<PersonDAO, Person, java.lang.Long> implements Converter {

        /**
         *
         * @throws javax.xml.bind.JAXBException
         * @param value
         * @return
         */
        @Override
        protected java.lang.Long getKey(String value) throws JAXBException {
            return new java.lang.Long(value);
        }

    }

}
