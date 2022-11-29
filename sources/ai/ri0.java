package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ri0 extends sh.a {
    public static final Parcelable.Creator<ri0> CREATOR = new si0();
    @Deprecated

    /* renamed from: w  reason: collision with root package name */
    public final String f9449w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9450x;
    @Deprecated

    /* renamed from: y  reason: collision with root package name */
    public final fs f9451y;

    /* renamed from: z  reason: collision with root package name */
    public final as f9452z;

    public ri0(String str, String str2, fs fsVar, as asVar) {
        this.f9449w = str;
        this.f9450x = str2;
        this.f9451y = fsVar;
        this.f9452z = asVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f9449w, false);
        sh.b.q(parcel, 2, this.f9450x, false);
        sh.b.p(parcel, 3, this.f9451y, i10, false);
        sh.b.p(parcel, 4, this.f9452z, i10, false);
        sh.b.b(parcel, a10);
    }
}
