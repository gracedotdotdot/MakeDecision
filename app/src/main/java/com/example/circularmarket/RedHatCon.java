package com.example.circularmarket;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

import static android.view.View.GONE;
import static com.example.circularmarket.CreateFragment.mQuestion;

public class RedHatCon extends AppCompatActivity {

    private TextView mChoice1, mChoice2;
    private TextView mtextNum11,mtextNum12, mtextNum13, mtextNum14,mtextNum15, mtextNum16;
    private TextView mtextNum21,mtextNum22, mtextNum23, mtextNum24,mtextNum25, mtextNum26;
    private TextView mtextCon11,mtextCon12, mtextCon13, mtextCon14,mtextCon15, mtextCon16;
    private TextView mtextCon21,mtextCon22, mtextCon23, mtextCon24,mtextCon25, mtextCon26;
    private TextView mtxtTopic;
    private ConstraintLayout mLayout11,mLayout12, mLayout13, mLayout14,mLayout15, mLayout16;
    private ConstraintLayout mLayout21,mLayout22, mLayout23, mLayout24,mLayout25, mLayout26;

    private ArrayList<ConstraintLayout> layoutList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutList2 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<TextView> tvList1 = new ArrayList<>();
    private ArrayList<TextView> tvNumList1 = new ArrayList<>();

    ArrayList<NumberPicker> npList = new ArrayList<>();

    private ImageButton mcheckcheck;
    private ImageButton mbtnBack;
    ImageButton mbtnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red_hat);

        mcheckcheck = findViewById(R.id.btncheck);
        mcheckcheck.setOnClickListener(btnCheckOnClick);
        mbtnBack = findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(btnBackOnClick);
        mbtnInfo = findViewById(R.id.btninfo);
        mbtnInfo.setOnClickListener(btninfoOnclick);

        mtxtTopic = findViewById(R.id.txtTopic);
        mtxtTopic.setText("請將下列壞處依據對你的\n 影響程度進行加權(1~5)");

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
        tvList1.add(mtextCon11);
        tvList1.add(mtextCon12);
        tvList1.add(mtextCon13);
        tvList1.add(mtextCon14);
        tvList1.add(mtextCon15);
        tvList1.add(mtextCon16);

        tvList1.add(mtextCon21);
        tvList1.add(mtextCon22);
        tvList1.add(mtextCon23);
        tvList1.add(mtextCon24);
        tvList1.add(mtextCon25);
        tvList1.add(mtextCon26);

        mtextNum11 = findViewById(R.id.textView11);
        mtextNum12 = findViewById(R.id.textView12);
        mtextNum13 = findViewById(R.id.textView13);
        mtextNum14 = findViewById(R.id.textView14);
        mtextNum15 = findViewById(R.id.textView15);
        mtextNum16 = findViewById(R.id.textView16);

        mtextNum21 = findViewById(R.id.textView21);
        mtextNum22 = findViewById(R.id.textView22);
        mtextNum23 = findViewById(R.id.textView23);
        mtextNum24 = findViewById(R.id.textView24);
        mtextNum25 = findViewById(R.id.textView25);
        mtextNum26 = findViewById(R.id.textView26);
        tvNumList1.add(mtextNum11);
        tvNumList1.add(mtextNum12);
        tvNumList1.add(mtextNum13);
        tvNumList1.add(mtextNum14);
        tvNumList1.add(mtextNum15);
        tvNumList1.add(mtextNum16);

        tvNumList1.add(mtextNum21);
        tvNumList1.add(mtextNum22);
        tvNumList1.add(mtextNum23);
        tvNumList1.add(mtextNum24);
        tvNumList1.add(mtextNum25);
        tvNumList1.add(mtextNum26);



        layoutList1.add(mLayout11);
        layoutList1.add(mLayout12);
        layoutList1.add(mLayout13);
        layoutList1.add(mLayout14);
        layoutList1.add(mLayout15);
        layoutList1.add(mLayout16);

        layoutList1.add(mLayout21);
        layoutList1.add(mLayout22);
        layoutList1.add(mLayout23);
        layoutList1.add(mLayout24);
        layoutList1.add(mLayout25);
        layoutList1.add(mLayout26);

        NumberPicker np11 = findViewById(R.id.numberPicker11);
        NumberPicker np12 = findViewById(R.id.numberPicker12);
        NumberPicker np13 = findViewById(R.id.numberPicker13);
        NumberPicker np14 = findViewById(R.id.numberPicker14);
        NumberPicker np15 = findViewById(R.id.numberPicker15);
        NumberPicker np16 = findViewById(R.id.numberPicker16);

        NumberPicker np21 = findViewById(R.id.numberPicker21);
        NumberPicker np22 = findViewById(R.id.numberPicker22);
        NumberPicker np23 = findViewById(R.id.numberPicker23);
        NumberPicker np24 = findViewById(R.id.numberPicker24);
        NumberPicker np25 = findViewById(R.id.numberPicker25);
        NumberPicker np26 = findViewById(R.id.numberPicker26);


        npList.add(np11);
        npList.add(np12);
        npList.add(np13);
        npList.add(np14);
        npList.add(np15);
        npList.add(np16);
        npList.add(np21);
        npList.add(np22);
        npList.add(np23);
        npList.add(np24);
        npList.add(np25);
        npList.add(np26);
        for(int index=0; index<npList.size(); index++) {
            npList.get(index).setMinValue(1);
            npList.get(index).setMaxValue(5);
            npList.get(index).setValue(1);
            final TextView tvNum = tvNumList1.get(index);
            npList.get(index).setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
                @Override
                public void onValueChange(NumberPicker numberPicker, int oldval, int newval) {
                    tvNum.setText(Integer.toString(newval));
                }
            });
        }

        for(TextView tv:tvList1)
            tv.setText("");
        for(ConstraintLayout ly: layoutList1)
            ly.setVisibility(GONE);

        // Set textview of cons to the board
        setView(layoutList1, tvList1, mQuestion.choice1.cons);
        setView(layoutList1, tvList1, mQuestion.choice2.cons);


    }

    public static void setView(ArrayList<ConstraintLayout> lyList, ArrayList<TextView> tvList, Choice.Item[] itemsArray){
        int j, i;
        for(j=0; j<tvList.size(); j++) {
            Log.e("setView", "tvlist j="+j+" = "+tvList.get(j).getText().toString());
            if (tvList.get(j).getText().toString().equals("")) {
                Log.e("setView", "tvlist = null\n");
                break;
            }
        }
        for(i=0; i<itemsArray.length && j<tvList.size(); i++, j++) {
            Log.e("setViewByItem layout", lyList.get(i).toString());
            Log.e("setViewByItem", "j="+j+tvList.get(j).toString());
            if (!itemsArray[i].itemName.equals("")) {
                Log.e("setViewByItem", "tvlist set string=" + itemsArray[i].itemName);
                tvList.get(j).setText(itemsArray[i].itemName);
                lyList.get(j).setVisibility(View.VISIBLE);
            } else {
                Log.e("setViewByItem", "invisible");
                lyList.get(j).setVisibility(View.GONE);
            }
            System.out.println("-------------------------------------------\n");
        }
        System.out.println("=========================================== \n");
    }
//    public class NumberPicker extends android.widget.NumberPicker {
//
//        public NumberPicker(Context context, AttributeSet attrs) {
//            super(context, attrs);
//        }
//
//        @Override
//        public void addView(View child) {
//            super.addView(child);
//            updateView(child);
//        }
//
//        @Override
//        public void addView(View child, int index, android.view.ViewGroup.LayoutParams params) {
//            super.addView(child, index, params);
//            updateView(child);
//        }
//
//        @Override
//        public void addView(View child, android.view.ViewGroup.LayoutParams params) {
//            super.addView(child, params);
//            updateView(child);
//        }
//
//        private void updateView(View view) {
//            if(view instanceof EditText){
//                ((EditText) view).setTextSize(18);
//                ((EditText) view).setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//            }
//        }
//
//    }
    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");
            mQuestion.choice1.addImportance(mQuestion.choice1.cons, tvList1, npList);
            mQuestion.choice2.addImportance(mQuestion.choice2.cons, tvList1, npList);

            //go to red hat activity 2
            Intent intent = new Intent(RedHatCon.this, Results.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btnBackOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            //go to yellow hat activity
            Intent intent = new Intent(RedHatCon.this, RedHatPro.class);
            startActivity(intent);
            finish();
        }
    };

    private ImageButton.OnClickListener btninfoOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(RedHatCon.this);
            alertDialogBuilder.setTitle("黃帽說明");
            alertDialogBuilder.setMessage(
                    "1. 紅帽代表直覺，有時候直覺代表我們最想要的選擇，即使做了再多分析，最後決定不是" +
                            "我們最想要的，我們也不會百分百順從該決定，因此直覺也很重要\n"+
                            "2. 請將兩個選項的壞處，對你的影響或在意程度進行評分，1影響最小，5影響最大\n"+
                            "3. 不同壞處的數字可以重複\n"
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
