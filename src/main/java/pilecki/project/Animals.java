package pilecki.project;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Animals {

	private String name;
	private int age;
	private KiOfAnim kind;
	private int releaseYear;

	public String kindString;

	public Animals(String name, KiOfAnim kind, int releaseYear, int age) {
		this.name = name;
		this.kind = kind;
		this.releaseYear = releaseYear;
		this.age = age;

		this.kindString = kindString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public KiOfAnim getKiOfAnim() {
		return kind;
	}

	public void setKiOfAnim(KiOfAnim kind) {
		this.kind = kind;
	}

	@Min(1950)
	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Min(0)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKiOfAnimString() {
		return kindString;
	}

	public void setKiOfAnimString(String KiOfAnimString) {
		this.kindString = kindString;
	}

}