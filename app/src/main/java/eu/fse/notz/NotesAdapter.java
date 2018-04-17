package eu.fse.notz;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {
    private ArrayList<Note> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTV, descriptionTV;


        public ViewHolder(View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.title_Tv);
            descriptionTV = itemView.findViewById(R.id.description_Tv);

        }
    }

    public NotesAdapter(ArrayList<Note> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public NotesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_note, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder( NotesAdapter.ViewHolder holder, int position) {
        Note currentNote = mDataset.get(position);
        holder.titleTV.setText(mDataset.get(position).getTitle());
        holder.descriptionTV.setText(mDataset.get(position).getDescription());



    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}


