package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import ph.f;
import ph.g;
import ph.l1;
import ph.n1;
import rh.p;

/* loaded from: classes3.dex */
public class LifecycleCallback {

    /* renamed from: w  reason: collision with root package name */
    public final g f27216w;

    public LifecycleCallback(g gVar) {
        this.f27216w = gVar;
    }

    public static g c(Activity activity) {
        return d(new f(activity));
    }

    public static g d(f fVar) {
        if (fVar.d()) {
            return n1.l3(fVar.b());
        }
        if (fVar.c()) {
            return l1.c(fVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static g getChimeraLifecycleFragmentImpl(f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity L = this.f27216w.L();
        p.i(L);
        return L;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
