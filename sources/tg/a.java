package tg;

import ai.a20;
import ai.z10;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes3.dex */
public final class a extends sh.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new j();

    /* renamed from: w  reason: collision with root package name */
    public final boolean f53619w;

    /* renamed from: x  reason: collision with root package name */
    public final IBinder f53620x;

    public a(boolean z10, IBinder iBinder) {
        this.f53619w = z10;
        this.f53620x = iBinder;
    }

    public final a20 P() {
        IBinder iBinder = this.f53620x;
        if (iBinder == null) {
            return null;
        }
        return z10.R5(iBinder);
    }

    public boolean p() {
        return this.f53619w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 1, p());
        sh.b.j(parcel, 2, this.f53620x, false);
        sh.b.b(parcel, a10);
    }
}
