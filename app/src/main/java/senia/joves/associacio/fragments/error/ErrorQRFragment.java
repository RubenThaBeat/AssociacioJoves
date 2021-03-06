package senia.joves.associacio.fragments.error;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import senia.joves.associacio.R;
import senia.joves.associacio.fragments.EscanearFragment;

/**
 * Created by Usuario on 22/05/2017.
 */

public class ErrorQRFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_errorqr, container, false);

        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn = (Button) view.findViewById(R.id.btnReintentar);

        //reintentamos el escanner de qr
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //vamos al fragment del lector qr camara
                getFragmentManager().beginTransaction()
                        .replace(R.id.contenido, new EscanearFragment()).commit();

            }
        });
    }
}
