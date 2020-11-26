package com.i4bchile.passwordstrengthmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.i4bchile.passwordstrengthmvvm.R;
import com.i4bchile.passwordstrengthmvvm.databinding.ActivityMainBinding;
import com.i4bchile.passwordstrengthmvvm.viewmodel.PasswordViewModel;

public class MainActivity extends AppCompatActivity {
/* TODO:
Vistas
[x] 1. Crear el proyecto usando el template de Empty Activity
[x] 2. Agregar las vistas para ingresar la contraseña y para desplegar el resultado de la evaluación en
      el layout main_layout.xml.
[x] 3. Definir los textos ocupados en el archivo strings.xml

Modelo
[X] 4. Crear la clase Verifier que tenga un método público para evaluar la contraseña que retorne un
        entero indicando que tan robusta es la contraseña.
[X] 5. Implementar cada regla en un método separado. Una de las formas es que cada regla retorne
        un booleano indicando si la regla se cumple.
[X] 6. Agregar test unitarios al modelo es opcional pero altamente recomendado.

ViewModel

[x] 7. Crear una clase que extienda de AndroidViewModel para tener acceso a los recursos definidos
      en strings.xml
[x] 8. Agregar como atributo el modelo. Se puede usar Dagger o instanciar el modelo en la clase (no
      es relevante para este desafío)
[x] 9. Agregar el método evaluatePass que reciba la contraseña y establezca dada categoria de contraseña
[x] 10. Agregar 3 atributos
        a. Para contener el texto de la contraseña.
        b. Para la fortaleza de la contraseña escrita en texto usando LiveData
        c. Para la fortaleza de la contraseña en color usando LiveData

MainActivity

[x] 11. Instanciar el objeto binding usando DataBindingUtil.
[x] 12. Obtener el ViewModel desde ViewModelProviders y asociar el viewModel al objeto binding.
[x] 13. Indicar la actividad como propietario del ciclo de vida usando setLifecycleOwner
       DataBinding
[x] 14. En el main_layout.xml, agregar el root layout y declarar la variable para el viewModel.
[x] 15. Usar Two-Way DataBinding para el texto del editText.
[x] 16. DataBinding para el texto y el color del textView que entrega el resultado.

 */

    private ActivityMainBinding binding;
    private PasswordViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        model=new ViewModelProvider(this).get(PasswordViewModel.class);
        binding.setLifecycleOwner(this);

        binding.setPassViewModel(model);

        binding.etPassword.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence pPwd, int start, int before, int count) {
                   model.evaluatePassword(pPwd.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}