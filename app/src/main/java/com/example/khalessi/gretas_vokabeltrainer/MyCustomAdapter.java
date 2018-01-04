package com.example.khalessi.gretas_vokabeltrainer;

/**
 * Created by Alexandra Filbert on 04.01.18.
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.khalessi.gretas_vokabeltrainer.database_vocabulary.Units;

import java.util.ArrayList;


public class MyCustomAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Units> car;

    public MyCustomAdapter(Context context, int textViewResourceId, ArrayList objects) {
        super(context, textViewResourceId, objects);

        this.context = context;
        car = objects;

    }

    private class ViewHolder {
        TextView carName;
        TextView carColor;
        TextView carPlace;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.car_details, null);

            holder = new ViewHolder();
            holder.carColor = (TextView) convertView.findViewById(R.id.carColor);
            holder.carName = (TextView) convertView.findViewById(R.id.carName);
            holder.carPlace = (TextView) convertView.findViewById(R.id.carPlace);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Units individualCar = car.get(position);
        holder.carPlace.setText("Car Place: " + individualCar.getDescription() + "");
        holder.carName.setText("Car Name: " + individualCar.getUser() + "");
        holder.carColor.setText("Car Color: " + individualCar.getUnitId());
        return convertView;


    }
}
