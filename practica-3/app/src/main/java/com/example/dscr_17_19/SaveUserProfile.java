package com.example.dscr_17_19;
import android.view.View;
import android.widget.EditText;

public class SaveUserProfile implements View.OnClickListener {

    private EditText name;

    public SaveUserProfile(EditText name) {
        this.name = name;
    }

    @Override
    public void onClick(View view){
        String name = this.name.getText().toString();

        // ToDo: grabar name en configuración
    }
}

// Pendiente revisar significado de "name" y completar

