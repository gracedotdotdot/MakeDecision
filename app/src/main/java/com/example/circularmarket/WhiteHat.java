package com.example.circularmarket;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

import static android.view.View.INVISIBLE;
import static com.example.circularmarket.Choice.setViewByItem;

public class WhiteHat extends AppCompatActivity {
    private TextView mChoice1, mChoice2;
    private TextView mtextPro11,mtextPro12, mtextPro13, mtextPro14,mtextPro15, mtextPro16;
    private TextView mtextPro21,mtextPro22, mtextPro23, mtextPro24,mtextPro25, mtextPro26;
    private TextView mtextCon11,mtextCon12, mtextCon13, mtextCon14,mtextCon15, mtextCon16;
    private TextView mtextCon21,mtextCon22, mtextCon23, mtextCon24,mtextCon25, mtextCon26;
    private ConstraintLayout mProLayout11, mProLayout12, mProLayout13, mProLayout14, mProLayout15, mProLayout16;
    private ConstraintLayout mProLayout21, mProLayout22, mProLayout23, mProLayout24, mProLayout25, mProLayout26;
    private ConstraintLayout mConLayout11, mConLayout12, mConLayout13, mConLayout14, mConLayout15, mConLayout16;
    private ConstraintLayout mConLayout21, mConLayout22, mConLayout23, mConLayout24, mConLayout25, mConLayout26;
    private CheckBox mCheckPro11, mCheckPro12, mCheckPro13, mCheckPro14, mCheckPro15, mCheckPro16;
    private CheckBox mCheckPro21, mCheckPro22,mCheckPro23,mCheckPro24,mCheckPro25,mCheckPro26;
    private CheckBox mCheckCon11, mCheckCon12, mCheckCon13, mCheckCon14, mCheckCon15, mCheckCon16;
    private CheckBox mCheckCon21, mCheckCon22,mCheckCon23,mCheckCon24,mCheckCon25,mCheckCon26;
    private ImageButton mbtncheck;
    private ImageButton mbtnBack;
    ImageButton mbtnInfo;

    private ArrayList<ConstraintLayout> layoutProList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutProList2 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutConList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutConList2 = new ArrayList<ConstraintLayout>(){};

    private ArrayList<TextView> tvProList1 = new ArrayList<TextView>(){};
    private ArrayList<TextView> tvProList2 = new ArrayList<TextView>(){};
    private ArrayList<TextView> tvConList1 = new ArrayList<TextView>(){};
    private ArrayList<TextView> tvConList2 = new ArrayList<TextView>(){};

    private ArrayList<CheckBox> checkProList1 = new ArrayList<CheckBox>(){};
    private ArrayList<CheckBox> checkProList2 = new ArrayList<CheckBox>(){};
    private ArrayList<CheckBox> checkConList1 = new ArrayList<CheckBox>(){};
    private ArrayList<CheckBox> checkConList2 = new ArrayList<CheckBox>(){};


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.white_hat);
        
        mbtncheck = findViewById(R.id.btncheck);
        mbtncheck.setOnClickListener(btnCheckOnClick);
        mbtnBack = findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(btnBackOnClick);
        mbtnInfo = findViewById(R.id.btninfo);
        mbtnInfo.setOnClickListener(btninfoOnclick);


        mChoice1 = findViewById(R.id.choice1);
        mChoice2 = findViewById(R.id.choice2);
        mChoice1.setText(CreateFragment.mQuestion.choice1.choiceName);
        mChoice2.setText(CreateFragment.mQuestion.choice2.choiceName);


        //Assign constraint layout id
        mProLayout11 = findViewById(R.id.constraintLayout11);
        mProLayout12 = findViewById(R.id.constraintLayout12);
        mProLayout13 = findViewById(R.id.constraintLayout13);
        mProLayout14 = findViewById(R.id.constraintLayout14);
        mProLayout15 = findViewById(R.id.constraintLayout15);
        mProLayout16 = findViewById(R.id.constraintLayout16);

        mProLayout21 = findViewById(R.id.constraintLayout21);
        mProLayout22 = findViewById(R.id.constraintLayout22);
        mProLayout23 = findViewById(R.id.constraintLayout23);
        mProLayout24 = findViewById(R.id.constraintLayout24);
        mProLayout25 = findViewById(R.id.constraintLayout25);
        mProLayout26 = findViewById(R.id.constraintLayout26);

        mConLayout11 = findViewById(R.id.constraintLayout31);
        mConLayout12 = findViewById(R.id.constraintLayout32);
        mConLayout13 = findViewById(R.id.constraintLayout33);
        mConLayout14 = findViewById(R.id.constraintLayout34);
        mConLayout15 = findViewById(R.id.constraintLayout35);
        mConLayout16 = findViewById(R.id.constraintLayout36);

        mConLayout21 = findViewById(R.id.constraintLayout41);
        mConLayout22 = findViewById(R.id.constraintLayout42);
        mConLayout23 = findViewById(R.id.constraintLayout43);
        mConLayout24 = findViewById(R.id.constraintLayout44);
        mConLayout25 = findViewById(R.id.constraintLayout45);
        mConLayout26 = findViewById(R.id.constraintLayout46);

       

        //Assign id of Checkbox of pros
        mCheckPro11 = findViewById(R.id.btnAddPro11);
        mCheckPro12 = findViewById(R.id.btnAddPro12);
        mCheckPro13 = findViewById(R.id.btnAddPro13);
        mCheckPro14 = findViewById(R.id.btnAddPro14);
        mCheckPro15 = findViewById(R.id.btnAddPro15);
        mCheckPro16 = findViewById(R.id.btnAddPro16);

        mCheckPro21 = findViewById(R.id.btnAddPro21);
        mCheckPro22 = findViewById(R.id.btnAddPro22);
        mCheckPro23 = findViewById(R.id.btnAddPro23);
        mCheckPro24 = findViewById(R.id.btnAddPro24);
        mCheckPro25 = findViewById(R.id.btnAddPro25);
        mCheckPro26 = findViewById(R.id.btnAddPro26);

        //Assign id of Checkbox of cons
        mCheckCon11 = findViewById(R.id.btnAddCon11);
        mCheckCon12 = findViewById(R.id.btnAddCon12);
        mCheckCon13 = findViewById(R.id.btnAddCon13);
        mCheckCon14 = findViewById(R.id.btnAddCon14);
        mCheckCon15 = findViewById(R.id.btnAddCon15);
        mCheckCon16 = findViewById(R.id.btnAddCon16);

        mCheckCon21 = findViewById(R.id.btnAddCon21);
        mCheckCon22 = findViewById(R.id.btnAddCon22);
        mCheckCon23 = findViewById(R.id.btnAddCon23);
        mCheckCon24 = findViewById(R.id.btnAddCon24);
        mCheckCon25 = findViewById(R.id.btnAddCon25);
        mCheckCon26 = findViewById(R.id.btnAddCon26);

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

        mtextCon11 = findViewById(R.id.TextView31);
        mtextCon12 = findViewById(R.id.TextView32);
        mtextCon13 = findViewById(R.id.TextView33);
        mtextCon14 = findViewById(R.id.TextView34);
        mtextCon15 = findViewById(R.id.TextView35);
        mtextCon16 = findViewById(R.id.TextView36);

        mtextCon21 = findViewById(R.id.TextView41);
        mtextCon22 = findViewById(R.id.TextView42);
        mtextCon23 = findViewById(R.id.TextView43);
        mtextCon24 = findViewById(R.id.TextView44);
        mtextCon25 = findViewById(R.id.TextView45);
        mtextCon26 = findViewById(R.id.TextView46);


        tvProList1.add(mtextPro11);
        tvProList1.add(mtextPro12);
        tvProList1.add(mtextPro13);
        tvProList1.add(mtextPro14);
        tvProList1.add(mtextPro15);
        tvProList1.add(mtextPro16);

        tvProList2.add(mtextPro21);
        tvProList2.add(mtextPro22);
        tvProList2.add(mtextPro23);
        tvProList2.add(mtextPro24);
        tvProList2.add(mtextPro25);
        tvProList2.add(mtextPro26);

        tvConList1.add(mtextCon11);
        tvConList1.add(mtextCon12);
        tvConList1.add(mtextCon13);
        tvConList1.add(mtextCon14);
        tvConList1.add(mtextCon15);
        tvConList1.add(mtextCon16);

        tvConList2.add(mtextCon21);
        tvConList2.add(mtextCon22);
        tvConList2.add(mtextCon23);
        tvConList2.add(mtextCon24);
        tvConList2.add(mtextCon25);
        tvConList2.add(mtextCon26);



        //Add Checkbox to list for pros
       checkProList1.add(mCheckPro11);
       checkProList1.add(mCheckPro12);
       checkProList1.add(mCheckPro13);
       checkProList1.add(mCheckPro14);
       checkProList1.add(mCheckPro15);
       checkProList1.add(mCheckPro16);

       checkProList2.add(mCheckPro21);
       checkProList2.add(mCheckPro22);
       checkProList2.add(mCheckPro23);
       checkProList2.add(mCheckPro24);
       checkProList2.add(mCheckPro25);
       checkProList2.add(mCheckPro26);

       // Add checkBox to list for cons
        checkConList1.add(mCheckCon11);
        checkConList1.add(mCheckCon12);
        checkConList1.add(mCheckCon13);
        checkConList1.add(mCheckCon14);
        checkConList1.add(mCheckCon15);
        checkConList1.add(mCheckCon16);

        checkConList2.add(mCheckCon21);
        checkConList2.add(mCheckCon22);
        checkConList2.add(mCheckCon23);
        checkConList2.add(mCheckCon24);
        checkConList2.add(mCheckCon25);
        checkConList2.add(mCheckCon26);

        //Add pro and cons layout to list
        layoutProList1.add( mProLayout11);
        layoutProList1.add( mProLayout12);
        layoutProList1.add( mProLayout13);
        layoutProList1.add( mProLayout14);
        layoutProList1.add( mProLayout15);
        layoutProList1.add( mProLayout16);

        layoutProList2.add( mProLayout21);
        layoutProList2.add( mProLayout22);
        layoutProList2.add( mProLayout23);
        layoutProList2.add( mProLayout24);
        layoutProList2.add( mProLayout25);
        layoutProList2.add( mProLayout26);

        layoutConList1.add( mConLayout11);
        layoutConList1.add( mConLayout12);
        layoutConList1.add( mConLayout13);
        layoutConList1.add( mConLayout14);
        layoutConList1.add( mConLayout15);
        layoutConList1.add( mConLayout16);
        
        layoutConList2.add( mConLayout21);
        layoutConList2.add( mConLayout22);
        layoutConList2.add( mConLayout23);
        layoutConList2.add( mConLayout24);
        layoutConList2.add( mConLayout25);
        layoutConList2.add( mConLayout26);
        

        setVisibility(layoutProList1, INVISIBLE);
        setVisibility(layoutProList2, INVISIBLE);
        setVisibility(layoutConList1, INVISIBLE);
        setVisibility(layoutConList2, INVISIBLE);

        // Set textview to pros and cons in list
        setViewByItem(layoutProList1, tvProList1, CreateFragment.mQuestion.choice1.pros);
        setViewByItem(layoutProList2, tvProList2, CreateFragment.mQuestion.choice2.pros);
        setViewByItem(layoutConList1, tvConList1, CreateFragment.mQuestion.choice1.cons);
        setViewByItem(layoutConList2, tvConList2, CreateFragment.mQuestion.choice2.cons);


    }

    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<checkProList1.size(); i++){
                if(checkProList1.get(i).isChecked())
                    CreateFragment.mQuestion.choice1.pros[i].fact = true;
                if(checkProList2.get(i).isChecked())
                    CreateFragment.mQuestion.choice2.pros[i].fact = true;
                if(checkConList1.get(i).isChecked())
                    CreateFragment.mQuestion.choice1.cons[i].fact = true;
                if(checkConList2.get(i).isChecked())
                    CreateFragment.mQuestion.choice2.cons[i].fact = true;
            }

            //go to green hat activity
            Intent intent = new Intent(WhiteHat.this, GreenHatPro.class);
            startActivity(intent);
            finish();
        }
    };
    private  void setVisibility(ArrayList<ConstraintLayout> layoutList, int visibility){
        for(ConstraintLayout ly: layoutList){
            ly.setVisibility(visibility);
        }
    }
    private ImageButton.OnClickListener btnBackOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<checkProList1.size(); i++){
                if(checkProList1.get(i).isChecked())
                    CreateFragment.mQuestion.choice1.pros[i].fact = true;
                if(checkProList2.get(i).isChecked())
                    CreateFragment.mQuestion.choice2.pros[i].fact = true;
                if(checkConList1.get(i).isChecked())
                    CreateFragment.mQuestion.choice1.cons[i].fact = true;
                if(checkConList2.get(i).isChecked())
                    CreateFragment.mQuestion.choice2.cons[i].fact = true;
            }

            //go to yellow hat activity
            Intent intent = new Intent(WhiteHat.this,BlackHat.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btninfoOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(WhiteHat.this);
            alertDialogBuilder.setTitle("白帽說明");
            alertDialogBuilder.setMessage(
                    "如何定義事實? \n" +
                            "1. 選了某選項的後續影響是經過多人論證，而非單一案例\n" +
                            "2. 是因為選擇該選項才有該影響，不是其他原因所造成的影響\n" +
                            "3. 建議您可以上網搜尋該影響是否符合上述特性\n");
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
