package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0243a();
    public final int A;
    public final int B;

    /* renamed from: w  reason: collision with root package name */
    public final l f27512w;

    /* renamed from: x  reason: collision with root package name */
    public final l f27513x;

    /* renamed from: y  reason: collision with root package name */
    public final c f27514y;

    /* renamed from: z  reason: collision with root package name */
    public l f27515z;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0243a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f27516e = s.a(l.c(1900, 0).B);

        /* renamed from: f  reason: collision with root package name */
        public static final long f27517f = s.a(l.c(2100, 11).B);

        /* renamed from: a  reason: collision with root package name */
        public long f27518a;

        /* renamed from: b  reason: collision with root package name */
        public long f27519b;

        /* renamed from: c  reason: collision with root package name */
        public Long f27520c;

        /* renamed from: d  reason: collision with root package name */
        public c f27521d;

        public b(a aVar) {
            this.f27518a = f27516e;
            this.f27519b = f27517f;
            this.f27521d = f.a(Long.MIN_VALUE);
            this.f27518a = aVar.f27512w.B;
            this.f27519b = aVar.f27513x.B;
            this.f27520c = Long.valueOf(aVar.f27515z.B);
            this.f27521d = aVar.f27514y;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f27521d);
            l e10 = l.e(this.f27518a);
            l e11 = l.e(this.f27519b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f27520c;
            return new a(e10, e11, cVar, l10 == null ? null : l.e(l10.longValue()), null);
        }

        public b b(long j10) {
            this.f27520c = Long.valueOf(j10);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface c extends Parcelable {
        boolean p0(long j10);
    }

    public /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0243a c0243a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public l e(l lVar) {
        if (lVar.compareTo(this.f27512w) < 0) {
            return this.f27512w;
        }
        return lVar.compareTo(this.f27513x) > 0 ? this.f27513x : lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f27512w.equals(aVar.f27512w) && this.f27513x.equals(aVar.f27513x) && n3.c.a(this.f27515z, aVar.f27515z) && this.f27514y.equals(aVar.f27514y);
        }
        return false;
    }

    public c f() {
        return this.f27514y;
    }

    public l g() {
        return this.f27513x;
    }

    public int h() {
        return this.B;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27512w, this.f27513x, this.f27515z, this.f27514y});
    }

    public l i() {
        return this.f27515z;
    }

    public l j() {
        return this.f27512w;
    }

    public int k() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f27512w, 0);
        parcel.writeParcelable(this.f27513x, 0);
        parcel.writeParcelable(this.f27515z, 0);
        parcel.writeParcelable(this.f27514y, 0);
    }

    public a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f27512w = lVar;
        this.f27513x = lVar2;
        this.f27515z = lVar3;
        this.f27514y = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.B = lVar.q(lVar2) + 1;
        this.A = (lVar2.f27577y - lVar.f27577y) + 1;
    }
}
