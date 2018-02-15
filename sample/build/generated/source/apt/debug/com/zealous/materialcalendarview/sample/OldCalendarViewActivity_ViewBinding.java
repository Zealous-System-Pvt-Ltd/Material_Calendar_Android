// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OldCalendarViewActivity_ViewBinding implements Unbinder {
  private OldCalendarViewActivity target;

  @UiThread
  public OldCalendarViewActivity_ViewBinding(OldCalendarViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OldCalendarViewActivity_ViewBinding(OldCalendarViewActivity target, View source) {
    this.target = target;

    target.widget = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'widget'", CalendarView.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OldCalendarViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.widget = null;
    target.textView = null;
  }
}
