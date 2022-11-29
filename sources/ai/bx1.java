package ai;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class bx1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final zw1 f2580a;

    public bx1(zw1 zw1Var) {
        this.f2580a = zw1Var;
    }

    public static Callable a(zw1 zw1Var) {
        return new bx1(zw1Var);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2580a.getWritableDatabase();
    }
}
