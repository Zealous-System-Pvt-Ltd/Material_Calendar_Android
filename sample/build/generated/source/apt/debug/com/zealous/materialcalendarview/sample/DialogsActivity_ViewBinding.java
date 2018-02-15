// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DialogsActivity_ViewBinding implements Unbinder {
  private DialogsActivity target;

  private View view2131230754;

  private View view2131230763;

  @UiThread
  public DialogsActivity_ViewBinding(DialogsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DialogsActivity_ViewBinding(final DialogsActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.button_normal_dialog, "method 'onNormalDialogClick'");
    view2131230754 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNormalDialogClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_simple_dialog, "method 'onSimpleCalendarDialogClick'");
    view2131230763 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSimpleCalendarDialogClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230754.setOnClickListener(null);
    view2131230754 = null;
    view2131230763.setOnClickListener(null);
    view2131230763 = null;
  }
}
