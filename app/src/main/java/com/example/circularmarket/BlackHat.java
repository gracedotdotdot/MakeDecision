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

import static com.example.circularmarket.Choice.setTextByItem;


public class BlackHat extends AppCompatActivity {
    private TextView mChoice1, mChoice2;
    private EditText mtextCon11,mtextCon12, mtextCon13, mtextCon14,mtextCon15, mtextCon16;
    private EditText mtextCon21,mtextCon22, mtextCon23, mtextCon24,mtextCon25, mtextCon26;

    private ConstraintLayout mscrollConstraintLayout1,mscrollConstraintLayout2;
    private ConstraintLayout mLayout11,mLayout12, mLayout13, mLayout14,mLayout15, mLayout16;
    private ConstraintLayout mLayout21,mLayout22, mLayout23, mLayout24,mLayout25, mLayout26;
    private ImageButton mbtnAddCon11, mbtnAddCon12, mbtnAddCon13, mbtnAddCon14, mbtnAddCon15, mbtnAddCon16;
    private ImageButton mbtnAddCon21, mbtnAddCon22,mbtnAddCon23,mbtnAddCon24,mbtnAddCon25,mbtnAddCon26;
    private ArrayList<ConstraintLayout> layoutList1 = new ArrayList<ConstraintLayout>(){};
    private ArrayList<ConstraintLayout> layoutList2 = new ArrayList<ConstraintLayout>(){};
    ArrayList<EditText> etxList1 = new ArrayList<EditText>(){};
    ArrayList<EditText> etxList2 = new ArrayList<EditText>(){};
    private ImageButton mbtncheck;
    private ImageButton mbtnBack;
    private ImageButton mbtnInfo;

//    private ArrayList<ConItem> ConItemList1= new ArrayList<ConItem>(){};
//    private ArrayList<ConItem> ConItemList2= new ArrayList<ConItem>(){};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.black_hat);

        mbtncheck = findViewById(R.id.btncheck);
        mbtncheck.setOnClickListener(btnCheckOnClick);
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
        mbtnAddCon11 = findViewById(R.id.btnAddCon11);
        mbtnAddCon12 = findViewById(R.id.btnAddCon12);
        mbtnAddCon13 = findViewById(R.id.btnAddCon13);
        mbtnAddCon14 = findViewById(R.id.btnAddCon14);
        mbtnAddCon15 = findViewById(R.id.btnAddCon15);
        mbtnAddCon16 = findViewById(R.id.btnAddCon16);

        mbtnAddCon21 = findViewById(R.id.btnAddCon21);
        mbtnAddCon22 = findViewById(R.id.btnAddCon22);
        mbtnAddCon23 = findViewById(R.id.btnAddCon23);
        mbtnAddCon24 = findViewById(R.id.btnAddCon24);
        mbtnAddCon25 = findViewById(R.id.btnAddCon25);
        mbtnAddCon26 = findViewById(R.id.btnAddCon26);

        //Assign edittext id
        mtextCon11 = findViewById(R.id.editText11);
        mtextCon12 = findViewById(R.id.editText12);
        mtextCon13 = findViewById(R.id.editText13);
        mtextCon14 = findViewById(R.id.editText14);
        mtextCon15 = findViewById(R.id.editText15);
        mtextCon16 = findViewById(R.id.editText16);

        mtextCon21 = findViewById(R.id.editText21);
        mtextCon22 = findViewById(R.id.editText22);
        mtextCon23 = findViewById(R.id.editText23);
        mtextCon24 = findViewById(R.id.editText24);
        mtextCon25 = findViewById(R.id.editText25);
        mtextCon26 = findViewById(R.id.editText26);

        etxList1.add(mtextCon11);
        etxList1.add(mtextCon12);
        etxList1.add(mtextCon13);
        etxList1.add(mtextCon14);
        etxList1.add(mtextCon15);
        etxList1.add(mtextCon16);

        etxList2.add(mtextCon21);
        etxList2.add(mtextCon22);
        etxList2.add(mtextCon23);
        etxList2.add(mtextCon24);
        etxList2.add(mtextCon25);
        etxList2.add(mtextCon26);

        for(int i=0; i<etxList1.size(); i++) {
            etxList1.get(i).setText(null);
            etxList2.get(i).setText(null);
            if(etxList1.get(i).getText()==null) Log.e("on create", "etxlist1 = null");
            if(etxList2.get(i).getText()==null) Log.e("on create", "etxlist2 = null");
        }
        for(EditText etx: etxList1)
            etx.setText("");
        for(EditText etx: etxList2)
            etx.setText("");



        ArrayList<ImageButton>btnAddConLis1 = new ArrayList<ImageButton>(){};
        ArrayList<ImageButton> btnAddConList2 = new ArrayList<ImageButton>(){};
       btnAddConLis1.add(mbtnAddCon11);
       btnAddConLis1.add(mbtnAddCon12);
       btnAddConLis1.add(mbtnAddCon13);
       btnAddConLis1.add(mbtnAddCon14);
       btnAddConLis1.add(mbtnAddCon15);
       btnAddConLis1.add(mbtnAddCon16);

       btnAddConList2.add(mbtnAddCon21);
       btnAddConList2.add(mbtnAddCon22);
       btnAddConList2.add(mbtnAddCon23);
       btnAddConList2.add(mbtnAddCon24);
       btnAddConList2.add(mbtnAddCon25);
       btnAddConList2.add(mbtnAddCon26);


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

        setTextByItem(layoutList1, etxList1, CreateFragment.mQuestion.choice1.cons);
        setTextByItem(layoutList2, etxList2, CreateFragment.mQuestion.choice2.cons);

        for(ImageButton btn1: btnAddConLis1){
             btn1.setOnClickListener(btnAddConOnClick1);
        }
        for(ImageButton btn2: btnAddConList2){
            btn2.setOnClickListener(btnAddConOnClick2);
        }

        for(ConstraintLayout ly : layoutList1)
            Log.e("print layout1", ly.toString());
        for(ConstraintLayout ly : layoutList2)
            Log.e("print layout2", ly.toString());



    }

    private ImageButton.OnClickListener btnAddConOnClick1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            changeItem(view, layoutList1, mscrollConstraintLayout1);
        }
    };
    private ImageButton.OnClickListener btnAddConOnClick2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        changeItem(view, layoutList2, mscrollConstraintLayout2);
        }
    };

    public void changeItem(View view, ArrayList<ConstraintLayout> layoutList, ConstraintLayout scrollLayout){
        int index = layoutList.indexOf(view.getParent());
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
                                etx.setText(null);
                        }
                        layoutList.get(i).setVisibility(View.INVISIBLE);
                        Log.e("layout id=",layoutList.get(index).toString() + "\n" );
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
                CreateFragment.mQuestion.choice1.cons[i].itemName = etxList1.get(i).getText().toString();
            for(int i=0; i<etxList2.size(); i++)
                CreateFragment.mQuestion.choice2.cons[i].itemName = etxList2.get(i).getText().toString();

            //go to white hat activity
            Intent intent = new Intent(BlackHat.this, WhiteHat.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btnBackOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            for(int i=0; i<etxList1.size(); i++)
                CreateFragment.mQuestion.choice1.cons[i].itemName = etxList1.get(i).getText().toString();
            for(int i=0; i<etxList2.size(); i++)
                CreateFragment.mQuestion.choice2.cons[i].itemName = etxList2.get(i).getText().toString();

            //go to yellow hat activity
            Intent intent = new Intent(BlackHat.this, YellowHat.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener btninfoOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(BlackHat.this);
            alertDialogBuilder.setTitle("黑帽說明");
            alertDialogBuilder.setMessage(
                    "1. 黑帽代表負面思考，請將此選項的缺點或壞處列出來，最多六點\n" +
                            "2.為減少後續加權誤差，請將不同性質的缺點分開列點\n"+
                            "3. 相似缺點請勿重複列成兩項\n");
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
