package ud;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes2.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55318a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55319b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55320c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f55321d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55322e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55323f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55324g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55325h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55326i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f55327j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f55328k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<q1>> f55329l;

    public p1() {
        Boolean bool = Boolean.FALSE;
        this.f55318a = new androidx.lifecycle.e0<>(bool);
        this.f55319b = new androidx.lifecycle.e0<>(bool);
        this.f55320c = new androidx.lifecycle.e0<>("");
        this.f55321d = new androidx.lifecycle.e0<>("");
        this.f55322e = new androidx.lifecycle.e0<>(0);
        this.f55323f = new androidx.lifecycle.e0<>(0);
        this.f55324g = new androidx.lifecycle.e0<>(0);
        this.f55325h = new androidx.lifecycle.e0<>(0);
        this.f55326i = new androidx.lifecycle.e0<>(0);
        this.f55327j = new androidx.lifecycle.e0<>(null);
        this.f55328k = new androidx.lifecycle.e0<>(null);
        this.f55329l = new androidx.lifecycle.e0<>(xn.s.k());
    }

    public final void a(List<q1> list, String str, String str2, boolean z10, int i10, int i11, int i12, int i13, Drawable drawable, Drawable drawable2) {
        jo.p.h(list, "rankings");
        jo.p.h(str, "rankingLink");
        jo.p.h(str2, "rankingHeaderText");
        jo.p.h(drawable, "rankingBackground");
        jo.p.h(drawable2, "rankingExpandButtonBackground");
        this.f55329l.p(list);
        this.f55318a.p(Boolean.valueOf(!list.isEmpty()));
        this.f55319b.p(Boolean.valueOf(z10));
        this.f55320c.p(str2);
        this.f55321d.p(str);
        this.f55323f.p(Integer.valueOf(i10));
        this.f55324g.p(Integer.valueOf(i11));
        this.f55325h.p(Integer.valueOf(i12));
        this.f55326i.p(Integer.valueOf(i13));
        this.f55327j.p(drawable);
        this.f55328k.p(drawable2);
    }

    public final androidx.lifecycle.e0<Integer> b() {
        return this.f55326i;
    }

    public final androidx.lifecycle.e0<Drawable> c() {
        return this.f55327j;
    }

    public final androidx.lifecycle.e0<Integer> d() {
        return this.f55323f;
    }

    public final androidx.lifecycle.e0<Drawable> e() {
        return this.f55328k;
    }

    public final androidx.lifecycle.e0<String> f() {
        return this.f55321d;
    }

    public final androidx.lifecycle.e0<Integer> g() {
        return this.f55325h;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.f55320c;
    }

    public final androidx.lifecycle.e0<List<q1>> i() {
        return this.f55329l;
    }

    public final androidx.lifecycle.e0<Boolean> j() {
        return this.f55318a;
    }

    public final androidx.lifecycle.e0<Boolean> k() {
        return this.f55319b;
    }
}
