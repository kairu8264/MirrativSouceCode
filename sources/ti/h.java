package ti;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends sh.a implements oh.e {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f53655w;

    /* renamed from: x  reason: collision with root package name */
    public final String f53656x;

    public h(List<String> list, String str) {
        this.f53655w = list;
        this.f53656x = str;
    }

    @Override // oh.e
    public final Status d() {
        return this.f53656x != null ? Status.B : Status.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.s(parcel, 1, this.f53655w, false);
        sh.b.q(parcel, 2, this.f53656x, false);
        sh.b.b(parcel, a10);
    }
}
