package com.project.mbti_app.result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.project.mbti_app.R;

import java.util.ArrayList;


public class Test_result extends AppCompatActivity {

    ArrayList<Integer> page_check = new ArrayList<>();
    ArrayList<Boolean> signals = new ArrayList<>();
    ArrayList<String> datas = new ArrayList<>();
    TextView[] checks=new TextView[25];
    int view_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ResultView_init();
        page_check(view_num);
    }
    public void  ResultView_init(){
        Intent intent=getIntent();
        int[] data=intent.getExtras().getIntArray("data");
        Log.e("qna",data.toString());
        if(data[0]==0){
            if(data[1]==0){
                if(data[2]==0){
                    if(data[3]==0){
                        setContentView(R.layout.estj_0246);
                        view_num=0;
                    }
                    else{
                        setContentView(R.layout.estp_0247);
                        view_num=1;
                    }
                }
                else{
                    if(data[3]==0){
                        setContentView(R.layout.esfj_0256);
                        view_num=2;
                    }
                    else{
                        setContentView(R.layout.esfp_0257);
                        view_num=3;
                    }
                }
            }
            else{
                if(data[2]==0){
                    if(data[3]==0){
                        setContentView(R.layout.entj_0346);
                        view_num=4;
                    }
                    else{
                        setContentView(R.layout.entp_0347);
                        view_num=5;
                    }
                }
                else{
                    if(data[3]==0){
                        setContentView(R.layout.enfj_0356);
                        view_num=6;
                    }
                    else{
                        setContentView(R.layout.enfp_0357);
                        view_num=7;
                    }
                }
            }
        }
        else{
            if(data[1]==0){
                if(data[2]==0){
                    if(data[3]==0){
                        setContentView(R.layout.istj_1246);
                        view_num=8;
                    }
                    else{
                        setContentView(R.layout.istp_1247);
                        view_num=9;
                    }
                }
                else{
                    if(data[3]==0){
                        setContentView(R.layout.isfj_1256);
                        view_num=10;
                    }
                    else{
                        setContentView(R.layout.isfp_1257);
                        view_num=11;
                    }
                }
            }
            else{
                if(data[2]==0){
                    if(data[3]==0){
                        setContentView(R.layout.intj_1346);
                        view_num=12;
                    }
                    else{
                        setContentView(R.layout.intp_1347);
                        view_num=13;
                    }
                }
                else{
                    if(data[3]==0){
                        setContentView(R.layout.infj_1356);
                        view_num=14;
                    }
                    else{
                        setContentView(R.layout.infp_1357);
                        view_num=15;
                    }
                }
            }
        }
    }
    public void page_check(int num){
        TextOnClickListener onClickListener = new TextOnClickListener();
        page_check.add(18);
        page_check.add(18);
        page_check.add(17);
        page_check.add(18);
        page_check.add(22);
        page_check.add(18);
        page_check.add(20);
        page_check.add(20);
        page_check.add(18);
        page_check.add(20);
        page_check.add(18);
        page_check.add(21);
        page_check.add(18);
        page_check.add(20);
        page_check.add(19);
        page_check.add(17);
        int i=1;
        while (i<22){
            datas.add("");
            i++;
        }
        i=1;
        while (i<page_check.get(num)+1){
            signals.add(false);


            checks[i - 1] = findViewById(getResources().getIdentifier("mbti_" + i, "id", getPackageName()));
            checks[i - 1].setOnClickListener(onClickListener);
            i++;
        }
    }

    public class TextOnClickListener implements TextView.OnClickListener {
        @Override
        public void onClick(View view) {
            int answer;
            switch (view.getId()) {
                case R.id.mbti_1:
                    if (!signals.get(0)) {
                        signals.set(0, true);
                        checks[0].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(0, checks[0].getText().toString());
                    } else {
                        signals.set(0, false);
                        checks[0].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(0, "");
                    }
                    break;
                case R.id.mbti_2:
                    if (!signals.get(1)) {
                        signals.set(1, true);
                        checks[1].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(1, checks[1].getText().toString());
                    } else {
                        signals.set(1, false);
                        checks[1].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(1, "");
                    }
                    break;
                case R.id.mbti_3:
                    if (!signals.get(2)) {
                        signals.set(2, true);
                        checks[2].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(2, checks[2].getText().toString());
                    } else {
                        signals.set(2, false);
                        checks[2].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(2, "");
                    }
                    break;
                case R.id.mbti_4:
                    if (!signals.get(3)) {
                        signals.set(3, true);
                        checks[3].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(3, checks[3].getText().toString());
                    } else {
                        signals.set(3, false);
                        checks[3].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(3, "");
                    }
                    break;
                case R.id.mbti_5:
                    if (!signals.get(4)) {
                        signals.set(4, true);
                        checks[4].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(4, checks[4].getText().toString());
                    } else {
                        signals.set(4, false);
                        checks[4].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(4, "");
                    }
                    break;
                case R.id.mbti_6:
                    if (!signals.get(5)) {
                        signals.set(5, true);
                        checks[5].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(5, checks[5].getText().toString());
                    } else {
                        signals.set(5, false);
                        checks[5].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(5, "");
                    }
                    break;
                case R.id.mbti_7:
                    if (!signals.get(6)) {
                        signals.set(6, true);
                        checks[6].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(6, checks[6].getText().toString());
                    } else {
                        signals.set(6, false);
                        checks[6].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(6, "");
                    }
                    break;
                case R.id.mbti_8:
                    if (!signals.get(7)) {
                        signals.set(7, true);
                        checks[7].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(7, checks[7].getText().toString());
                    } else {
                        signals.set(7, false);
                        checks[7].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(7, "");
                    }
                    break;
                case R.id.mbti_9:
                    if (!signals.get(8)) {
                        signals.set(8, true);
                        checks[8].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(8, checks[8].getText().toString());
                    } else {
                        signals.set(8, false);
                        checks[8].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(8, "");
                    }
                    break;
                case R.id.mbti_10:
                    if (!signals.get(9)) {
                        signals.set(9, true);
                        checks[9].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(9, checks[9].getText().toString());
                    } else {
                        signals.set(9, false);
                        checks[9].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(9, "");
                    }
                    break;

                case R.id.mbti_11:
                    if (!signals.get(10)) {
                        signals.set(10, true);
                        checks[10].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(10, checks[10].getText().toString());
                    } else {
                        signals.set(10, false);
                        checks[10].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(10, "");
                    }
                    break;

                case R.id.mbti_12:
                    if (!signals.get(11)) {
                        signals.set(11, true);
                        checks[11].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(11, checks[11].getText().toString());
                    } else {
                        signals.set(11, false);
                        checks[11].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(11, "");
                    }
                    break;
                case R.id.mbti_13:
                    if (!signals.get(12)) {
                        signals.set(12, true);
                        checks[12].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(12, checks[12].getText().toString());
                    } else {
                        signals.set(12, false);
                        checks[12].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(12, "");
                    }
                    break;
                case R.id.mbti_14:
                    if (!signals.get(13)) {
                        signals.set(13, true);
                        checks[13].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(13, checks[13].getText().toString());
                    } else {
                        signals.set(13, false);
                        checks[13].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(13, "");
                    }
                    break;
                case R.id.mbti_15:
                    if (!signals.get(1)) {
                        signals.set(14, true);
                        checks[14].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(14, checks[14].getText().toString());
                    } else {
                        signals.set(14, false);
                        checks[14].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(14, "");
                    }
                    break;
                case R.id.mbti_16:
                    if (!signals.get(15)) {
                        signals.set(15, true);
                        checks[15].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(15, checks[15].getText().toString());
                    } else {
                        signals.set(15, false);
                        checks[15].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(15, "");
                    }
                    break;
                case R.id.mbti_17:
                    if (!signals.get(16)) {
                        signals.set(16, true);
                        checks[16].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(16, checks[16].getText().toString());
                    } else {
                        signals.set(16, false);
                        checks[16].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(16, "");
                    }
                    break;
                case R.id.mbti_18:
                    if (!signals.get(17)) {
                        signals.set(17, true);
                        checks[17].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(17, checks[17].getText().toString());
                    } else {
                        signals.set(17, false);
                        checks[17].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(17, "");
                    }
                    break;
                case R.id.mbti_19:
                    if (!signals.get(18)) {
                        signals.set(18, true);
                        checks[18].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(18, checks[18].getText().toString());
                    } else {
                        signals.set(18, false);
                        checks[18].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(18, "");
                    }
                    break;
                case R.id.mbti_20:
                    if (!signals.get(19)) {
                        signals.set(19, true);
                        checks[19].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(19, checks[19].getText().toString());
                    } else {
                        signals.set(19, false);
                        checks[19].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(19, "");
                    }
                    break;
                case R.id.mbti_21:
                    if (!signals.get(20)) {
                        signals.set(20, true);
                        checks[20].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(20, checks[20].getText().toString());
                    } else {
                        signals.set(20, false);
                        checks[20].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(20, "");
                    }
                    break;
                case R.id.mbti_22:
                    if (!signals.get(21)) {
                        signals.set(21, true);
                        checks[21].setTextColor(getResources().getColor(R.color.coral));
                        datas.set(21, checks[21].getText().toString());
                    } else {
                        signals.set(21, false);
                        checks[21].setTextColor(getResources().getColor(R.color.gray_50));
                        datas.set(21, "");
                    }
                    break;
            }
        }
    }
}