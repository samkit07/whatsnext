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

public final class Fragment3Binding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ExpandableListView expandlist3;

  private Fragment3Binding(@NonNull FrameLayout rootView, @NonNull ExpandableListView expandlist3) {
    this.rootView = rootView;
    this.expandlist3 = expandlist3;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expandlist3;
      ExpandableListView expandlist3 = rootView.findViewById(id);
      if (expandlist3 == null) {
        break missingId;
      }

      return new Fragment3Binding((FrameLayout) rootView, expandlist3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}