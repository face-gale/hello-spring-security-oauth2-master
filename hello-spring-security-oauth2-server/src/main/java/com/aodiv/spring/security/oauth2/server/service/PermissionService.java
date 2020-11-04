package com.aodiv.spring.security.oauth2.server.service;

import com.aodiv.spring.security.oauth2.server.domain.PermissionDO;

import java.util.List;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/11/03
 */
public interface PermissionService {
    List<PermissionDO> getByUserId(Long id);
}
