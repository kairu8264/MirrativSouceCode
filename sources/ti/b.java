package ti;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class b extends sh.a implements oh.e {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: w  reason: collision with root package name */
    public final int f53652w;

    /* renamed from: x  reason: collision with root package name */
    public int f53653x;

    /* renamed from: y  reason: collision with root package name */
    public Intent f53654y;

    public b() {
        this(2, 0, null);
    }

    @Override // oh.e
    public final Status d() {
        return this.f53653x == 0 ? Status.B : Status.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f53652w);
        sh.b.k(parcel, 2, this.f53653x);
        sh.b.p(parcel, 3, this.f53654y, i10, false);
        sh.b.b(parcel, a10);
    }

    public b(int i10, int i11, Intent intent) {
        this.f53652w = i10;
        this.f53653x = i11;
        this.f53654y = intent;
    }
}
