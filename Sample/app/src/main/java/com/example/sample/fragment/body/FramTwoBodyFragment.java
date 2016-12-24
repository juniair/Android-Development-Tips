package com.example.sample.fragment.body;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.sample.R;

/**
 * Created by juniair on 2016-12-24.
 */

public class FramTwoBodyFragment extends Fragment {

    EditText tvHeaderBackTitle;

    String _title;

    public static FramTwoBodyFragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString("Text", title);

        FramTwoBodyFragment fragment = new FramTwoBodyFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _title = getArguments().getString("Text");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_template_body, container, false);

        tvHeaderBackTitle = (EditText) view.findViewById(R.id.tv_body_2);
        tvHeaderBackTitle.setText(_title);

        return view;
    }
}
