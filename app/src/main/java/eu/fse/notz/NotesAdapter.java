package eu.fse.notz;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {
    private ArrayList<Note> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public NotesAdapter(ArrayList<Note> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public NotesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_note, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder( NotesAdapter.ViewHolder holder, int position) {
        Note currentNote = mDataset.get(position);
        holder.mTextView.setText(currentNote.getTitle());


    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}


