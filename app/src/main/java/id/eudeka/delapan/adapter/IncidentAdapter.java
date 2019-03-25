package id.eudeka.delapan.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.eudeka.delapan.R;
import id.eudeka.delapan.model.Incident;

public class IncidentAdapter extends RecyclerView.Adapter<IncidentAdapter.IncidentHolder> {
    private List<Incident> listIncident;

    public IncidentAdapter(List<Incident> listIncident) {
        this.listIncident = listIncident;
    }

    @NonNull
    @Override
    public IncidentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()
        ).inflate(R.layout.item_incident, viewGroup, false);
        return new IncidentHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull IncidentHolder incidentHolder, int i) {

        Incident data = listIncident.get(i);
        incidentHolder.title.setText(data.getTitle());
        incidentHolder.description.setText(data.getDescription());
        incidentHolder.address.setText(data.getAddress());
        incidentHolder.updated_at.setText(data.getUpdated_at());
        Picasso.get().load(data.getMedia().getImage_url_thumb()).into(incidentHolder.image_url_thumb);
    }

    public Incident getDataIncident(int position) {
        return listIncident.get(position);
    }

    @Override
    public int getItemCount() {
        return listIncident.size();
    }

    public class IncidentHolder extends RecyclerView.ViewHolder {

        TextView title,description,updated_at,address;
        ImageView image_url_thumb;

        public IncidentHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            address = (TextView) itemView.findViewById(R.id.address);
            updated_at = (TextView) itemView.findViewById(R.id.updated_at);
            image_url_thumb = (ImageView) itemView.findViewById(R.id.image_url_thumb);
        }
    }
}
