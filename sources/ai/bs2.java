package ai;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class bs2 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2468a;

    /* renamed from: b  reason: collision with root package name */
    public final AudioManager f2469b;

    /* renamed from: c  reason: collision with root package name */
    public final zr2 f2470c;

    /* renamed from: d  reason: collision with root package name */
    public float f2471d;

    /* renamed from: e  reason: collision with root package name */
    public final ks2 f2472e;

    public bs2(Handler handler, Context context, zr2 zr2Var, ks2 ks2Var, byte[] bArr) {
        super(handler);
        this.f2468a = context;
        this.f2469b = (AudioManager) context.getSystemService("audio");
        this.f2470c = zr2Var;
        this.f2472e = ks2Var;
    }

    public final void a() {
        this.f2471d = c();
        d();
        this.f2468a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f2468a.getContentResolver().unregisterContentObserver(this);
    }

    public final float c() {
        int streamVolume = this.f2469b.getStreamVolume(3);
        int streamMaxVolume = this.f2469b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void d() {
        this.f2472e.e(this.f2471d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (c10 != this.f2471d) {
            this.f2471d = c10;
            d();
        }
    }
}
