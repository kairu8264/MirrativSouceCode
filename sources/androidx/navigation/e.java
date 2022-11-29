package androidx.navigation;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f15695a;

    /* renamed from: b  reason: collision with root package name */
    public u f15696b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f15697c;

    public e(int i10) {
        this(i10, null);
    }

    public Bundle a() {
        return this.f15697c;
    }

    public int b() {
        return this.f15695a;
    }

    public u c() {
        return this.f15696b;
    }

    public void d(Bundle bundle) {
        this.f15697c = bundle;
    }

    public void e(u uVar) {
        this.f15696b = uVar;
    }

    public e(int i10, u uVar) {
        this(i10, uVar, null);
    }

    public e(int i10, u uVar, Bundle bundle) {
        this.f15695a = i10;
        this.f15696b = uVar;
        this.f15697c = bundle;
    }
}
