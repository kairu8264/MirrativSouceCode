package ai;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import yh.a;

/* loaded from: classes3.dex */
public final class kd0 extends sh.a {
    public static final Parcelable.Creator<kd0> CREATOR = new ld0();

    /* renamed from: w  reason: collision with root package name */
    public final View f6170w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6171x;

    public kd0(IBinder iBinder, IBinder iBinder2) {
        this.f6170w = (View) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder));
        this.f6171x = (Map) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.j(parcel, 1, yh.b.h1(this.f6170w).asBinder(), false);
        sh.b.j(parcel, 2, yh.b.h1(this.f6171x).asBinder(), false);
        sh.b.b(parcel, a10);
    }
}
