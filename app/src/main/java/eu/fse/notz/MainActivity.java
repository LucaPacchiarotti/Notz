package eu.fse.notz;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class MainActivity extends AppCompatActivity {
    //private String [] myDataset = {"nota 1", "nota 2", "nota 3","nota 4"};

    private ArrayList<Note> myDataset;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.notes_rv);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        myDataset = new ArrayList<>();
        Note pinPalazzo = new Note("PIN","12345");
        myDataset.add(pinPalazzo);

        mAdapter = new NotesAdapter (myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
