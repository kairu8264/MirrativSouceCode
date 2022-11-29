package k9;

import android.os.Parcel;
import c1.e0;
import jo.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f38476a = new b();

    public long a(Parcel parcel) {
        p.h(parcel, "parcel");
        return e0.b(parcel.readInt());
    }

    public void b(long j10, Parcel parcel, int i10) {
        p.h(parcel, "parcel");
        parcel.writeInt((int) j10);
    }
}
