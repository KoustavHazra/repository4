package com.userService.external;

import java.util.List;




public class Mentor {
	
	public Mentor(int mentorId, String mentorName, String mentorPassword, int mentorExperience,
			List<TechnicalCourse> technicalCourses) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.mentorPassword = mentorPassword;
		this.mentorExperience = mentorExperience;
		this.technicalCourses = technicalCourses;
	}

	public Mentor() {
		super();
	}


	private int mentorId;
	private String mentorName;
	private String mentorPassword;
	private int mentorExperience;
	

	private List<TechnicalCourse> technicalCourses;

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public String getMentorPassword() {
		return mentorPassword;
	}

	public void setMentorPassword(String mentorPassword) {
		this.mentorPassword = mentorPassword;
	}

	public int getMentorExperience() {
		return mentorExperience;
	}

	public void setMentorExperience(int mentorExperience) {
		this.mentorExperience = mentorExperience;
	}

	public List<TechnicalCourse> getTechnicalCourses() {
		return technicalCourses;
	}

	public void setTechnicalCourses(List<TechnicalCourse> technicalCourses) {
		this.technicalCourses = technicalCourses;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", mentorName=" + mentorName + ", mentorPassword=" + mentorPassword
				+ ", mentorExperience=" + mentorExperience + ", technicalCourses=" + technicalCourses + "]";
	}

	

}
