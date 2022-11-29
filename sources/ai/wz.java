package ai;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class wz extends l00 {
    public final int A;

    /* renamed from: w  reason: collision with root package name */
    public final Drawable f11819w;

    /* renamed from: x  reason: collision with root package name */
    public final Uri f11820x;

    /* renamed from: y  reason: collision with root package name */
    public final double f11821y;

    /* renamed from: z  reason: collision with root package name */
    public final int f11822z;

    public wz(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        this.f11819w = drawable;
        this.f11820x = uri;
        this.f11821y = d10;
        this.f11822z = i10;
        this.A = i11;
    }

    @Override // ai.m00
    public final int a() {
        return this.A;
    }

    @Override // ai.m00
    public final Uri b() throws RemoteException {
        return this.f11820x;
    }

    @Override // ai.m00
    public final int c() {
        return this.f11822z;
    }

    @Override // ai.m00
    public final double d() {
        return this.f11821y;
    }

    @Override // ai.m00
    public final yh.a zzb() throws RemoteException {
        return yh.b.h1(this.f11819w);
    }
}
