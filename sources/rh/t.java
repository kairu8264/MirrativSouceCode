package rh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class t extends sh.a {
    public static final Parcelable.Creator<t> CREATOR = new x();

    /* renamed from: w  reason: collision with root package name */
    public final int f51516w;

    /* renamed from: x  reason: collision with root package name */
    public List<m> f51517x;

    public t(int i10, List<m> list) {
        this.f51516w = i10;
        this.f51517x = list;
    }

    public final List<m> P() {
        return this.f51517x;
    }

    public final void S(m mVar) {
        if (this.f51517x == null) {
            this.f51517x = new ArrayList();
        }
        this.f51517x.add(mVar);
    }

    public final int p() {
        return this.f51516w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f51516w);
        sh.b.u(parcel, 2, this.f51517x, false);
        sh.b.b(parcel, a10);
    }
}
