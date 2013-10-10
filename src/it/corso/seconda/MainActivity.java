package it.corso.seconda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {

	
		  static final LatLng MILANO = new LatLng(53.558, 9.927);
		  static final LatLng FIORI = new LatLng(53.551, 9.993);
		  private GoogleMap map;

		  @Override
		  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);
		    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.mappa1))
		        .getMap();
		    Marker hamburg = map.addMarker(new MarkerOptions().position(MILANO)
		        .title("Milano"));
		    Marker kiel = map.addMarker(new MarkerOptions()
		        .position(FIORI)
		        .title("MilanoFiori")
		        .snippet("Qui il corso")
		        .icon(BitmapDescriptorFactory
		            .fromResource(R.drawable.ic_launcher)));

		    // Move the camera instantly to hamburg with a zoom of 15.
		    map.moveCamera(CameraUpdateFactory.newLatLngZoom(MILANO, 15));

		    // Zoom in, animating the camera.
		    map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
		  }

		 

		} 

