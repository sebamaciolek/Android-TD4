package com.sebamaciolek.td4;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;

/**
 * Created by seba9 on 26/09/2016.
 */

public class TextFragment extends Fragment {
    public interface OnActionListener {
        public void onAction(ContactsContract.Contacts.Data d);
    }

    OnActionListener mListener;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnActionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnActionListener");
        }
    }
}
