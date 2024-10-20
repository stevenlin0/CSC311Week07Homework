package org.example.javafxdb_sql_shellcode;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.example.javafxdb_sql_shellcode.models.Person;

public class PrimaryController {

    // This is where people input first name, last name, department, major, and course.
    @FXML
    private TextField firstNameField, lastNameField, deptField, majorField, courseField;

    // This is a table that shows a list of people.
    @FXML
    private TableView<Person> personTable;

    // This is a table column that display the id, first name, last name, department, major, and course of each person.
    @FXML
    private TableColumn<Person, Integer> idColumn;
    @FXML
    private TableColumn<Person, String> firstNameColumn, lastNameColumn, deptColumn, majorColumn, courseColumn;

    // This is the list of people that will be shown in the table.
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    // This is to assign unique IDs to new people.
    private int nextId = 1;

    // This method runs when the controller is initialized. It links the table columns to the person data.
    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        deptColumn.setCellValueFactory(cellData -> cellData.getValue().deptProperty());
        majorColumn.setCellValueFactory(cellData -> cellData.getValue().majorProperty());
        courseColumn.setCellValueFactory(cellData -> cellData.getValue().courseProperty());

        personTable.setItems(personData);  // This set the table's data to the personData list.
    }

    // This method clears all the text fields.
    @FXML
    private void handleClearFields() {
        firstNameField.clear();
        lastNameField.clear();
        deptField.clear();
        majorField.clear();
        courseField.clear();
    }

    // This method adds a new person to the table using the values entered in the text fields.
    @FXML
    private void handleAddPerson() {
        // This creates a new Person object using the entered details and add it to the personData list.
        Person newPerson = new Person(nextId++, firstNameField.getText(), lastNameField.getText(), deptField.getText(), majorField.getText(), courseField.getText());
        personData.add(newPerson);
        handleClearFields();
    }

    // This method allows editing an existing person's details.
    @FXML
    private void handleEditPerson() {
        // Get the selected person from the table.
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            // This updates the person's details with the new values entered in the text fields.
            selectedPerson.setFirstName(firstNameField.getText());
            selectedPerson.setLastName(lastNameField.getText());
            selectedPerson.setDept(deptField.getText());
            selectedPerson.setMajor(majorField.getText());
            selectedPerson.setCourse(courseField.getText());
            personTable.refresh();
        }
    }

    // This method removes the selected person from the table.
    @FXML
    private void handleDeletePerson() {
        // Get the selected person from the table.
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            // This removes the person from the personData list and removes them from the table.
            personData.remove(selectedPerson);
        }
    }
}