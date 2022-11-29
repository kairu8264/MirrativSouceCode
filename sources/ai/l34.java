package ai;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes3.dex */
public final class l34 {

    /* renamed from: a  reason: collision with root package name */
    public int f6477a = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;

    /* renamed from: b  reason: collision with root package name */
    public int f6478b;

    public final int a() {
        return this.f6477a;
    }

    public final int b() {
        return this.f6478b;
    }

    public final void c(zzwl zzwlVar) throws zzwl {
        int i10 = this.f6478b + 1;
        this.f6478b = i10;
        int i11 = this.f6477a;
        this.f6477a = i11 + i11;
        if (i10 > 1) {
            throw zzwlVar;
        }
    }
}
