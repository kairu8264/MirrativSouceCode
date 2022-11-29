package ai;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.Future;
import rh.c;

/* loaded from: classes3.dex */
public final class jn implements c.a {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ bn f5846w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ mk0 f5847x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ln f5848y;

    public jn(ln lnVar, bn bnVar, mk0 mk0Var) {
        this.f5848y = lnVar;
        this.f5846w = bnVar;
        this.f5847x = mk0Var;
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        Object obj;
        boolean z10;
        final an anVar;
        obj = this.f5848y.f6624d;
        synchronized (obj) {
            z10 = this.f5848y.f6622b;
            if (z10) {
                return;
            }
            this.f5848y.f6622b = true;
            anVar = this.f5848y.f6621a;
            if (anVar == null) {
                return;
            }
            t43 t43Var = hk0.f4878a;
            final bn bnVar = this.f5846w;
            final mk0 mk0Var = this.f5847x;
            final s43<?> q10 = t43Var.q(new Runnable(this, anVar, bnVar, mk0Var) { // from class: ai.gn

                /* renamed from: w  reason: collision with root package name */
                public final jn f4516w;

                /* renamed from: x  reason: collision with root package name */
                public final an f4517x;

                /* renamed from: y  reason: collision with root package name */
                public final bn f4518y;

                /* renamed from: z  reason: collision with root package name */
                public final mk0 f4519z;

                {
                    this.f4516w = this;
                    this.f4517x = anVar;
                    this.f4518y = bnVar;
                    this.f4519z = mk0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ym M1;
                    jn jnVar = this.f4516w;
                    an anVar2 = this.f4517x;
                    bn bnVar2 = this.f4518y;
                    mk0 mk0Var2 = this.f4519z;
                    try {
                        dn i02 = anVar2.i0();
                        if (anVar2.h0()) {
                            M1 = i02.f4(bnVar2);
                        } else {
                            M1 = i02.M1(bnVar2);
                        }
                        if (!M1.zza()) {
                            mk0Var2.e(new RuntimeException("No entry contents."));
                            ln.f(jnVar.f5848y);
                            return;
                        }
                        in inVar = new in(jnVar, M1.p(), 1);
                        int read = inVar.read();
                        if (read != -1) {
                            inVar.unread(read);
                            mk0Var2.d(nn.a(inVar, M1.S(), M1.r0(), M1.k0(), M1.U()));
                            return;
                        }
                        throw new IOException("Unable to read from cache.");
                    } catch (RemoteException | IOException e10) {
                        uj0.d("Unable to obtain a cache service instance.", e10);
                        mk0Var2.e(e10);
                        ln.f(jnVar.f5848y);
                    }
                }
            });
            final mk0 mk0Var2 = this.f5847x;
            mk0Var2.c(new Runnable(mk0Var2, q10) { // from class: ai.hn

                /* renamed from: w  reason: collision with root package name */
                public final mk0 f4900w;

                /* renamed from: x  reason: collision with root package name */
                public final Future f4901x;

                {
                    this.f4900w = mk0Var2;
                    this.f4901x = q10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mk0 mk0Var3 = this.f4900w;
                    Future future = this.f4901x;
                    if (mk0Var3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, hk0.f4883f);
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
    }
}
