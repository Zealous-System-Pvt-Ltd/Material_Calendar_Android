// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zealous.materialcalendarview.MaterialCalendarView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BasicActivity_ViewBinding implements Unbinder {
  private BasicActivity target;

  @UiThread
  public BasicActivity_ViewBinding(BasicActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BasicActivity_ViewBinding(BasicActivity target, View source) {
    this.target = target;

    target.widget = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'widget'", MaterialCalendarView.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BasicActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.widget = null;
    target.textView = null;
  }
}
