package com.samsung.finalprojectsamsungit.ui.address;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.samsung.finalprojectsamsungit.databinding.FragmentAddressBinding;

public class AddressFragment extends Fragment {
    private FragmentAddressBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddressViewModel addressViewModel =
                new ViewModelProvider(this).get(AddressViewModel.class);

        binding = FragmentAddressBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
