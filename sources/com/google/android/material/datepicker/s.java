package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<r> f27597a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar k10 = k();
        k10.setTimeInMillis(j10);
        return d(k10).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar l10 = l(calendar);
        Calendar k10 = k();
        k10.set(l10.get(1), l10.get(2), l10.get(5));
        return k10;
    }

    public static java.text.DateFormat e(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    public static r g() {
        r rVar = f27597a.get();
        return rVar == null ? r.c() : rVar;
    }

    public static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        Calendar a10 = g().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(h());
        return a10;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar k() {
        return l(null);
    }

    public static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}
