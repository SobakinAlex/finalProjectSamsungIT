package com.samsung.finalprojectsamsungit.ui.accountSettings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.finalprojectsamsungit.databinding.FragmentAccountSettingsBinding;

public class AccountSettingsFragment extends Fragment {

    private FragmentAccountSettingsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AccountSettingsViewModel slideshowViewModel =
                new ViewModelProvider(this).get(AccountSettingsViewModel.class);

        binding = FragmentAccountSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAccountSettings;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}