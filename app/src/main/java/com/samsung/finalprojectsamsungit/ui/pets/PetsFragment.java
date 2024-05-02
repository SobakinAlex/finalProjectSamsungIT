package com.samsung.finalprojectsamsungit.ui.pets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.finalprojectsamsungit.databinding.FragmentPetsBinding;

public class PetsFragment extends Fragment {

    private FragmentPetsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PetsViewModel homeViewModel =
                new ViewModelProvider(this).get(PetsViewModel.class);

        binding = FragmentPetsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPets;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}