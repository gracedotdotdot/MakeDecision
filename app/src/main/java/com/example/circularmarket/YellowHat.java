package com.example.circularmarket;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import java.util.ArrayList;



public class YellowHat extends AppCompatActivity {
    private TextView mChoice1, mChoice2;
    private EditText mtextPro11,mtextPro12, mtextPro13, mtextPro14,mtextPro15, mtextPro16;
    private EditText mtextPro21,mtextPro22, mtextPro23, mtextPro24,mtextPro25, mtextPro26;

    private ConstraintLayout mscrollConstraintLayout1,mscrollConstraintLayout2;
    private ConstraintLayout mLayout11,mLayout12, mLayout13, mLayout14,mLayout15, mLayout16;
    private ConstraintLayout mLayout21,mLayout22, mLayout23, mLayout24,mLayout25, mLayout26;
    private ImageButton mbtnAddPro11, mbtnAddPro12, mbtnAddPro13, mbtnAddPro14, mbtnAddPro15, mbtnAddPro16;
    private ImageButton mbtnAddPro21, mbtnAddPro22,mbtnAddPro23,mbtnAddPro24,mbtnAddPro25,mbtnAddPro26;

    private ArrayList<ConstraintLayout> layoutList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutList2 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<EditText> etxList1 = new ArrayList<EditText>(){};
    private ArrayList<EditText> etxList2 = new ArrayList<EditText>(){};
    ArrayList<ImageButton>btnAddProLis1 = new ArrayList<ImageButton>(){};
    ArrayList<ImageButton> btnAddProList2 = new ArrayList<ImageButton>(){};

    private ImageButton mbtnCheck;
    private ImageButton mbtnBack;
    private ImageButton mbtnInfo;
//    private ArrayList<proItem> proItemList1= new ArrayList<proItem>(){};
//    private ArrayList<proItem> proItemList2= new ArrayList<proItem>(){};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellow_hat);

        mbtnCheck = findViewById(R.id.btncheck);
        mbtnCheck.setOnClickListener(btnCheckOnClick);
        mbtnBack = findViewById(R.id.btnBack);
        mbtnBack.setOnClickListener(btnBackOnClick);
        mbtnInfo = findViewById(R.id.btninfo);
        mbtnInfo.setOnClickListener(btninfoOnclick);

        mscrollConstraintLayout1 = findViewById(R.id.scrollConstraintLayout1);
        mscrollConstraintLayout2 = findViewById(R.id.scrollConstraintLayout2);

        mChoice1 = findViewById(R.id.choice1);
        mChoice2 = findViewById(R.id.choice2);
        mChoice1.setText(CreateFragment.mQuestion.choice1.choiceName);
        mChoice2.setText(CreateFragment.mQuestion.choice2.choiceName);


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

        //Assign Imgbtn id
        mbtnAddPro11 = findViewById(R.id.btnAddPro11);
        mbtnAddPro12 = findViewById(R.id.btnAddPro12);
        mbtnAddPro13 = findViewById(R.id.btnAddPro13);
        mbtnAddPro14 = findViewById(R.id.btnAddPro14);
        mbtnAddPro15 = findViewById(R.id.btnAddPro15);
        mbtnAddPro16 = findViewById(R.id.btnAddPro16);

        mbtnAddPro21 = findViewById(R.id.btnAddPro21);
        mbtnAddPro22 = findViewById(R.id.btnAddPro22);
        mbtnAddPro23 = findViewById(R.id.btnAddPro23);
        mbtnAddPro24 = findViewById(R.id.btnAddPro24);
        mbtnAddPro25 = findViewById(R.id.btnAddPro25);
        mbtnAddPro26 = findViewById(R.id.btnAddPro26);

        //Assign edittext id
        mtextPro11 = findViewById(R.id.editText11);
        mtextPro12 = findViewById(R.id.editText12);
        mtextPro13 = findViewById(R.id.editText13);
        mtextPro14 = findViewById(R.id.editText14);
        mtextPro15 = findViewById(R.id.editText15);
        mtextPro16 = findViewById(R.id.editText16);

        mtextPro21 = findViewById(R.id.editText21);
        mtextPro22 = findViewById(R.id.editText22);
        mtextPro23 = findViewById(R.id.editText23);
        mtextPro24 = findViewById(R.id.editText24);
        mtextPro25 = findViewById(R.id.editText25);
        mtextPro26 = findViewById(R.id.editText26);


        etxList1.add(mtextPro11);
        etxList1.add(mtextPro12);
        etxList1.add(mtextPro13);
        etxList1.add(mtextPro14);
        etxList1.add(mtextPro15);
        etxList1.add(mtextPro16);

        etxList2.add(mtextPro21);
        etxList2.add(mtextPro22);
        etxList2.add(mtextPro23);
        etxList2.add(mtextPro24);
        etxList2.add(mtextPro25);
        etxList2.add(mtextPro26);


       btnAddProLis1.add(mbtnAddPro11);
       btnAddProLis1.add(mbtnAddPro12);
       btnAddProLis1.add(mbtnAddPro13);
       btnAddProLis1.add(mbtnAddPro14);
       btnAddProLis1.add(mbtnAddPro15);
       btnAddProLis1.add(mbtnAddPro16);

       btnAddProList2.add(mbtnAddPro21);
       btnAddProList2.add(mbtnAddPro22);
       btnAddProList2.add(mbtnAddPro23);
       btnAddProList2.add(mbtnAddPro24);
       btnAddProList2.add(mbtnAddPro25);
       btnAddProList2.add(mbtnAddPro26);


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


        for(EditText etx: etxList1)
            etx.setText("");
        for(EditText etx: etxList2)
            etx.setText("");



        /*restore*/
        Choice.setTextByItem(layoutList1, etxList1, CreateFragment.mQuestion.choice1.pros);
        Choice.setTextByItem(layoutList2, etxList2, CreateFragment.mQuestion.choice2.pros);


        for(ImageButton btn1: btnAddProLis1){
            btn1.setOnClickListener(btnAddProOnClick1);
        }
        for(ImageButton btn2: btnAddProList2){
            btn2.setOnClickListener(btnAddProOnClick2);
        }



    }

    private ImageButton.OnClickListener btnAddProOnClick1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            changeItem(view, layoutList1, mscrollConstraintLayout1);
        }
    };
    private ImageButton.OnClickListener btnAddProOnClick2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        changeItem(view, layoutList2, mscrollConstraintLayout2);
        }
    };

    public void changeItem(View view, ArrayList<ConstraintLayout> layoutList, ConstraintLayout scrollLayout){
        int index = layoutList.indexOf(view.getParent());
        //Log.e("changeItem","class of view.getParent="+view.getParent().getClass());
        Log.e("index", Integer.toString(index));
        if(index == layoutList.size()){
            /*ToDo:  Alert only 6 selection*/
            Log.e("changeitem","6 item been added!");

        }else{
            if(view.getBackground().getConstantState() == getResources().getDrawable(R.drawable.add_light).getConstantState()){
                Log.e("onclick","get backgnd = add");
                view.setBackgroundResource(R.drawable.minus_light);
                if(index+1<layoutList.size()) layoutList.get(index+1).setVisibility(View.VISIBLE);
            }else if(view.getBackground().getConstantState()==getResources().getDrawable(R.drawable.minus_light).getConstantState()){
                Log.e("onclick","get backgnd = minus");
                view.setBackgroundResource(R.drawable.add_light);

                for(int i=0; i<6;i++){
                    if(i==index) {
                        Log.e("ly loop", "index="+index);
                        ArrayList<EditText> etxList = new ArrayList<>();
                        if(layoutList== layoutList1) etxList = etxList1;
                        else if(layoutList == layoutList2) etxList = etxList2;
                        for(EditText etx: etxList){
                            if(etx.getParent()==layoutList.get(i))
                                etx.setText("");
                        }
                        layoutList.get(i).setVisibility(View.INVISIBLE);
                        Log.e("layout id=",layoutList.get(index).toString() + "\n" );

                        // Reset the priority of different rows, put the cancel one to the bottom of the line
                        ConstraintLayout tmp = layoutList.get(index);
                        for(int j=index; j<layoutList.size()-1; j++){
                            layoutList.set(j, layoutList.get(j+1));
                        }
                        layoutList.set(layoutList.size()-1,tmp);
                    }
                }
                addLayoutByList(layoutList, scrollLayout);
            }

        }
    }


    public void addLayoutByList(ArrayList<ConstraintLayout> layoutList, ConstraintLayout scrollLayout){
        //Set the constraint by the current scroll view
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(scrollLayout);

        for(ConstraintLayout ly : layoutList)
            Log.e("addLayoutlist ", "print layout\n"+ly.toString());


        //building vertical chain
        View previousItem = null;
        for(ConstraintLayout ly : layoutList) {
            boolean lastItem =layoutList.indexOf(ly) ==layoutList.size() - 1;
            if(previousItem == null) {
                Log.e("add layout","prev = null, connect to constraintlayout21");
                if(layoutList==layoutList1) constraintSet.connect(ly.getId(), ConstraintSet.TOP, R.id.constraintLayout11, ConstraintSet.BOTTOM);
                else if(layoutList==layoutList2) constraintSet.connect(ly.getId(), ConstraintSet.TOP, R.id.constraintLayout21, ConstraintSet.BOTTOM);
            } else {
                Log.e("add layout","prev NOT null, connect to previousItem="+previousItem.toString());
                constraintSet.connect(ly.getId(), ConstraintSet.TOP, previousItem.getId(), ConstraintSet.BOTTOM);
                if(lastItem) {
                    Log.e("add layout","last item, connect to set bottom");
                    constraintSet.connect(ly.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
                }
            }
            previousItem = ly;

        }
        //Collect id of the view
        int[] viewIds = new int[6]; int i=0;
        for(ConstraintLayout ly : layoutList) {
            if(i<6){
                viewIds[i] = ly.getId();
                i++;
            }else break;
        }

        constraintSet.createVerticalChain(ConstraintSet.PARENT_ID, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, viewIds, null, ConstraintSet.CHAIN_SPREAD);
        constraintSet.applyTo(scrollLayout);
        Log.e("Onclick","add layout end");
    }
    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<etxList1.size(); i++)
                CreateFragment.mQuestion.choice1.pros[i].itemName = etxList1.get(i).getText().toString();
            for(int i=0; i<etxList2.size(); i++)
                CreateFragment.mQuestion.choice2.pros[i].itemName = etxList2.get(i).getText().toString();

            //go to yellow hat activity
            Intent intent = new Intent(YellowHat.this, BlackHat.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btnBackOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<etxList1.size(); i++)
                CreateFragment.mQuestion.choice1.pros[i].itemName = etxList1.get(i).getText().toString();
            for(int i=0; i<etxList2.size(); i++)
                CreateFragment.mQuestion.choice2.pros[i].itemName = etxList2.get(i).getText().toString();

            //go to yellow hat activity
            Intent intent = new Intent(YellowHat.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btninfoOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(YellowHat.this);
            alertDialogBuilder.setTitle("黃帽說明");
            alertDialogBuilder.setMessage(
                    "1. 黃帽代表樂觀思考，請將此選項的好處列出來，最多六點\n"
                    +"2. 為減少後續加權誤差，請將不同性質的優點分開列點\n"
                    +"3. 相似優點請勿重複列成兩項\n");
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
