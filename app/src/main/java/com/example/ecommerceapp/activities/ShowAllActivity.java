package com.example.ecommerceapp.activities;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.adapters.ShowAllAdapter;
import com.example.ecommerceapp.models.ShowAllModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.ktx.Firebase;

import java.util.ArrayList;
import java.util.List;

public class ShowAllActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ShowAllAdapter showAllAdapter;
    List<ShowAllModel> showAllModelList;

    Toolbar toolbar;

    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        toolbar=findViewById(R.id.show_all_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        String type=getIntent().getStringExtra("type");

        firestore=FirebaseFirestore.getInstance();
        recyclerView=findViewById(R.id.show_all_rec);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        showAllModelList=new ArrayList<>();
        showAllAdapter=new ShowAllAdapter(this,showAllModelList);
        recyclerView.setAdapter(showAllAdapter);


        if(type == null || type.isEmpty()){
            firestore.collection("ShowAll")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });
        }

        if (type !=null && type.equalsIgnoreCase("men")){
            firestore.collection("ShowAll").whereEqualTo("type","men")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }
        if (type !=null && type.equalsIgnoreCase("woman")){
            firestore.collection("ShowAll").whereEqualTo("type","woman")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }
        if (type !=null && type.equalsIgnoreCase("shoes")){
            firestore.collection("ShowAll").whereEqualTo("type","shoes")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }
        if (type !=null && type.equalsIgnoreCase("kids")){
            firestore.collection("ShowAll").whereEqualTo("type","kids")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }
        if (type !=null && type.equalsIgnoreCase("watch")){
            firestore.collection("ShowAll").whereEqualTo("type","watch")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }
        if (type !=null && type.equalsIgnoreCase("camera")){
            firestore.collection("ShowAll").whereEqualTo("type","camera")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if (task.isSuccessful()){
                                for (DocumentSnapshot doc :task.getResult().getDocuments()){
                                    ShowAllModel showAllModel =doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    });

        }

}
}