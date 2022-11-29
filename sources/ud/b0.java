package ud;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserDetail;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54757a = new androidx.lifecycle.e0<>("");

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54758b = new androidx.lifecycle.e0<>("");

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54759c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54760d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54761e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54762f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54763g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f54764h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54765i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54766j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54767k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54768l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54769m;

    /* renamed from: n  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54770n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54771o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54772p;

    /* renamed from: q  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54773q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54774r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54775s;

    public b0() {
        Boolean bool = Boolean.FALSE;
        this.f54759c = new androidx.lifecycle.e0<>(bool);
        this.f54760d = new androidx.lifecycle.e0<>("");
        this.f54761e = new androidx.lifecycle.e0<>("");
        this.f54762f = new androidx.lifecycle.e0<>("");
        this.f54763g = new androidx.lifecycle.e0<>("");
        this.f54764h = new androidx.lifecycle.e0<>(new SpannableString(""));
        this.f54765i = new androidx.lifecycle.e0<>("");
        this.f54766j = new androidx.lifecycle.e0<>("");
        this.f54767k = new androidx.lifecycle.e0<>(bool);
        this.f54768l = new androidx.lifecycle.e0<>(bool);
        this.f54769m = new androidx.lifecycle.e0<>(bool);
        this.f54770n = new androidx.lifecycle.e0<>(0);
        this.f54771o = new androidx.lifecycle.e0<>(0);
        this.f54772p = new androidx.lifecycle.e0<>(null);
        this.f54773q = new androidx.lifecycle.e0<>(null);
        this.f54774r = new androidx.lifecycle.e0<>(null);
        this.f54775s = new androidx.lifecycle.e0<>(null);
    }

    public final void a(EmomoRunEventResponse emomoRunEventResponse, SpannableString spannableString, String str) {
        Boolean bool;
        Boolean bool2;
        jo.p.h(emomoRunEventResponse, "emomoRunEvent");
        jo.p.h(spannableString, "rankText");
        jo.p.h(str, "pointText");
        this.f54759c.p(Boolean.TRUE);
        this.f54757a.p(emomoRunEventResponse.getImageUrl());
        this.f54758b.p(emomoRunEventResponse.getFooterImageUrl());
        androidx.lifecycle.e0<Integer> e0Var = this.f54770n;
        jo.i0 i0Var = jo.i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format, "format(format, *args)");
        e0Var.p(Integer.valueOf(Color.parseColor(format)));
        androidx.lifecycle.e0<Integer> e0Var2 = this.f54771o;
        String format2 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getSeparatorColor()}, 1));
        jo.p.g(format2, "format(format, *args)");
        e0Var2.p(Integer.valueOf(Color.parseColor(format2)));
        EmomoRunUserDetail rankReward = emomoRunEventResponse.getRankReward();
        this.f54767k.p(Boolean.valueOf(!rankReward.isBanned()));
        this.f54760d.p(rankReward.getIconUrl());
        this.f54761e.p(rankReward.getBadgeImageUrl());
        this.f54762f.p(rankReward.getLabelImageUrl());
        this.f54764h.p(spannableString);
        this.f54765i.p(rankReward.getName());
        this.f54766j.p(str);
        androidx.lifecycle.e0<Boolean> e0Var3 = this.f54768l;
        String f10 = this.f54761e.f();
        if (f10 != null) {
            jo.p.g(f10, "value");
            bool = Boolean.valueOf(!so.n.r(f10));
        } else {
            bool = Boolean.FALSE;
        }
        e0Var3.p(bool);
        androidx.lifecycle.e0<Boolean> e0Var4 = this.f54769m;
        String f11 = this.f54762f.f();
        if (f11 != null) {
            jo.p.g(f11, "value");
            bool2 = Boolean.valueOf(!so.n.r(f11));
        } else {
            bool2 = Boolean.FALSE;
        }
        e0Var4.p(bool2);
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.f54762f;
    }

    public final androidx.lifecycle.e0<Drawable> c() {
        return this.f54772p;
    }

    public final androidx.lifecycle.e0<Drawable> d() {
        return this.f54773q;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.f54758b;
    }

    public final androidx.lifecycle.e0<Integer> f() {
        return this.f54770n;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.f54757a;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.f54761e;
    }

    public final androidx.lifecycle.e0<String> i() {
        return this.f54760d;
    }

    public final androidx.lifecycle.e0<String> j() {
        return this.f54765i;
    }

    public final androidx.lifecycle.e0<String> k() {
        return this.f54766j;
    }

    public final androidx.lifecycle.e0<SpannableString> l() {
        return this.f54764h;
    }

    public final androidx.lifecycle.e0<Integer> m() {
        return this.f54771o;
    }

    public final androidx.lifecycle.e0<Boolean> n() {
        return this.f54769m;
    }

    public final androidx.lifecycle.e0<Boolean> o() {
        return this.f54759c;
    }

    public final androidx.lifecycle.e0<Boolean> p() {
        return this.f54768l;
    }

    public final androidx.lifecycle.e0<Boolean> q() {
        return this.f54767k;
    }

    public final void r(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        jo.p.h(drawable, "eventInfoBackground");
        jo.p.h(drawable2, "eventInfoHeaderBackground");
        jo.p.h(drawable3, "nextScoreRewardScoreBackground");
        jo.p.h(drawable4, "nextScoreRewardScoreForeground");
        this.f54772p.p(drawable);
        this.f54773q.p(drawable2);
        this.f54774r.p(drawable3);
        this.f54775s.p(drawable4);
    }
}
