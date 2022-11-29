package ih;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class d extends sh.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: w  reason: collision with root package name */
    public final String f36819w;

    /* renamed from: x  reason: collision with root package name */
    public final String f36820x;

    public d(String str, String str2) {
        this.f36819w = str;
        this.f36820x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f36819w, false);
        sh.b.q(parcel, 2, this.f36820x, false);
        sh.b.b(parcel, a10);
    }
}
