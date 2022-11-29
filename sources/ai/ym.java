package ai;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class ym extends sh.a {
    public static final Parcelable.Creator<ym> CREATOR = new zm();
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public ParcelFileDescriptor f12664w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f12665x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f12666y;

    /* renamed from: z  reason: collision with root package name */
    public final long f12667z;

    public ym() {
        this(null, false, false, 0L, false);
    }

    public final synchronized ParcelFileDescriptor P() {
        return this.f12664w;
    }

    public final synchronized boolean S() {
        return this.f12665x;
    }

    public final synchronized boolean U() {
        return this.f12666y;
    }

    public final synchronized long k0() {
        return this.f12667z;
    }

    public final synchronized InputStream p() {
        ParcelFileDescriptor parcelFileDescriptor = this.f12664w;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f12664w = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean r0() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.p(parcel, 2, P(), i10, false);
        sh.b.c(parcel, 3, S());
        sh.b.c(parcel, 4, U());
        sh.b.n(parcel, 5, k0());
        sh.b.c(parcel, 6, r0());
        sh.b.b(parcel, a10);
    }

    public final synchronized boolean zza() {
        return this.f12664w != null;
    }

    public ym(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.f12664w = parcelFileDescriptor;
        this.f12665x = z10;
        this.f12666y = z11;
        this.f12667z = j10;
        this.A = z12;
    }
}
