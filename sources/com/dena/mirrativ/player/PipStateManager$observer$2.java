package com.dena.mirrativ.player;

import androidx.lifecycle.g0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import com.dena.mirrativ.player.PipStateManager;
import io.a;
import jo.q;

/* loaded from: classes2.dex */
public final class PipStateManager$observer$2 extends q implements a<AnonymousClass1> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ PipStateManager f21954w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipStateManager$observer$2(PipStateManager pipStateManager) {
        super(0);
        this.f21954w = pipStateManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.dena.mirrativ.player.PipStateManager$observer$2$1] */
    @Override // io.a
    /* renamed from: a */
    public final AnonymousClass1 invoke() {
        final PipStateManager pipStateManager = this.f21954w;
        return new t() { // from class: com.dena.mirrativ.player.PipStateManager$observer$2.1
            @g0(o.b.ON_DESTROY)
            public final void onDestroy() {
                PipStateManager.b b10 = PipStateManager.this.b();
                if (b10 != null) {
                    b10.A1(PipStateManager.this);
                }
            }

            @g0(o.b.ON_RESUME)
            public final void onResume() {
                PipStateManager.b b10;
                if (PipStateManager.this.e() && (b10 = PipStateManager.this.b()) != null) {
                    b10.I0(PipStateManager.this);
                }
                PipStateManager.this.f21951d = false;
            }

            @g0(o.b.ON_STOP)
            public final void onStop() {
                PipStateManager.b b10;
                if (PipStateManager.this.e() && (b10 = PipStateManager.this.b()) != null) {
                    b10.K0(PipStateManager.this);
                }
                PipStateManager.this.f21951d = false;
            }
        };
    }
}
