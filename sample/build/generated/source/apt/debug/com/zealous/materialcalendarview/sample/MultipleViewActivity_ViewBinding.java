// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MultipleViewActivity_ViewBinding implements Unbinder {
  private MultipleViewActivity target;

  @UiThread
  public MultipleViewActivity_ViewBinding(MultipleViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MultipleViewActivity_ViewBinding(MultipleViewActivity target, View source) {
    this.target = target;

    target.calendarList = Utils.findRequiredViewAsType(source, R.id.calendar_list, "field 'calendarList'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MultipleViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.calendarList = null;
  }
}
