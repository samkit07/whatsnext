// Generated by view binder compiler. Do not edit!
package com.example.what_next.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.what_next.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Fragment22Binding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ExpandableListView expandlist22;

  private Fragment22Binding(@NonNull FrameLayout rootView,
      @NonNull ExpandableListView expandlist22) {
    this.rootView = rootView;
    this.expandlist22 = expandlist22;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment22Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment22Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment2_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment22Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expandlist2_2;
      ExpandableListView expandlist22 = rootView.findViewById(id);
      if (expandlist22 == null) {
        break missingId;
      }

      return new Fragment22Binding((FrameLayout) rootView, expandlist22);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}