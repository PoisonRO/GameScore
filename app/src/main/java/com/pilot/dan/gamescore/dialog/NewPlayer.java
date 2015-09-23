package com.pilot.dan.gamescore.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.pilot.dan.gamescore.R;

/**
 * Created by dan on 9/23/15.
 */
public class NewPlayer extends DialogFragment {

    private EditText            playerName;
    private Button              addPlayer;
    private Button              done;
    private ImageButton         addPicture;
    private Dialog              newPlayerDialog;

    public NewPlayer() {

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View view;

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        view = inflater.inflate(R.layout.dialog_add_new_player,null);

        //set controls
        playerName = (EditText)view.findViewById(R.id.editName);
        addPlayer = (Button)view.findViewById(R.id.button_ok);
        done = (Button)view.findViewById(R.id.button_done);
        addPicture = (ImageButton)view.findViewById(R.id.imageButton_Picture);

        dialog.setView(view);

        // set callbacks

        addPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPlayerDialog.dismiss();
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPlayerDialog.dismiss();
            }
        });

        addPicture.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        newPlayerDialog = dialog.create();

        return newPlayerDialog;
    }

}
