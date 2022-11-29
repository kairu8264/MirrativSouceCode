package com.dena.mirrativ.user.mypage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import e.b;
import jn.f;
import jo.h;
import jo.p;
import pc.q;

/* loaded from: classes2.dex */
public final class MyPageActivity extends b {
    public static final a P = new a(null);
    public static final int Q = 8;
    public q O;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, MyPageActivity.class);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_my_page);
        p.g(g10, "setContentView(this, R.layout.activity_my_page)");
        this.O = (q) g10;
    }
}
