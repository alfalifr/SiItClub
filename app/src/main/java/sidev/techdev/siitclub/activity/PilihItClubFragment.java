package sidev.techdev.siitclub.activity;

import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import sidev.techdev.siitclub.R;
import sidev.techdev.siitclub.adapter.PilihItClubAdapter;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PilihItClubFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PilihItClubFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    /*private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PilihItClubFragment() {
        // Required empty public constructor
    }

    *//*
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PilihItClubFragment.
     *//*
    // TODO: Rename and change types and number of parameters
    public static PilihItClubFragment newInstance(String param1, String param2) {
        PilihItClubFragment fragment = new PilihItClubFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/

    GridView gridView;
    int[] namaClub = {R.string.nama_club_isad, R.string.nama_club_isgc, R.string.nama_club_isgd, R.string.nama_club_iswd};
    int[][] judulMateri = {
            {R.string.materi_judul_isad_1, R.string.materi_judul_isad_2, R.string.materi_judul_isad_3, R.string.materi_judul_isad_4, R.string.materi_judul_isad_5},
            {R.string.materi_judul_isgc_1, R.string.materi_judul_isgc_2, R.string.materi_judul_isgc_3, R.string.materi_judul_isgc_4},
            {R.string.materi_judul_isgd_1, R.string.materi_judul_isgd_2, R.string.materi_judul_isgd_3},
            {R.string.materi_judul_iswd_1, R.string.materi_judul_iswd_2}
    };
    int[] logo = {R.drawable.logo_isad, R.drawable.logo_isgc, R.drawable.logo_isgd, R.drawable.logo_iswd};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pilih_it_club, container, false);

        gridView = v.findViewById(R.id.gridview);
        PilihItClubAdapter adp = new PilihItClubAdapter(getContext(), namaClub, judulMateri, logo, null);
        gridView.setAdapter(adp);

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    /*public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    *//**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     *//*
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/
}
