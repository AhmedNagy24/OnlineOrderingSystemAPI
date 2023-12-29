package com.example.softassign2api.Database;

import com.example.softassign2api.Models.Category;
import com.example.softassign2api.Models.Product;

import java.util.ArrayList;

public interface CategoryDatabase {

    boolean decPartsNum(Product product, int decrement);

    boolean incPartsNum(Product product, int increment);
    ArrayList<Category> getCategories();
    Product searchProd(String name, String vendor);

}