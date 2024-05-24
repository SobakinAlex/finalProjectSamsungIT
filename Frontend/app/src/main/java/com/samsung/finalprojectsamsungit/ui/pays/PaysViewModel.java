package com.samsung.finalprojectsamsungit.ui.pays;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PaysViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PaysViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}