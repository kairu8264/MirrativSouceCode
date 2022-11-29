package ai;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class co2 implements e43<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fo2 f2889a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ go2 f2890b;

    public co2(go2 go2Var, fo2 fo2Var) {
        this.f2890b = go2Var;
        this.f2889a = fo2Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        synchronized (this.f2890b) {
            this.f2890b.f4532e = null;
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(Void r32) {
        ArrayDeque arrayDeque;
        int i10;
        synchronized (this.f2890b) {
            this.f2890b.f4532e = null;
            arrayDeque = this.f2890b.f4531d;
            arrayDeque.addFirst(this.f2889a);
            i10 = this.f2890b.f4533f;
            if (i10 == 1) {
                this.f2890b.h();
            }
        }
    }
}
