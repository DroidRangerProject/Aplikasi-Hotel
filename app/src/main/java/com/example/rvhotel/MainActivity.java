package com.example.rvhotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoHotels = new ArrayList<>();
    private ArrayList<String> namaHotels = new ArrayList<>();
    private ArrayList<String> alamatHotels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rvHotels);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoHotels,namaHotels, alamatHotels, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData(){
        namaHotels.add("Hotel Harper Purwakarta");
        alamatHotels.add("Jl.Raya Bungursari No.122, Bungursari, Kabupaten Purwakarta, Jawa Barat 41181");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_harper.jpeg");

        namaHotels.add("Prime Plaza Hotel Purwakarta");
        alamatHotels.add("Kawasan Industri Kota Bukit Indah Blok L, Cinangka, Bungursari, Cinangka, Bungursari, Kabupaten Purwakarta, Jawa Barat 41181");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/2.jpg");

        namaHotels.add("Hotel Khalista");
        alamatHotels.add("Jl. Veteran No.1, Mulyamekar, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41115");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_khalista.jpg");

        namaHotels.add("Hotel Permata Purwakarta");
        alamatHotels.add("Jalan Raya Sadang-Subang Km. 1, Bungur Sari, Ciwangi, Bungursari, Kabupaten Purwakarta, Jawa Barat 41181");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_permata.jpg");

        namaHotels.add("Intan Hotel");
        alamatHotels.add("Jl. Basuki Rahmat No.132, Sindangkasih, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41112");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/5.jpg");

        namaHotels.add("Grand Situ Buleud Hotel");
        alamatHotels.add("JL. Siliwangi No. 11, Nagri Tengah, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41114");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/6.jpg");

        namaHotels.add("Hotel Sederhana");
        alamatHotels.add("Jl. Singawinata, Gg Dahlia I, No. 15, Nagri Tengah, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41115");
        fotoHotels.add("http://dev.farizdotid.com/api/halopwk/gambar/hotel/Hotel%20Sederhana.jpg");

        namaHotels.add("Hotel La Derra");
        alamatHotels.add("Jalan A. Yani No.5, Sindangkasih, Purwakarta, Sindangkasih, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41113");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_la_dera.png");

        namaHotels.add("Hotel Abah");
        alamatHotels.add("Jl. Cibening Raya No. 201, RT. 13 / RW. 5, Cibening, Bungursari, Nagri Kaler, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41115");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/9.jpg");

        namaHotels.add("Hotel Grand Permata");
        alamatHotels.add("Jalan Raya Bungursari No.171, Cibening, Bungursari, Kabupaten Purwakarta, Jawa Barat 41181");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/10.jpg");

        namaHotels.add("Hotel Ciwangi");
        alamatHotels.add("Jl. Raya Ciwangi No.327, Ciwangi, Bungursari, Kabupaten Purwakarta, Jawa Barat 41181");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_ciwangi.png");

        namaHotels.add("Hotel Kusuma");
        alamatHotels.add("Jl. Prof. Mr. Dr. Kusumahatmaja No.1, Nagri Tengah, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41114");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_kusuma.jpg");

        namaHotels.add("Grand Ciwareng Inn Hotel and Resort");
        alamatHotels.add("Jl. Kopi No.5, Ciwareng, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41151");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_ciwareng_inn.jpg");

        namaHotels.add("Hotel Khalsa Indah");
        alamatHotels.add("Jalan Veteran, Gang Seroja No. 235A, Nagri Kaler, Kec. Purwakarta, Kabupaten Purwakarta, Jawa Barat 41115");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_khalsa.png");

        namaHotels.add("DCabin Hotel Container");
        alamatHotels.add("Jalan Rasamala, Jatiluhur, Jatiluhur, Purwakarta, Jawa Barat, Indonesia");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_dcabin.png");

        namaHotels.add("Hotel Cibatu");
        alamatHotels.add("Jl. Cibatu Raya No.36 KM.15, Purwakarta, Purwakarta, Indonesia");
        fotoHotels.add("https://dev.farizdotid.com/api/halopwk/gambar/hotel/hotel_cibatu.jpg");

        namaHotels.add("Hidden Valley Hills");
        alamatHotels.add("Cibodas, Sukatani, Purwakarta Regency, West Java 41167");
        fotoHotels.add("http://dev.farizdotid.com/api/halopwk/gambar/hotel/hidden_valley_hills-min.jpg");


        prosesRecyclerViewAdapter();


    }
}