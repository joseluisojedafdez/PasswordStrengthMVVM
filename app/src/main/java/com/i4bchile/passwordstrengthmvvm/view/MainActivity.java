package com.i4bchile.passwordstrengthmvvm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.i4bchile.passwordstrengthmvvm.R;

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
[] 8. Agregar como atributo el modelo. Se puede usar Dagger o instanciar el modelo en la clase (no
      es relevante para este desafío)
[] 9. Agregar el método evaluatePass que reciba la contraseña y retorne el resultado de la evaluación
      como entero
[] 10. Agregar 3 atributos
        a. Para contener el texto de la contraseña.
        b. Para la fortaleza de la contraseña escrita en texto usando LiveData
        c. Para la fortaleza de la contraseña en color usando LiveData

MainActivity

[] 11. Instanciar el objeto binding usando DataBindingUtil.
[] 12. Obtener el ViewModel desde ViewModelProviders y asociar el viewModel al objeto binding.
[] 13. Indicar la actividad como propietario del ciclo de vida usando setLifecycleOwner
       DataBinding
[] 14. En el main_layout.xml, agregar el root layout y declarar la variable para el viewModel.
[] 15. Usar Two-Way DataBinding para el texto del editText.
[] 16. DataBinding para el texto y el color del textView que entrega el resultado.

 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}