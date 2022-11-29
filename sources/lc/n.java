package lc;

import androidx.lifecycle.LiveData;
import java.util.List;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final LiveData<Boolean> f39925a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39926b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39927c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39928d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39929e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39930f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39931g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39932h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f39933i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<o0>> f39934j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f39935k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39936l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f39937m;

    /* renamed from: n  reason: collision with root package name */
    public final LiveData<String> f39938n;

    /* renamed from: o  reason: collision with root package name */
    public final LiveData<Integer> f39939o;

    /* renamed from: p  reason: collision with root package name */
    public final LiveData<Integer> f39940p;

    /* renamed from: q  reason: collision with root package name */
    public final LiveData<Boolean> f39941q;

    /* loaded from: classes2.dex */
    public static final class a<I, O> implements n.a {
        @Override // n.a
        public final String apply(String str) {
            String str2 = str;
            StringBuilder sb2 = new StringBuilder();
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(de.l.a(str2));
            sb2.append("/40");
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<I, O> implements n.a {
        @Override // n.a
        public final Integer apply(Boolean bool) {
            Boolean bool2 = bool;
            jo.p.g(bool2, "it");
            return Integer.valueOf(bool2.booleanValue() ? xb.n.ic_twitter_active : xb.n.ic_twitter_white);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<I, O> implements n.a {
        @Override // n.a
        public final Integer apply(Boolean bool) {
            Boolean bool2 = bool;
            jo.p.g(bool2, "it");
            return Integer.valueOf(bool2.booleanValue() ? xb.l.f59950w : xb.l.f59952y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(String str) {
            String str2 = str;
            return Boolean.valueOf(str2 == null || str2.length() == 0);
        }
    }

    public n(LiveData<Boolean> liveData, androidx.lifecycle.e0<String> e0Var, androidx.lifecycle.e0<String> e0Var2, androidx.lifecycle.e0<String> e0Var3, androidx.lifecycle.e0<String> e0Var4, androidx.lifecycle.e0<String> e0Var5, androidx.lifecycle.e0<String> e0Var6, androidx.lifecycle.e0<String> e0Var7, androidx.lifecycle.e0<Boolean> e0Var8, androidx.lifecycle.e0<List<o0>> e0Var9, androidx.lifecycle.e0<Boolean> e0Var10, androidx.lifecycle.e0<String> e0Var11, androidx.lifecycle.e0<String> e0Var12) {
        jo.p.h(liveData, "catalogEmomoEnabled");
        jo.p.h(e0Var, "appImageUrl");
        jo.p.h(e0Var2, "title");
        jo.p.h(e0Var3, "thumbnailImageUrl");
        jo.p.h(e0Var4, "thumbnailLeftTopImageUrl");
        jo.p.h(e0Var5, "thumbnailRightBottomImageUrl");
        jo.p.h(e0Var6, "thumbnailRightBottomAnimationImageUrl");
        jo.p.h(e0Var7, "avatarBodyImageUrl");
        jo.p.h(e0Var8, "isEnabledStreamingStartTweet");
        jo.p.h(e0Var9, "thumbnailFrameBindModels");
        jo.p.h(e0Var10, "isEnabledOmotenashiLive");
        jo.p.h(e0Var11, "omotenashiLiveNoticeText");
        jo.p.h(e0Var12, "omotenashiLpUrl");
        this.f39925a = liveData;
        this.f39926b = e0Var;
        this.f39927c = e0Var2;
        this.f39928d = e0Var3;
        this.f39929e = e0Var4;
        this.f39930f = e0Var5;
        this.f39931g = e0Var6;
        this.f39932h = e0Var7;
        this.f39933i = e0Var8;
        this.f39934j = e0Var9;
        this.f39935k = e0Var10;
        this.f39936l = e0Var11;
        this.f39937m = e0Var12;
        LiveData<String> b10 = androidx.lifecycle.p0.b(e0Var2, new a());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.f39938n = b10;
        LiveData<Integer> b11 = androidx.lifecycle.p0.b(e0Var8, new b());
        jo.p.g(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.f39939o = b11;
        LiveData<Integer> b12 = androidx.lifecycle.p0.b(e0Var8, new c());
        jo.p.g(b12, "crossinline transform: (…p(this) { transform(it) }");
        this.f39940p = b12;
        LiveData<Boolean> b13 = androidx.lifecycle.p0.b(e0Var, new d());
        jo.p.g(b13, "crossinline transform: (…p(this) { transform(it) }");
        this.f39941q = b13;
    }

    public final androidx.lifecycle.e0<String> a() {
        return this.f39926b;
    }

    public final androidx.lifecycle.e0<String> b() {
        return this.f39932h;
    }

    public final LiveData<Boolean> c() {
        return this.f39925a;
    }

    public final androidx.lifecycle.e0<String> d() {
        return this.f39936l;
    }

    public final androidx.lifecycle.e0<String> e() {
        return this.f39937m;
    }

    public final androidx.lifecycle.e0<List<o0>> f() {
        return this.f39934j;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.f39928d;
    }

    public final androidx.lifecycle.e0<String> h() {
        return this.f39929e;
    }

    public final androidx.lifecycle.e0<String> i() {
        return this.f39931g;
    }

    public final androidx.lifecycle.e0<String> j() {
        return this.f39930f;
    }

    public final androidx.lifecycle.e0<String> k() {
        return this.f39927c;
    }

    public final LiveData<String> l() {
        return this.f39938n;
    }

    public final LiveData<Integer> m() {
        return this.f39939o;
    }

    public final LiveData<Integer> n() {
        return this.f39940p;
    }

    public final androidx.lifecycle.e0<Boolean> o() {
        return this.f39935k;
    }

    public final androidx.lifecycle.e0<Boolean> p() {
        return this.f39933i;
    }

    public final LiveData<Boolean> q() {
        return this.f39941q;
    }

    public /* synthetic */ n(LiveData liveData, androidx.lifecycle.e0 e0Var, androidx.lifecycle.e0 e0Var2, androidx.lifecycle.e0 e0Var3, androidx.lifecycle.e0 e0Var4, androidx.lifecycle.e0 e0Var5, androidx.lifecycle.e0 e0Var6, androidx.lifecycle.e0 e0Var7, androidx.lifecycle.e0 e0Var8, androidx.lifecycle.e0 e0Var9, androidx.lifecycle.e0 e0Var10, androidx.lifecycle.e0 e0Var11, androidx.lifecycle.e0 e0Var12, int i10, jo.h hVar) {
        this(liveData, (i10 & 2) != 0 ? new androidx.lifecycle.e0(null) : e0Var, (i10 & 4) != 0 ? new androidx.lifecycle.e0(null) : e0Var2, (i10 & 8) != 0 ? new androidx.lifecycle.e0(null) : e0Var3, (i10 & 16) != 0 ? new androidx.lifecycle.e0(null) : e0Var4, (i10 & 32) != 0 ? new androidx.lifecycle.e0(null) : e0Var5, (i10 & 64) != 0 ? new androidx.lifecycle.e0(null) : e0Var6, (i10 & 128) != 0 ? new androidx.lifecycle.e0(null) : e0Var7, (i10 & 256) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var8, (i10 & 512) != 0 ? new androidx.lifecycle.e0(xn.s.k()) : e0Var9, (i10 & 1024) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var10, (i10 & 2048) != 0 ? new androidx.lifecycle.e0(null) : e0Var11, (i10 & 4096) != 0 ? new androidx.lifecycle.e0(null) : e0Var12);
    }
}
