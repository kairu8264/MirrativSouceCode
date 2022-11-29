package com.dena.mirrativ.user.mypage.contract;

import ad.n2;
import ad.q2;
import ad.r0;
import ad.s2;
import ad.t2;
import ad.u2;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.a;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cd.c0;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusActivity;
import java.io.Serializable;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import kq.a;
import nc.j;
import wn.g;
import wn.i;
import wn.v;

/* loaded from: classes2.dex */
public final class SelectReceiveCashBonusActivity extends e.b {
    public static final a R = new a(null);
    public static final int S = 8;
    public final wn.f O = g.b(i.SYNCHRONIZED, new c(this, null, null));
    public final wn.f P = new s0(f0.b(u2.class), new f(this), new e(new d(this), null, null, gq.a.a(this)));
    public final androidx.activity.result.c<Intent> Q;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, SelectReceiveCashBonusActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes2.dex */
        public static final class a implements s2 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SelectReceiveCashBonusActivity f24681a;

            public a(SelectReceiveCashBonusActivity selectReceiveCashBonusActivity) {
                this.f24681a = selectReceiveCashBonusActivity;
            }

            public static final void e(DialogInterface dialogInterface, int i10) {
            }

            @Override // ad.s2
            public void a() {
                this.f24681a.finish();
            }

            @Override // ad.s2
            public void b(r0 r0Var) {
                p.h(r0Var, "bindModel");
                this.f24681a.Q.a(ContractActivity.V.a(this.f24681a, c0.REGISTER, r0Var));
            }

            @Override // ad.s2
            public void c(String str) {
                p.h(str, "message");
                new a.C0045a(this.f24681a, j.ContractAlertDialog).g(str).setPositiveButton(nc.i.E4, q2.f1274w).create().show();
            }
        }

        public b() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                t2.a(SelectReceiveCashBonusActivity.this.B3(), SelectReceiveCashBonusActivity.this.C3(), new a(SelectReceiveCashBonusActivity.this), iVar, 72);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<n2> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24682w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24683x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24684y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24682w = componentCallbacks;
            this.f24683x = aVar;
            this.f24684y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ad.n2] */
        @Override // io.a
        public final n2 invoke() {
            ComponentCallbacks componentCallbacks = this.f24682w;
            return gq.a.a(componentCallbacks).c(f0.b(n2.class), this.f24683x, this.f24684y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24685w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f24685w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24685w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24687x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24688y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24689z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24686w = aVar;
            this.f24687x = aVar2;
            this.f24688y = aVar3;
            this.f24689z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24686w;
            vq.a aVar2 = this.f24687x;
            io.a aVar3 = this.f24688y;
            xq.a aVar4 = this.f24689z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(u2.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24690w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f24690w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24690w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    public SelectReceiveCashBonusActivity() {
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: ad.p2
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                SelectReceiveCashBonusActivity.D3(SelectReceiveCashBonusActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul…ityResult\n        )\n    }");
        this.Q = V2;
    }

    public static final void D3(SelectReceiveCashBonusActivity selectReceiveCashBonusActivity, androidx.activity.result.a aVar) {
        p.h(selectReceiveCashBonusActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        n2 B3 = selectReceiveCashBonusActivity.B3();
        Intent a10 = aVar.a();
        Serializable serializableExtra = a10 != null ? a10.getSerializableExtra("RESULT_EDIT_BANK_ACCOUNT_KYC_INFO") : null;
        KycInfo kycInfo = serializableExtra instanceof KycInfo ? (KycInfo) serializableExtra : null;
        if (kycInfo == null) {
            return;
        }
        B3.d(kycInfo);
    }

    public final n2 B3() {
        return (n2) this.O.getValue();
    }

    public final u2 C3() {
        return (u2) this.P.getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a.b(this, null, s0.c.c(783999291, true, new b()), 1, null);
    }
}
