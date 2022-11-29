package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class uw extends sh.a {
    public static final Parcelable.Creator<uw> CREATOR = new vw();

    /* renamed from: w  reason: collision with root package name */
    public final boolean f10855w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f10856x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f10857y;

    public uw(rg.v vVar) {
        this(vVar.c(), vVar.b(), vVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 2, this.f10855w);
        sh.b.c(parcel, 3, this.f10856x);
        sh.b.c(parcel, 4, this.f10857y);
        sh.b.b(parcel, a10);
    }

    public uw(boolean z10, boolean z11, boolean z12) {
        this.f10855w = z10;
        this.f10856x = z11;
        this.f10857y = z12;
    }
}
