package com.samsung.finalprojectsamsungit.ui.order;

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
import com.samsung.finalprojectsamsungit.databinding.FragmentOrderBinding;
import com.samsung.finalprojectsamsungit.ui.map.MapFragment;
import com.samsung.finalprojectsamsungit.ui.orderpettime.OrderPetTimeFragment;
import com.samsung.finalprojectsamsungit.ui.orderpettime.OrderPetTimeViewModel;

public class OrderFragment extends Fragment {
    private FragmentOrderBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OrderViewModel orderViewModel =
                new ViewModelProvider(this).get(OrderViewModel.class);

        binding = FragmentOrderBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.prevOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapFragment mapFrag = new MapFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.cl_order, mapFrag);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.nextOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderPetTimeFragment orderPetTimeFragment = new OrderPetTimeFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.cl_order, orderPetTimeFragment);
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
