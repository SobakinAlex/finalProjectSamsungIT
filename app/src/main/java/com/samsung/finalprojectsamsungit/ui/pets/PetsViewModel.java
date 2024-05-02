package com.samsung.finalprojectsamsungit.ui.pets;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PetsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PetsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}