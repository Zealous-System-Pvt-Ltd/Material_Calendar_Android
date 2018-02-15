// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zealous.materialcalendarview.MaterialCalendarView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SwappableBasicActivityDecorated_ViewBinding implements Unbinder {
  private SwappableBasicActivityDecorated target;

  private View view2131230765;

  private View view2131230752;

  @UiThread
  public SwappableBasicActivityDecorated_ViewBinding(SwappableBasicActivityDecorated target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SwappableBasicActivityDecorated_ViewBinding(final SwappableBasicActivityDecorated target,
      View source) {
    this.target = target;

    View view;
    target.widget = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'widget'", MaterialCalendarView.class);
    view = Utils.findRequiredView(source, R.id.button_weeks, "method 'onSetWeekMode'");
    view2131230765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSetWeekMode();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_months, "method 'onSetMonthMode'");
    view2131230752 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSetMonthMode();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SwappableBasicActivityDecorated target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.widget = null;

    view2131230765.setOnClickListener(null);
    view2131230765 = null;
    view2131230752.setOnClickListener(null);
    view2131230752 = null;
  }
}
