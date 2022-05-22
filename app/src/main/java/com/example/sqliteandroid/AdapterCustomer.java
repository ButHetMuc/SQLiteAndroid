package com.example.sqliteandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterCustomer extends BaseAdapter {
    private List<Contact> contactList;
    private Context context;
    private int layout;

    public AdapterCustomer(List<Contact> contactList, Context context, int layout) {
        this.contactList = contactList;
        this.context = context;
        this.layout = layout;
    }

    @Override

    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return contactList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(layout,null);

        TextView name = view.findViewById(R.id.id_tv_name);
        Contact contact = contactList.get(i);
        name.setText(contact.getName());
        return view;
    }
}
