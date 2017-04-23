package hcm.nnbinh.elevator.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import hcm.nnbinh.elevator.R;
import hcm.nnbinh.elevator.adapter.MainRecyclerAdapter;
import hcm.nnbinh.elevator.model.Vector;

/**
 * Created by nguyenngocbinh on 4/22/17.
 */

public class MainFragment extends BaseRecyclerFragment {
    private MainRecyclerAdapter mRecycleAdapter;
    private static final int FLOOR_SIZE = 5;
    private static final int ELEVATOR_SIZE = 2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecyclerView();
    }

    /**
     * setup recycler view on UI
     * */
    private void setupRecyclerView() {
        setGridLayout(ELEVATOR_SIZE);
        mRecycleAdapter = new MainRecyclerAdapter(getContext(), getVectors());
        mRecycleAdapter.setOnClickListener(new MainRecyclerAdapter.OnClickListener() {
            @Override
            public void onClickItem(Vector vector, int position) {

            }
        });
        getRecyclerView().setAdapter(mRecycleAdapter);
    }

    /**
     * get all of vector
     * */
    private List<Vector> getVectors() {
        List<Vector> vectors = new ArrayList<>();
        int n = FLOOR_SIZE* ELEVATOR_SIZE;
        int count = 1;
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n; j++) {
                Vector item = new Vector(i,j,String.valueOf(count++));
                vectors.add(item);
            }
        }
        return vectors;
    }

    /**
     * update UI
     * */
    private void updateOnUI(final List<Vector> vectors) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mRecycleAdapter.setData(vectors);
                mRecycleAdapter.notifyDataSetChanged();
            }
        });
    }
}
