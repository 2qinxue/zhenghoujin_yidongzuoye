package com.jnu.yidongzuoye.statisticdata;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jnu.yidongzuoye.R;
import com.jnu.yidongzuoye.view.CustomCurveChart;
import com.jnu.yidongzuoye.view.IncomBIll;
import com.jnu.yidongzuoye.view.Statistic;

public class StatisticdailyFragment extends Fragment {

    public StatisticdailyFragment() {
        // Required empty public constructor
    }

    public static StatisticdailyFragment newInstance( int childPosition) {
        StatisticdailyFragment fragment = new StatisticdailyFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_statisticdaily, container, false);
        return rootView;
    }

}