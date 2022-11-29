package nh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import rh.u1;

/* loaded from: classes3.dex */
public final class c0 extends sh.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: w  reason: collision with root package name */
    public final String f43532w;

    /* renamed from: x  reason: collision with root package name */
    public final s f43533x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f43534y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43535z;

    public c0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f43532w = str;
        t tVar = null;
        if (iBinder != null) {
            try {
                yh.a d10 = u1.s0(iBinder).d();
                byte[] bArr = d10 == null ? null : (byte[]) yh.b.z0(d10);
                if (bArr != null) {
                    tVar = new t(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f43533x = tVar;
        this.f43534y = z10;
        this.f43535z = z11;
    }

    public c0(String str, s sVar, boolean z10, boolean z11) {
        this.f43532w = str;
        this.f43533x = sVar;
        this.f43534y = z10;
        this.f43535z = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f43532w, false);
        s sVar = this.f43533x;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        }
        sh.b.j(parcel, 2, sVar, false);
        sh.b.c(parcel, 3, this.f43534y);
        sh.b.c(parcel, 4, this.f43535z);
        sh.b.b(parcel, a10);
    }
}
