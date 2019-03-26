package id.eudeka.delapan.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import id.eudeka.delapan.R;
import id.eudeka.delapan.model.Incident;

public class DetailActivity extends AppCompatActivity {
    public final static String EXTRA_DETAIL_INCIDENT = "EXTRA_DETAIL_INCIDENT";
    private Incident incident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        ImageView imageView = findViewById(R.id.imageViewIncident);
        TextView textViewDesc = findViewById(R.id.textViewDesc);
        TextView textViewUpdated = findViewById(R.id.textViewUpdate);
        TextView textViewAddress = findViewById(R.id.textViewAddress);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        incident = getIntent().getParcelableExtra(EXTRA_DETAIL_INCIDENT);
        setTitle(incident.getTitle());
        Picasso.get().load(incident.getMedia().getImage_url()).into(imageView);
        textViewDesc.setText(incident.getDescription());
        textViewAddress.setText(incident.getAddress());

        textViewUpdated.setText(incident.getUpdated_at());
    }

}
