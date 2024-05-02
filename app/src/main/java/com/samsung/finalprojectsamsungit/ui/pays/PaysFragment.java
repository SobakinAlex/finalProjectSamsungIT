package com.samsung.finalprojectsamsungit.ui.pays;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.finalprojectsamsungit.databinding.FragmentPaysBinding;

public class PaysFragment extends Fragment {

    private FragmentPaysBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PaysViewModel paysViewModel =
                new ViewModelProvider(this).get(PaysViewModel.class);

        binding = FragmentPaysBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPays;
        paysViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}