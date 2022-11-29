package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class e {
    public static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    public static String b(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return s.b(locale).format(new Date(j10));
        }
        return s.f(locale).format(new Date(j10));
    }

    public static String c(Context context, long j10) {
        return DateUtils.formatDateTime(context, j10 - TimeZone.getDefault().getOffset(j10), 36);
    }

    public static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    public static String e(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return s.m(locale).format(new Date(j10));
        }
        return s.f(locale).format(new Date(j10));
    }
}
