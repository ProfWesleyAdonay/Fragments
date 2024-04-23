package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.FragmentTransitionSupport;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragments.ContatosFragment;
import com.example.fragments.fragments.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragments;
    private ContatosFragment contatosFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        conversasFragments = new ConversasFragment();

        //configurar o objeto para o Fragmento
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.replace(R.id.frameConteudo, conversasFragments);
        transition.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatosFragments = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,contatosFragments );
                transaction.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,conversasFragments);
                transaction.commit();
            }
        });

    }
}