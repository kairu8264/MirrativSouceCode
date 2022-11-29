package com.dena.mirrativ.catalog.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import c9.b0;
import c9.u;
import java.io.Serializable;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import kq.a;
import r8.f1;
import t8.i;
import wn.f;
import y4.e;

/* loaded from: classes.dex */
public final class SearchActivity extends e.b {
    public static final a Q = new a(null);
    public static final int R = 8;
    public i O;
    public final f P = new s0(f0.b(b0.class), new d(this), new c(new b(this), null, null, gq.a.a(this)));

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, u uVar, String str, String str2) {
            p.h(context, "context");
            Intent intent = new Intent(context, SearchActivity.class);
            intent.putExtra("EXTRA_INDEX", uVar);
            intent.putExtra("EXTRA_KEYWORD", str);
            intent.putExtra("EXTRA_APP_ID", str2);
            intent.addFlags(67108864);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20715w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f20715w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f20715w;
            return c0552a.b(componentActivity, componentActivity instanceof e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20716w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20717x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20718y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20719z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20716w = aVar;
            this.f20717x = aVar2;
            this.f20718y = aVar3;
            this.f20719z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20716w;
            vq.a aVar2 = this.f20717x;
            io.a aVar3 = this.f20718y;
            xq.a aVar4 = this.f20719z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(b0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20720w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f20720w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f20720w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, f1.activity_search);
        p.g(g10, "setContentView(this, R.layout.activity_search)");
        this.O = (i) g10;
        y3();
    }

    public final b0 x3() {
        return (b0) this.P.getValue();
    }

    public final void y3() {
        b0 x32 = x3();
        Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_INDEX");
        u uVar = serializableExtra instanceof u ? (u) serializableExtra : null;
        if (uVar == null) {
            uVar = u.USERS;
        }
        x32.j(uVar);
        x3().k(getIntent().getStringExtra("EXTRA_KEYWORD"));
        x3().i(getIntent().getStringExtra("EXTRA_APP_ID"));
    }
}
