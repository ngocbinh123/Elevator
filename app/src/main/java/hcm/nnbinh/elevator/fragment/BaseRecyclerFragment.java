package hcm.nnbinh.elevator.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hcm.nnbinh.elevator.R;
/**
 * Created by nguyenngocbinh on 4/22/17.
 */

public class BaseRecyclerFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    public final static int LIST_TYPE = 0;
    public final static int GRID_TYPE = 1;
    private int mDisplayType = LIST_TYPE;
    private int mColumnNumber= 2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mResLayoutId == 0) {
            mResLayoutId = R.layout.fragment_recycler_view;
        }
        View view = inflater.inflate(mResLayoutId, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        mRecyclerView.setHasFixedSize(true);
        setLayoutManager();
    }

    public void setGridLayout(int columnNumber) {
        mDisplayType = GRID_TYPE;
        mColumnNumber = columnNumber;
    }

    private void setLayoutManager() {
        if (mDisplayType == GRID_TYPE) {
            mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), mColumnNumber));
        }else {
            LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
            mRecyclerView.setLayoutManager(mLayoutManager);
        }
    }

    public void  setRecyclerView(RecyclerView recyclerView) {
        mRecyclerView = recyclerView;
    }
    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }
}
