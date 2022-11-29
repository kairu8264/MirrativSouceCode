package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import oh.i;
import rh.p;

/* loaded from: classes3.dex */
public final class Scope extends sh.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new i();

    /* renamed from: w  reason: collision with root package name */
    public final int f27173w;

    /* renamed from: x  reason: collision with root package name */
    public final String f27174x;

    public Scope(int i10, String str) {
        p.f(str, "scopeUri must not be null or empty");
        this.f27173w = i10;
        this.f27174x = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f27174x.equals(((Scope) obj).f27174x);
        }
        return false;
    }

    public int hashCode() {
        return this.f27174x.hashCode();
    }

    public String p() {
        return this.f27174x;
    }

    public String toString() {
        return this.f27174x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f27173w);
        sh.b.q(parcel, 2, p(), false);
        sh.b.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
