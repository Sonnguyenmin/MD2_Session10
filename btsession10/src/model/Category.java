package model;

import interfaceLibrary.Ilibrary;
import validate.CategoryValidate;

import java.util.Scanner;

public class Category implements Ilibrary {
    private int id;
    private String name;
    private boolean status;

    public Category() {
    }

    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        this.id = CategoryValidate.inputCategoryId();
        this.name = CategoryValidate.inputCategoryName(scanner);
        this.status = CategoryValidate.inputCategoryStatus(scanner);
    }

    @Override
    public void displayData() {
        System.out.println("Category ID: " + this.id);
        System.out.println("Category Name: " + this.name);
        System.out.println("Category Status: " + (this.status ? "Active" : "Inactive"));
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\t| Name: " + this.name + "\n";
    }

    public void updateData(Scanner scanner) {
        this.name = CategoryValidate.inputCategoryName(scanner);
        this.status = CategoryValidate.inputCategoryStatus(scanner);
    }
}
