package com.example.circularmarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Intent.getIntent;
import static com.example.circularmarket.Results.mQuestion2;

public class CreateFragment extends Fragment {
    private ImageButton mbtnaddChoice3, mbtnaddChoice4, mbtnaddChoice5, mbtnaddChoice6, mbtnCheck;
    private Button mbtnRandom, mbtnNonRandom;
    private TextView mChoice1, mChoice2, mChoice3, mChoice4, mChoice5, mChoice6 ;
    private TextView mtxtQuestion;
    private Activity activity;
    public static Question mQuestion;

    public CreateFragment(Activity activity) {
        // Required empty public constructor
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mbtnRandom = getView().findViewById(R.id.btnRandom);
        mbtnRandom.setOnClickListener(randomOnClick);
        mtxtQuestion = getView().findViewById(R.id.question);

        mChoice1 = getView().findViewById(R.id.choice1);
        mChoice2 = getView().findViewById(R.id.choice2);
        mChoice3 = getView().findViewById(R.id.addChoice3);
        mChoice4 = getView().findViewById(R.id.addChoice4);
        mChoice5 = getView().findViewById(R.id.addChoice5);
        mChoice6 = getView().findViewById(R.id.addChoice6);

        mbtnaddChoice3 = getView().findViewById(R.id.btnAddChoice3);
        mbtnaddChoice4 = getView().findViewById(R.id.btnAddChoice4);
        mbtnaddChoice5 = getView().findViewById(R.id.btnAddChoice5);
        mbtnaddChoice6 = getView().findViewById(R.id.btnAddChoice6);
        mbtnCheck = getView().findViewById(R.id.btncheck);

        mbtnaddChoice3.setOnClickListener(addChoice3OnClick);
        mbtnaddChoice4.setOnClickListener(addChoice4OnClick);
        mbtnaddChoice5.setOnClickListener(addChoice5OnClick);
        mbtnaddChoice6.setOnClickListener(addChoice6OnClick);
        mbtnCheck.setOnClickListener(btnCheckOnClick);


        // set additional btn invisible
        mChoice4.setVisibility(View.INVISIBLE);
        mChoice5.setVisibility(View.INVISIBLE);
        mChoice6.setVisibility(View.INVISIBLE);
        mbtnaddChoice4.setVisibility(View.INVISIBLE);
        mbtnaddChoice5.setVisibility(View.INVISIBLE);
        mbtnaddChoice6.setVisibility(View.INVISIBLE);


        //Bundle b =.getExtras();
        //String name = b.getString("name");
        //&& !name.equals("")
        if(mQuestion2!=null) {
            mtxtQuestion.setText(mQuestion.quesName);
            if(mQuestion.choice1!=null) mChoice1.setText(mQuestion.choice1.choiceName);
            if(mQuestion.choice2!=null) mChoice2.setText(mQuestion.choice2.choiceName);
        }

    }
    private View.OnClickListener randomOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(activity,"目前只開放非隨機喔!",Toast.LENGTH_LONG).show();
        }
    };
    private ImageButton.OnClickListener addChoice3OnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Toast.makeText(activity,"非隨機目前只開放兩個選項喔!",Toast.LENGTH_LONG).show();


//            mbtnaddChoice3.setImageResource(R.drawable.minus_light);
//            if(mChoice3.getText()=="新增選項") mChoice3.setHint("選項");
//            mbtnaddChoice4.setVisibility(View.VISIBLE);
//            mChoice4.setVisibility(View.VISIBLE);
        }
    };
    private ImageButton.OnClickListener addChoice4OnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("hi","click on 4");
            mbtnaddChoice4.setImageResource(R.drawable.minus_light);
            if(mChoice4.getText()=="新增選項") mChoice4.setHint("選項");
            mbtnaddChoice5.setVisibility(View.VISIBLE);
            mChoice5.setVisibility(View.VISIBLE);
        }
    };
    private ImageButton.OnClickListener addChoice5OnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            mbtnaddChoice5.setImageResource(R.drawable.minus_light);
            if(mChoice5.getText()=="新增選項") mChoice5.setHint("選項");
            mbtnaddChoice6.setVisibility(View.VISIBLE);
            mChoice6.setVisibility(View.VISIBLE);
        }
    };
    private ImageButton.OnClickListener addChoice6OnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            mbtnaddChoice6.setImageResource(R.drawable.minus_light);
            if(mChoice6.getText()=="新增選項") mChoice6.setHint("選項");

        }
    };
    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");
            if(mtxtQuestion.getText().toString().equals("")){
                Toast.makeText(activity,"請填寫您想決定的問題!",Toast.LENGTH_LONG).show();
            }
            else if(mChoice1.getText().toString().equals("") || mChoice2.getText().toString().equals("")){
                Toast.makeText(activity,"請填寫兩個選項!",Toast.LENGTH_LONG).show();
            }
            else{
                // Create Choice Object
                if(mQuestion2==null){
                    mQuestion = new Question(mtxtQuestion.getText().toString(),
                            mChoice1.getText().toString(),
                            mChoice2.getText().toString());
                }else{
                    mQuestion = mQuestion2;
                }

                //go to yellow hat activity
                Intent intent = new Intent(activity, YellowHat.class);
                activity.startActivity(intent);
                activity.finish();
            }

        }
    };

}

