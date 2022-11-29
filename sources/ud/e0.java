package ud;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54872a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54873b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54874c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54875d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f54876e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54877f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54878g;

    public e0(androidx.lifecycle.e0<String> e0Var, androidx.lifecycle.e0<Integer> e0Var2, androidx.lifecycle.e0<String> e0Var3, androidx.lifecycle.e0<Boolean> e0Var4, androidx.lifecycle.e0<SpannableString> e0Var5, androidx.lifecycle.e0<Drawable> e0Var6, androidx.lifecycle.e0<Drawable> e0Var7) {
        jo.p.h(e0Var, "giftImageUrl");
        jo.p.h(e0Var2, "score");
        jo.p.h(e0Var3, "scoreSuffix");
        jo.p.h(e0Var4, "isVisibleScoreSuffix");
        jo.p.h(e0Var5, "currentScoreText");
        jo.p.h(e0Var6, "sendButtonBackground");
        jo.p.h(e0Var7, "editButtonBackground");
        this.f54872a = e0Var;
        this.f54873b = e0Var2;
        this.f54874c = e0Var3;
        this.f54875d = e0Var4;
        this.f54876e = e0Var5;
        this.f54877f = e0Var6;
        this.f54878g = e0Var7;
    }

    public final void a(jf.q qVar, int i10, String str, SpannableString spannableString, Drawable drawable, Drawable drawable2) {
        jo.p.h(qVar, "gift");
        jo.p.h(str, "scoreSuffix");
        jo.p.h(spannableString, "currentScoreText");
        jo.p.h(drawable, "sendButtonBackground");
        jo.p.h(drawable2, "editButtonBackground");
        this.f54872a.p(qVar.i());
        this.f54873b.p(Integer.valueOf(i10));
        this.f54874c.p(str);
        this.f54876e.p(spannableString);
        this.f54877f.p(drawable);
        this.f54878g.p(drawable2);
    }

    public final androidx.lifecycle.e0<SpannableString> b() {
        return this.f54876e;
    }

    public final androidx.lifecycle.e0<Drawable> c() {
        return this.f54878g;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f54872a;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.f54874c;
    }

    public final androidx.lifecycle.e0<Drawable> f() {
        return this.f54877f;
    }

    public final androidx.lifecycle.e0<Boolean> g() {
        return this.f54875d;
    }

    public final void h(int i10, SpannableString spannableString, Drawable drawable, Drawable drawable2) {
        jo.p.h(spannableString, "currentScoreText");
        jo.p.h(drawable, "sendButtonBackground");
        jo.p.h(drawable2, "editButtonBackground");
        this.f54875d.p(Boolean.valueOf(i10 > 0));
        this.f54876e.p(spannableString);
        this.f54877f.p(drawable);
        this.f54878g.p(drawable2);
    }

    public /* synthetic */ e0(androidx.lifecycle.e0 e0Var, androidx.lifecycle.e0 e0Var2, androidx.lifecycle.e0 e0Var3, androidx.lifecycle.e0 e0Var4, androidx.lifecycle.e0 e0Var5, androidx.lifecycle.e0 e0Var6, androidx.lifecycle.e0 e0Var7, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new androidx.lifecycle.e0("") : e0Var, (i10 & 2) != 0 ? new androidx.lifecycle.e0(0) : e0Var2, (i10 & 4) != 0 ? new androidx.lifecycle.e0("") : e0Var3, (i10 & 8) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var4, (i10 & 16) != 0 ? new androidx.lifecycle.e0(new SpannableString("")) : e0Var5, (i10 & 32) != 0 ? new androidx.lifecycle.e0(null) : e0Var6, (i10 & 64) != 0 ? new androidx.lifecycle.e0(null) : e0Var7);
    }
}
