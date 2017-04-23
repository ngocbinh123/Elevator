package hcm.nnbinh.elevator.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.HashMap;

/**
 * Created by nguyenngocbinh on 4/22/17.
 */

public class BaseFragment extends Fragment {
    protected int mResLayoutId = 0;
    protected String TAG = getClass().getSimpleName();

    public int getResLayoutId() {
        return mResLayoutId;
    }

    public void setLayout(int resLayoutId) {
        mResLayoutId = resLayoutId;
    }

    public void setTitle(String title) {
        getActivity().setTitle(title);
    }

    /**
     * build unique id
     * @return
     */
    public String getFragmentKey() {
        return getClass().getName() + "_" + getId() + "_" + getTag();
    }

    /**
     * create unique key for this fragment
     * @return
     */
    public String createArgumentKey(String key) {
        return getFragmentKey() + "_" + key;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
