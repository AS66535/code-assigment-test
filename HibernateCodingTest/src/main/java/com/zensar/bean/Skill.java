package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Skill {
	
  
	String skillName;
    
	int skilllevel;
	
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getSkilllevel() {
		return skilllevel;
	}
	public void setSkilllevel(int skilllevel) {
		this.skilllevel = skilllevel;
	}
	public Skill(String skillName, int skilllevel) {
		super();
		this.skillName = skillName;
		this.skilllevel = skilllevel;
	}
	public Skill(int skilllevel) {
		super();
		this.skilllevel = skilllevel;
	}
	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}
	public Skill() {
		super();
	}
	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", skilllevel=" + skilllevel + "]";
	}
	
}
