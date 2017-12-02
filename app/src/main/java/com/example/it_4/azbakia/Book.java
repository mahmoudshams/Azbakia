package com.example.it_4.azbakia;

import android.content.Context;

/**
 * Created by IT-4 on 22/11/2017.
 */

public class Book  {
    private String name;
    private String pic;
    private int picid;


        public Book(String bname,String bpic,int bpicid){
            name=bname;
            pic=bpic;
            picid=bpicid;

        }

        public String getName(){
            return name;
        }
        public String getPic(){
            return pic;
        }
        public int getPicid(){return picid; }


}
