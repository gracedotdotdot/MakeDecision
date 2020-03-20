package com.example.circularmarket;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static com.example.circularmarket.Choice.setViewByItem;

public class GreenHatCon extends AppCompatActivity {

    private TextView mChoice1, mChoice2;
    private TextView mtextCon11,mtextCon12, mtextCon13, mtextCon14,mtextCon15, mtextCon16;
    private TextView mtextCon21,mtextCon22, mtextCon23, mtextCon24,mtextCon25, mtextCon26;
    private ConstraintLayout mLayout11,mLayout12, mLayout13, mLayout14,mLayout15, mLayout16;
    private ConstraintLayout mLayout21,mLayout22, mLayout23, mLayout24,mLayout25, mLayout26;
    private CheckBox mcheckAddCon11, mcheckAddCon12, mcheckAddCon13, mcheckAddCon14, mcheckAddCon15, mcheckAddCon16;
    private CheckBox mcheckAddCon21, mcheckAddCon22,mcheckAddCon23,mcheckAddCon24,mcheckAddCon25,mcheckAddCon26;
    EditText msub1,msub2,msub3,msub4,msub5,msub6;
    EditText msub21,msub22,msub23,msub24,msub25,msub26;

    private ArrayList<ConstraintLayout> layoutList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutList2 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<TextView> tvList1 = new ArrayList<>();
    private ArrayList<TextView> tvList2 = new ArrayList<>();
    ArrayList<EditText> subList1 = new ArrayList<>();
    ArrayList<EditText> subList2 = new ArrayList<>();
    ArrayList<CheckBox>checkAddConList1 = new ArrayList<>();
    ArrayList<CheckBox> checkAddConList2 = new ArrayList<>();
    private ImageButton mcheckcheck;
    private ImageButton mbtnBack;
    ImageButton mbtnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.green_hat_con);

        mcheckcheck = findViewById(R.id.btncheck);
        mcheckcheck.setOnClickListener(btnCheckOnClick);
        mbtnBack = findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(btnBackOnClick);
        mbtnInfo = findViewById(R.id.btninfo);
        mbtnInfo.setOnClickListener(btninfoOnclick);

        mChoice1 = findViewById(R.id.choice1);
        mChoice2 = findViewById(R.id.choice2);
        mChoice1.setText(CreateFragment.mQuestion.choice1.choiceName);
        mChoice2.setText(CreateFragment.mQuestion.choice2.choiceName);
        
        msub1 = findViewById(R.id.sub1);
        msub2 = findViewById(R.id.sub2);
        msub3 = findViewById(R.id.sub3);
        msub4 = findViewById(R.id.sub4);
        msub5 = findViewById(R.id.sub5);
        msub6 = findViewById(R.id.sub6);

        msub21 = findViewById(R.id.sub21);
        msub22 = findViewById(R.id.sub22);
        msub23 = findViewById(R.id.sub23);
        msub24 = findViewById(R.id.sub24);
        msub25 = findViewById(R.id.sub25);
        msub26 = findViewById(R.id.sub26);


        //Assign constraint layout id
        mLayout11 = findViewById(R.id.constraintLayout11);
        mLayout12 = findViewById(R.id.constraintLayout12);
        mLayout13 = findViewById(R.id.constraintLayout13);
        mLayout14 = findViewById(R.id.constraintLayout14);
        mLayout15 = findViewById(R.id.constraintLayout15);
        mLayout16 = findViewById(R.id.constraintLayout16);

        mLayout21 = findViewById(R.id.constraintLayout21);
        mLayout22 = findViewById(R.id.constraintLayout22);
        mLayout23 = findViewById(R.id.constraintLayout23);
        mLayout24 = findViewById(R.id.constraintLayout24);
        mLayout25 = findViewById(R.id.constraintLayout25);
        mLayout26 = findViewById(R.id.constraintLayout26);

        //Assign textview id
        mtextCon11 = findViewById(R.id.TextView11);
        mtextCon12 = findViewById(R.id.TextView12);
        mtextCon13 = findViewById(R.id.TextView13);
        mtextCon14 = findViewById(R.id.TextView14);
        mtextCon15 = findViewById(R.id.TextView15);
        mtextCon16 = findViewById(R.id.TextView16);

        mtextCon21 = findViewById(R.id.TextView21);
        mtextCon22 = findViewById(R.id.TextView22);
        mtextCon23 = findViewById(R.id.TextView23);
        mtextCon24 = findViewById(R.id.TextView24);
        mtextCon25 = findViewById(R.id.TextView25);
        mtextCon26 = findViewById(R.id.TextView26);

        //Assign Imgcheck id
        mcheckAddCon11 = findViewById(R.id.checkAddCon11);
        mcheckAddCon12 = findViewById(R.id.checkAddCon12);
        mcheckAddCon13 = findViewById(R.id.checkAddCon13);
        mcheckAddCon14 = findViewById(R.id.checkAddCon14);
        mcheckAddCon15 = findViewById(R.id.checkAddCon15);
        mcheckAddCon16 = findViewById(R.id.checkAddCon16);

        mcheckAddCon21 = findViewById(R.id.checkAddCon21);
        mcheckAddCon22 = findViewById(R.id.checkAddCon22);
        mcheckAddCon23 = findViewById(R.id.checkAddCon23);
        mcheckAddCon24 = findViewById(R.id.checkAddCon24);
        mcheckAddCon25 = findViewById(R.id.checkAddCon25);
        mcheckAddCon26 = findViewById(R.id.checkAddCon26);

        tvList1.add(mtextCon11);
        tvList1.add(mtextCon12);
        tvList1.add(mtextCon13);
        tvList1.add(mtextCon14);
        tvList1.add(mtextCon15);
        tvList1.add(mtextCon16);

        tvList2.add(mtextCon21);
        tvList2.add(mtextCon22);
        tvList2.add(mtextCon23);
        tvList2.add(mtextCon24);
        tvList2.add(mtextCon25);
        tvList2.add(mtextCon26);

        layoutList1.add(mLayout11);
        layoutList1.add(mLayout12);
        layoutList1.add(mLayout13);
        layoutList1.add(mLayout14);
        layoutList1.add(mLayout15);
        layoutList1.add(mLayout16);

        layoutList2.add(mLayout21);
        layoutList2.add(mLayout22);
        layoutList2.add(mLayout23);
        layoutList2.add(mLayout24);
        layoutList2.add(mLayout25);
        layoutList2.add(mLayout26);

        checkAddConList1.add(mcheckAddCon11);
        checkAddConList1.add(mcheckAddCon12);
        checkAddConList1.add(mcheckAddCon13);
        checkAddConList1.add(mcheckAddCon14);
        checkAddConList1.add(mcheckAddCon15);
        checkAddConList1.add(mcheckAddCon16);

        checkAddConList2.add(mcheckAddCon21);
        checkAddConList2.add(mcheckAddCon22);
        checkAddConList2.add(mcheckAddCon23);
        checkAddConList2.add(mcheckAddCon24);
        checkAddConList2.add(mcheckAddCon25);
        checkAddConList2.add(mcheckAddCon26);

        subList1.add(msub1);
        subList1.add(msub2);
        subList1.add(msub3);
        subList1.add(msub4);
        subList1.add(msub5);
        subList1.add(msub6);

        subList2.add(msub21);
        subList2.add(msub22);
        subList2.add(msub23);
        subList2.add(msub24);
        subList2.add(msub25);
        subList2.add(msub26);

        for(EditText sub: subList1) {
            sub.setText("");
            sub.setVisibility(View.GONE);
        }
        for(EditText sub: subList2)
            sub.setVisibility(View.GONE);

        // Set textview of cons to the board
        setViewByItem(layoutList1, tvList1, CreateFragment.mQuestion.choice1.cons);
        setViewByItem(layoutList2, tvList2, CreateFragment.mQuestion.choice2.cons);


//        for(int i=0; i<6; i++){
//            addSubstitute(layoutList1.get(i), tvList1.get(i), subList1.get(i));
//            addSubstitute(layoutList2.get(i), tvList2.get(i), subList2.get(i));
//        }

        for(CheckBox check1: checkAddConList1){
            check1.setOnClickListener(checkSubOnClick1);
        }
        for(CheckBox check2: checkAddConList2){
            check2.setOnClickListener(checkSubOnClick2);
        }
    }
    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<subList1.size(); i++)
                CreateFragment.mQuestion.choice1.cons[i].substitute = subList1.get(i).getText().toString();
            for(int i=0; i<subList2.size(); i++)
                CreateFragment.mQuestion.choice2.cons[i].substitute = subList2.get(i).getText().toString();

            for(int i=0; i<CreateFragment.mQuestion.choice1.cons.length;i++)
                Log.d("checkOnClick","substitute"+CreateFragment.mQuestion.choice1.cons[i].substitute);
            //go to green hat activity 2
            Intent intent = new Intent(GreenHatCon.this, RedHatPro.class);
            startActivity(intent);
            finish();
        }
    };
    CheckBox.OnClickListener checkSubOnClick1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            checkSub(checkAddConList1, subList1);
        }
    };
    CheckBox.OnClickListener checkSubOnClick2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            checkSub(checkAddConList2, subList2);
        }
    };
    public void checkSub(ArrayList<CheckBox> checkAddConList, ArrayList<EditText> subList){
        Log.e("checkSubOnCheck","On check");
        for(CheckBox check: checkAddConList){
            int Visibility = GONE;
            if(check.isChecked())  Visibility=VISIBLE;
            Log.e("checkSubOnCheck","check id"+check.toString()+"is checked");
            Log.e("checkSubOnCheck","check parent id="+check.getParent().toString());
            for(EditText sub: subList){
                Log.e("checkSubOnCheck","sub id = "+sub.toString());
                Log.e("checkSubOnCheck","sub parent id="+sub.getParent().toString());
                if(check.getParent()==sub.getParent())
                    sub.setVisibility(Visibility);
            }
            System.out.println("--------------------------------\n");

        }
    }
    private ImageButton.OnClickListener btnBackOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<subList1.size(); i++)
                CreateFragment.mQuestion.choice1.cons[i].substitute = subList1.get(i).getText().toString();
            for(int i=0; i<subList2.size(); i++)
                CreateFragment.mQuestion.choice2.cons[i].substitute = subList2.get(i).getText().toString();

            //go to yellow hat activity
            Intent intent = new Intent(GreenHatCon.this, GreenHatPro.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btninfoOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GreenHatCon.this);
            alertDialogBuilder.setTitle("綠帽說明");
            alertDialogBuilder.setMessage(
                    "1. 綠帽代表創新，很多時候我們會猶豫是因為我們被選項所限制住，逃避該壞處，但有時候壞處沒有我們想像中嚴重或困難" +
                            "，因此可以想想是否能透過哪些方法，解決該選項的壞處\n"
                            +"2. 若有，請將該壞處打勾，並將解決方法列下來\n");
            alertDialogBuilder.setPositiveButton("我知道了",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {

                        }
                    });


            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    };
}
