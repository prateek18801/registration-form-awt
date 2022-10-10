import java.awt.*;
import java.awt.event.*;

class RegistrationForm extends Frame {

	Label title, name, roll, branch, contact, gender, city, username, password, hint, answer;
	TextField nameField, rollField, contactField, usernameField, passwordField, answerField;
	Checkbox male, female;
	CheckboxGroup genderGroup;
	Choice branchField, cityField, hintField;
	Button submitBtn;

	RegistrationForm() {

		super("User Registration Form");
		setSize(1000, 800);
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(53, 59, 72);
		setBackground(formColor);

		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont = new Font("arial", Font.PLAIN, 18);
		Font textFont = new Font("arial", Font.PLAIN, 18);

		title = new Label("AJAY KUMAR GARG ENGINEERING COLLEGE");
		title.setBounds(250, 40, 650, 50);
		title.setFont(titleFont);
		title.setForeground(Color.YELLOW);
		add(title);

		name = new Label("Name :");
		name.setBounds(250, 100, 150, 30);
		name.setFont(labelFont);
		name.setForeground(Color.WHITE);
		add(name);

		nameField = new TextField();
		nameField.setBounds(400, 100, 400, 30);
		nameField.setFont(textFont);
		add(nameField);

		roll = new Label("Roll No. :");
		roll.setBounds(250, 150, 150, 30);
		roll.setFont(labelFont);
		roll.setForeground(Color.WHITE);
		add(roll);

		rollField = new TextField();
		rollField.setBounds(400, 150, 400, 30);
		rollField.setFont(textFont);
		add(rollField);

		branch = new Label("Branch :");
		branch.setBounds(250, 200, 150, 30);
		branch.setFont(labelFont);
		branch.setForeground(Color.WHITE);
		add(branch);

		branchField = new Choice();
		branchField.setFont(labelFont);
		branchField.setBounds(400, 200, 400, 50);
		branchField.add("CSE");
		branchField.add("CS");
		branchField.add("IT");
		branchField.add("CSIT");
		branchField.add("Civil");
		add(branchField);

		contact = new Label("Contact :");
		contact.setBounds(250, 250, 150, 30);
		contact.setFont(labelFont);
		contact.setForeground(Color.WHITE);
		add(contact);

		contactField = new TextField();
		contactField.setBounds(400, 250, 400, 30);
		contactField.setFont(textFont);
		add(contactField);

		gender = new Label("Gender :");
		gender.setBounds(250, 300, 150, 30);
		gender.setFont(labelFont);
		gender.setForeground(Color.WHITE);
		add(gender);

		genderGroup = new CheckboxGroup();

		male = new Checkbox("Male", genderGroup, true);
		male.setBounds(400, 300, 100, 30);
		male.setFont(labelFont);
		male.setForeground(Color.WHITE);
		add(male);

		female = new Checkbox("Female", genderGroup, false);
		female.setBounds(500, 300, 100, 30);
		female.setFont(labelFont);
		female.setForeground(Color.WHITE);
		add(female);

		city = new Label("City :");
		city.setBounds(250, 350, 150, 30);
		city.setFont(labelFont);
		city.setForeground(Color.WHITE);
		add(city);

		cityField = new Choice();
		cityField.setFont(labelFont);
		cityField.setBounds(400, 350, 400, 50);
		cityField.add("Lucknow");
		cityField.add("Kanpur");
		cityField.add("Ghaziabad");
		cityField.add("Banaras");
		cityField.add("Prayagraj");
		add(cityField);

		username = new Label("Username :");
		username.setBounds(250, 400, 150, 30);
		username.setFont(labelFont);
		username.setForeground(Color.WHITE);
		add(username);

		usernameField = new TextField();
		usernameField.setBounds(400, 400, 400, 30);
		usernameField.setFont(textFont);
		add(usernameField);

		password = new Label("Password :");
		password.setBounds(250, 450, 150, 30);
		password.setFont(labelFont);
		password.setForeground(Color.WHITE);
		add(password);

		passwordField = new TextField();
		passwordField.setBounds(400, 450, 400, 30);
		passwordField.setFont(textFont);
		add(passwordField);

		hint = new Label("Hint Question :");
		hint.setBounds(250, 500, 150, 30);
		hint.setFont(labelFont);
		hint.setForeground(Color.WHITE);
		add(hint);

		hintField = new Choice();
		hintField.setFont(labelFont);
		hintField.setBounds(400, 500, 400, 50);
		hintField.add("Name of your first school");
		hintField.add("Name of your pet");
		hintField.add("Place you were born");
		hintField.add("Name of your favourite sport");
		add(hintField);

		answer = new Label("Answer :");
		answer.setBounds(250, 550, 150, 30);
		answer.setFont(labelFont);
		answer.setForeground(Color.WHITE);
		add(answer);

		answerField = new TextField();
		answerField.setBounds(400, 550, 400, 30);
		answerField.setFont(textFont);
		add(answerField);

		submitBtn = new Button("Submit");
		submitBtn.setBounds(400, 600, 150, 30);
		submitBtn.setFont(labelFont);
		submitBtn.setBackground(Color.YELLOW);
		submitBtn.setForeground(Color.WHITE);
		add(submitBtn);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}

public class Main {
	public static void main(String[] args) {
		RegistrationForm frm = new RegistrationForm();
	}

}