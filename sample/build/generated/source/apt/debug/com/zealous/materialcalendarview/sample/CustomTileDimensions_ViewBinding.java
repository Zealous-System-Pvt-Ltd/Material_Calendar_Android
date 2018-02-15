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

public class CustomTileDimensions_ViewBinding implements Unbinder {
  private CustomTileDimensions target;

  private View view2131230779;

  private View view2131230780;

  private View view2131230777;

  private View view2131230781;

  private View view2131230778;

  @UiThread
  public CustomTileDimensions_ViewBinding(CustomTileDimensions target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CustomTileDimensions_ViewBinding(final CustomTileDimensions target, View source) {
    this.target = target;

    View view;
    target.widget = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'widget'", MaterialCalendarView.class);
    view = Utils.findRequiredView(source, R.id.custom_tile_match_parent, "method 'onMatchParentClick'");
    view2131230779 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMatchParentClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.custom_tile_width_match_parent, "method 'onWidthMatchParentClick'");
    view2131230780 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWidthMatchParentClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.custom_tile_height_match_parent, "method 'onHeightMatchParentClick'");
    view2131230777 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onHeightMatchParentClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.custom_tile_width_size, "method 'onWidthClick'");
    view2131230781 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWidthClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.custom_tile_height_size, "method 'onHeightClick'");
    view2131230778 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onHeightClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomTileDimensions target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.widget = null;

    view2131230779.setOnClickListener(null);
    view2131230779 = null;
    view2131230780.setOnClickListener(null);
    view2131230780 = null;
    view2131230777.setOnClickListener(null);
    view2131230777 = null;
    view2131230781.setOnClickListener(null);
    view2131230781 = null;
    view2131230778.setOnClickListener(null);
    view2131230778 = null;
  }
}
