package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class m<E> extends j {
    public final FragmentManager A;

    /* renamed from: w  reason: collision with root package name */
    public final Activity f15365w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f15366x;

    /* renamed from: y  reason: collision with root package name */
    public final Handler f15367y;

    /* renamed from: z  reason: collision with root package name */
    public final int f15368z;

    public m(h hVar) {
        this(hVar, hVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.j
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.j
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f15365w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f15366x;
    }

    public Handler h() {
        return this.f15367y;
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f15366x);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i10) {
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            c3.a.m(this.f15366x, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void n() {
    }

    public m(Activity activity, Context context, Handler handler, int i10) {
        this.A = new q();
        this.f15365w = activity;
        this.f15366x = (Context) n3.h.h(context, "context == null");
        this.f15367y = (Handler) n3.h.h(handler, "handler == null");
        this.f15368z = i10;
    }
}
