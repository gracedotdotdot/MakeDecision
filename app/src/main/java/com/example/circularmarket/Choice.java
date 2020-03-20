package com.example.circularmarket;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;



    public class Choice {
        public String choiceName;
        public Item[] pros;
        public Item[] cons;
        public double score;
        public Choice(String choiceName){
            this.choiceName = choiceName;
            this.pros = new Item[6];
            this.cons = new Item[6];
            this.score =1;
            for(int i=0; i<6; i++) {
                pros[i] = new Item();
                cons[i] = new Item();
            }
        }
        //Object of pros or cons
        public class Item{
            public String itemName;     //Yellow Hat, Black Hat
            public Boolean fact;        //White Hat
            public String substitute;   //Green Hat
            public int importance;
            public Item(){
                this.itemName = "";
                this.fact = false;
                this.substitute = "";
                this.importance = 1;
            }
        }
        //Set textview
        public static void setViewByItem(ArrayList<ConstraintLayout> lyList, ArrayList<TextView> tvList, Choice.Item[] itemsArray){
            for(int i=0; i<itemsArray.length; i++){
                Log.e("setViewByItem layout",lyList.get(i).toString());
                Log.e("setViewByItem",tvList.get(i).toString());
                if(itemsArray[i]!=null && !itemsArray[i].itemName.equals("")){
                    Log.e("setViewByItem","tvlist set string="+itemsArray[i].itemName);
                    tvList.get(i).setText(itemsArray[i].itemName);
                    lyList.get(i).setVisibility(View.VISIBLE);
                }else {
                    Log.e("setViewByItem","NULL");
                    lyList.get(i).setVisibility(View.INVISIBLE);
                }
                System.out.println("-------------------------------------------\n");
            }
            System.out.println("=========================================== \n");
        }
        //set editText
        public static void setTextByItem(ArrayList<ConstraintLayout> lyList, ArrayList<EditText> etxList, Choice.Item[] itemsArray){
            etxList.get(0).setText(itemsArray[0].itemName);
            lyList.get(0).setVisibility(View.VISIBLE);
            for(int i=1; i<itemsArray.length; i++){
                Log.e("setViewByItem layout",lyList.get(i).toString());
                Log.e("setViewByItem",etxList.get(i).toString());
                if(itemsArray[i]!=null){
                    if(!itemsArray[i].itemName.equals("")){
                        Log.e("setViewByItem","tvlist set string="+itemsArray[i].itemName);
                        etxList.get(i).setText(itemsArray[i].itemName);
                        lyList.get(i).setVisibility(View.VISIBLE);
                    }else {
                        Log.e("setViewByItem","NULL");
                        lyList.get(i).setVisibility(View.INVISIBLE);
                    }
                }
                System.out.println("-------------------------------------------\n");
            }
            System.out.println("=========================================== \n");
        }
        public static void setSubstitute(ArrayList<ConstraintLayout> lyList, ArrayList<EditText> etxList, Choice.Item[] itemsArray, ArrayList<CheckBox> checkList){
            for(int i=0; i<itemsArray.length; i++){
                Log.e("setViewByItem layout",lyList.get(i).toString());
                Log.e("setViewByItem",etxList.get(i).toString());
                if(itemsArray[i]!=null){
                    if(!itemsArray[i].substitute.equals("")){
                        Log.e("setViewByItem","tvlist set string="+itemsArray[i].itemName);
                        etxList.get(i).setText(itemsArray[i].substitute);
                        etxList.get(i).setVisibility(View.VISIBLE);
                        checkList.get(i).setChecked(true);
                    }else {
                        Log.e("setViewByItem","NULL");
                        etxList.get(i).setVisibility(View.INVISIBLE);
                        checkList.get(i).setChecked(false);
                    }
                }
                System.out.println("-------------------------------------------\n");
            }
            System.out.println("=========================================== \n");
        }
        public void addImportance(Choice.Item[] mchoiceItem, ArrayList<TextView> tvList, ArrayList<NumberPicker> npList){
            int npValue=1;
            for(int i=0; i<mchoiceItem.length; i++){
                for(TextView tv: tvList){
                    if(tv.getText().toString().equals(mchoiceItem[i].itemName)){
                        for(NumberPicker np: npList){
                            if(np.getParent()==tv.getParent())
                                npValue = np.getValue();
                        }
                        mchoiceItem[i].importance = npValue;
                        Log.d("checkOnClick","item "+mchoiceItem[i].itemName);
                        Log.d("checkOnClick","importance "+mchoiceItem[i].importance);
                    }
                }
            }
        }
    }



