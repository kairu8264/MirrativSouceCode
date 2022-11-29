package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
public final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    public final int A;
    public final long B;
    public String C;

    /* renamed from: w  reason: collision with root package name */
    public final Calendar f27575w;

    /* renamed from: x  reason: collision with root package name */
    public final int f27576x;

    /* renamed from: y  reason: collision with root package name */
    public final int f27577y;

    /* renamed from: z  reason: collision with root package name */
    public final int f27578z;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = s.d(calendar);
        this.f27575w = d10;
        this.f27576x = d10.get(2);
        this.f27577y = d10.get(1);
        this.f27578z = d10.getMaximum(7);
        this.A = d10.getActualMaximum(5);
        this.B = d10.getTimeInMillis();
    }

    public static l c(int i10, int i11) {
        Calendar k10 = s.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new l(k10);
    }

    public static l e(long j10) {
        Calendar k10 = s.k();
        k10.setTimeInMillis(j10);
        return new l(k10);
    }

    public static l h() {
        return new l(s.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.f27575w.compareTo(lVar.f27575w);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f27576x == lVar.f27576x && this.f27577y == lVar.f27577y;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27576x), Integer.valueOf(this.f27577y)});
    }

    public int i() {
        int firstDayOfWeek = this.f27575w.get(7) - this.f27575w.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f27578z : firstDayOfWeek;
    }

    public long l(int i10) {
        Calendar d10 = s.d(this.f27575w);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    public int m(long j10) {
        Calendar d10 = s.d(this.f27575w);
        d10.setTimeInMillis(j10);
        return d10.get(5);
    }

    public String n(Context context) {
        if (this.C == null) {
            this.C = e.c(context, this.f27575w.getTimeInMillis());
        }
        return this.C;
    }

    public long o() {
        return this.f27575w.getTimeInMillis();
    }

    public l p(int i10) {
        Calendar d10 = s.d(this.f27575w);
        d10.add(2, i10);
        return new l(d10);
    }

    public int q(l lVar) {
        if (this.f27575w instanceof GregorianCalendar) {
            return ((lVar.f27577y - this.f27577y) * 12) + (lVar.f27576x - this.f27576x);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27577y);
        parcel.writeInt(this.f27576x);
    }
}
