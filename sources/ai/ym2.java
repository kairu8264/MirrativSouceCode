package ai;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class ym2 implements y41 {

    /* renamed from: w  reason: collision with root package name */
    public final HashSet<yi0> f12677w = new HashSet<>();

    /* renamed from: x  reason: collision with root package name */
    public final Context f12678x;

    /* renamed from: y  reason: collision with root package name */
    public final jj0 f12679y;

    public ym2(Context context, jj0 jj0Var) {
        this.f12678x = context;
        this.f12679y = jj0Var;
    }

    public final synchronized void a(HashSet<yi0> hashSet) {
        this.f12677w.clear();
        this.f12677w.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f12679y.k(this.f12678x, this);
    }

    @Override // ai.y41
    public final synchronized void z(sr srVar) {
        if (srVar.f9916w != 3) {
            this.f12679y.c(this.f12677w);
        }
    }
}
