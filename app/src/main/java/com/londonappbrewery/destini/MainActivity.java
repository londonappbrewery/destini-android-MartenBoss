package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex=1;
    boolean mAnswer=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(mStoryIndex==1){
                mStoryText.setText(R.string.T4_End);
             }
             else if(mStoryIndex==2){
                mStoryIndex++;
                mStoryText.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);

            }
            else if(mStoryIndex==3){
                 mStoryText.setText(R.string.T6_End);
                 mButtonTop.setText("You finished the Story");
                 mButtonBottom.setText("Marten Kabelitz");
            }


            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(mStoryIndex==1){
                mStoryIndex++;
                mStoryText.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1);
                mButtonBottom.setText(R.string.T2_Ans2);
            }
            else if(mStoryIndex==2){
                mStoryText.setText(R.string.T4_End);
            }
            else if(mStoryIndex==3){
                mStoryText.setText(R.string.T5_End);
                mButtonTop.setText("You finished the Story");
                mButtonBottom.setText("Marten Kabelitz");
            }
            }
        });


    }
}
