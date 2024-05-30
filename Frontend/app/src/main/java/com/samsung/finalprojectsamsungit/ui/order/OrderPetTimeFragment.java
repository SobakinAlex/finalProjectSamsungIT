package com.samsung.finalprojectsamsungit.ui.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.finalprojectsamsungit.databinding.FragmentHelpBinding;
import com.samsung.finalprojectsamsungit.databinding.FragmentOrderBinding;
import com.samsung.finalprojectsamsungit.databinding.FragmentOrderpettimeBinding;

public class OrderpettimeimeFragment extends Fragment {
    private FragmentOrderpettimeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OrderViewModel OrderViewModel =
                new ViewModelProvider(this).get(OrderViewModel.class);

        binding = FragmentOrderpettimeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
