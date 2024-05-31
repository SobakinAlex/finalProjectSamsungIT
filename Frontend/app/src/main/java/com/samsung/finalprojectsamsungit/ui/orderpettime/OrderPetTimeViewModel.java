package com.samsung.finalprojectsamsungit.ui.orderpettime;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrderPetTimeViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public OrderPetTimeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
