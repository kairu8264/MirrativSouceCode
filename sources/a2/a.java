package a2;

import com.dena.mirrorman.clientlog.logs.LogBase;
import java.util.Locale;
import jo.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f361a;

    public a(Locale locale, CharSequence charSequence) {
        p.h(locale, LogBase.LOCALE);
        p.h(charSequence, "text");
        this.f361a = new b(charSequence, 0, charSequence.length(), locale);
    }

    public final int a(int i10) {
        int d10;
        if (this.f361a.i(this.f361a.n(i10))) {
            d10 = this.f361a.g(i10);
        } else {
            d10 = this.f361a.d(i10);
        }
        return d10 == -1 ? i10 : d10;
    }

    public final int b(int i10) {
        int e10;
        if (this.f361a.k(this.f361a.o(i10))) {
            e10 = this.f361a.f(i10);
        } else {
            e10 = this.f361a.e(i10);
        }
        return e10 == -1 ? i10 : e10;
    }
}
