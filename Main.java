import java.awt.*;
import java.awt.event.*;

class RegistrationForm extends Frame {

	RegistrationForm() {

		super("User Registration Form");
		setSize(1000, 700);
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(53, 59, 72);
		setBackground(formColor);

		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont = new Font("arial", Font.PLAIN, 18);
		Font textFont = new Font("arial", Font.PLAIN, 15);

		Label title = new Label("AJAY KUMAR GARG ENGINEERING COLLEGE");
		title.setBounds(225, 40, 650, 50);
		title.setFont(titleFont);
		title.setForeground(Color.YELLOW);
		add(title);

		Label name = new Label("Name :");
		name.setBounds(200, 100, 150, 30);
		name.setFont(labelFont);
		name.setForeground(Color.WHITE);
		add(name);

		TextField nameField = new TextField();
		nameField.setBounds(400, 100, 400, 30);
		nameField.setFont(textFont);
		add(nameField);

		Label roll = new Label("Roll No. :");
		roll.setBounds(200, 150, 150, 30);
		roll.setFont(labelFont);
		roll.setForeground(Color.WHITE);
		add(roll);

		TextField rollField = new TextField();
		rollField.setBounds(400, 150, 400, 30);
		rollField.setFont(textFont);
		add(rollField);

		Label branch = new Label("Branch :");
		branch.setBounds(200, 200, 150, 30);
		branch.setFont(labelFont);
		branch.setForeground(Color.WHITE);
		add(branch);

		Choice branchField = new Choice();
		branchField.setFont(textFont);
		branchField.setBounds(400, 200, 400, 50);
		branchField.add("CSE");
		branchField.add("CS");
		branchField.add("IT");
		branchField.add("CSIT");
		branchField.add("Civil");
		add(branchField);

		Label contact = new Label("Contact :");
		contact.setBounds(200, 250, 150, 30);
		contact.setFont(labelFont);
		contact.setForeground(Color.WHITE);
		add(contact);

		TextField contactField = new TextField();
		contactField.setBounds(400, 250, 400, 30);
		contactField.setFont(textFont);
		add(contactField);

		Label gender = new Label("Gender :");
		gender.setBounds(200, 300, 150, 30);
		gender.setFont(labelFont);
		gender.setForeground(Color.WHITE);
		add(gender);

		CheckboxGroup genderGroup = new CheckboxGroup();

		Checkbox male = new Checkbox("Male", genderGroup, true);
		male.setBounds(400, 300, 100, 30);
		male.setFont(labelFont);
		male.setForeground(Color.WHITE);
		add(male);

		Checkbox female = new Checkbox("Female", genderGroup, false);
		female.setBounds(500, 300, 100, 30);
		female.setFont(labelFont);
		female.setForeground(Color.WHITE);
		add(female);

		Label city = new Label("City :");
		city.setBounds(200, 350, 150, 30);
		city.setFont(labelFont);
		city.setForeground(Color.WHITE);
		add(city);

		Choice cityField = new Choice();
		cityField.setFont(textFont);
		cityField.setBounds(400, 350, 400, 50);
		cityField.add("Lucknow");
		cityField.add("Kanpur");
		cityField.add("Ghaziabad");
		cityField.add("Banaras");
		cityField.add("Prayagraj");
		add(cityField);

		Label username = new Label("Username :");
		username.setBounds(200, 400, 150, 30);
		username.setFont(labelFont);
		username.setForeground(Color.WHITE);
		add(username);

		TextField usernameField = new TextField();
		usernameField.setBounds(400, 400, 400, 30);
		usernameField.setFont(textFont);
		add(usernameField);

		Label password = new Label("Password :");
		password.setBounds(200, 450, 150, 30);
		password.setFont(labelFont);
		password.setForeground(Color.WHITE);
		add(password);

		TextField passwordField = new TextField();
		passwordField.setBounds(400, 450, 400, 30);
		passwordField.setFont(textFont);
		add(passwordField);

		Label hint = new Label("Hint Question :");
		hint.setBounds(200, 500, 150, 30);
		hint.setFont(labelFont);
		hint.setForeground(Color.WHITE);
		add(hint);

		Choice hintField = new Choice();
		hintField.setFont(textFont);
		hintField.setBounds(400, 500, 400, 50);
		hintField.add("Name of your first school");
		hintField.add("Name of your pet");
		hintField.add("Place you were born");
		hintField.add("Name of your favourite sport");
		add(hintField);

		Label answer = new Label("Answer :");
		answer.setBounds(200, 550, 150, 30);
		answer.setFont(labelFont);
		answer.setForeground(Color.WHITE);
		add(answer);

		TextField answerField = new TextField();
		answerField.setBounds(400, 550, 400, 30);
		answerField.setFont(textFont);
		add(answerField);

		Button submitBtn = new Button("Submit");
		submitBtn.setBounds(400, 600, 130, 35);
		submitBtn.setFont(labelFont);
		submitBtn.setBackground(Color.BLACK);
		submitBtn.setForeground(Color.YELLOW);
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
		new RegistrationForm();
	}
}