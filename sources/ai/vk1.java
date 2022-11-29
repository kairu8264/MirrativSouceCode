package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class vk1 extends c10 {

    /* renamed from: w  reason: collision with root package name */
    public final Context f11112w;

    /* renamed from: x  reason: collision with root package name */
    public final og1 f11113x;

    /* renamed from: y  reason: collision with root package name */
    public oh1 f11114y;

    /* renamed from: z  reason: collision with root package name */
    public jg1 f11115z;

    public vk1(Context context, og1 og1Var, oh1 oh1Var, jg1 jg1Var) {
        this.f11112w = context;
        this.f11113x = og1Var;
        this.f11114y = oh1Var;
        this.f11115z = jg1Var;
    }

    @Override // ai.d10
    public final String H(String str) {
        return this.f11113x.y().get(str);
    }

    @Override // ai.d10
    public final void H0(String str) {
        jg1 jg1Var = this.f11115z;
        if (jg1Var != null) {
            jg1Var.A(str);
        }
    }

    @Override // ai.d10
    public final String e() {
        return this.f11113x.q();
    }

    @Override // ai.d10
    public final List<String> f() {
        s.g<String, wz> v10 = this.f11113x.v();
        s.g<String, String> y10 = this.f11113x.y();
        String[] strArr = new String[v10.size() + y10.size()];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < v10.size()) {
            strArr[i12] = v10.m(i11);
            i11++;
            i12++;
        }
        while (i10 < y10.size()) {
            strArr[i12] = y10.m(i10);
            i10++;
            i12++;
        }
        return Arrays.asList(strArr);
    }

    @Override // ai.d10
    public final void g() {
        jg1 jg1Var = this.f11115z;
        if (jg1Var != null) {
            jg1Var.B();
        }
    }

    @Override // ai.d10
    public final boolean h0(yh.a aVar) {
        oh1 oh1Var;
        Object z02 = yh.b.z0(aVar);
        if ((z02 instanceof ViewGroup) && (oh1Var = this.f11114y) != null && oh1Var.d((ViewGroup) z02)) {
            this.f11113x.r().f0(new uk1(this));
            return true;
        }
        return false;
    }

    @Override // ai.d10
    public final pv i() {
        return this.f11113x.e0();
    }

    @Override // ai.d10
    public final void j() {
        jg1 jg1Var = this.f11115z;
        if (jg1Var != null) {
            jg1Var.b();
        }
        this.f11115z = null;
        this.f11114y = null;
    }

    @Override // ai.d10
    public final yh.a k() {
        return yh.b.h1(this.f11112w);
    }

    @Override // ai.d10
    public final boolean o() {
        jg1 jg1Var = this.f11115z;
        return (jg1Var == null || jg1Var.m()) && this.f11113x.t() != null && this.f11113x.r() == null;
    }

    @Override // ai.d10
    public final boolean p() {
        yh.a u10 = this.f11113x.u();
        if (u10 != null) {
            wg.t.s().zzf(u10);
            if (this.f11113x.t() != null) {
                this.f11113x.t().j0("onSdkLoaded", new s.a());
                return true;
            }
            return true;
        }
        uj0.f("Trying to start OMID session before creation.");
        return false;
    }

    @Override // ai.d10
    public final void p5(yh.a aVar) {
        jg1 jg1Var;
        Object z02 = yh.b.z0(aVar);
        if (!(z02 instanceof View) || this.f11113x.u() == null || (jg1Var = this.f11115z) == null) {
            return;
        }
        jg1Var.n((View) z02);
    }

    @Override // ai.d10
    public final m00 s(String str) {
        return this.f11113x.v().get(str);
    }

    @Override // ai.d10
    public final void w() {
        String x10 = this.f11113x.x();
        if ("Google".equals(x10)) {
            uj0.f("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(x10)) {
            uj0.f("Not starting OMID session. OM partner name has not been configured.");
        } else {
            jg1 jg1Var = this.f11115z;
            if (jg1Var != null) {
                jg1Var.l(x10, false);
            }
        }
    }
}
