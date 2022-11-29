package com.dena.mirrorman;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import jo.f0;
import jo.h;
import jo.q;
import od.p;
import oq.a;
import so.n;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class ControlReceiver extends BroadcastReceiver implements oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final f f25060w;

    /* renamed from: x  reason: collision with root package name */
    public final f f25061x;

    /* renamed from: y  reason: collision with root package name */
    public final f f25062y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f25059z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25063w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25064x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25065y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25063w = aVar;
            this.f25064x = aVar2;
            this.f25065y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f25063w;
            vq.a aVar2 = this.f25064x;
            io.a<? extends uq.a> aVar3 = this.f25065y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25066w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25067x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25068y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25066w = aVar;
            this.f25067x = aVar2;
            this.f25068y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final p invoke() {
            xq.a b10;
            oq.a aVar = this.f25066w;
            vq.a aVar2 = this.f25067x;
            io.a<? extends uq.a> aVar3 = this.f25068y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(p.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25069w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25070x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25071y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25069w = aVar;
            this.f25070x = aVar2;
            this.f25071y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f25069w;
            vq.a aVar2 = this.f25070x;
            io.a<? extends uq.a> aVar3 = this.f25071y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.b.class), aVar2, aVar3);
        }
    }

    public ControlReceiver() {
        cr.a aVar = cr.a.f28611a;
        this.f25060w = g.b(aVar.b(), new b(this, null, null));
        this.f25061x = g.b(aVar.b(), new c(this, null, null));
        this.f25062y = g.b(aVar.b(), new d(this, null, null));
    }

    public final od.b a() {
        return (od.b) this.f25062y.getValue();
    }

    public final p b() {
        return (p) this.f25061x.getValue();
    }

    public final tb.c c() {
        return (tb.c) this.f25060w.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        jo.p.h(context, "context");
        jo.p.h(intent, "intent");
        String action = intent.getAction();
        if (n.q("cast_control", action, true)) {
            a().T();
        } else if (n.q("play_live_control", action, true)) {
            b().A();
        } else if (n.q("play_vod_control", action, true)) {
            context.stopService(c().b0(context));
        }
    }
}
