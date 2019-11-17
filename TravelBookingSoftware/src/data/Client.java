package data;

import java.util.Date;

public class Client {

	private String clientID, firstName, lastName,adress,email,telephone;
	private Date birthDate;
	
	public String getFirstName() {return this.firstName;}
	public String getLastName() {return this.lastName;}
	public String getClientID() {return this.clientID;}
	public String getAdress() {return this.adress;}
	public String getEmail() {return this.email;}
	public String getTelephone() {return this.telephone;}
	public Date getBirthDay() {return (Date) this.birthDate.clone();}
	
	public Client(String clientID,String firstName,String lastName,String adress, String email,String telephone, Date birthDate) {
		this.clientID = clientID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.telephone = telephone;
		this.email = email;
		this.birthDate = birthDate;
	}
	

}