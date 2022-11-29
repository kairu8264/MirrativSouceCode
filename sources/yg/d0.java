package yg;

import ai.sr;
import ai.tm2;
import ai.xx2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class d0 extends sh.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: w  reason: collision with root package name */
    public final String f61862w;

    /* renamed from: x  reason: collision with root package name */
    public final int f61863x;

    public d0(String str, int i10) {
        this.f61862w = str == null ? "" : str;
        this.f61863x = i10;
    }

    public static d0 p(Throwable th2) {
        String message;
        sr a10 = tm2.a(th2);
        if (xx2.c(th2.getMessage())) {
            message = a10.f9917x;
        } else {
            message = th2.getMessage();
        }
        return new d0(message, a10.f9916w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f61862w, false);
        sh.b.k(parcel, 2, this.f61863x);
        sh.b.b(parcel, a10);
    }
}
