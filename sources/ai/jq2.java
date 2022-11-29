package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jq2 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5888a;

    /* renamed from: b  reason: collision with root package name */
    public final yj0 f5889b;

    public jq2(Executor executor, yj0 yj0Var) {
        this.f5888a = executor;
        this.f5889b = yj0Var;
    }

    public final void a(final String str) {
        this.f5888a.execute(new Runnable(this, str) { // from class: ai.iq2

            /* renamed from: w  reason: collision with root package name */
            public final jq2 f5323w;

            /* renamed from: x  reason: collision with root package name */
            public final String f5324x;

            {
                this.f5323w = this;
                this.f5324x = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5323w.b(this.f5324x);
            }
        });
    }

    public final /* synthetic */ void b(String str) {
        this.f5889b.v(str);
    }
}
