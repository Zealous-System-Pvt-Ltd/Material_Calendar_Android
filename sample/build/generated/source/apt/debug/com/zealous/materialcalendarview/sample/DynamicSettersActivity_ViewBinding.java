// Generated code from Butter Knife. Do not modify!
package com.zealous.materialcalendarview.sample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CompoundButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zealous.materialcalendarview.MaterialCalendarView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DynamicSettersActivity_ViewBinding implements Unbinder {
  private DynamicSettersActivity target;

  private View view2131230788;

  private View view2131230770;

  private View view2131230769;

  private View view2131230755;

  private View view2131230756;

  private View view2131230753;

  private View view2131230751;

  private View view2131230750;

  private View view2131230757;

  private View view2131230764;

  private View view2131230759;

  private View view2131230761;

  private View view2131230762;

  private View view2131230749;

  private View view2131230758;

  private View view2131230748;

  private View view2131230760;

  private View view2131230765;

  private View view2131230752;

  @UiThread
  public DynamicSettersActivity_ViewBinding(DynamicSettersActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DynamicSettersActivity_ViewBinding(final DynamicSettersActivity target, View source) {
    this.target = target;

    View view;
    target.widget = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'widget'", MaterialCalendarView.class);
    view = Utils.findRequiredView(source, R.id.enable_save_current_position, "method 'onSaveCurrentPositionChecked'");
    view2131230788 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onSaveCurrentPositionChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.check_text_appearance, "method 'onTextAppearanceChecked'");
    view2131230770 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onTextAppearanceChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.check_page_enabled, "method 'onPageEnabledChecked'");
    view2131230769 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onPageEnabledChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.button_other_dates, "method 'onOtherDatesClicked'");
    view2131230755 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOtherDatesClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_previous, "method 'onPreviousClicked'");
    view2131230756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPreviousClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_next, "method 'onNextClicked'");
    view2131230753 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNextClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_min_date, "method 'onMinClicked'");
    view2131230751 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMinClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_max_date, "method 'onMaxClicked'");
    view2131230750 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMaxClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_selected_date, "method 'onSelectedClicked'");
    view2131230757 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSelectedClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_toggle_topbar, "method 'onToggleTopBarClicked'");
    view2131230764 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onToggleTopBarClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_set_colors, "method 'onColorsClicked'");
    view2131230759 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onColorsClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_set_tile_size, "method 'onTileSizeClicked'");
    view2131230761 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTileSizeClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_set_width_height, "method 'onTileWidthHeightClicked'");
    view2131230762 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTileWidthHeightClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_clear_selection, "method 'onClearSelection'");
    view2131230749 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClearSelection();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_selection_mode, "method 'onChangeSelectionMode'");
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onChangeSelectionMode();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_change_orientation, "method 'onButtonChangeOrientation'");
    view2131230748 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonChangeOrientation();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_set_first_day, "method 'onFirstDayOfWeekClicked'");
    view2131230760 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFirstDayOfWeekClicked();
      }
    });
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
    DynamicSettersActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.widget = null;

    ((CompoundButton) view2131230788).setOnCheckedChangeListener(null);
    view2131230788 = null;
    ((CompoundButton) view2131230770).setOnCheckedChangeListener(null);
    view2131230770 = null;
    ((CompoundButton) view2131230769).setOnCheckedChangeListener(null);
    view2131230769 = null;
    view2131230755.setOnClickListener(null);
    view2131230755 = null;
    view2131230756.setOnClickListener(null);
    view2131230756 = null;
    view2131230753.setOnClickListener(null);
    view2131230753 = null;
    view2131230751.setOnClickListener(null);
    view2131230751 = null;
    view2131230750.setOnClickListener(null);
    view2131230750 = null;
    view2131230757.setOnClickListener(null);
    view2131230757 = null;
    view2131230764.setOnClickListener(null);
    view2131230764 = null;
    view2131230759.setOnClickListener(null);
    view2131230759 = null;
    view2131230761.setOnClickListener(null);
    view2131230761 = null;
    view2131230762.setOnClickListener(null);
    view2131230762 = null;
    view2131230749.setOnClickListener(null);
    view2131230749 = null;
    view2131230758.setOnClickListener(null);
    view2131230758 = null;
    view2131230748.setOnClickListener(null);
    view2131230748 = null;
    view2131230760.setOnClickListener(null);
    view2131230760 = null;
    view2131230765.setOnClickListener(null);
    view2131230765 = null;
    view2131230752.setOnClickListener(null);
    view2131230752 = null;
  }
}
