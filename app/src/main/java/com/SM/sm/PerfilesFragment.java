package com.SM.sm;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.SM.sm.ui.gallery.GalleryViewModel;

public class PerfilesFragment extends Fragment {

    private PerfilesViewModel perfilesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        perfilesViewModel =
                ViewModelProviders.of(this).get(PerfilesViewModel.class);
        View root = inflater.inflate(R.layout.perfiles_fragment, container, false);

        return root;
    }


}
