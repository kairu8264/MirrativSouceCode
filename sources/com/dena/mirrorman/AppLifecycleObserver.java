package com.dena.mirrorman;

import androidx.lifecycle.g0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import jo.f0;
import jo.q;
import kf.x;
import oq.a;
import pd.s;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class AppLifecycleObserver implements t, oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final f f25037w;

    /* renamed from: x  reason: collision with root package name */
    public final f f25038x;

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25039w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25040x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25041y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25039w = aVar;
            this.f25040x = aVar2;
            this.f25041y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            xq.a b10;
            oq.a aVar = this.f25039w;
            vq.a aVar2 = this.f25040x;
            io.a<? extends uq.a> aVar3 = this.f25041y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(x.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<q8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25042w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25043x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25044y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25042w = aVar;
            this.f25043x = aVar2;
            this.f25044y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q8.a] */
        @Override // io.a
        public final q8.a invoke() {
            xq.a b10;
            oq.a aVar = this.f25042w;
            vq.a aVar2 = this.f25043x;
            io.a<? extends uq.a> aVar3 = this.f25044y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(q8.a.class), aVar2, aVar3);
        }
    }

    public AppLifecycleObserver() {
        cr.a aVar = cr.a.f28611a;
        this.f25037w = g.b(aVar.b(), new a(this, null, null));
        this.f25038x = g.b(aVar.b(), new b(this, null, null));
    }

    public final q8.a a() {
        return (q8.a) this.f25038x.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final x j() {
        return (x) this.f25037w.getValue();
    }

    @g0(o.b.ON_CREATE)
    public final void onAppCreate() {
    }

    @g0(o.b.ON_DESTROY)
    public final void onAppDestroy() {
    }

    @g0(o.b.ON_PAUSE)
    public final void onAppPause() {
        a().a(new s.b(false));
    }

    @g0(o.b.ON_RESUME)
    public final void onAppResume() {
        a().a(new s.b(true));
    }

    @g0(o.b.ON_START)
    public final void onAppStart() {
    }

    @g0(o.b.ON_STOP)
    public final void onAppStop() {
        g9.a.g("AppLifecycleObserver onAppStop");
        j().r5(false);
    }
}
