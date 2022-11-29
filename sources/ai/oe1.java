package ai;

import android.content.Context;
import android.view.View;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class oe1 implements k61, xg.q {
    public final yn A;
    public yh.a B;

    /* renamed from: w  reason: collision with root package name */
    public final Context f7726w;

    /* renamed from: x  reason: collision with root package name */
    public final rp0 f7727x;

    /* renamed from: y  reason: collision with root package name */
    public final fl2 f7728y;

    /* renamed from: z  reason: collision with root package name */
    public final zj0 f7729z;

    public oe1(Context context, rp0 rp0Var, fl2 fl2Var, zj0 zj0Var, yn ynVar) {
        this.f7726w = context;
        this.f7727x = rp0Var;
        this.f7728y = fl2Var;
        this.f7729z = zj0Var;
        this.A = ynVar;
    }

    @Override // xg.q
    public final void B4() {
    }

    @Override // xg.q
    public final void D5(int i10) {
        this.B = null;
    }

    @Override // ai.k61
    public final void a() {
        mc0 mc0Var;
        mc0 mc0Var2;
        lc0 lc0Var;
        yn ynVar = this.A;
        if ((ynVar == yn.REWARD_BASED_VIDEO_AD || ynVar == yn.INTERSTITIAL || ynVar == yn.APP_OPEN) && this.f7728y.P && this.f7727x != null && wg.t.s().p(this.f7726w)) {
            zj0 zj0Var = this.f7729z;
            int i10 = zj0Var.f13014x;
            int i11 = zj0Var.f13015y;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(i10);
            sb2.append(TopicConstant.SEPARATOR);
            sb2.append(i11);
            String sb3 = sb2.toString();
            String a10 = this.f7728y.R.a();
            if (this.f7728y.R.b() == 1) {
                lc0Var = lc0.VIDEO;
                mc0Var2 = mc0.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.f7728y.U == 2) {
                    mc0Var = mc0.UNSPECIFIED;
                } else {
                    mc0Var = mc0.BEGIN_TO_RENDER;
                }
                mc0Var2 = mc0Var;
                lc0Var = lc0.HTML_DISPLAY;
            }
            yh.a t10 = wg.t.s().t(sb3, this.f7727x.I(), "", "javascript", a10, mc0Var2, lc0Var, this.f7728y.f4097i0);
            this.B = t10;
            if (t10 != null) {
                wg.t.s().s(this.B, (View) this.f7727x);
                this.f7727x.K0(this.B);
                wg.t.s().zzf(this.B);
                this.f7727x.j0("onSdkLoaded", new s.a());
            }
        }
    }

    @Override // xg.q
    public final void c() {
    }

    @Override // xg.q
    public final void d() {
    }

    @Override // xg.q
    public final void f4() {
    }

    @Override // xg.q
    public final void s0() {
        rp0 rp0Var;
        if (this.B == null || (rp0Var = this.f7727x) == null) {
            return;
        }
        rp0Var.j0("onSdkImpression", new s.a());
    }
}
