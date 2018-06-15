package com.example.chelix.bairesdevtext;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment implements View.OnClickListener {

    private Button btnToast;
    private Button btnAlert;

    public BlankFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_blank, container, false);

        btnToast = fragment.findViewById(R.id.btnToast);
        btnAlert = fragment.findViewById(R.id.btnAlert);
        btnToast.setOnClickListener(this);
        btnAlert.setOnClickListener(this);

        return fragment;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnToast:
                Toast.makeText(getContext(), "Showing toast!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAlert:
                AlertDialog alertDialog = new AlertDialog.Builder(getContext())
                        .setMessage("Alert Dialog")
                        .setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();
                alertDialog.show();
                break;
        }
    }
}
