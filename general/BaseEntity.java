package com.orhankaya.n11h2.general;

import com.orhankaya.n11h2.dao.ProductRepository;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements BaseModel {

    @Embedded
    private BaseAdditionalFields baseAdditionalFields;

}

