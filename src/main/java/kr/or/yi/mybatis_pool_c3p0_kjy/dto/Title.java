package kr.or.yi.mybatis_pool_c3p0_kjy.dto;

public class Title {
	private int code;
	private String name;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Title [code=%s, name=%s]", code, name);
	}

}
