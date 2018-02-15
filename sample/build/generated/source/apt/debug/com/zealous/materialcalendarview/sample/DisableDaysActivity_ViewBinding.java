// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zealous.materialcalendarview.MaterialCalendarView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DisableDaysActivity_ViewBinding implements Unbinder {
  private DisableDaysActivity target;

  @UiThread
  public DisableDaysActivity_ViewBinding(DisableDaysActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DisableDaysActivity_ViewBinding(DisableDaysActivity target, View source) {
    this.target = target;

    target.widget = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'widget'", MaterialCalendarView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DisableDaysActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.widget = null;
  }
}
