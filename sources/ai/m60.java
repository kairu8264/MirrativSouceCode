package ai;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzcmw;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m60 implements e60, b60 {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f6815w;

    public m60(Context context, zj0 zj0Var, u uVar, wg.a aVar) throws zzcmw {
        wg.t.e();
        rp0 a10 = cq0.a(context, ir0.b(), "", false, false, null, null, zj0Var, null, null, null, qn.a(), null, null);
        this.f6815w = a10;
        ((View) a10).setWillNotDraw(true);
    }

    public static final void P(Runnable runnable) {
        dt.a();
        if (nj0.n()) {
            runnable.run();
        } else {
            yg.d2.f61866i.post(runnable);
        }
    }

    @Override // ai.e60
    public final void A(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        P(new Runnable(this, format) { // from class: ai.g60

            /* renamed from: w  reason: collision with root package name */
            public final m60 f4351w;

            /* renamed from: x  reason: collision with root package name */
            public final String f4352x;

            {
                this.f4351w = this;
                this.f4352x = format;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f4351w.t(this.f4352x);
            }
        });
    }

    @Override // ai.n60
    public final void B(String str, String str2) {
        a60.b(this, str, str2);
    }

    @Override // ai.e60
    public final void R(final String str) {
        P(new Runnable(this, str) { // from class: ai.h60

            /* renamed from: w  reason: collision with root package name */
            public final m60 f4758w;

            /* renamed from: x  reason: collision with root package name */
            public final String f4759x;

            {
                this.f4758w = this;
                this.f4759x = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f4758w.d(this.f4759x);
            }
        });
    }

    public final /* synthetic */ void b(String str) {
        this.f6815w.loadUrl(str);
    }

    @Override // ai.z50
    public final void c(String str, JSONObject jSONObject) {
        a60.c(this, str, jSONObject);
    }

    public final /* synthetic */ void d(String str) {
        this.f6815w.loadData(str, "text/html", C.UTF8_NAME);
    }

    @Override // ai.e60
    public final void f(d60 d60Var) {
        this.f6815w.i0().P(k60.a(d60Var));
    }

    @Override // ai.e60
    public final boolean g() {
        return this.f6815w.c0();
    }

    @Override // ai.e60
    public final void h() {
        this.f6815w.destroy();
    }

    @Override // ai.e60
    public final m70 i() {
        return new m70(this);
    }

    @Override // ai.z50
    public final void j0(String str, Map map) {
        a60.d(this, str, map);
    }

    @Override // ai.n60
    public final void l0(String str, JSONObject jSONObject) {
        a60.a(this, str, jSONObject);
    }

    @Override // ai.e60
    public final void s(final String str) {
        P(new Runnable(this, str) { // from class: ai.i60

            /* renamed from: w  reason: collision with root package name */
            public final m60 f5124w;

            /* renamed from: x  reason: collision with root package name */
            public final String f5125x;

            {
                this.f5124w = this;
                this.f5125x = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5124w.b(this.f5125x);
            }
        });
    }

    public final /* synthetic */ void t(String str) {
        this.f6815w.loadData(str, "text/html", C.UTF8_NAME);
    }

    @Override // ai.n60
    public final void v(final String str) {
        P(new Runnable(this, str) { // from class: ai.f60

            /* renamed from: w  reason: collision with root package name */
            public final m60 f3953w;

            /* renamed from: x  reason: collision with root package name */
            public final String f3954x;

            {
                this.f3953w = this;
                this.f3954x = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3953w.x(this.f3954x);
            }
        });
    }

    public final /* synthetic */ void x(String str) {
        this.f6815w.v(str);
    }

    @Override // ai.l70
    public final void x0(String str, r30<? super l70> r30Var) {
        this.f6815w.c1(str, new l60(this, r30Var));
    }

    @Override // ai.l70
    public final void z0(String str, final r30<? super l70> r30Var) {
        this.f6815w.a1(str, new vh.o(r30Var) { // from class: ai.j60

            /* renamed from: a  reason: collision with root package name */
            public final r30 f5630a;

            {
                this.f5630a = r30Var;
            }

            @Override // vh.o
            public final boolean apply(Object obj) {
                r30 r30Var2;
                r30 r30Var3 = this.f5630a;
                r30 r30Var4 = (r30) obj;
                if (r30Var4 instanceof l60) {
                    r30Var2 = ((l60) r30Var4).f6486a;
                    return r30Var2.equals(r30Var3);
                }
                return false;
            }
        });
    }
}
