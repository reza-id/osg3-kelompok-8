package id.eudeka.delapan.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import id.eudeka.delapan.IncidentInjection;
import id.eudeka.delapan.R;
import id.eudeka.delapan.adapter.IncidentAdapter;
import id.eudeka.delapan.listener.ItemClickRecyclerView;
import id.eudeka.delapan.model.Incident;
import id.eudeka.delapan.navigator.IncidentNavigator;
import id.eudeka.delapan.viewmodel.ListViewModel;

import static id.eudeka.delapan.view.DetailActivity.EXTRA_DETAIL_INCIDENT;

public class ListFragment extends Fragment implements IncidentNavigator {

    private ListViewModel listViewModel;
    private RecyclerView recIncident;
    private ProgressBar progressbar;

    private IncidentAdapter adapter;
    private List<Incident> dataListIncident;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_incident, container, false);
        recIncident = (RecyclerView) view.findViewById(R.id.list);
        progressbar = (ProgressBar) view.findViewById(R.id.progressbar);

        progressbar.setVisibility(View.VISIBLE);
        listViewModel = new ListViewModel(IncidentInjection.provideIncidentRepository(),this);
        dataListIncident = new ArrayList<>();
        listViewModel.setNavigator(this);
        listViewModel.getListIncident();
        initAdapter();

        ItemClickRecyclerView.addTo(recIncident).setOnItemClickListener(new ItemClickRecyclerView.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra(EXTRA_DETAIL_INCIDENT, adapter.getDataIncident(position));
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void loadListIncident(List<Incident> listIncident) {
        dataListIncident.addAll(listIncident);
        adapter.notifyDataSetChanged();
        progressbar.setVisibility(View.GONE);
    }

    @Override
    public void errorloadListIncident(String message) {
        Log.e("ERROR", message);
    }

    private void initAdapter() {
        adapter = new IncidentAdapter(dataListIncident);
        recIncident.setLayoutManager(new LinearLayoutManager(getContext()));
        recIncident.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recIncident.setAdapter(adapter);
    }
}
