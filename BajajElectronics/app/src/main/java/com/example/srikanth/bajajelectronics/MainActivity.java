package com.example.srikanth.bajajelectronics;

import android.content.Context;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private Context context;

  //  String[] values = new String[]{"Monday                 10AM  TO  11pm","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main1);






        paulateUsersList();
    }
    private void paulateUsersList() {
         ArrayList<DataModel> arrayofUsers =DataModel.getUsers();

        ModelAdapter adapter=new ModelAdapter(this,arrayofUsers);

        //  ArrayAdapter adapter = new ArrayAdapter<String>(this,
        //        R.layout.activity_listview,R.id.label, values);

        final ListView listView = (ListView)findViewById(R.id.days_list);


      listView.setAdapter(adapter);
    }

    public class ModelAdapter extends ArrayAdapter<DataModel>

    {

        public ModelAdapter(Context context, ArrayList<DataModel> users) {

            super(context, 0, users);
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            DataModel user = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_listview, parent, false);
            }
            // Lookup view for data population
            TextView tvName1 = (TextView) convertView.findViewById(R.id.label);
            TextView tvHome2 = (TextView) convertView.findViewById(R.id.label1);
            TextView tvHome3 = (TextView) convertView.findViewById(R.id.label2);
            TextView tvHome4 = (TextView) convertView.findViewById(R.id.label3);
            // Populate the data into the template view using the data object
            tvName1.setText(user.day);
            tvHome2.setText(user.opentime);
            tvHome3.setText(user.dis);
            tvHome4.setText(user.closetime);
            // Return the completed view to render on screen
            return convertView;


        }
    }
}
