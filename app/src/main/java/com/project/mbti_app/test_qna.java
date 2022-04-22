package com.project.mbti_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.mbti_app.result.Test_result;


public class test_qna extends AppCompatActivity {
    private RelativeLayout cancel;
    private TextView a1, a2, q, Progress_txt;
    private ProgressBar progressBar;
    int[] data = new int[4];
    int progress = 0;
    int progress_range = 9;
    String pho_num;

    private String[] questions = {"일정없는 주말에 \n당신은?",
            "5년만에 우연히 \n동창을 만났다.\n당신은?",
            "미술을 배우려 한다.\n어떤 그림을 그릴까?",
            "한 달의 휴가를 받은 당신,\n당신의 모습은?",
            "당신은 어떤 \n칭찬을 선호하는가?",
            "여행을 가기로 했다. \n당신은?",
            "영화에서 쫓기는\n 장면을 봤을 때, 당신은?",
            "내일 좋아하는 \n이성을 만난다. 당신은?",
            "친구가 정신적으로 \n힘들어할 때, 당신은?",
            "코로나 관련 뉴스 중 어떤 소식을 선호하는가?",
            "여행 후 숙소에서 이불에 누웠을 때, 당신 모습은?",
            "맛집을 대하는 당신은?"
    };

    private String[] answers1 = {"친구들 만나야지 연락연락!!",
            "먼저 말을 걸면서 인사하고 이야기를 한다.",
            "사실적 묘사나 풍경화 같이 사물의 특징!",
            "집이 처음에는 좋지만, 곧 친구를 만나고 싶어진다.",
            "너의 정보처리 능력을 통해 이 일정을 줄인 부분이 대단해.",
            "음 일단 점심은 여기서 먹고 그 다음 여기 들렀다가 저녁은 \n찰리레스토랑에서 먹어야지",
            "집에 돌아와서 쫓기는 장면을 생각하며 \n아! 나였으면 이렇게 도망갔을텐데!",
            "아 내일 뭐 입지? 이거 입을까? \n하루 전 머리부터 발 끝까지 세팅!",
            "심리 상담을 받아보라고 추천해준다.",
            "바이러스의 원인, 출처와 같은 심층 분석 뉴스를 선호한다.",
            "이불의 촉감이 좋네? 녹는다..좋아..",
            "대기 줄이 적은 날짜와 요일을 찾아서 그날 가야지!! 헤헤 맛집"
    };

    private String[] answers2 = {"침대 개꿀? 내가 곧 침대",
            "인사는 했지만 다음 말을 걸어올 때까지 기다린다.",
            "독특하고 창의력 돋는 추상화 같은 그림!",
            "개꿀! 넷플릭스 한 달내내 봐야지.",
            "너와 같은 팀이여서 너무 좋아!",
            "방만 예약하고 몽뚱이만 있으면 끝. 일단 가자~",
            "무념무상",
            "음 대충 이거 입을까? 내일 생각하자..",
            "이야기를 들어주고 힘이 되어준다.",
            "의료진의 노고, 기부릴레이와 같은 뉴스를 선호한다.",
            "오늘 있었던 일이 뭐였지?",
            "맛있겠다 근데 줄 기다리긴 싫어 수고"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_qna);
        Intent intent = getIntent();
        pho_num = intent.getStringExtra("pho_num");
        cancel = findViewById(R.id.cancel);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        q = findViewById(R.id.q);
        BtnOnClickListener onClickListener = new BtnOnClickListener();
        cancel.setOnClickListener(onClickListener);
        a1.setOnClickListener(onClickListener);
        a2.setOnClickListener(onClickListener);
        Progress_txt = findViewById(R.id.Progress_txt);
        progressBar = findViewById(R.id.progressBar);
        if (progress == 11) {

        }
    }

    public class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            int answer;
            switch (view.getId()) {
                case R.id.a1:
                    if (progress < 11) {
                        answer = 0;
                        data_save(progress, answer);
                        progress++;
                        progressBar.setProgress(progress_range * progress + 1);
                        q.setText(questions[progress]);
                        a1.setText(answers1[progress]);
                        a2.setText(answers2[progress]);
                        Progress_txt.setText(String.valueOf(progress + 1) + "/12");
                    } else {
                        q.setVisibility(View.GONE);
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                        Progress_txt.setVisibility(View.GONE);
                        for (int i = 0; i < 4; i++) {
                            if (data[i] > 1) {
                                data[i] = 1;
                            } else {
                                data[i] = 0;
                            }
                        }

                        Intent intent = new Intent(test_qna.this, Test_result.class);
                        intent.putExtra("data", data);
                        intent.putExtra("pho_num", pho_num);
                        startActivity(intent);
                        finishAffinity();
                    }
                    break;
                case R.id.a2:
                    if (progress < 11) {
                        answer = 1;
                        data_save(progress, answer);
                        progress++;
                        progressBar.setProgress(progress_range * progress + 1);
                        q.setText(questions[progress]);
                        a1.setText(answers1[progress]);
                        a2.setText(answers2[progress]);
                        Progress_txt.setText(String.valueOf(progress + 1) + "/12");
                    } else {
                        q.setVisibility(View.GONE);
                        a1.setVisibility(View.GONE);
                        a2.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                        Progress_txt.setVisibility(View.GONE);
                        for (int i = 0; i < 4; i++) {
                            if (data[i] > 1) {
                                data[i] = 1;
                            } else {
                                data[i] = 0;
                            }
                        }

                        Intent intent = new Intent(test_qna.this, Test_result.class);
                        intent.putExtra("data", data);
                        startActivity(intent);
                        finishAffinity();
                    }
                    break;
                case R.id.cancel:
                    if (progress > 0) {
                        progress--;
                        progressBar.setProgress(progress_range * progress + 1);
                        q.setText(questions[progress]);
                        a1.setText(answers1[progress]);
                        a2.setText(answers2[progress]);
                        Progress_txt.setText(String.valueOf(progress + 1) + "/12");
                    } else {
                        Intent intent = new Intent(test_qna.this, Test_start.class);
                        startActivity(intent);
                        finishAffinity();
                    }
                    break;
            }
        }
    }

    public void data_save(int question, int answer) {
        if (question == 0) {
            data[0] += answer;
        } else if (question == 1) {
            data[0] += answer;
        } else if (question == 2) {
            data[1] += answer;
        } else if (question == 3) {
            data[0] += answer;
        } else if (question == 4) {
            data[2] += answer;
        } else if (question == 5) {
            data[3] += answer;
        } else if (question == 6) {
            data[1] += answer;
        } else if (question == 7) {
            data[3] += answer;
        } else if (question == 8) {
            data[2] += answer;
        } else if (question == 9) {
            data[2] += answer;
        } else if (question == 10) {
            data[3] += answer;
        } else if (question == 11) {
            data[1] += answer;
        } else if (question == 12) {
            data[3] += answer;
        }
    }

}