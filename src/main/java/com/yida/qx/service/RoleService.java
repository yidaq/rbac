package com.yida.qx.service;

import com.yida.qx.base.result.Results;
import com.yida.qx.dto.RoleDto;
import com.yida.qx.model.SysRole;

public interface RoleService {

	Results<SysRole> getAllRoles();

	Results<SysRole> getAllRolesByPage(Integer offset, Integer limit);

	Results<SysRole> save(RoleDto roleDto);

	SysRole getRoleById(Integer id);

	Results update(RoleDto roleDto);

	Results delete(Integer id);

	Results<SysRole> getRoleByFuzzyRoleNamePage(String roleName, Integer offset, Integer limit);
}
