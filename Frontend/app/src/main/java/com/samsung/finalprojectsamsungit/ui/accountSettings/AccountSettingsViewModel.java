package com.samsung.finalprojectsamsungit.ui.accountSettings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountSettingsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AccountSettingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}