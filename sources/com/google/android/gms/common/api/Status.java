package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import oh.e;
import oh.j;
import rh.n;

/* loaded from: classes3.dex */
public final class Status extends sh.a implements e, ReflectedParcelable {
    public final ConnectionResult A;

    /* renamed from: w  reason: collision with root package name */
    public final int f27175w;

    /* renamed from: x  reason: collision with root package name */
    public final int f27176x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27177y;

    /* renamed from: z  reason: collision with root package name */
    public final PendingIntent f27178z;
    public static final Status B = new Status(0);
    public static final Status C = new Status(14);
    public static final Status D = new Status(8);
    public static final Status E = new Status(15);
    public static final Status F = new Status(16);
    public static final Status H = new Status(17);
    public static final Status G = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new j();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f27175w = i10;
        this.f27176x = i11;
        this.f27177y = str;
        this.f27178z = pendingIntent;
        this.A = connectionResult;
    }

    public int P() {
        return this.f27176x;
    }

    public String S() {
        return this.f27177y;
    }

    public boolean U() {
        return this.f27178z != null;
    }

    @Override // oh.e
    public Status d() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f27175w == status.f27175w && this.f27176x == status.f27176x && n.a(this.f27177y, status.f27177y) && n.a(this.f27178z, status.f27178z) && n.a(this.A, status.A);
        }
        return false;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f27175w), Integer.valueOf(this.f27176x), this.f27177y, this.f27178z, this.A);
    }

    public boolean k0() {
        return this.f27176x <= 0;
    }

    public ConnectionResult p() {
        return this.A;
    }

    public final String r0() {
        String str = this.f27177y;
        return str != null ? str : oh.a.a(this.f27176x);
    }

    public String toString() {
        n.a c10 = n.c(this);
        c10.a("statusCode", r0());
        c10.a("resolution", this.f27178z);
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, P());
        sh.b.q(parcel, 2, S(), false);
        sh.b.p(parcel, 3, this.f27178z, i10, false);
        sh.b.p(parcel, 4, p(), i10, false);
        sh.b.k(parcel, 1000, this.f27175w);
        sh.b.b(parcel, a10);
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent) {
        this(i10, i11, str, pendingIntent, null);
    }

    public Status(int i10, String str) {
        this(1, i10, str, null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i10) {
        this(1, i10, str, connectionResult.S(), connectionResult);
    }
}
