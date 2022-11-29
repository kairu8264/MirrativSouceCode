package rh;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import rh.i;

/* loaded from: classes3.dex */
public class f extends sh.a {
    public static final Parcelable.Creator<f> CREATOR = new j1();
    public IBinder A;
    public Scope[] B;
    public Bundle C;
    public Account D;
    public nh.c[] E;
    public nh.c[] F;
    public boolean G;
    public int H;
    public boolean I;
    public String J;

    /* renamed from: w  reason: collision with root package name */
    public final int f51439w;

    /* renamed from: x  reason: collision with root package name */
    public final int f51440x;

    /* renamed from: y  reason: collision with root package name */
    public int f51441y;

    /* renamed from: z  reason: collision with root package name */
    public String f51442z;

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, nh.c[] cVarArr, nh.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        this.f51439w = i10;
        this.f51440x = i11;
        this.f51441y = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f51442z = "com.google.android.gms";
        } else {
            this.f51442z = str;
        }
        if (i10 < 2) {
            this.D = iBinder != null ? a.z0(i.a.s0(iBinder)) : null;
        } else {
            this.A = iBinder;
            this.D = account;
        }
        this.B = scopeArr;
        this.C = bundle;
        this.E = cVarArr;
        this.F = cVarArr2;
        this.G = z10;
        this.H = i13;
        this.I = z11;
        this.J = str2;
    }

    public final String p() {
        return this.J;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j1.a(this, parcel, i10);
    }

    public f(int i10, String str) {
        this.f51439w = 6;
        this.f51441y = nh.e.f43540a;
        this.f51440x = i10;
        this.G = true;
        this.J = str;
    }
}
