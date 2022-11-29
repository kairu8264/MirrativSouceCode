package ai;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* loaded from: classes3.dex */
public class x24 {

    /* renamed from: a  reason: collision with root package name */
    public int f11846a;

    /* renamed from: b  reason: collision with root package name */
    public int f11847b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11848c;

    /* renamed from: d  reason: collision with root package name */
    public final zz2<String> f11849d;

    /* renamed from: e  reason: collision with root package name */
    public final zz2<String> f11850e;

    /* renamed from: f  reason: collision with root package name */
    public final zz2<String> f11851f;

    /* renamed from: g  reason: collision with root package name */
    public zz2<String> f11852g;

    /* renamed from: h  reason: collision with root package name */
    public int f11853h;

    /* renamed from: i  reason: collision with root package name */
    public final j03<Integer> f11854i;

    @Deprecated
    public x24() {
        this.f11846a = Integer.MAX_VALUE;
        this.f11847b = Integer.MAX_VALUE;
        this.f11848c = true;
        this.f11849d = zz2.r();
        this.f11850e = zz2.r();
        this.f11851f = zz2.r();
        this.f11852g = zz2.r();
        this.f11853h = 0;
        this.f11854i = j03.p();
    }

    public x24(t34 t34Var) {
        this.f11846a = t34Var.f10104i;
        this.f11847b = t34Var.f10105j;
        this.f11848c = t34Var.f10106k;
        this.f11849d = t34Var.f10107l;
        this.f11850e = t34Var.f10108m;
        this.f11851f = t34Var.f10112q;
        this.f11852g = t34Var.f10113r;
        this.f11853h = t34Var.f10114s;
        this.f11854i = t34Var.f10118w;
    }

    public x24 j(int i10, int i11, boolean z10) {
        this.f11846a = i10;
        this.f11847b = i11;
        this.f11848c = true;
        return this;
    }

    public final x24 k(Context context) {
        CaptioningManager captioningManager;
        int i10 = sb.f9778a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f11853h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f11852g = zz2.s(sb.U(locale));
            }
        }
        return this;
    }
}
