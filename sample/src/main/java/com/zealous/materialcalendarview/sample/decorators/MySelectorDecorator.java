package com.zealous.materialcalendarview.sample.decorators;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.zealous.materialcalendarview.CalendarDay;
import com.zealous.materialcalendarview.DayViewDecorator;
import com.zealous.materialcalendarview.DayViewFacade;
import com.zealous.materialcalendarview.sample.R;

/**
 * Use a custom selector
 */
public class MySelectorDecorator implements DayViewDecorator {

    private final Drawable drawable;

    public MySelectorDecorator(Activity context) {
        drawable = context.getResources().getDrawable(R.drawable.my_selector);
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return true;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setSelectionDrawable(drawable);
    }
}
