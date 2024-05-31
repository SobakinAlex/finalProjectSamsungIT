package com.samsung.finalprojectsamsungit.ui.map;


import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;
import com.samsung.finalprojectsamsungit.R;
import com.samsung.finalprojectsamsungit.databinding.FragmentMapBinding;
import com.samsung.finalprojectsamsungit.ui.order.OrderFragment;;

public class MapFragment extends Fragment{
    private Button button;
    private MaterialButton btn;
    private FragmentMapBinding binding;

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
        FragmentManager fragmentManager = getParentFragmentManager();


        binding.btnReady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        binding.btnCall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                OrderFragment orderFrag = new OrderFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.cl_map, orderFrag);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
