package nh;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class f0 extends g0 {

    /* renamed from: e  reason: collision with root package name */
    public final Callable<String> f43543e;

    public /* synthetic */ f0(Callable callable, e0 e0Var) {
        super(false, null, null);
        this.f43543e = callable;
    }

    @Override // nh.g0
    public final String a() {
        try {
            return this.f43543e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
