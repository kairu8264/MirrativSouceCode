package ai;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class fr2 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4171a;

    /* renamed from: b  reason: collision with root package name */
    public final yj0 f4172b;

    public fr2(Executor executor, yj0 yj0Var) {
        this.f4171a = executor;
        this.f4172b = yj0Var;
    }

    public final void a(List<String> list) {
        for (String str : list) {
            b(str);
        }
    }

    public final void b(final String str) {
        this.f4171a.execute(new Runnable(this, str) { // from class: ai.er2

            /* renamed from: w  reason: collision with root package name */
            public final fr2 f3752w;

            /* renamed from: x  reason: collision with root package name */
            public final String f3753x;

            {
                this.f3752w = this;
                this.f3753x = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3752w.c(this.f3753x);
            }
        });
    }

    public final /* synthetic */ void c(String str) {
        this.f4172b.v(str);
    }
}
