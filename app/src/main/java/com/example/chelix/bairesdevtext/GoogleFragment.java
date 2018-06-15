package com.example.chelix.bairesdevtext;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GoogleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GoogleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GoogleFragment extends Fragment {

    private WebView wvGoogle;

    public GoogleFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static GoogleFragment newInstance() {
        GoogleFragment fragment = new GoogleFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View wvGoogleFragment = inflater.inflate(R.layout.fragment_google, container, false);
        wvGoogle = wvGoogleFragment.findViewById(R.id.googleWebView);
        wvGoogle.setWebViewClient(new WebViewClient());
        wvGoogle.loadUrl("http://www.google.com");
        return wvGoogleFragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
