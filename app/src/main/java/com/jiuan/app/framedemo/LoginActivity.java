package com.jiuan.app.framedemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ZhangKong on 2015/8/13.
 */
public class LoginActivity extends ActionBarActivity implements View.OnClickListener,TextView.OnEditorActionListener,TextWatcher {


    @Bind(R.id.et_account)
    AutoCompleteTextView etAccount;
    @Bind(R.id.et_password)
    EditText etPassword;
    @Bind(R.id.bt_login)
    Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        etAccount.addTextChangedListener(this);
        etPassword.addTextChangedListener(this);
    }

    @Override
    @OnClick(R.id.bt_login)
    public void onClick(View v) {

    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

        String account = etAccount.getText().toString();
        String pwd = etPassword.getText().toString();
        if (TextUtils.isEmpty(account) || TextUtils.isEmpty(pwd)) {
            btLogin.setEnabled(false);
        } else {
            btLogin.setEnabled(true);
        }

    }
}
