package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="Course_ID")
	    private int courseId;

	    @Column(name="Course_Name")
	    private String courseName;
	    
	    @Column(name="Course_Rating")
	    private float courseRating;

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public float getCourseRating() {
			return courseRating;
		}

		public void setCourseRating(float courseRating) {
			this.courseRating = courseRating;
		}
	    
	    
	    
}
