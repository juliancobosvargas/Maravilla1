package com.example.maravilla1;

import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mimapa extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    //creo miMarcador
    private Marker miMarcador;

    private String Grupo,Objeto;
    private Marker miMarcador1;
    private Marker miMarcador2;
    private Marker miMarcador3;
    private Marker miMarcador4;
    private Marker miMarcador5;
    private Marker miMarcador6;
    private Marker miMarcador7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mimapa);
        //verifico servicios de google play (disponible y actualizado)
        int estado = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if(estado == ConnectionResult.SUCCESS){
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            //mensaje
            Dialog mensaje = GooglePlayServicesUtil.getErrorDialog(estado,(Activity)getApplicationContext(),10);
            mensaje.show();
        }
        Grupo = getIntent().getStringExtra("grupo");
        Objeto = getIntent().getStringExtra("objeto");
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // tipo de mapa:
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        //habilitar mapas ya q estan desabilidatas
        UiSettings configuro = mMap.getUiSettings();
        configuro.setZoomControlsEnabled(true);

        //mis lugares
        Miglobal.infoActual(Grupo);
        LatLng lugar1 = new LatLng(Miglobal.mar1Lat, Miglobal.mar1Lon);
        LatLng lugar2 = new LatLng(Miglobal.mar2Lat, Miglobal.mar2Lon);
        LatLng lugar3 = new LatLng(Miglobal.mar3Lat, Miglobal.mar3Lon);
        LatLng lugar4 = new LatLng(Miglobal.mar4Lat, Miglobal.mar4Lon);
        LatLng lugar5 = new LatLng(Miglobal.mar5Lat, Miglobal.mar5Lon);
        LatLng lugar6 = new LatLng(Miglobal.mar6Lat, Miglobal.mar6Lon);
        LatLng lugar7 = new LatLng(Miglobal.mar7Lat, Miglobal.mar7Lon);

        miMarcador1 = googleMap.addMarker(new MarkerOptions()
                .position(lugar1)
                .title(Miglobal.mar1Tit)
                .snippet(Miglobal.mar1Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar1Img))
        );
        miMarcador2 = googleMap.addMarker(new MarkerOptions()
                .position(lugar2)
                .title(Miglobal.mar2Tit)
                .snippet(Miglobal.mar2Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar2Img))
        );
        miMarcador3 = googleMap.addMarker(new MarkerOptions()
                .position(lugar3)
                .title(Miglobal.mar3Tit)
                .snippet(Miglobal.mar3Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar3Img))
        );
        miMarcador4 = googleMap.addMarker(new MarkerOptions()
                .position(lugar4)
                .title(Miglobal.mar4Tit)
                .snippet(Miglobal.mar4Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar4Img))
        );
        miMarcador5 = googleMap.addMarker(new MarkerOptions()
                .position(lugar5)
                .title(Miglobal.mar5Tit)
                .snippet(Miglobal.mar5Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar5Img))
        );
        miMarcador6 = googleMap.addMarker(new MarkerOptions()
                .position(lugar6)
                .title(Miglobal.mar6Tit)
                .snippet(Miglobal.mar6Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar6Img))
        );
        miMarcador7 = googleMap.addMarker(new MarkerOptions()
                .position(lugar7)
                .title(Miglobal.mar7Tit)
                .snippet(Miglobal.mar7Des)
                .icon(BitmapDescriptorFactory.fromResource(Miglobal.mar7Img))
        );



        //le doy zoom
        float miZoom = 10;
        switch (Objeto){
            case "1":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar1,miZoom));
                break;
            case "2":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar2,miZoom));
                break;
            case "3":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar3,miZoom));
                break;
            case "4":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar4,miZoom));
                break;
            case "5":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar5,miZoom));
                break;
            case "6":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar6,miZoom));
                break;
            case "7":
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar7,miZoom));
                break;
        }

        //variable google map escucha eventos del marcador
        googleMap.setOnMarkerClickListener(this);
        //para usar la funcion onMarkerClick
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
            String nom,lat,lng;
            nom = marker.getTitle();
            lat = Double.toString(marker.getPosition().latitude);
            lng = Double.toString(marker.getPosition().longitude);
            Toast.makeText(this,nom + "\n lat: " + lat + "\n lon: " + lng,Toast.LENGTH_LONG).show();
        return false;
    }

    public void hibrido(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }

    public void satelital(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }

    public void terreno(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }

    public void normal(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }

    public void regresar(View view) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        finish();
    }
}