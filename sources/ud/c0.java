package ud;

import android.graphics.Color;
import android.text.SpannableString;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserDetail;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f54807a = new androidx.lifecycle.e0<>(new SpannableString(""));

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54808b = new androidx.lifecycle.e0<>("");

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54809c = new androidx.lifecycle.e0<>("");

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54810d = new androidx.lifecycle.e0<>("");

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f54811e = new androidx.lifecycle.e0<>(new SpannableString(""));

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54812f = new androidx.lifecycle.e0<>("");

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54813g = new androidx.lifecycle.e0<>("");

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54814h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54815i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54816j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54817k;

    public c0() {
        Boolean bool = Boolean.FALSE;
        this.f54814h = new androidx.lifecycle.e0<>(bool);
        this.f54815i = new androidx.lifecycle.e0<>(bool);
        this.f54816j = new androidx.lifecycle.e0<>(bool);
        this.f54817k = new androidx.lifecycle.e0<>(0);
    }

    public final void a(EmomoRunEventResponse emomoRunEventResponse, SpannableString spannableString, String str) {
        Boolean bool;
        Boolean bool2;
        jo.p.h(emomoRunEventResponse, "emomoRunEvent");
        jo.p.h(spannableString, "rankText");
        jo.p.h(str, "pointText");
        androidx.lifecycle.e0<Integer> e0Var = this.f54817k;
        jo.i0 i0Var = jo.i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format, "format(format, *args)");
        e0Var.p(Integer.valueOf(Color.parseColor(format)));
        EmomoRunUserDetail rankReward = emomoRunEventResponse.getRankReward();
        this.f54814h.p(Boolean.valueOf(!rankReward.isBanned()));
        this.f54808b.p(rankReward.getIconUrl());
        this.f54809c.p(rankReward.getBadgeImageUrl());
        this.f54810d.p(rankReward.getLabelImageUrl());
        this.f54811e.p(spannableString);
        this.f54812f.p(rankReward.getName());
        this.f54813g.p(str);
        androidx.lifecycle.e0<Boolean> e0Var2 = this.f54815i;
        String f10 = this.f54809c.f();
        if (f10 != null) {
            jo.p.g(f10, "value");
            bool = Boolean.valueOf(!so.n.r(f10));
        } else {
            bool = Boolean.FALSE;
        }
        e0Var2.p(bool);
        androidx.lifecycle.e0<Boolean> e0Var3 = this.f54816j;
        String f11 = this.f54810d.f();
        if (f11 != null) {
            jo.p.g(f11, "value");
            bool2 = Boolean.valueOf(!so.n.r(f11));
        } else {
            bool2 = Boolean.FALSE;
        }
        e0Var3.p(bool2);
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.f54810d;
    }

    public final androidx.lifecycle.e0<Integer> c() {
        return this.f54817k;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f54809c;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.f54808b;
    }

    public final androidx.lifecycle.e0<String> f() {
        return this.f54812f;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.f54813g;
    }

    public final androidx.lifecycle.e0<SpannableString> h() {
        return this.f54811e;
    }

    public final androidx.lifecycle.e0<Boolean> i() {
        return this.f54816j;
    }

    public final androidx.lifecycle.e0<Boolean> j() {
        return this.f54815i;
    }

    public final androidx.lifecycle.e0<Boolean> k() {
        return this.f54814h;
    }
}
