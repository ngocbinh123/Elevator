package hcm.nnbinh.elevator.adapter;
import android.content.Context;
import android.view.ViewGroup;

import java.util.List;

import hcm.nnbinh.elevator.R;
import hcm.nnbinh.elevator.model.Vector;

/**
 * Created by nguyenngocbinh on 4/22/17.
 */

public class MainRecyclerAdapter extends BaseRecyclerAdapter<Vector> {
    private OnClickListener mListener;
    public interface OnClickListener {
        void onClickItem(Vector vector, int position);
    }
    public MainRecyclerAdapter(Context context, List<Vector> data) {
        super(context, data);
    }

    public void setOnClickListener(OnClickListener listener) {
        mListener = listener;
    }

    @Override
    public BaseViewHolder<Vector> onCreateViewHolder(ViewGroup parent, int viewType) {
        VectorHolder holder = new VectorHolder(parent, R.layout.list_item_vector);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<Vector> holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    class VectorHolder extends BaseViewHolder<Vector> {
        public VectorHolder(ViewGroup parent, int layoutId) {
            super(parent, layoutId);
        }

        @Override
        public void onBindItem(Vector item, int position) {

        }
    }
}
