package xg;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import yh.a;

/* loaded from: classes3.dex */
public final class e extends sh.a {
    public static final Parcelable.Creator<e> CREATOR = new d();
    public final String A;
    public final String B;
    public final String C;
    public final Intent D;
    public final v E;
    public final boolean F;

    /* renamed from: w  reason: collision with root package name */
    public final String f60263w;

    /* renamed from: x  reason: collision with root package name */
    public final String f60264x;

    /* renamed from: y  reason: collision with root package name */
    public final String f60265y;

    /* renamed from: z  reason: collision with root package name */
    public final String f60266z;

    public e(Intent intent, v vVar) {
        this(null, null, null, null, null, null, null, intent, yh.b.h1(vVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f60263w, false);
        sh.b.q(parcel, 3, this.f60264x, false);
        sh.b.q(parcel, 4, this.f60265y, false);
        sh.b.q(parcel, 5, this.f60266z, false);
        sh.b.q(parcel, 6, this.A, false);
        sh.b.q(parcel, 7, this.B, false);
        sh.b.q(parcel, 8, this.C, false);
        sh.b.p(parcel, 9, this.D, i10, false);
        sh.b.j(parcel, 10, yh.b.h1(this.E).asBinder(), false);
        sh.b.c(parcel, 11, this.F);
        sh.b.b(parcel, a10);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f60263w = str;
        this.f60264x = str2;
        this.f60265y = str3;
        this.f60266z = str4;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = intent;
        this.E = (v) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder));
        this.F = z10;
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, v vVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, yh.b.h1(vVar).asBinder(), false);
    }
}
