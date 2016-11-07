package com.andersoncarlosfs.controller.beans;

import com.andersoncarlosfs.controller.services.AccountService;
import com.andersoncarlosfs.model.AbstractController;
import com.andersoncarlosfs.model.AbstractConverter;
import com.andersoncarlosfs.model.daos.AccountDAO;
import com.andersoncarlosfs.model.entities.Account;
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
public class AccountBean extends AbstractController<AccountService, AccountDAO, Account, java.lang.Long> {

    /**
     *
     */
    @FacesConverter(forClass = Account.class)
    public static class AccountConverter extends AbstractConverter<AccountDAO, Account, java.lang.Long> implements Converter {

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
