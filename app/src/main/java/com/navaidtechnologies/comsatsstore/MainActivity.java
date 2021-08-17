package com.navaidtechnologies.comsatsstore;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    RecyclerView recview;
    myadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview = (RecyclerView) findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));


        String sub = getIntent().getStringExtra("sub");
        Toast.makeText(getApplicationContext(), "Loading files, please wait", Toast.LENGTH_SHORT).show();


        //first semester
        switch (sub) {
            case "pf": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/1st/pf"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "caag": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/caag"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "ecac": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/ecac"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "ict": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/itc"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "is": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/is"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
                //second semester
            case "2bi": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/2nd/bi"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "2dis": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/2nd/dis"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "2oop": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/2nd/oop"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "2rws": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/rws"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "2mvc": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/mvc"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "2apfe": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/apfe"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }


            //third semester

            case "3ppit": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/3rd/ppit"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "3dsa": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/3rd/dsa"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "3dld": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/3rd/dld"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "3la": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/3rd/la"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "3spt": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/3rd/spt"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            //forth semester

            case "4cskils": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/cskils"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "4ca": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/ca"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "4dbs": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/dbs1"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "4de": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/de"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "4sec": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/sec"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }


            case "4vp": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/vp"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }


            //fifth semester


            case "5DAAA": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/5th/daa"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "5TOA": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/5th/aut"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "5OS": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/5th/os"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "5DCNN": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/5th/ccn"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }




            //Sixth Semester

            case "6MAL": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/6th/mal"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "6WT": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/6th/wt"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "6HCI": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/6th/hci"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "6AI": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/6th/ai"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }



            //Seventh Semester

            case "7MAD": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/7th/mad"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }



            case "7CC": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/7th/cc"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "dip": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/8th/dip"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "emao": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/8th/emao"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "fom": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/8th/fom"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "spm": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/8th/smp"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }


            //Business Administration
                //first semester

            case "B1ME": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/1st/me"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "B1ITB": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/1st/me"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "B1BM": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/1st/maths"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            // business administration
                //second semester

            case "B2MAE": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/2nd/mae"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "B2A2": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/2nd/A2"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "B2ITM": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/2nd/itm"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "B2BM2": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/bba/2nd/m2"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "CEDLD": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/ce/2nd/dld"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "PS": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/ps"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "CEDM": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/ce/2nd/dsc"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "CELA": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/ce/2nd/la"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }




            //Electrical Engineering
                //2nd semester

            case "ICP": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/ee/2nd/itcp"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "ECA": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/ee/2nd/eca"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "ODE": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/ee/2nd/ode"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }



            //graduate program
            //MCS

            case "M1ITC": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/mcs/1st/itc"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "M1DSC": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/2nd/dis"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M1ICP": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/mcs/1st/itp"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "M1DBS": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/dbs1"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            //mcs 2nd semester
            case "M2DS": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/3rd/dsa"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M2COAL": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/graduate/coal"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }
            case "M2AT": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/graduate/automata"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M2OOP": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/2nd/oop"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M2RWS": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/rws"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            //mcs 3rd semester

            case "M3OSC": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/mcs/3rd/osc"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M3SEII": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/mcs/3rd/se"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M3VP": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/combine/vp"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }

            case "M3CA": {
                FirebaseRecyclerOptions<model> options =
                        new FirebaseRecyclerOptions.Builder<model>()
                                .setQuery(FirebaseDatabase.getInstance().getReference().child("database/computer science/4th/ca"), model.class)
                                .build();

                adapter = new myadapter(options);
                recview.setAdapter(adapter);
                break;
            }


        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}