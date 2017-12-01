package com.isla.kltn.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.isla.kltn.R;
import com.mindorks.butterknifelite.ButterKnifeLite;
import com.mindorks.butterknifelite.annotations.BindView;
import com.mindorks.butterknifelite.annotations.OnClick;
import com.mindorks.placeholderview.annotations.Layout;


/**
 * Created by isla on 11/27/17.
 */
@Layout(R.layout.login)
public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.email)
    private EditText mEmail;

    @BindView(R.id.password)
    private EditText mPassword;

    @BindView(R.id.progressBar)
    private ProgressBar mProgressBar;

    @BindView(R.id.btn_login)
    private Button mLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnifeLite.bind(this);
    }


    @OnClick(R.id.btn_login)
    private void Login(){
        String email = mEmail.getText().toString();
        final String password = mPassword.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }

        mProgressBar.setVisibility(android.view.View.VISIBLE);
        //Login handle
        startActivity(new Intent(this,MainActivity.class));
    }
}
