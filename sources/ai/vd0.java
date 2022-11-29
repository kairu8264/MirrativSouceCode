package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public final class vd0 extends sh.a {
    public static final Parcelable.Creator<vd0> CREATOR = new wd0();

    /* renamed from: w  reason: collision with root package name */
    public final boolean f11029w;

    /* renamed from: x  reason: collision with root package name */
    public final List<String> f11030x;

    public vd0(boolean z10, List<String> list) {
        this.f11029w = z10;
        this.f11030x = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 2, this.f11029w);
        sh.b.s(parcel, 3, this.f11030x, false);
        sh.b.b(parcel, a10);
    }
}
