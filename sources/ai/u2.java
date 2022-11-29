package ai;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u2 {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f10568a;

    /* renamed from: b  reason: collision with root package name */
    public final s2 f10569b;

    /* renamed from: c  reason: collision with root package name */
    public t2 f10570c;

    /* renamed from: d  reason: collision with root package name */
    public int f10571d;

    /* renamed from: e  reason: collision with root package name */
    public float f10572e = 1.0f;

    public u2(Context context, Handler handler, t2 t2Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f10568a = audioManager;
        this.f10570c = t2Var;
        this.f10569b = new s2(this, handler);
        this.f10571d = 0;
    }

    public static /* synthetic */ void d(u2 u2Var, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                u2Var.f(3);
                return;
            }
            u2Var.g(0);
            u2Var.f(2);
        } else if (i10 == -1) {
            u2Var.g(-1);
            u2Var.e();
        } else if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unknown focus change type: ");
            sb2.append(i10);
            Log.w("AudioFocusManager", sb2.toString());
        } else {
            u2Var.f(1);
            u2Var.g(1);
        }
    }

    public final float a() {
        return this.f10572e;
    }

    public final int b(boolean z10, int i10) {
        e();
        return z10 ? 1 : -1;
    }

    public final void c() {
        this.f10570c = null;
        e();
    }

    public final void e() {
        if (this.f10571d == 0) {
            return;
        }
        if (sb.f9778a < 26) {
            this.f10568a.abandonAudioFocus(this.f10569b);
        }
        f(0);
    }

    public final void f(int i10) {
        if (this.f10571d == i10) {
            return;
        }
        this.f10571d = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f10572e == f10) {
            return;
        }
        this.f10572e = f10;
        t2 t2Var = this.f10570c;
        if (t2Var != null) {
            ((b7) t2Var).f2258w.L();
        }
    }

    public final void g(int i10) {
        int U;
        t2 t2Var = this.f10570c;
        if (t2Var != null) {
            b7 b7Var = (b7) t2Var;
            boolean l10 = b7Var.f2258w.l();
            e7 e7Var = b7Var.f2258w;
            U = e7.U(l10, i10);
            e7Var.M(l10, i10, U);
        }
    }
}
