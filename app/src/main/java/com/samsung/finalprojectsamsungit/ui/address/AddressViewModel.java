package com.samsung.finalprojectsamsungit.ui.address;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddressViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddressViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
