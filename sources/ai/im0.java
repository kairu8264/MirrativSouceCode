package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class im0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f5288a;

    /* renamed from: b  reason: collision with root package name */
    public final hm0 f5289b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5290c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5291d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5292e;

    /* renamed from: f  reason: collision with root package name */
    public float f5293f = 1.0f;

    public im0(Context context, hm0 hm0Var) {
        this.f5288a = (AudioManager) context.getSystemService("audio");
        this.f5289b = hm0Var;
    }

    public final void a(boolean z10) {
        this.f5292e = z10;
        f();
    }

    public final void b(float f10) {
        this.f5293f = f10;
        f();
    }

    public final float c() {
        float f10 = this.f5292e ? 0.0f : this.f5293f;
        if (this.f5290c) {
            return f10;
        }
        return 0.0f;
    }

    public final void d() {
        this.f5291d = true;
        f();
    }

    public final void e() {
        this.f5291d = false;
        f();
    }

    public final void f() {
        if (!this.f5291d || this.f5292e || this.f5293f <= 0.0f) {
            if (this.f5290c) {
                AudioManager audioManager = this.f5288a;
                if (audioManager != null) {
                    this.f5290c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f5289b.m();
            }
        } else if (this.f5290c) {
        } else {
            AudioManager audioManager2 = this.f5288a;
            if (audioManager2 != null) {
                this.f5290c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
            }
            this.f5289b.m();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f5290c = i10 > 0;
        this.f5289b.m();
    }
}
