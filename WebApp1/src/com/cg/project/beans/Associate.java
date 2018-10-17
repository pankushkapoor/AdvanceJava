package com.cg.project.beans;

public class Associate{
		private int associateId;
		private String userName, firstName, lastName, email, birthDate, password;
		private String []hobbies;
		public Associate() {
			super();
		}
		public Associate(int associateId, String password) {
			super();
			this.associateId = associateId;
			this.password = password;
		}
		
		public Associate(String userName, String password) {
			super();
			this.userName = userName;
			this.password = password;
		}
		
		public Associate(int associateId, String userName, String firstName,
				String lastName, String email, String birthDate,
				String password, String[] hobbies) {
			super();
			this.associateId = associateId;
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.birthDate = birthDate;
			this.password = password;
			this.hobbies = hobbies;
		}
		public int getAssociateId() {
			return associateId;
		}
		public void setAssociateId(int associateId) {
			this.associateId = associateId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String[] getHobbies() {
			return hobbies;
		}
		public void setHobbies(String[] hobbies) {
			this.hobbies = hobbies;
		}
		
}
