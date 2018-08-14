package com.sinnerschrader.aem.react.tsgenerator.fromclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassBean {

	private static final Pattern pattern = Pattern.compile("([^\\.]*)$");

	private Class<?> type;

	public ClassBean(Class type) {
		this.name = type.getName();
		this.simpleName = type.getSimpleName();
		this.type = type;
		this.extern = true;
	}

	public ClassBean(String name) {
		this.name = name;
		Matcher matcher = pattern.matcher(name);
		if (matcher.find()) {
			this.simpleName = matcher.group(0);
		}
		if (simpleName.equals(name)) {
			extern = false;
		}
	}

	private String simpleName;
	private String name;

	private boolean extern;

	public String getSimpleName() {
		return simpleName;
	}

	public String getName() {
		return name;
	}

	public boolean isNumber() {
		if (this.type == null) {
			return false;
		}
		return Number.class.isAssignableFrom(this.type);
	}

	public boolean isBoolean() {
		if (this.type == null) {
			return false;
		}
		return Boolean.class.isAssignableFrom(this.type);
	}

	public boolean isString() {
		if (this.type == null) {
			return false;
		}
		return String.class.isAssignableFrom(this.type);
	}

	public boolean isExtern() {
		return extern;
	}

}
