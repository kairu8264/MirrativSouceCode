package com.dena.mirrativ.player;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Process;
import androidx.lifecycle.t;
import hb.s1;
import jo.h;
import jo.p;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class PipStateManager {

    /* renamed from: g  reason: collision with root package name */
    public static final a f21946g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f21947h = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21948a;

    /* renamed from: b  reason: collision with root package name */
    public final f f21949b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21950c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21951d;

    /* renamed from: e  reason: collision with root package name */
    public int f21952e;

    /* renamed from: f  reason: collision with root package name */
    public b f21953f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final boolean a(Context context) {
            p.h(context, "context");
            Object systemService = context.getSystemService("appops");
            p.f(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            return ((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && !context.getResources().getBoolean(s1.f34960a);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void A1(PipStateManager pipStateManager);

        void I0(PipStateManager pipStateManager);

        void K0(PipStateManager pipStateManager);
    }

    public PipStateManager(Context context) {
        p.h(context, "context");
        this.f21948a = context;
        this.f21949b = g.a(new PipStateManager$observer$2(this));
    }

    public final b b() {
        return this.f21953f;
    }

    public final t c() {
        return (t) this.f21949b.getValue();
    }

    public final boolean d() {
        return this.f21950c && f21946g.a(this.f21948a);
    }

    public final boolean e() {
        return this.f21951d;
    }

    public final void f(Intent intent) {
        this.f21951d = false;
    }

    public final void g(boolean z10, Configuration configuration) {
        this.f21951d = z10;
    }

    public final boolean h(int i10) {
        return this.f21952e != i10;
    }

    public final void i(b bVar) {
        this.f21953f = bVar;
    }

    public final void j(int i10, boolean z10) {
        this.f21952e = i10;
        this.f21950c = z10;
    }
}
