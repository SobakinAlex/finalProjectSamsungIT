package com.samsung.finalprojectsamsungit.ui.map;


import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;
import com.samsung.finalprojectsamsungit.R;
import com.samsung.finalprojectsamsungit.databinding.FragmentMapBinding;
import com.samsung.finalprojectsamsungit.ui.order.OrderFragment;;

public class MapFragment extends Fragment{
    private Button button;
    private MaterialButton btn;
    private int[] colors = {Color.WHITE, Color.YELLOW};
    private FragmentMapBinding binding;
    private int k = 0;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MapViewModel mapViewModel =
                new ViewModelProvider(this).get(MapViewModel.class);

        binding = FragmentMapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.btnReady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        binding.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderFragment orderFrag = new OrderFragment();

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                ft.add(R.id.cl_map, orderFrag).addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
