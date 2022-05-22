package com.example.sqliteandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Log.d("Insert","Inserting...");
//        databaseHandler.addContact(new Contact("ravi","0977777777"));
//        databaseHandler.addContact(new Contact("alexandro","0977777777"));
//        databaseHandler.addContact(new Contact("contantinus","0977777777"));
//        databaseHandler.addContact(new Contact("melmed1","0977777777"));

        Log.d("Read","Reading...");
        List<Contact> contacts = databaseHandler.getAllContacts();
        for (Contact contact: contacts){
            String log = "id: "+ contact.getId()+ "name: "+ contact.getName()+ "phone: "+contact.getPhoneNumber();
            Log.d("Name",log);
        }
    }
}