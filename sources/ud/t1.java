package ud;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;

/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f55509a = new androidx.lifecycle.e0<>(new SpannableString(""));

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f55510b = new androidx.lifecycle.e0<>(new SpannableString(""));

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55511c = new androidx.lifecycle.e0<>("");

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55512d = new androidx.lifecycle.e0<>(0);

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f55513e = new androidx.lifecycle.e0<>(null);

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f55514f = new androidx.lifecycle.e0<>(null);

    public final void a(SpannableString spannableString, SpannableString spannableString2, String str, int i10, Drawable drawable, Drawable drawable2) {
        jo.p.h(spannableString, "titleText");
        jo.p.h(spannableString2, "titleSubText");
        jo.p.h(str, "linkText");
        jo.p.h(drawable, "eventTitleBackground");
        jo.p.h(drawable2, "eventTitleLinkBackground");
        this.f55509a.p(spannableString);
        this.f55510b.p(spannableString2);
        this.f55511c.p(str);
        this.f55512d.p(Integer.valueOf(i10));
        this.f55513e.p(drawable);
        this.f55514f.p(drawable2);
    }

    public final androidx.lifecycle.e0<Drawable> b() {
        return this.f55513e;
    }

    public final androidx.lifecycle.e0<Drawable> c() {
        return this.f55514f;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f55511c;
    }

    public final androidx.lifecycle.e0<Integer> e() {
        return this.f55512d;
    }

    public final androidx.lifecycle.e0<SpannableString> f() {
        return this.f55510b;
    }

    public final androidx.lifecycle.e0<SpannableString> g() {
        return this.f55509a;
    }
}
