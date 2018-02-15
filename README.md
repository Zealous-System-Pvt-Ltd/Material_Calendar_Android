
Material Calendar View
======================

Usage
-----

1. Add `compile 'zealous:material-calendarview:1.4.3'` to your dependencies.
2. Add `MaterialCalendarView` into your layouts or view hierarchy.
3. Set a `OnDateSelectedListener` or call `MaterialCalendarView.getSelectedDates()` when you need it.



Example:

```xml
<zealous.materialcalendarview.MaterialCalendarView
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/calendarView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:mcv_showOtherDates="all"
    app:mcv_selectionColor="#00F"
    />
```
#### @Experimental
`CalendarMode.WEEK` and all week mode functionality is officially marked `@Experimental`. All APIs
marked `@Experimental` are subject to change quickly and should not be used in production code. They
are allowed for testing and feedback.

Major Change in 1.4.0
---------------------
* Breaking Change: `setFirstDayOfWeek`, `setMin/MaxDate`, and `setCalendarDisplayMode` are moved to a `State` object. This was necessary because it was unclear that these were not simple setters--individually, they were side effecting and triggered full adapter/date range recalculations. Typical usage of the view involves setting all these invariants up front during `onCreate` and it was unknown to the user that setting all 4 of these would create a lot of waste. Not to mention certain things were side effecting--some would reset the current day or selected date. As a result, the same 4 methods called in a different order could result in a different state, which is bad.

  For most cases you will simply need to replace setting those invariants with:
  ```java
  mcv.state().edit()
    .setFirstDayOfWeek(Calendar.WEDNESDAY)
    .setMinimumDate(CalendarDay.from(2016, 4, 3))
    .setMaximumDate(CalendarDay.from(2016, 5, 12))
    .setCalendarDisplayMode(CalendarMode.WEEKS)
    .commit();
  ```

  `mcv.state().edit()` will retain previously set values; `mcv.newState()` will create a new state using default values. Calling `commit` will trigger the rebuild of adapters and date ranges. It is recommended these state changes occur as the first modification to MCV (before configuring anything else like current date or selected date); we make no guarantee those modifications will be retained when the state is modified.




Major Change in 1.3.0
---------------------
* Breaking change: `getTileSize` is deprecated. Use `getTileWidth` or `getTileHeight`.
* Added `goToNext` and `goToPrevious` API to programmatically trigger paging
* Allow users to click on dates outside of current month with `setAllowClickDaysOutsideCurrentMonth`
* Set tile width/height separately rather than single tile size with `setTileWidth` and `setTileHeight`
* Attributes: mcv_tileWidth, mcv_tileHeight, mcv_calendarMode
* TalkBack APIs: `setContentDescriptionArrowPast`, `ArrowFuture`, `Calendar`

Documentation
-------------

Make sure to check all the documentation available [here](docs/README.md).

Customization
-------------

One of the aims of this library is to be customizable. The many options include:

* [Define the view's width and height in terms of tile size](docs/CUSTOMIZATION.md#tile-size)
* [Single or Multiple date selection, or disabling selection entirely](docs/CUSTOMIZATION.md#date-selection)
* [Showing dates from other months or those out of range](docs/CUSTOMIZATION.md#showing-other-dates)
* [Setting the first day of the week](docs/CUSTOMIZATION_BUILDER.md#first-day-of-the-week)
* [Show only a range of dates](docs/CUSTOMIZATION_BUILDER.md#date-ranges)
* [Customize the top bar](docs/CUSTOMIZATION.md#topbar-options)
* [Custom labels for the header, weekdays, or individual days](docs/CUSTOMIZATION.md#custom-labels)


### Events, Highlighting, Custom Selectors, and More!

All of this and more can be done via the decorator api. Please check out the [decorator documentation](docs/DECORATORS.md).



