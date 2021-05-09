package com.lqt.duynguyenhairsalon.Model.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lqt.duynguyenhairsalon.Model.DayCut;
import com.lqt.duynguyenhairsalon.R;

import java.util.List;

public class DayCutAdapter extends ArrayAdapter {
    public DayCutAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selected_day, parent, false);
        TextView textViewSelected = (TextView) convertView.findViewById(R.id.textView_SelectedDay);

        DayCut dayCut = (DayCut) this.getItem(position);
        if (dayCut != null){
            textViewSelected.setText("" + dayCut.getStringDayCut());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day_cut, parent, false);
        TextView textViewDay = (TextView) convertView.findViewById(R.id.textView_Day);

        DayCut dayCut = (DayCut) this.getItem(position);
        if (dayCut != null){
            textViewDay.setText("" + dayCut.getStringDayCut());
        }
        return convertView;
    }
}