package shipdoandem.amytateam.org.shipdoandem.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shipdoandem.amytateam.org.shipdoandem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HighlightsFragment extends Fragment {


    public HighlightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_highlights, container, false);
    }

}
