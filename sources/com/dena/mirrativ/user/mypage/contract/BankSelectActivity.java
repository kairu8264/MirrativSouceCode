package com.dena.mirrativ.user.mypage.contract;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.f;
import ao.g;
import da.j;
import e.b;
import jo.h;
import jo.p;
import uo.q0;

/* loaded from: classes2.dex */
public final class BankSelectActivity extends b implements q0 {
    public static final a P = new a(null);
    public static final int Q = j.f29340x;
    public final /* synthetic */ j O = new j();

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, BankSelectActivity.class);
        }
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (a3().k0() == 1) {
            finish();
        } else {
            a3().R0();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a3().k().r(((pc.a) f.g(this, nc.f.activity_bank_select)).B.getId(), ad.f.f1010z0.a()).g("BankIndexFragment").i();
    }
}
