package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class sr extends sh.a {
    public static final Parcelable.Creator<sr> CREATOR = new ur();
    public IBinder A;

    /* renamed from: w  reason: collision with root package name */
    public final int f9916w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9917x;

    /* renamed from: y  reason: collision with root package name */
    public final String f9918y;

    /* renamed from: z  reason: collision with root package name */
    public sr f9919z;

    public sr(int i10, String str, String str2, sr srVar, IBinder iBinder) {
        this.f9916w = i10;
        this.f9917x = str;
        this.f9918y = str2;
        this.f9919z = srVar;
        this.A = iBinder;
    }

    public final rg.m P() {
        sr srVar = this.f9919z;
        lv lvVar = null;
        rg.a aVar = srVar == null ? null : new rg.a(srVar.f9916w, srVar.f9917x, srVar.f9918y);
        int i10 = this.f9916w;
        String str = this.f9917x;
        String str2 = this.f9918y;
        IBinder iBinder = this.A;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof lv) {
                lvVar = (lv) queryLocalInterface;
            } else {
                lvVar = new jv(iBinder);
            }
        }
        return new rg.m(i10, str, str2, aVar, rg.t.d(lvVar));
    }

    public final rg.a p() {
        sr srVar = this.f9919z;
        return new rg.a(this.f9916w, this.f9917x, this.f9918y, srVar == null ? null : new rg.a(srVar.f9916w, srVar.f9917x, srVar.f9918y));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f9916w);
        sh.b.q(parcel, 2, this.f9917x, false);
        sh.b.q(parcel, 3, this.f9918y, false);
        sh.b.p(parcel, 4, this.f9919z, i10, false);
        sh.b.j(parcel, 5, this.A, false);
        sh.b.b(parcel, a10);
    }
}
