package com.sanluna.model;

import com.sanluna.commons.model.BaseDTO;
import com.sanluna.commons.model.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "functions")
public class FunctionsAllowed extends BaseEntity<FunctionsAllowed> {

    private boolean browseMembers;
    private boolean importProducts;

    public boolean isImportProducts() {
        return importProducts;
    }

    public FunctionsAllowed setImportProducts(boolean importProducts) {
        this.importProducts = importProducts;
        return this;
    }

    public boolean isBrowseMembers() {
        return browseMembers;
    }

    public FunctionsAllowed setBrowseMembers(boolean browseMembers) {
        this.browseMembers = browseMembers;
        return this;
    }

    @Override
    public <T1 extends BaseDTO<T1>> T1 convertToDTO() {
        return null; // not used
    }

    @Override
    public FunctionsAllowed updateEntity(FunctionsAllowed newEntity) {
        return null;
    }
}
