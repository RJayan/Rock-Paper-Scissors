package com.example.user.rockpaperscissors;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
import android.content.Intent;


public class rpslogic extends AppCompatActivity {

    Button b_rock, b_scissor, b_paper;
    TextView tv_Score;
    ImageView iv_ComputerChoice, iv_HumanChoice;
    int HumanScore, ComputerScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpslogic);

        b_paper = (Button) findViewById(R.id.b_paper);
        b_scissor = (Button) findViewById(R.id.b_scissor);
        b_rock = (Button) findViewById(R.id.b_rock);

        iv_ComputerChoice = (ImageView) findViewById(R.id.iv_ComputerChoice);
        iv_HumanChoice = (ImageView) findViewById(R.id.iv_HumanChoice);

        tv_Score = (TextView) findViewById(R.id.tv_score);

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.paper);
                String message = play_turn("paper");
                Toast.makeText(rpslogic.this, message, Toast.LENGTH_SHORT).show();
                if(HumanScore==10){
                    AlertDialog.Builder builder=new AlertDialog.Builder(rpslogic.this);
                    builder.setMessage("Game Over...!\nYou Win.. :) \n Do you want to exit from game");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();

                        }
                    });
                    builder.setNegativeButton("restart", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(rpslogic.this,rpslogic.class));
                        }
                    });
                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(ComputerScore==10){
                    AlertDialog.Builder builder=new AlertDialog.Builder(rpslogic.this);
                    builder.setMessage("Game Over...! \nYou lose.. :( \n Do you want to exit from game");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();

                        }
                    });
                    builder.setNegativeButton("restart", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(rpslogic.this,rpslogic.class));
                        }
                    });
                    AlertDialog alert=builder.create();
                    alert.show();
                }
                tv_Score.setText("Human:" + Integer.toString(HumanScore) + " " + " " + " " + "Computer:" + Integer.toString(ComputerScore));
            }
        });
        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.rock);
                String message = play_turn("rock");
                Toast.makeText(rpslogic.this, message, Toast.LENGTH_SHORT).show();
                if(HumanScore==10){
                    AlertDialog.Builder builder=new AlertDialog.Builder(rpslogic.this);
                    builder.setMessage("Game Over...!\nYou Win.. :) \n Do you want to exit from game");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();

                        }
                    });
                    builder.setNegativeButton("restart", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(rpslogic.this,rpslogic.class));
                        }
                    });
                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(ComputerScore==10){
                    AlertDialog.Builder builder=new AlertDialog.Builder(rpslogic.this);
                    builder.setMessage("Game Over...! \nYou lose.. :( \n Do you want to exit from game");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();
                        }
                    });
                    builder.setNegativeButton("restart", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(rpslogic.this,rpslogic.class));
                        }
                    });
                    AlertDialog alert=builder.create();
                    alert.show();
                }

                tv_Score.setText("Human:" + Integer.toString(HumanScore) + " " + " " + " " + "Computer:" + Integer.toString(ComputerScore));


            }
        });
        b_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iv_HumanChoice.setImageResource(R.drawable.scissor);
                String message = play_turn("scissor");
                Toast.makeText(rpslogic.this, message, Toast.LENGTH_SHORT).show();
                if(HumanScore==10){
                    AlertDialog.Builder builder=new AlertDialog.Builder(rpslogic.this);
                    builder.setMessage("Game Over...!\nYou Win.. :) \nDo you want to exit from game");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();

                        }
                    });
                    builder.setNegativeButton("restart", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(rpslogic.this,rpslogic.class));
                        }
                    });
                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(ComputerScore==10){
                    AlertDialog.Builder builder=new AlertDialog.Builder(rpslogic.this);
                    builder.setMessage("Game Over...! \nYou lose.. :( \n Do you want to exit from game");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();

                        }
                    });
                    builder.setNegativeButton("restart", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(rpslogic.this,rpslogic.class));
                        }
                    });
                    AlertDialog alert=builder.create();
                    alert.show();
                }
                tv_Score.setText("Human:" + Integer.toString(HumanScore) + " " + " " + " " + "Computer:" + Integer.toString(ComputerScore));
            }
        });
    }

    public String play_turn(String player_choice) {
        String computer_choice = "";
        Random r = new Random();
        //choose 1 2 or 3
        int computer_choice_number = r.nextInt(3) + 1;
        if (computer_choice_number == 1) {
            computer_choice = "rock";
        } else if (computer_choice_number == 2) {
            computer_choice = "scissor";
        } else if (computer_choice_number == 3) {
            computer_choice = "paper";
        }

        if (computer_choice == "rock") {
            iv_ComputerChoice.setImageResource(R.drawable.rock);
        } else if (computer_choice == "scissor") {
            iv_ComputerChoice.setImageResource(R.drawable.scissor);
        } else if (computer_choice == "rock") {
            iv_ComputerChoice.setImageResource(R.drawable.rock);
        } else if (computer_choice == "paper") {
            iv_ComputerChoice.setImageResource(R.drawable.paper);
        }

        // comp
        if(computer_choice == player_choice){
            return "Draw. Nobody Won";
        }
        else if(player_choice=="rock"&&computer_choice=="scissor"){
            HumanScore++;
            return "Rock crushes scissor. You win !";
        }
        else if(player_choice=="rock"&&computer_choice=="paper"){
            ComputerScore++;
            return "Paper covers rock. Computer wins !";
        }
        else if(player_choice=="scissor"&&computer_choice=="rock"){
            ComputerScore++;
            return "Rock crushes scissor. Computer wins !";
        }
        else if(player_choice=="scissor"&&computer_choice=="paper"){
            HumanScore++;
            return "scissor cuts paper. You win !";
        }
        else if(player_choice=="paper"&&computer_choice=="scissor"){
            ComputerScore++;
            return "scissor cuts paper. Computer wins !";
        }
        else if(player_choice=="paper"&&computer_choice=="rock"){
            HumanScore++;
            return "Paper covers rock. You win !";
        }
        else
            return "not sure";
    }

}









