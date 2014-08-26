//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.
//


package com.fei_ke.AndroidHook.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import com.fei_ke.AndroidHook.R.layout;
import com.fei_ke.AndroidHook.entity.HookEntity;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class EditFragment_
    extends EditFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;
    public final static String HOOK_ENTITY_ARG = "hookEntity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.fragment_edit, container, false);
        }
        return contentView_;
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectFragmentArguments_();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static EditFragment_.FragmentBuilder_ builder() {
        return new EditFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        editMethodName = ((EditText) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.editMethodName));
        editAliasName = ((EditText) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.editAliasName));
        editClassName = ((EditText) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.editClassName));
        spinnerReturnType = ((Spinner) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.spinnerReturnType));
        editPackageName = ((EditText) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.editPackageName));
        spinnerHookType = ((Spinner) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.spinnerHookType));
        editParaType = ((EditText) hasViews.findViewById(com.fei_ke.AndroidHook.R.id.editParaType));
        onPrivateAfterViews();
    }

    private void injectFragmentArguments_() {
        Bundle args_ = getArguments();
        if (args_!= null) {
            if (args_.containsKey(HOOK_ENTITY_ARG)) {
                hookEntity = ((HookEntity) args_.getSerializable(HOOK_ENTITY_ARG));
            }
        }
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public EditFragment build() {
            EditFragment_ fragment_ = new EditFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

        public EditFragment_.FragmentBuilder_ hookEntity(HookEntity hookEntity) {
            args_.putSerializable(HOOK_ENTITY_ARG, hookEntity);
            return this;
        }

    }

}
