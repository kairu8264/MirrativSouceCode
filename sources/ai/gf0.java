package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class gf0 extends sh.a {
    public static final Parcelable.Creator<gf0> CREATOR = new hf0();

    /* renamed from: w  reason: collision with root package name */
    public final as f4407w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4408x;

    public gf0(as asVar, String str) {
        this.f4407w = asVar;
        this.f4408x = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.p(parcel, 2, this.f4407w, i10, false);
        sh.b.q(parcel, 3, this.f4408x, false);
        sh.b.b(parcel, a10);
    }
}
