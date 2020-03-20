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
import static com.example.circularmarket.Choice.setSubstitute;
import static com.example.circularmarket.Choice.setViewByItem;
import static com.example.circularmarket.CreateFragment.mQuestion;

public class GreenHatPro extends AppCompatActivity {
    private ImageButton mcheckcheck;

    private TextView mChoice1, mChoice2;
    private TextView mtextPro11,mtextPro12, mtextPro13, mtextPro14,mtextPro15, mtextPro16;
    private TextView mtextPro21,mtextPro22, mtextPro23, mtextPro24,mtextPro25, mtextPro26;
    private ConstraintLayout mscrollConstraintLayout1,mscrollConstraintLayout2;
    private ConstraintLayout mLayout11,mLayout12, mLayout13, mLayout14,mLayout15, mLayout16;
    private ConstraintLayout mLayout21,mLayout22, mLayout23, mLayout24,mLayout25, mLayout26;
    private CheckBox mcheckAddPro11, mcheckAddPro12, mcheckAddPro13, mcheckAddPro14, mcheckAddPro15, mcheckAddPro16;
    private CheckBox mcheckAddPro21, mcheckAddPro22,mcheckAddPro23,mcheckAddPro24,mcheckAddPro25,mcheckAddPro26;
    EditText msub1,msub2,msub3,msub4,msub5,msub6;
    EditText msub21,msub22,msub23,msub24,msub25,msub26;

    private ArrayList<ConstraintLayout> layoutList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutList2 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<TextView> tvList1 = new ArrayList<>();
    private ArrayList<TextView> tvList2 = new ArrayList<>();
    ArrayList<EditText> subList1 = new ArrayList<>();
    ArrayList<EditText> subList2 = new ArrayList<>();
    ArrayList<CheckBox>checkAddProList1 = new ArrayList<>();
    ArrayList<CheckBox> checkAddProList2 = new ArrayList<>();
    ImageButton mbtnBack;
    ImageButton mbtnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.green_hat_pro);

        mcheckcheck = findViewById(R.id.btncheck);
        mcheckcheck.setOnClickListener(btnCheckOnClick);
        mbtnBack = findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(btnBackOnClick);
        mbtnInfo = findViewById(R.id.btninfo);
        mbtnInfo.setOnClickListener(btninfoOnclick);


        mChoice1 = findViewById(R.id.choice1);
        mChoice2 = findViewById(R.id.choice2);
        mChoice1.setText(mQuestion.choice1.choiceName);
        mChoice2.setText(mQuestion.choice2.choiceName);
        
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
        mtextPro11 = findViewById(R.id.TextView11);
        mtextPro12 = findViewById(R.id.TextView12);
        mtextPro13 = findViewById(R.id.TextView13);
        mtextPro14 = findViewById(R.id.TextView14);
        mtextPro15 = findViewById(R.id.TextView15);
        mtextPro16 = findViewById(R.id.TextView16);

        mtextPro21 = findViewById(R.id.TextView21);
        mtextPro22 = findViewById(R.id.TextView22);
        mtextPro23 = findViewById(R.id.TextView23);
        mtextPro24 = findViewById(R.id.TextView24);
        mtextPro25 = findViewById(R.id.TextView25);
        mtextPro26 = findViewById(R.id.TextView26);

        //Assign Imgcheck id
        mcheckAddPro11 = findViewById(R.id.checkAddPro11);
        mcheckAddPro12 = findViewById(R.id.checkAddPro12);
        mcheckAddPro13 = findViewById(R.id.checkAddPro13);
        mcheckAddPro14 = findViewById(R.id.checkAddPro14);
        mcheckAddPro15 = findViewById(R.id.checkAddPro15);
        mcheckAddPro16 = findViewById(R.id.checkAddPro16);

        mcheckAddPro21 = findViewById(R.id.checkAddPro21);
        mcheckAddPro22 = findViewById(R.id.checkAddPro22);
        mcheckAddPro23 = findViewById(R.id.checkAddPro23);
        mcheckAddPro24 = findViewById(R.id.checkAddPro24);
        mcheckAddPro25 = findViewById(R.id.checkAddPro25);
        mcheckAddPro26 = findViewById(R.id.checkAddPro26);

        tvList1.add(mtextPro11);
        tvList1.add(mtextPro12);
        tvList1.add(mtextPro13);
        tvList1.add(mtextPro14);
        tvList1.add(mtextPro15);
        tvList1.add(mtextPro16);

        tvList2.add(mtextPro21);
        tvList2.add(mtextPro22);
        tvList2.add(mtextPro23);
        tvList2.add(mtextPro24);
        tvList2.add(mtextPro25);
        tvList2.add(mtextPro26);

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

        checkAddProList1.add(mcheckAddPro11);
        checkAddProList1.add(mcheckAddPro12);
        checkAddProList1.add(mcheckAddPro13);
        checkAddProList1.add(mcheckAddPro14);
        checkAddProList1.add(mcheckAddPro15);
        checkAddProList1.add(mcheckAddPro16);

        checkAddProList2.add(mcheckAddPro21);
        checkAddProList2.add(mcheckAddPro22);
        checkAddProList2.add(mcheckAddPro23);
        checkAddProList2.add(mcheckAddPro24);
        checkAddProList2.add(mcheckAddPro25);
        checkAddProList2.add(mcheckAddPro26);

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
        setViewByItem(layoutList1, tvList1, mQuestion.choice1.pros);
        setViewByItem(layoutList2, tvList2, mQuestion.choice2.pros);

        /*ADD substitute*/
        setSubstitute(layoutList1, subList1, mQuestion.choice1.pros, checkAddProList1);
        setSubstitute(layoutList2, subList2, mQuestion.choice2.pros, checkAddProList2);


        for(CheckBox check1: checkAddProList1){
            check1.setOnClickListener(checkSubOnClick1);
        }
        for(CheckBox check2: checkAddProList2){
            check2.setOnClickListener(checkSubOnClick2);
        }
    }
    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<subList1.size(); i++)
                mQuestion.choice1.pros[i].substitute = subList1.get(i).getText().toString();
            for(int i=0; i<subList2.size(); i++)
                mQuestion.choice2.pros[i].substitute = subList2.get(i).getText().toString();

            //go to green hat activity 2
            Intent intent = new Intent(GreenHatPro.this, GreenHatCon.class);
            startActivity(intent);
            finish();
        }
    };
    CheckBox.OnClickListener checkSubOnClick1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            checkSub(checkAddProList1, subList1);
        }
    };
    CheckBox.OnClickListener checkSubOnClick2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            checkSub(checkAddProList2, subList2);
        }
    };
    public void checkSub(ArrayList<CheckBox> checkAddProList, ArrayList<EditText> subList){
        Log.e("checkSubOnCheck","On check");
        for(CheckBox check: checkAddProList){
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
                mQuestion.choice1.pros[i].substitute = subList1.get(i).getText().toString();
            for(int i=0; i<subList2.size(); i++)
                mQuestion.choice2.pros[i].substitute = subList2.get(i).getText().toString();

            //go to yellow hat activity
            Intent intent = new Intent(GreenHatPro.this, WhiteHat.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btninfoOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GreenHatPro.this);
            alertDialogBuilder.setTitle("綠帽說明");
            alertDialogBuilder.setMessage(
                    "1. 綠帽代表創新，很多時候我們會猶豫是因為我們被選項所限制住，不想失去該好處，但有時候不一定二選一" +
                            "，因此可以想想是否能透過其他管道獲得和該選項相似的利益\n"
                    +"2. 若有，請將該好處打勾，並將替代方案列下來\n"
            );
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
