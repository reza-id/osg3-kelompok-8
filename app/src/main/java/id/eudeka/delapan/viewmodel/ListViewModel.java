package id.eudeka.delapan.viewmodel;

import android.content.Context;

import java.util.List;

import id.eudeka.delapan.data.IncidentDataSource;
import id.eudeka.delapan.data.IncidentRepository;
import id.eudeka.delapan.model.Incident;
import id.eudeka.delapan.navigator.IncidentNavigator;
import id.eudeka.delapan.view.ListFragment;

public class ListViewModel {

    private IncidentRepository incidentRepository;
    private IncidentNavigator mNavigator;

    public  ListViewModel(IncidentRepository incidentRepository, ListFragment context){
        this.incidentRepository = incidentRepository;
    }

    public void setNavigator(IncidentNavigator navigator){
        mNavigator = navigator;
    }

    public void getListIncident(){
        incidentRepository.getListIncident(new IncidentDataSource.GetIncidentCallback() {
            @Override
            public void onIncidentLoaded(List<Incident> data) {
                mNavigator.loadListIncident(data);
            }

            @Override
            public void onDataNotAvailabel(String errorMessage) {
                System.out.println("okh "+errorMessage);
            }
        });
    }

}
