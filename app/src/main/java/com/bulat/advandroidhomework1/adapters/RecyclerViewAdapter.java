package com.bulat.advandroidhomework1.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bulat.advandroidhomework1.R;
import com.bulat.advandroidhomework1.model.Record;

import java.util.List;

/**
 * Created by bulat on 08.10.15.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecordHolder> {
    private List<Record> records;

    public RecyclerViewAdapter(List<Record> records) {
        this.records = records;
    }

    @Override
    public RecordHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item, parent, false);
        return new RecordHolder(view);
    }

    @Override
    public void onBindViewHolder(RecordHolder holder, int position) {
        Record record = records.get(position);
        Log.d("myLog", record.getIndexStringFormat());
        holder.record.setText(record.getIndexStringFormat());
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    class RecordHolder extends RecyclerView.ViewHolder {
        private TextView record;

        public RecordHolder(View itemView) {
            super(itemView);
            record = (TextView) itemView.findViewById(R.id.recycler_view_record);
        }
    }
}
