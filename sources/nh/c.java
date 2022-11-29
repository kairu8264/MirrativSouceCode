package nh;

import android.os.Parcel;
import android.os.Parcelable;
import rh.n;

/* loaded from: classes3.dex */
public class c extends sh.a {
    public static final Parcelable.Creator<c> CREATOR = new m();

    /* renamed from: w  reason: collision with root package name */
    public final String f43529w;
    @Deprecated

    /* renamed from: x  reason: collision with root package name */
    public final int f43530x;

    /* renamed from: y  reason: collision with root package name */
    public final long f43531y;

    public c(String str, int i10, long j10) {
        this.f43529w = str;
        this.f43530x = i10;
        this.f43531y = j10;
    }

    public c(String str, long j10) {
        this.f43529w = str;
        this.f43531y = j10;
        this.f43530x = -1;
    }

    public long P() {
        long j10 = this.f43531y;
        return j10 == -1 ? this.f43530x : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((p() != null && p().equals(cVar.p())) || (p() == null && cVar.p() == null)) && P() == cVar.P()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return rh.n.b(p(), Long.valueOf(P()));
    }

    public String p() {
        return this.f43529w;
    }

    public final String toString() {
        n.a c10 = rh.n.c(this);
        c10.a("name", p());
        c10.a("version", Long.valueOf(P()));
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, p(), false);
        sh.b.k(parcel, 2, this.f43530x);
        sh.b.n(parcel, 3, P());
        sh.b.b(parcel, a10);
    }
}
