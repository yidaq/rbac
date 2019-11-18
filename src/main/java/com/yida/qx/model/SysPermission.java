package com.yida.qx.model;

import lombok.Data;

import java.util.List;

@Data
public class SysPermission extends BaseEntity<Integer> {

	private static final long serialVersionUID = -6525908145032868837L;
	private Integer parentId;
	private String name;
	private String css;
	private String href;
	private Integer type;
	private String permission;
	private Integer sort;

	private List<SysPermission> child;

	@Override
	public String toString() {
		return "SysPermission{" +
				"parentId=" + parentId +
				", name='" + name + '\'' +
				", css='" + css + '\'' +
				", href='" + href + '\'' +
				", type=" + type +
				", permission='" + permission + '\'' +
				", sort=" + sort +
				'}';
	}
}
