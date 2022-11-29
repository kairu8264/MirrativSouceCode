package com.dena.mirrativ.user.mypage.passbook.contract_member;

import ad.r0;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cd.c0;
import co.l;
import com.dena.mirrativ.user.mypage.contract.ContractActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import l0.i;
import nf.k;
import od.s;
import uo.q0;
import wn.m;
import wn.v;
import xo.w;

/* loaded from: classes2.dex */
public final class ContractMemberPassBookActivity extends e.b {
    public static final a T = new a(null);
    public static final int U = 8;
    public final wn.f O;
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, ContractMemberPassBookActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<i, Integer, v> {
        public b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                hd.i.a(ContractMemberPassBookActivity.this.A3(), ContractMemberPassBookActivity.this.E3(), ContractMemberPassBookActivity.this.B3(), iVar, (k.V << 6) | 72);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookActivity$onCreate$3", f = "ContractMemberPassBookActivity.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24727w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ContractMemberPassBookActivity f24729w;

            public a(ContractMemberPassBookActivity contractMemberPassBookActivity) {
                this.f24729w = contractMemberPassBookActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                ContractMemberPassBookActivity contractMemberPassBookActivity = this.f24729w;
                ContractActivity.a aVar = ContractActivity.V;
                c0 c0Var = c0.EDIT;
                r0 f10 = contractMemberPassBookActivity.E3().i().f();
                if (f10 == null) {
                    return v.f59242a;
                }
                contractMemberPassBookActivity.startActivity(aVar.a(contractMemberPassBookActivity, c0Var, f10));
                return v.f59242a;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24727w;
            if (i10 == 0) {
                m.b(obj);
                w<v> l10 = ContractMemberPassBookActivity.this.E3().l();
                a aVar = new a(ContractMemberPassBookActivity.this);
                this.f24727w = 1;
                if (l10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24730w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24731x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24732y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24730w = componentCallbacks;
            this.f24731x = aVar;
            this.f24732y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.s, java.lang.Object] */
        @Override // io.a
        public final s invoke() {
            ComponentCallbacks componentCallbacks = this.f24730w;
            return gq.a.a(componentCallbacks).c(f0.b(s.class), this.f24731x, this.f24732y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<hd.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24733w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24734x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24733w = componentCallbacks;
            this.f24734x = aVar;
            this.f24735y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hd.e, java.lang.Object] */
        @Override // io.a
        public final hd.e invoke() {
            ComponentCallbacks componentCallbacks = this.f24733w;
            return gq.a.a(componentCallbacks).c(f0.b(hd.e.class), this.f24734x, this.f24735y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<hd.l> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24736w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24737x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24736w = componentCallbacks;
            this.f24737x = aVar;
            this.f24738y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hd.l] */
        @Override // io.a
        public final hd.l invoke() {
            ComponentCallbacks componentCallbacks = this.f24736w;
            return gq.a.a(componentCallbacks).c(f0.b(hd.l.class), this.f24737x, this.f24738y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24739w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24740x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24741y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24739w = componentCallbacks;
            this.f24740x = aVar;
            this.f24741y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f24739w;
            return gq.a.a(componentCallbacks).c(f0.b(k.class), this.f24740x, this.f24741y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24742w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24743x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24744y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24742w = componentCallbacks;
            this.f24743x = aVar;
            this.f24744y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24742w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24743x, this.f24744y);
        }
    }

    public ContractMemberPassBookActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O = wn.g.b(iVar, new d(this, null, null));
        this.P = wn.g.b(iVar, new e(this, null, null));
        this.Q = wn.g.b(iVar, new f(this, null, null));
        this.R = wn.g.b(iVar, new g(this, null, null));
        this.S = wn.g.b(iVar, new h(this, null, null));
    }

    public final hd.e A3() {
        return (hd.e) this.P.getValue();
    }

    public final k B3() {
        return (k) this.R.getValue();
    }

    public final s C3() {
        return (s) this.O.getValue();
    }

    public final MRLogger D3() {
        return (MRLogger) this.S.getValue();
    }

    public final hd.l E3() {
        return (hd.l) this.Q.getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MRLogger D3 = D3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CASH_BONUS_HISTORY_IMP);
        builder.setTargetId(MRLog.TARGET_ID_IMP);
        D3.sendLog(builder.build());
        a.a.b(this, null, s0.c.c(-1429962662, true, new b()), 1, null);
        uo.l.d(androidx.lifecycle.v.a(this), null, null, new c(null), 3, null);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        C3().g();
        super.onResume();
    }
}
