package com.quark.common.dao;

import com.quark.common.entity.AdminUser;
import com.quark.common.entity.Label;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelDao extends JpaRepository<Label,Integer> {
}
