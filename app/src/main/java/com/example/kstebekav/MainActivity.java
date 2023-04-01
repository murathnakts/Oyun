package com.example.kstebekav;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14,k15,k16;
    private TextView skor;
    private int score = 0,k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        k1 = findViewById(R.id.k1);
        k2 = findViewById(R.id.k2);
        k3 = findViewById(R.id.k3);
        k4 = findViewById(R.id.k4);
        k5 = findViewById(R.id.k5);
        k6 = findViewById(R.id.k6);
        k7 = findViewById(R.id.k7);
        k8 = findViewById(R.id.k8);
        k9 = findViewById(R.id.k9);
        k10 = findViewById(R.id.k10);
        k11 = findViewById(R.id.k11);
        k12 = findViewById(R.id.k12);
        k13 = findViewById(R.id.k13);
        k14 = findViewById(R.id.k14);
        k15 = findViewById(R.id.k15);
        k16 = findViewById(R.id.k16);
        skor = findViewById(R.id.skor);

        k1.setVisibility(View.INVISIBLE);
        k2.setVisibility(View.INVISIBLE);
        k3.setVisibility(View.INVISIBLE);
        k4.setVisibility(View.INVISIBLE);
        k5.setVisibility(View.INVISIBLE);
        k6.setVisibility(View.INVISIBLE);
        k7.setVisibility(View.INVISIBLE);
        k8.setVisibility(View.INVISIBLE);
        k9.setVisibility(View.INVISIBLE);
        k10.setVisibility(View.INVISIBLE);
        k11.setVisibility(View.INVISIBLE);
        k12.setVisibility(View.INVISIBLE);
        k13.setVisibility(View.INVISIBLE);
        k14.setVisibility(View.INVISIBLE);
        k15.setVisibility(View.INVISIBLE);
        k16.setVisibility(View.INVISIBLE);

        new CountDownTimer(999999999, 750) {

            @Override
            public void onTick(long l) {
                int rand = (int) (Math.random() * 16 + 1);

                k1.setVisibility(View.INVISIBLE);
                k2.setVisibility(View.INVISIBLE);
                k3.setVisibility(View.INVISIBLE);
                k4.setVisibility(View.INVISIBLE);
                k5.setVisibility(View.INVISIBLE);
                k6.setVisibility(View.INVISIBLE);
                k7.setVisibility(View.INVISIBLE);
                k8.setVisibility(View.INVISIBLE);
                k9.setVisibility(View.INVISIBLE);
                k10.setVisibility(View.INVISIBLE);
                k11.setVisibility(View.INVISIBLE);
                k12.setVisibility(View.INVISIBLE);
                k13.setVisibility(View.INVISIBLE);
                k14.setVisibility(View.INVISIBLE);
                k15.setVisibility(View.INVISIBLE);
                k16.setVisibility(View.INVISIBLE);
                k=0;

                if (rand == 1) {
                    k1.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 2) {
                    k2.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 3) {
                    k3.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 4) {
                    k4.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 5) {
                    k5.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 6) {
                    k6.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 7) {
                    k7.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 8) {
                    k8.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 9) {
                    k9.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 10) {
                    k10.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 11) {
                    k11.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 12) {
                    k12.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 13) {
                    k13.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 14) {
                    k14.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 15) {
                    k15.setVisibility(View.VISIBLE);
                    k = 1;
                } else if (rand == 16) {
                    k16.setVisibility(View.VISIBLE);
                    k = 1;
                }
            }

            @Override
            public void onFinish() {

            }
        }.start();
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }
            }
        });
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }
            }
        });
        k8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }
            }
        });
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });
        k16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (k == 1) {
                    score++;
                    skor.setText("Puanınız: " + score);
                    k=0;
                }

            }
        });



    }
}