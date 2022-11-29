package com.dena.mirrativ.user.mypage.contract;

import ad.a1;
import ad.k1;
import ad.r0;
import ad.u0;
import ad.w0;
import ad.y1;
import ad.z1;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import cd.c0;
import cd.v;
import da.j;
import java.io.Serializable;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import uo.q0;
import wn.k;

/* loaded from: classes2.dex */
public final class ContractActivity extends e.b implements q0 {
    public static final a V = new a(null);
    public static final int W = 8;
    public pc.c P;
    public y1 U;
    public final /* synthetic */ j O = new j();
    public final wn.f Q = wn.g.a(new i());
    public final wn.f R = wn.g.a(new d());
    public final wn.f S = wn.g.a(new c());
    public final wn.f T = wn.g.b(wn.i.SYNCHRONIZED, new h(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ Intent e(a aVar, Context context, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.d(context, str, z10);
        }

        public final Intent a(Context context, c0 c0Var, r0 r0Var) {
            p.h(context, "context");
            p.h(c0Var, "editBankAccountType");
            p.h(r0Var, "bindModel");
            Intent putExtra = new Intent(context, ContractActivity.class).putExtra("EXTRA_BANK_ACCOUNT_BIND_MODEL", r0Var).putExtra("EXTRA_TRANSITION", ub.a.EDIT_BANK_ACCOUNT).putExtra("EXTRA_EDIT_BANK_ACCOUNT_TYPE", c0Var);
            p.g(putExtra, "Intent(context, Contract…YPE, editBankAccountType)");
            return putExtra;
        }

        public final Intent b(Context context, c0 c0Var, u0 u0Var) {
            p.h(context, "context");
            p.h(c0Var, "editIdentificationType");
            p.h(u0Var, "bindModel");
            Intent putExtra = new Intent(context, ContractActivity.class).putExtra("EXTRA_IDENTIFICATION_BIND_MODEL", u0Var).putExtra("EXTRA_TRANSITION", ub.a.EDIT_IDENTIFICATION).putExtra("EXTRA_EDIT_IDENTIFICATION_TYPE", c0Var);
            p.g(putExtra, "Intent(context, Contract…, editIdentificationType)");
            return putExtra;
        }

        public final Intent c(Context context, ub.a aVar) {
            p.h(context, "context");
            p.h(aVar, "transition");
            Intent intent = new Intent(context, ContractActivity.class);
            intent.putExtra("EXTRA_TRANSITION", aVar);
            return intent;
        }

        public final Intent d(Context context, String str, boolean z10) {
            p.h(context, "context");
            p.h(str, "url");
            Intent putExtra = new Intent(context, ContractActivity.class).putExtra("EXTRA_KYC_URL", str).putExtra("EXTRA_TRANSITION", ub.a.SUBMISSION_IDENTIFICATION).putExtra("EXTRA_SUBMIT_IDENTIFICATION_IS_EDIT", z10);
            p.g(putExtra, "Intent(context, Contract…FICATION_IS_EDIT, isEdit)");
            return putExtra;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24664a;

        static {
            int[] iArr = new int[ub.a.values().length];
            iArr[ub.a.DETAIL.ordinal()] = 1;
            iArr[ub.a.COMPLETE.ordinal()] = 2;
            iArr[ub.a.EDIT_IDENTIFICATION.ordinal()] = 3;
            iArr[ub.a.EDIT_BANK_ACCOUNT.ordinal()] = 4;
            iArr[ub.a.SUBMISSION_IDENTIFICATION.ordinal()] = 5;
            f24664a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<r0> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final r0 invoke() {
            Parcelable parcelableExtra = ContractActivity.this.getIntent().getParcelableExtra("EXTRA_BANK_ACCOUNT_BIND_MODEL");
            if (parcelableExtra instanceof r0) {
                return (r0) parcelableExtra;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<u0> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            Parcelable parcelableExtra = ContractActivity.this.getIntent().getParcelableExtra("EXTRA_IDENTIFICATION_BIND_MODEL");
            if (parcelableExtra instanceof u0) {
                return (u0) parcelableExtra;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24667w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f24667w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24667w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24668w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24669x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24670y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24671z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24668w = aVar;
            this.f24669x = aVar2;
            this.f24670y = aVar3;
            this.f24671z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24668w;
            vq.a aVar2 = this.f24669x;
            io.a aVar3 = this.f24670y;
            xq.a aVar4 = this.f24671z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(y1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24672w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f24672w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f24672w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<w0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24673w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24674x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24675y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24673w = componentCallbacks;
            this.f24674x = aVar;
            this.f24675y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ad.w0, java.lang.Object] */
        @Override // io.a
        public final w0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24673w;
            return gq.a.a(componentCallbacks).c(f0.b(w0.class), this.f24674x, this.f24675y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<ub.a> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ub.a invoke() {
            Serializable serializableExtra = ContractActivity.this.getIntent().getSerializableExtra("EXTRA_TRANSITION");
            p.f(serializableExtra, "null cannot be cast to non-null type com.dena.mirrativ.router.contract.ContractTransition");
            return (ub.a) serializableExtra;
        }
    }

    public final ub.a A3() {
        return (ub.a) this.Q.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        k a10;
        String stringExtra;
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_contract);
        p.g(g10, "setContentView(this, R.layout.activity_contract)");
        this.P = (pc.c) g10;
        int i10 = b.f24664a[A3().ordinal()];
        if (i10 == 1) {
            a10 = wn.q.a(k1.C0.a(), "ContractDetailFragment");
        } else if (i10 == 2) {
            a10 = wn.q.a(a1.a.b(a1.f951z0, false, 1, null), "ContractCompeteFragment");
        } else if (i10 == 3) {
            u0 z32 = z3();
            Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_EDIT_IDENTIFICATION_TYPE");
            c0 c0Var = serializableExtra instanceof c0 ? (c0) serializableExtra : null;
            if (z32 != null && c0Var != null) {
                a10 = wn.q.a(v.B0.a(z32, c0Var), "ContractEditIdentificationFragment");
            }
            a10 = null;
        } else if (i10 != 4) {
            if (i10 == 5 && (stringExtra = getIntent().getStringExtra("EXTRA_KYC_URL")) != null) {
                a10 = wn.q.a(z1.f1426y0.a(stringExtra, getIntent().getBooleanExtra("EXTRA_SUBMIT_IDENTIFICATION_IS_EDIT", true)), "ContractSubmitIdentificationDocumentFragment");
            }
            a10 = null;
        } else {
            r0 y32 = y3();
            Serializable serializableExtra2 = getIntent().getSerializableExtra("EXTRA_EDIT_BANK_ACCOUNT_TYPE");
            c0 c0Var2 = serializableExtra2 instanceof c0 ? (c0) serializableExtra2 : null;
            if (y32 != null && c0Var2 != null) {
                a10 = wn.q.a(cd.k.B0.a(y32, c0Var2), "ContractEditBankAccountFragment");
            }
            a10 = null;
        }
        if (a10 != null) {
            Fragment fragment = (Fragment) a10.a();
            String str = (String) a10.b();
            z k10 = a3().k();
            pc.c cVar = this.P;
            if (cVar == null) {
                p.v("binding");
                cVar = null;
            }
            k10.r(cVar.B.getId(), fragment).g(str).i();
        }
        this.U = (y1) ((androidx.lifecycle.q0) new s0(f0.b(y1.class), new g(this), new f(new e(this), null, null, gq.a.a(this))).getValue());
        x3().c("");
    }

    public final w0 x3() {
        return (w0) this.T.getValue();
    }

    public final r0 y3() {
        return (r0) this.S.getValue();
    }

    public final u0 z3() {
        return (u0) this.R.getValue();
    }
}
