package ai;

import android.content.Context;
import android.view.View;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class j01 implements k61, p51 {
    public yh.a A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final Context f5568w;

    /* renamed from: x  reason: collision with root package name */
    public final rp0 f5569x;

    /* renamed from: y  reason: collision with root package name */
    public final fl2 f5570y;

    /* renamed from: z  reason: collision with root package name */
    public final zj0 f5571z;

    public j01(Context context, rp0 rp0Var, fl2 fl2Var, zj0 zj0Var) {
        this.f5568w = context;
        this.f5569x = rp0Var;
        this.f5570y = fl2Var;
        this.f5571z = zj0Var;
    }

    @Override // ai.k61
    public final synchronized void a() {
        if (this.B) {
            return;
        }
        b();
    }

    public final synchronized void b() {
        lc0 lc0Var;
        mc0 mc0Var;
        if (this.f5570y.P) {
            if (this.f5569x == null) {
                return;
            }
            if (wg.t.s().p(this.f5568w)) {
                zj0 zj0Var = this.f5571z;
                int i10 = zj0Var.f13014x;
                int i11 = zj0Var.f13015y;
                StringBuilder sb2 = new StringBuilder(23);
                sb2.append(i10);
                sb2.append(TopicConstant.SEPARATOR);
                sb2.append(i11);
                String sb3 = sb2.toString();
                String a10 = this.f5570y.R.a();
                if (this.f5570y.R.b() == 1) {
                    lc0Var = lc0.VIDEO;
                    mc0Var = mc0.DEFINED_BY_JAVASCRIPT;
                } else {
                    lc0Var = lc0.HTML_DISPLAY;
                    if (this.f5570y.f4090f == 1) {
                        mc0Var = mc0.ONE_PIXEL;
                    } else {
                        mc0Var = mc0.BEGIN_TO_RENDER;
                    }
                }
                yh.a t10 = wg.t.s().t(sb3, this.f5569x.I(), "", "javascript", a10, mc0Var, lc0Var, this.f5570y.f4097i0);
                this.A = t10;
                rp0 rp0Var = this.f5569x;
                if (t10 != null) {
                    wg.t.s().s(this.A, (View) rp0Var);
                    this.f5569x.K0(this.A);
                    wg.t.s().zzf(this.A);
                    this.B = true;
                    this.f5569x.j0("onSdkLoaded", new s.a());
                }
            }
        }
    }

    @Override // ai.p51
    public final synchronized void f() {
        rp0 rp0Var;
        if (!this.B) {
            b();
        }
        if (!this.f5570y.P || this.A == null || (rp0Var = this.f5569x) == null) {
            return;
        }
        rp0Var.j0("onSdkImpression", new s.a());
    }
}
