package com.example.sample.fragment.body;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sample.R;

/**
 * Created by juniair on 2016-12-24.
 */

public class FramOneBodyFragment extends Fragment {

    TextView tvHeaderBackTitle;

    String _title;

    public static FramOneBodyFragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString("Text", title);

        FramOneBodyFragment fragment = new FramOneBodyFragment();
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

        tvHeaderBackTitle = (TextView) view.findViewById(R.id.tv_body_1);
        tvHeaderBackTitle.setText(_title);

        return view;
    }
}