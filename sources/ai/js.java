package ai;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class js extends sh.a {
    public static final Parcelable.Creator<js> CREATOR = new ks();

    /* renamed from: w  reason: collision with root package name */
    public final String f5904w;

    /* renamed from: x  reason: collision with root package name */
    public long f5905x;

    /* renamed from: y  reason: collision with root package name */
    public sr f5906y;

    /* renamed from: z  reason: collision with root package name */
    public final Bundle f5907z;

    public js(String str, long j10, sr srVar, Bundle bundle) {
        this.f5904w = str;
        this.f5905x = j10;
        this.f5906y = srVar;
        this.f5907z = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f5904w, false);
        sh.b.n(parcel, 2, this.f5905x);
        sh.b.p(parcel, 3, this.f5906y, i10, false);
        sh.b.e(parcel, 4, this.f5907z, false);
        sh.b.b(parcel, a10);
    }
}
