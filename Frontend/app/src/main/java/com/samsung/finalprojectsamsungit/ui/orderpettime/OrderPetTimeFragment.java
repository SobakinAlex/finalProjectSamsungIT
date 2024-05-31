package com.samsung.finalprojectsamsungit.ui.orderpettime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.finalprojectsamsungit.R;
import com.samsung.finalprojectsamsungit.databinding.FragmentOrderpettimeBinding;
import com.samsung.finalprojectsamsungit.ui.map.MapFragment;
import com.samsung.finalprojectsamsungit.ui.order.OrderFragment;

import java.util.Map;

public class OrderPetTimeFragment extends Fragment {
    private FragmentOrderpettimeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OrderPetTimeViewModel orderPetTimeViewModel =
                new ViewModelProvider(this).get(OrderPetTimeViewModel.class);

        binding = FragmentOrderpettimeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.prevOrderpettime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderFragment orderFragment = new OrderFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.cl_orderpettime, orderFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.nextOrderpettime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapFragment mapFragment = new MapFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.cl_orderpettime, mapFragment);
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
