package com.coolor.view_binding_demo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.fragment.app.Fragment;

import com.coolor.view_binding_demo.databinding.FragmentViewBindingDemoBinding;

public class ViewBindingDemoFragment extends Fragment {
    private static ViewBindingDemoFragment instance;
    private FragmentViewBindingDemoBinding binding;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentViewBindingDemoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.tvRoot.setText("ViewBinding Usage in Fragment");
        binding.tvRoot.setOnClickListener(v -> Toast.makeText(requireContext(), "ViewBinding Usage in Fragment", Toast.LENGTH_LONG).show());
    }

    @UiThread
    static ViewBindingDemoFragment getInstance() {
        if (instance == null) {
            instance = new ViewBindingDemoFragment();
        }
        return instance;
    }
}
