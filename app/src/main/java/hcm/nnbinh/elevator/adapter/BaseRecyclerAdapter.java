package hcm.nnbinh.elevator.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by nguyenngocbinh on 4/22/17.
 */

public class BaseRecyclerAdapter <T> extends RecyclerView.Adapter<BaseViewHolder<T>> {
    private List<T> mData;

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context mContext) {
        this.mContext = mContext;
    }

    private Context mContext;

    public BaseRecyclerAdapter() {
    }

    public BaseRecyclerAdapter(Context context, List<T> data) {
        mContext = context;
        mData = data;
    }

    public List<T> getData() {
        return mData;
    }

    public void setData(List<T> mData) {
        this.mData = mData;
    }

    public void addAll(List<T> items) {
        mData.addAll(items);
        notifyDataSetChanged();
    }

    public void remove(int position) {
        remove(mData.get(position));
    }

    public void remove(T item) {
        mData.remove(item);
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder<T> onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<T> holder, int position) {
        holder.bindItem(mData.get(position), position);
    }

    @Override
    public int getItemCount() {
        if (mData == null)
            return 0;
        return mData.size();
    }
}
