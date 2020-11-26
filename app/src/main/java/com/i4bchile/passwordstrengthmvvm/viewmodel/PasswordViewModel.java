package com.i4bchile.passwordstrengthmvvm.viewmodel;

import android.graphics.Color;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.i4bchile.passwordstrengthmvvm.model.Verifier;

public class PasswordViewModel extends ViewModel {

    private Verifier verifier=Verifier.getInstance();
    //private String password;
    private MutableLiveData<String> texStrength;
    private MutableLiveData<Integer> colorStrength;

    public PasswordViewModel() {
          this.texStrength=new MutableLiveData<>();
          this.colorStrength= new MutableLiveData<>();

    }

    public void evaluatePassword (String password){

        int evaluacion=verifier.verifyPassword(password);

        switch (evaluacion) {

            case 0:
                texStrength.setValue("WEAK");
                colorStrength.setValue(Color.RED);
                break;
            case 1:
                texStrength.setValue("MEDIUM");
                colorStrength.setValue(Color.YELLOW);
                break;
            case 2:
                texStrength.setValue("STRONG");
                colorStrength.setValue(Color.GREEN);
                break;
            case 3:
                texStrength.setValue("VERY STRONG");
                colorStrength.setValue(Color.GREEN);
                break;


        }


    }

    public LiveData<Integer> getColorStrength() {
        return colorStrength;
    }
    public LiveData<String> getTexStrength(){
        return texStrength;
    }




}
