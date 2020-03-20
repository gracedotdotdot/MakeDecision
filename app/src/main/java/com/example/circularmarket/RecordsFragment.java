package com.example.circularmarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;
import static com.example.circularmarket.CreateFragment.mQuestion;

public class RecordsFragment extends Fragment {
    private ImageButton mbtnaddChoice3, mbtnaddChoice4, mbtnaddChoice5, mbtnaddChoice6, mbtnCheck;

    private Button mbtnQuestion;
    private Activity activity;


    public RecordsFragment(Activity activity) {
        // Required empty public constructor
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_records, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mbtnQuestion = getView().findViewById(R.id.btnQuestion1);
        mbtnQuestion.setOnClickListener(btnQuesOnClick);
        if(mQuestion!=null && !mQuestion.quesName.equals("")){
            mbtnQuestion.setText(mQuestion.quesName);
            mbtnQuestion.setVisibility(VISIBLE);
        }else{
            mbtnQuestion.setVisibility(INVISIBLE);
        }
    }
    Button.OnClickListener btnQuesOnClick = new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            //go to yellow hat activity
            Intent intent = new Intent(activity, MainActivity.class);
            intent.putExtra("ques",mQuestion.quesName);
            activity.startActivity(intent);
            activity.finish();
        }
    };

}

