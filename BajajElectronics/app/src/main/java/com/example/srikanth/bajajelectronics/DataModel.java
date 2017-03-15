package com.example.srikanth.bajajelectronics;

import java.util.ArrayList;

/**
 * Created by srikanth on 15/3/17.
 */

public class DataModel {
    String day;
    String opentime;
    String dis;
    String closetime;

    public DataModel(String day,String opentime,String dis,String closetime)
    {
          this.day = day;
        this.opentime = opentime;
        this.dis=dis;
        this.closetime = closetime;


    }


    public static ArrayList<DataModel> getUsers() {
        ArrayList<DataModel> users = new ArrayList<DataModel>();
        users.add(new DataModel("Monday",                                    "10AM","to","11pm"));
        users.add(new DataModel("Tuesday"                     , "10AM","to","11pm"));
        users.add(new DataModel("Wednesday", "10AM","to","11pm"));
        users.add(new DataModel("Thursday", "10AM","to","11pm"));
        users.add(new DataModel("Friday", "10AM","to","11pm"));
        users.add(new DataModel("Saturday", "10AM","to","11pm"));
        users.add(new DataModel("Sunday", "10AM","to","11pm"));
        return users;
    }

}
