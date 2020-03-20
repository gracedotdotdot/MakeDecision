package com.example.circularmarket;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static com.example.circularmarket.CreateFragment.mQuestion;


public class Results extends AppCompatActivity {
    TextView mscore, mchoice, msuggest;
    ImageButton mbtnCheck;
    double proScore, conScore;
    ArrayList<String> notFactList = new ArrayList<>();
    ArrayList<String> subProList = new ArrayList<>();
    ArrayList<String> subConList = new ArrayList<>();
    public static Question mQuestion2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        mbtnCheck = findViewById(R.id.btncheck);
        mbtnCheck.setOnClickListener(btnCheckOnClick);

        mscore = findViewById(R.id.score);
        msuggest = findViewById(R.id.suggestContent);
        mchoice = findViewById(R.id.suggestChoice);

        proScore = calculateScore(mQuestion.choice1.pros);
        conScore = calculateScore(mQuestion.choice1.cons);
        mQuestion.choice1.score = proScore - conScore;
        Log.e("OnCreate","choice1 Total score"+mQuestion.choice1.score);

        proScore = calculateScore(mQuestion.choice2.pros);
        conScore = calculateScore(mQuestion.choice2.cons);
        mQuestion.choice2.score = proScore - conScore;
        Log.e("OnCreate","choice2 Total score"+mQuestion.choice2.score);

        String msg1 = mQuestion.choice1.choiceName + ": " + mQuestion.choice1.score +"分\n";
        String msg2 = mQuestion.choice2.choiceName + ": " + mQuestion.choice2.score +"分\n";
        mscore.setText(msg1+msg2);

        String winner ="";
        String near = "";
        String other = "";
        String notfact="";
        String subPro="", subCon="";
        if(mQuestion.choice1.score > mQuestion.choice2.score){
            winner = "建議選擇" + mQuestion.choice1.choiceName;
            findContracdictFact(mQuestion.choice1);
            findContracdictFact(mQuestion.choice2);
            findContracdictSub(mQuestion.choice2.pros, subProList);
            findContracdictSub(mQuestion.choice1.cons, subConList);

        }else {
            winner = "建議選擇" + mQuestion.choice2.choiceName + "\n";
            findContracdictFact(mQuestion.choice1);
            findContracdictFact(mQuestion.choice2);
            findContracdictSub(mQuestion.choice1.pros, subProList);
            findContracdictSub(mQuestion.choice2.cons, subConList);
        }
        if(mQuestion.choice1.score-mQuestion.choice2.score<=1 && mQuestion.choice1.score-mQuestion.choice2.score>=-1){
            near = "您的分數十分接近\n";
        }
        if(!notFactList.isEmpty()){
            notfact= "您所重視的: ";
            for(String str: notFactList)
                notfact = notfact.concat(str +", ");
            notfact = notfact.concat("事實性不足，建議您確認此項目是否為真，再行決定\n");
        }
        if(!subProList.isEmpty()) {
            subPro = "若您仍對選擇有所猶豫，建議您利用其他方式獲得和";
            for(String str: subProList)
                subPro= subPro.concat("\"" + str +"\", ");
            subPro= subPro.concat("相似的好處\n");
        }
        if(!subConList.isEmpty()) {
            subCon = "若您有所猶豫，建議您嘗試克服\" ";
            for(String str: subConList)
                subCon= subCon.concat("\"" + str +"\", ");
            subCon= subCon.concat("的壞處\n");
        }

        Log.e("print suggest", winner+near+notfact+subPro+subCon);
        mchoice.setText(winner);
        msuggest.setText(near+notfact+subPro+subCon);


    }
    public void findContracdictFact(Choice mchoice){
        Choice.Item[] item =mchoice.pros;
        for(int j=0; j<2; j++)
            if(j==1) item = mchoice.cons;
        for(int i=0; i<item.length; i++){
            if(item[i].importance>3){
                // find if any item is important to user but not fact
                if(!item[i].fact) notFactList.add(item[i].itemName);
            }
        }
        for(String str: notFactList)
            Log.e("print notFactlist", str);
    }
    public void findContracdictSub(Choice.Item[] item, ArrayList<String> sublist){
        int index=0;    // the index which has the biggest importance of the itemList
        for(int i=0, tmpImportance =1; i<item.length; i++) {
            if (item[i].importance > tmpImportance) {
                tmpImportance = item[i].importance;
                index = i;
            }
        }
        // find if any item most important to user but can be substitute
        if(!item[index].substitute.equals("")) sublist.add(item[index].itemName);
        for(String str: sublist)
            Log.e("print sublist", str);
    }
    public double calculateScore(Choice.Item[] item){
        double score=0;
        // Calculate pro scores
        for(int i=0; i<item.length; i++){
            double factFactor = 1, subFactor=1;
            if(item[i].fact)                    // factor is increased if the item is a fact
                factFactor=1.5;
            if(!item[i].substitute.equals(""))  //factor is decreased if the item has a substitute
                subFactor = 0.5;
            if(!item[i].itemName.equals("")) score += subFactor*factFactor*(item[i].importance);
            Log.e("calculateScore","item="+item[i].itemName+" , score="+score);
        }
        Log.e("calculateScore","Total score="+score);
        return score;
    }
    private ImageButton.OnClickListener btnCheckOnClick = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.e("choices", "checkonclick");

            mQuestion2 = mQuestion;

            //go to yellow hat activity
            Intent intent = new Intent(Results.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
}
