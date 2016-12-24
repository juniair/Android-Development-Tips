package com.example.sample.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.sample.R;
import com.example.sample.fragment.body.FramOneBodyFragment;
import com.example.sample.fragment.footer.FooterToastButoonFragment;
import com.example.sample.fragment.header.HeaderBackButtonFragment;

public class FramOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamplate);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        HeaderBackButtonFragment headerBackButtonFragment = HeaderBackButtonFragment.newInstance(this.getClass().getSimpleName());
        fragmentTransaction.add(R.id.layout_header, headerBackButtonFragment);

        FramOneBodyFragment framOneBodyFragment = FramOneBodyFragment.newInstance(this.getClass().getSimpleName() + "의 바디 영역 입니다.");
        fragmentTransaction.add(R.id.layout_content, framOneBodyFragment);

        FooterToastButoonFragment footerToastButoonFragment = FooterToastButoonFragment.newInstance(FramOneBodyFragment.class.getSimpleName() + "이 올라와 있어요");

        fragmentTransaction.commit();

    }
}
