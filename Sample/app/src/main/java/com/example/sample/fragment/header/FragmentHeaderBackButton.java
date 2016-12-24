package com.example.sample.fragment.header;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sample.R;

public class FragmentHeaderBackButton extends Fragment {

    ImageView ivHeaderBack;
    TextView tvHeaderBackTitle;
    FrameLayout layoutHeaderBackBackBtn;
    LinearLayout layoutHeaderBackground;
    FrameLayout layoutHeaderBtn;

    int _visibility = View.VISIBLE;

    float _alpha = 1;
    String _title;
    View _rightLayout;

    public static FragmentHeaderBackButton newInstance(String title) {
        Bundle args = new Bundle();
        args.putString("Title", title);

        FragmentHeaderBackButton fragment = new FragmentHeaderBackButton();
        fragment.setArguments(args);

        return fragment;
    }

    public static FragmentHeaderBackButton newInstance(String title, View rightLayout) {
        FragmentHeaderBackButton fragment = newInstance(title);
        fragment.setRightBtn(rightLayout);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _title = getArguments().getString("Title");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_header_back_button, container, false);

        ivHeaderBack = (ImageView) view.findViewById(R.id.iv_header_back);
        tvHeaderBackTitle = (TextView) view.findViewById(R.id.tv_header_back_title);
        layoutHeaderBackBackBtn = (FrameLayout) view.findViewById(R.id.layout_header_back_backBtn);
        layoutHeaderBackBackBtn.setOnClickListener(onClick(this));
        layoutHeaderBackground = (LinearLayout) view.findViewById(R.id.layout_header_background);
        layoutHeaderBtn = (FrameLayout) view.findViewById(R.id.layout_header_btn);


        ivHeaderBack.setImageDrawable(view.getResources().getDrawable(R.drawable.header_back));
        tvHeaderBackTitle.setText(_title);
        layoutHeaderBackground.setAlpha(_alpha);
        tvHeaderBackTitle.setVisibility(_visibility);
        layoutHeaderBackBackBtn.setVisibility(_visibility);

        if (_rightLayout != null) {
            setRightBtn(_rightLayout);
        }

        return view;
    }


    public View.OnClickListener onClick(final FragmentHeaderBackButton it) {

        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                it.getActivity().onBackPressed();
            }
        };
    }

    public void setRightBtn(View view) {
        _rightLayout = view;

        if(layoutHeaderBtn!=null) {
            layoutHeaderBtn.removeAllViews();
            layoutHeaderBtn.addView(_rightLayout, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.MATCH_PARENT));
        }
    }

    //region for ProductActivity( hide when scroll on top )

    public void setHeaderComponentVisible(int visibility) {
        this._visibility = visibility;

        if (tvHeaderBackTitle != null && layoutHeaderBackBackBtn != null) {
            tvHeaderBackTitle.setVisibility(visibility);
            layoutHeaderBackBackBtn.setVisibility(visibility);
        }
    }

    public void setBackgroundAlpha(float alpha) {
        this._alpha = alpha;
        if (layoutHeaderBackground != null) {
            layoutHeaderBackground.setAlpha(alpha);
        }
    }
}
