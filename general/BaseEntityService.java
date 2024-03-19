package com.orhankaya.n11h2.general;

import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

@Getter
public abstract class BaseEntityService<E extends BaseEntity, R extends JpaRepository<E, Long>> {

    private final R repository;

    protected BaseEntityService(R repository) {
        this.repository = repository;
    }

    public E save(E entity) {

        BaseAdditionalFields baseAdditionalFields = entity.getBaseAdditionalFields();
        if (baseAdditionalFields == null) {
            baseAdditionalFields = new BaseAdditionalFields();
        }

        LocalDateTime now = LocalDateTime.now();
        if (entity.getId() == null) {
            // yeni kayıt
            baseAdditionalFields.setCreateDate(now);
            //entity.getBaseAdditionalFields().setCreatorId();
        }

        baseAdditionalFields.setUpdateDate(now);
        //entity.getBaseAdditionalFields().setUpdaterId();
        entity.setBaseAdditionalFields(baseAdditionalFields);

        entity = repository.save(entity);
        return entity;
    }


}
