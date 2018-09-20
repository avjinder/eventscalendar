package com.events.calendar.utils

import android.util.MonthDisplayHelper
import android.util.SparseBooleanArray
import java.util.*

class EventDots(month: Calendar) {

    private val mNoOfDays: Int
    private val mDotsArray: SparseBooleanArray
    private val mMonthDisplayHelper: MonthDisplayHelper
    private val mCalendar: Calendar = month.clone() as Calendar

    init {
        mMonthDisplayHelper = MonthDisplayHelper(mCalendar.get(Calendar.YEAR), mCalendar.get(Calendar.MONTH))
        mNoOfDays = mMonthDisplayHelper.numberOfDaysInMonth
        mDotsArray = SparseBooleanArray(mNoOfDays)
    }

    fun clear() {
        mDotsArray.clear()
    }

    fun add(date: Int) {
        mDotsArray.put(date, true)
    }

    fun hasEvent(date: Int): Boolean {
        return mDotsArray.get(date)
    }

    companion object {
        private val TAG = "EventsDots"
    }
}