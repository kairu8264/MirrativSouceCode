package com.dena.mirrativ.user.mypage.passbook.coin;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.o;
import java.io.Serializable;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nf.o;
import vb.i;
import wn.f;
import wn.g;
import wn.v;
import yd.t1;

/* loaded from: classes2.dex */
public final class CoinPassbookActivity extends e.b implements i {
    public static final a R = new a(null);
    public static final int S = 8;
    public final f O;
    public final f P;
    public final f Q;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, CoinPassbookActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CoinPassbookActivity f24716w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CoinPassbookActivity coinPassbookActivity) {
                super(0);
                this.f24716w = coinPassbookActivity;
            }

            public final void a() {
                this.f24716w.B3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public b() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                gd.f.a(new a(CoinPassbookActivity.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<gd.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24717w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24718x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24719y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24717w = componentCallbacks;
            this.f24718x = aVar;
            this.f24719y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gd.c, java.lang.Object] */
        @Override // io.a
        public final gd.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24717w;
            return gq.a.a(componentCallbacks).c(f0.b(gd.c.class), this.f24718x, this.f24719y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24720w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24721x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24722y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24720w = componentCallbacks;
            this.f24721x = aVar;
            this.f24722y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f24720w;
            return gq.a.a(componentCallbacks).c(f0.b(o.class), this.f24721x, this.f24722y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24723w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24724x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24725y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24723w = componentCallbacks;
            this.f24724x = aVar;
            this.f24725y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24723w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f24724x, this.f24725y);
        }
    }

    public CoinPassbookActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O = g.b(iVar, new c(this, null, null));
        this.P = g.b(iVar, new d(this, null, null));
        this.Q = g.b(iVar, new e(this, null, null));
    }

    public final tb.c A3() {
        return (tb.c) this.Q.getValue();
    }

    public final void B3() {
        if (p.c(z3().H().f(), Boolean.TRUE)) {
            t1.a aVar = t1.f61795x;
            String string = getString(nc.i.C4);
            p.g(string, "getString(R.string.text_…available_with_live_play)");
            aVar.a(this, string);
            return;
        }
        tb.a C = A3().C("passbook_coin");
        C.a().z3(a3(), C.b());
    }

    @Override // vb.i
    public void J1() {
        if (g().b() != o.c.RESUMED) {
            return;
        }
        tb.a b10 = A3().b();
        b10.a().z3(a3(), b10.b());
    }

    @Override // vb.i
    public void n1() {
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a.b(this, null, s0.c.c(1385349060, true, new b()), 1, null);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        y3().h();
        y3().e();
    }

    @Override // vb.i
    public void x(Serializable serializable) {
        p.h(serializable, "posssessionCoin");
        y3().h();
    }

    public final gd.c y3() {
        return (gd.c) this.O.getValue();
    }

    public final nf.o z3() {
        return (nf.o) this.P.getValue();
    }
}
