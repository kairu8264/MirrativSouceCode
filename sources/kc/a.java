package kc;

import android.content.Context;
import androidx.lifecycle.e0;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e0<Boolean> f38543a;

    /* renamed from: b  reason: collision with root package name */
    public final e0<Integer> f38544b;

    /* renamed from: c  reason: collision with root package name */
    public final e0<String> f38545c;

    /* renamed from: d  reason: collision with root package name */
    public final e0<Integer> f38546d;

    /* renamed from: e  reason: collision with root package name */
    public final e0<Integer> f38547e;

    /* renamed from: f  reason: collision with root package name */
    public final e0<Integer> f38548f;

    /* renamed from: g  reason: collision with root package name */
    public final e0<Integer> f38549g;

    /* renamed from: h  reason: collision with root package name */
    public final e0<String> f38550h;

    /* renamed from: i  reason: collision with root package name */
    public final e0<Integer> f38551i;

    /* renamed from: j  reason: collision with root package name */
    public final e0<Integer> f38552j;

    /* renamed from: k  reason: collision with root package name */
    public final e0<Integer> f38553k;

    /* renamed from: l  reason: collision with root package name */
    public final e0<Integer> f38554l;

    /* renamed from: m  reason: collision with root package name */
    public final e0<String> f38555m;

    /* renamed from: n  reason: collision with root package name */
    public final e0<Integer> f38556n;

    /* renamed from: o  reason: collision with root package name */
    public final e0<Integer> f38557o;

    /* renamed from: p  reason: collision with root package name */
    public final e0<Integer> f38558p;

    public a(e0<Boolean> e0Var, e0<Integer> e0Var2, e0<String> e0Var3, e0<Integer> e0Var4, e0<Integer> e0Var5, e0<Integer> e0Var6, e0<Integer> e0Var7, e0<String> e0Var8, e0<Integer> e0Var9, e0<Integer> e0Var10, e0<Integer> e0Var11, e0<Integer> e0Var12, e0<String> e0Var13, e0<Integer> e0Var14, e0<Integer> e0Var15, e0<Integer> e0Var16) {
        jo.p.h(e0Var, "collabEnabled");
        jo.p.h(e0Var2, "onePersonIcon");
        jo.p.h(e0Var3, "onePersonText");
        jo.p.h(e0Var4, "onePersonTextBackgroundColorResId");
        jo.p.h(e0Var5, "onePersonRippleOverlayColor");
        jo.p.h(e0Var6, "onePersonTextColor");
        jo.p.h(e0Var7, "twoPersonIcon");
        jo.p.h(e0Var8, "twoPersonText");
        jo.p.h(e0Var9, "twoPersonTextBackgroundColorResId");
        jo.p.h(e0Var10, "twoPersonTextColor");
        jo.p.h(e0Var11, "twoPersonRippleOverlayColor");
        jo.p.h(e0Var12, "threePersonIcon");
        jo.p.h(e0Var13, "threePersonText");
        jo.p.h(e0Var14, "threePersonTextBackgroundColorResId");
        jo.p.h(e0Var15, "threePersonTextColor");
        jo.p.h(e0Var16, "threePersonRippleOverlayColor");
        this.f38543a = e0Var;
        this.f38544b = e0Var2;
        this.f38545c = e0Var3;
        this.f38546d = e0Var4;
        this.f38547e = e0Var5;
        this.f38548f = e0Var6;
        this.f38549g = e0Var7;
        this.f38550h = e0Var8;
        this.f38551i = e0Var9;
        this.f38552j = e0Var10;
        this.f38553k = e0Var11;
        this.f38554l = e0Var12;
        this.f38555m = e0Var13;
        this.f38556n = e0Var14;
        this.f38557o = e0Var15;
        this.f38558p = e0Var16;
    }

    public final void a(Context context, boolean z10, int i10) {
        jo.p.h(context, "context");
        this.f38543a.p(Boolean.valueOf(z10));
        e0<String> e0Var = this.f38545c;
        int i11 = xb.r.G1;
        e0Var.p(context.getString(i11, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        this.f38550h.p(context.getString(i11, "2"));
        this.f38555m.p(context.getString(i11, "3"));
        r(i10);
    }

    public final e0<Boolean> b() {
        return this.f38543a;
    }

    public final e0<Integer> c() {
        return this.f38544b;
    }

    public final e0<Integer> d() {
        return this.f38547e;
    }

    public final e0<String> e() {
        return this.f38545c;
    }

    public final e0<Integer> f() {
        return this.f38546d;
    }

    public final e0<Integer> g() {
        return this.f38548f;
    }

    public final e0<Integer> h() {
        return this.f38554l;
    }

    public final e0<Integer> i() {
        return this.f38558p;
    }

    public final e0<String> j() {
        return this.f38555m;
    }

    public final e0<Integer> k() {
        return this.f38556n;
    }

    public final e0<Integer> l() {
        return this.f38557o;
    }

    public final e0<Integer> m() {
        return this.f38549g;
    }

    public final e0<Integer> n() {
        return this.f38553k;
    }

    public final e0<String> o() {
        return this.f38550h;
    }

    public final e0<Integer> p() {
        return this.f38551i;
    }

    public final e0<Integer> q() {
        return this.f38552j;
    }

    public final void r(int i10) {
        if (i10 == 1) {
            this.f38544b.p(Integer.valueOf(xb.n.f59955b0));
            e0<Integer> e0Var = this.f38546d;
            int i11 = xb.l.f59943n;
            e0Var.p(Integer.valueOf(i11));
            e0<Integer> e0Var2 = this.f38548f;
            int i12 = xb.l.f59952y;
            e0Var2.p(Integer.valueOf(i12));
            this.f38547e.p(Integer.valueOf(xb.l.B));
            this.f38549g.p(0);
            this.f38551i.p(Integer.valueOf(i12));
            this.f38552j.p(Integer.valueOf(i11));
            e0<Integer> e0Var3 = this.f38553k;
            int i13 = xb.l.tealish10;
            e0Var3.p(Integer.valueOf(i13));
            this.f38554l.p(0);
            this.f38556n.p(Integer.valueOf(i12));
            this.f38557o.p(Integer.valueOf(i11));
            this.f38558p.p(Integer.valueOf(i13));
        } else if (i10 != 2) {
            this.f38544b.p(0);
            e0<Integer> e0Var4 = this.f38546d;
            int i14 = xb.l.f59952y;
            e0Var4.p(Integer.valueOf(i14));
            e0<Integer> e0Var5 = this.f38548f;
            int i15 = xb.l.f59943n;
            e0Var5.p(Integer.valueOf(i15));
            e0<Integer> e0Var6 = this.f38547e;
            int i16 = xb.l.tealish10;
            e0Var6.p(Integer.valueOf(i16));
            this.f38549g.p(0);
            this.f38551i.p(Integer.valueOf(i14));
            this.f38552j.p(Integer.valueOf(i15));
            this.f38553k.p(Integer.valueOf(i16));
            this.f38554l.p(Integer.valueOf(xb.n.f59955b0));
            this.f38556n.p(Integer.valueOf(i15));
            this.f38557o.p(Integer.valueOf(i14));
            this.f38558p.p(Integer.valueOf(xb.l.B));
        } else {
            this.f38544b.p(0);
            e0<Integer> e0Var7 = this.f38546d;
            int i17 = xb.l.f59952y;
            e0Var7.p(Integer.valueOf(i17));
            e0<Integer> e0Var8 = this.f38548f;
            int i18 = xb.l.f59943n;
            e0Var8.p(Integer.valueOf(i18));
            e0<Integer> e0Var9 = this.f38547e;
            int i19 = xb.l.tealish10;
            e0Var9.p(Integer.valueOf(i19));
            this.f38549g.p(Integer.valueOf(xb.n.f59955b0));
            this.f38551i.p(Integer.valueOf(i18));
            this.f38552j.p(Integer.valueOf(i17));
            this.f38553k.p(Integer.valueOf(xb.l.B));
            this.f38554l.p(0);
            this.f38556n.p(Integer.valueOf(i17));
            this.f38557o.p(Integer.valueOf(i18));
            this.f38558p.p(Integer.valueOf(i19));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ a(androidx.lifecycle.e0 r18, androidx.lifecycle.e0 r19, androidx.lifecycle.e0 r20, androidx.lifecycle.e0 r21, androidx.lifecycle.e0 r22, androidx.lifecycle.e0 r23, androidx.lifecycle.e0 r24, androidx.lifecycle.e0 r25, androidx.lifecycle.e0 r26, androidx.lifecycle.e0 r27, androidx.lifecycle.e0 r28, androidx.lifecycle.e0 r29, androidx.lifecycle.e0 r30, androidx.lifecycle.e0 r31, androidx.lifecycle.e0 r32, androidx.lifecycle.e0 r33, int r34, jo.h r35) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.a.<init>(androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, androidx.lifecycle.e0, int, jo.h):void");
    }
}
