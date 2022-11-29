package tg;

import ai.a20;
import ai.gu;
import ai.hu;
import ai.z10;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* loaded from: classes3.dex */
public final class g extends sh.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new m();

    /* renamed from: w  reason: collision with root package name */
    public final boolean f53637w;

    /* renamed from: x  reason: collision with root package name */
    public final hu f53638x;

    /* renamed from: y  reason: collision with root package name */
    public final IBinder f53639y;

    public g(boolean z10, IBinder iBinder, IBinder iBinder2) {
        this.f53637w = z10;
        this.f53638x = iBinder != null ? gu.R5(iBinder) : null;
        this.f53639y = iBinder2;
    }

    public final a20 P() {
        IBinder iBinder = this.f53639y;
        if (iBinder == null) {
            return null;
        }
        return z10.R5(iBinder);
    }

    public final hu p() {
        return this.f53638x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 1, this.f53637w);
        hu huVar = this.f53638x;
        sh.b.j(parcel, 2, huVar == null ? null : huVar.asBinder(), false);
        sh.b.j(parcel, 3, this.f53639y, false);
        sh.b.b(parcel, a10);
    }

    public final boolean zza() {
        return this.f53637w;
    }
}
