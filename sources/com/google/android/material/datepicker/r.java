package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f27594c = new r(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f27595a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeZone f27596b;

    public r(Long l10, TimeZone timeZone) {
        this.f27595a = l10;
        this.f27596b = timeZone;
    }

    public static r c() {
        return f27594c;
    }

    public Calendar a() {
        return b(this.f27596b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f27595a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
