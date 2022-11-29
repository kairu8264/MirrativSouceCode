package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gq0 extends FrameLayout implements rp0 {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f4543w;

    /* renamed from: x  reason: collision with root package name */
    public final sl0 f4544x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicBoolean f4545y;

    public gq0(rp0 rp0Var) {
        super(rp0Var.getContext());
        this.f4545y = new AtomicBoolean();
        this.f4543w = rp0Var;
        this.f4544x = new sl0(rp0Var.D0(), this, this);
        addView((View) rp0Var);
    }

    @Override // ai.rp0
    public final void A0(int i10) {
        this.f4543w.A0(i10);
    }

    @Override // ai.n60
    public final void B(String str, String str2) {
        this.f4543w.B("window.inspectorInfo", str2);
    }

    @Override // ai.rp0
    public final void B0() {
        rp0 rp0Var = this.f4543w;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(wg.t.i().d()));
        hashMap.put("app_volume", String.valueOf(wg.t.i().b()));
        kq0 kq0Var = (kq0) rp0Var;
        hashMap.put("device_volume", String.valueOf(yg.f.e(kq0Var.getContext())));
        kq0Var.j0("volume", hashMap);
    }

    @Override // ai.rp0
    public final xg.n C() {
        return this.f4543w.C();
    }

    @Override // ai.em0
    public final fo0 C0(String str) {
        return this.f4543w.C0(str);
    }

    @Override // ai.rp0, ai.ip0
    public final fl2 D() {
        return this.f4543w.D();
    }

    @Override // ai.rp0
    public final Context D0() {
        return this.f4543w.D0();
    }

    @Override // ai.rp0, ai.oq0
    public final kl2 E() {
        return this.f4543w.E();
    }

    @Override // ai.rp0
    public final void F() {
        TextView textView = new TextView(getContext());
        wg.t.d();
        textView.setText(yg.d2.c());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // ai.rp0
    public final void F0(boolean z10) {
        this.f4543w.F0(z10);
    }

    @Override // ai.rp0, ai.cr0
    public final View G() {
        return this;
    }

    @Override // ai.xq0
    public final void G0(boolean z10, int i10, String str, boolean z11) {
        this.f4543w.G0(z10, i10, str, z11);
    }

    @Override // ai.rp0
    public final String H() {
        return this.f4543w.H();
    }

    @Override // ai.rp0
    public final WebView I() {
        return (WebView) this.f4543w;
    }

    @Override // ai.rp0
    public final boolean I0(boolean z10, int i10) {
        if (this.f4545y.compareAndSet(false, true)) {
            if (((Boolean) ft.c().c(ox.f8125x0)).booleanValue()) {
                return false;
            }
            if (this.f4543w.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f4543w.getParent()).removeView((View) this.f4543w);
            }
            this.f4543w.I0(z10, i10);
            return true;
        }
        return true;
    }

    @Override // ai.rp0, ai.em0
    public final void J(nq0 nq0Var) {
        this.f4543w.J(nq0Var);
    }

    @Override // ai.rp0
    public final void J0(int i10) {
        this.f4543w.J0(i10);
    }

    @Override // ai.em0
    public final int K() {
        return this.f4543w.K();
    }

    @Override // ai.rp0
    public final void K0(yh.a aVar) {
        this.f4543w.K0(aVar);
    }

    @Override // ai.rp0
    public final void L() {
        this.f4543w.L();
    }

    @Override // ai.em0
    public final int M() {
        return this.f4543w.M();
    }

    @Override // ai.em0
    public final void N(int i10) {
        this.f4543w.N(i10);
    }

    @Override // ai.rp0
    public final boolean N0() {
        return this.f4545y.get();
    }

    @Override // ai.rp0
    public final void O() {
        this.f4543w.O();
    }

    @Override // ai.rp0
    public final WebViewClient O0() {
        return this.f4543w.O0();
    }

    @Override // ai.rp0
    public final boolean P0() {
        return this.f4543w.P0();
    }

    @Override // ai.rp0
    public final void Q() {
        this.f4543w.Q();
    }

    @Override // ai.rp0
    public final void Q0(fl2 fl2Var, kl2 kl2Var) {
        this.f4543w.Q0(fl2Var, kl2Var);
    }

    @Override // ai.rp0
    public final void R0(jm jmVar) {
        this.f4543w.R0(jmVar);
    }

    @Override // ai.rp0
    public final yz S() {
        return this.f4543w.S();
    }

    @Override // ai.xq0
    public final void S0(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f4543w.S0(z10, i10, str, str2, z11);
    }

    @Override // ai.rp0
    public final boolean T() {
        return this.f4543w.T();
    }

    @Override // ai.xq0
    public final void T0(boolean z10, int i10, boolean z11) {
        this.f4543w.T0(z10, i10, z11);
    }

    @Override // ai.vk
    public final void U(uk ukVar) {
        this.f4543w.U(ukVar);
    }

    @Override // ai.em0
    public final void U0(int i10) {
        this.f4543w.U0(i10);
    }

    @Override // ai.rp0
    public final void V() {
        setBackgroundColor(0);
        this.f4543w.setBackgroundColor(0);
    }

    @Override // ai.rp0
    public final boolean V0() {
        return this.f4543w.V0();
    }

    @Override // ai.rp0
    public final void W() {
        this.f4543w.W();
    }

    @Override // ai.rp0
    public final void W0(boolean z10) {
        this.f4543w.W0(z10);
    }

    @Override // ai.rp0
    public final s43<String> X() {
        return this.f4543w.X();
    }

    @Override // ai.rp0
    public final void X0(xg.n nVar) {
        this.f4543w.X0(nVar);
    }

    @Override // ai.rp0
    public final void Y(boolean z10) {
        this.f4543w.Y(z10);
    }

    @Override // ai.rp0
    public final void Y0(String str, r30<? super rp0> r30Var) {
        this.f4543w.Y0(str, r30Var);
    }

    @Override // ai.em0
    public final void Z(int i10) {
        this.f4543w.Z(i10);
    }

    @Override // ai.rp0
    public final void Z0(String str, String str2, String str3) {
        this.f4543w.Z0(str, str2, null);
    }

    @Override // ai.em0
    public final sl0 a() {
        return this.f4544x;
    }

    @Override // ai.rp0
    public final void a0(xg.n nVar) {
        this.f4543w.a0(nVar);
    }

    @Override // ai.rp0
    public final void a1(String str, vh.o<r30<? super rp0>> oVar) {
        this.f4543w.a1(str, oVar);
    }

    @Override // ai.em0
    public final void b0(boolean z10) {
        this.f4543w.b0(false);
    }

    @Override // ai.z50
    public final void c(String str, JSONObject jSONObject) {
        this.f4543w.c(str, jSONObject);
    }

    @Override // ai.rp0
    public final boolean c0() {
        return this.f4543w.c0();
    }

    @Override // ai.rp0
    public final void c1(String str, r30<? super rp0> r30Var) {
        this.f4543w.c1(str, r30Var);
    }

    @Override // ai.rp0
    public final boolean canGoBack() {
        return this.f4543w.canGoBack();
    }

    @Override // ai.rp0
    public final xg.n d0() {
        return this.f4543w.d0();
    }

    @Override // ai.rp0
    public final void destroy() {
        final yh.a o02 = o0();
        if (o02 != null) {
            ow2 ow2Var = yg.d2.f61866i;
            ow2Var.post(new Runnable(o02) { // from class: ai.dq0

                /* renamed from: w  reason: collision with root package name */
                public final yh.a f3372w;

                {
                    this.f3372w = o02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    wg.t.s().P(this.f3372w);
                }
            });
            rp0 rp0Var = this.f4543w;
            rp0Var.getClass();
            ow2Var.postDelayed(eq0.a(rp0Var), ((Integer) ft.c().c(ox.f8112v3)).intValue());
            return;
        }
        this.f4543w.destroy();
    }

    @Override // ai.rp0, ai.em0
    public final nq0 e() {
        return this.f4543w.e();
    }

    @Override // ai.em0
    public final void e0(int i10) {
        this.f4544x.f(i10);
    }

    @Override // ai.rp0
    public final void f0(yz yzVar) {
        this.f4543w.f0(yzVar);
    }

    @Override // ai.rp0, ai.tq0, ai.em0
    public final Activity g() {
        return this.f4543w.g();
    }

    @Override // ai.rp0
    public final void g0(boolean z10) {
        this.f4543w.g0(z10);
    }

    @Override // ai.rp0
    public final void goBack() {
        this.f4543w.goBack();
    }

    @Override // ai.em0
    public final ay h() {
        return this.f4543w.h();
    }

    @Override // ai.rp0
    public final void h0(Context context) {
        this.f4543w.h0(context);
    }

    @Override // ai.rp0, ai.em0
    public final wg.a i() {
        return this.f4543w.i();
    }

    @Override // ai.rp0
    public final fr0 i0() {
        return ((kq0) this.f4543w).l1();
    }

    @Override // ai.em0
    public final void j() {
        this.f4543w.j();
    }

    @Override // ai.z50
    public final void j0(String str, Map<String, ?> map) {
        this.f4543w.j0(str, map);
    }

    @Override // ai.em0
    public final String k() {
        return this.f4543w.k();
    }

    @Override // ai.rp0, ai.em0
    public final by l() {
        return this.f4543w.l();
    }

    @Override // ai.n60
    public final void l0(String str, JSONObject jSONObject) {
        ((kq0) this.f4543w).B(str, jSONObject.toString());
    }

    @Override // ai.rp0
    public final void loadData(String str, String str2, String str3) {
        this.f4543w.loadData(str, "text/html", str3);
    }

    @Override // ai.rp0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f4543w.loadDataWithBaseURL(str, str2, "text/html", C.UTF8_NAME, null);
    }

    @Override // ai.rp0
    public final void loadUrl(String str) {
        this.f4543w.loadUrl(str);
    }

    @Override // ai.rp0, ai.br0, ai.em0
    public final zj0 m() {
        return this.f4543w.m();
    }

    @Override // ai.em0
    public final String n() {
        return this.f4543w.n();
    }

    @Override // ai.rp0
    public final void n0(boolean z10) {
        this.f4543w.n0(z10);
    }

    @Override // ai.rp0, ai.em0
    public final void o(String str, fo0 fo0Var) {
        this.f4543w.o(str, fo0Var);
    }

    @Override // ai.rp0
    public final yh.a o0() {
        return this.f4543w.o0();
    }

    @Override // ai.or
    public final void onAdClicked() {
        rp0 rp0Var = this.f4543w;
        if (rp0Var != null) {
            rp0Var.onAdClicked();
        }
    }

    @Override // ai.rp0
    public final void onPause() {
        this.f4544x.d();
        this.f4543w.onPause();
    }

    @Override // ai.rp0
    public final void onResume() {
        this.f4543w.onResume();
    }

    @Override // ai.em0
    public final int p() {
        return this.f4543w.p();
    }

    @Override // wg.l
    public final void p0() {
        this.f4543w.p0();
    }

    @Override // ai.rp0, ai.zq0
    public final ir0 q() {
        return this.f4543w.q();
    }

    @Override // ai.rp0
    public final void q0(vz vzVar) {
        this.f4543w.q0(vzVar);
    }

    @Override // ai.rp0
    public final jm r() {
        return this.f4543w.r();
    }

    @Override // ai.rp0
    public final void r0() {
        this.f4544x.e();
        this.f4543w.r0();
    }

    @Override // wg.l
    public final void s0() {
        this.f4543w.s0();
    }

    @Override // android.view.View, ai.rp0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4543w.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, ai.rp0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f4543w.setOnTouchListener(onTouchListener);
    }

    @Override // ai.rp0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f4543w.setWebChromeClient(webChromeClient);
    }

    @Override // ai.rp0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f4543w.setWebViewClient(webViewClient);
    }

    @Override // ai.xq0
    public final void t(xg.e eVar, boolean z10) {
        this.f4543w.t(eVar, z10);
    }

    @Override // ai.rp0
    public final void t0(boolean z10) {
        this.f4543w.t0(z10);
    }

    @Override // ai.em0
    public final int u() {
        if (((Boolean) ft.c().c(ox.f8063p2)).booleanValue()) {
            return this.f4543w.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // ai.rp0
    public final boolean u0() {
        return this.f4543w.u0();
    }

    @Override // ai.n60
    public final void v(String str) {
        ((kq0) this.f4543w).i1(str);
    }

    @Override // ai.rp0
    public final void v0(ir0 ir0Var) {
        this.f4543w.v0(ir0Var);
    }

    @Override // ai.rp0, ai.ar0
    public final u w() {
        return this.f4543w.w();
    }

    @Override // ai.xq0
    public final void w0(yg.v0 v0Var, ey1 ey1Var, pp1 pp1Var, nq2 nq2Var, String str, String str2, int i10) {
        this.f4543w.w0(v0Var, ey1Var, pp1Var, nq2Var, str, str2, i10);
    }

    @Override // ai.em0
    public final void y() {
        this.f4543w.y();
    }

    @Override // ai.em0
    public final void y0(boolean z10, long j10) {
        this.f4543w.y0(z10, j10);
    }

    @Override // ai.em0
    public final int z() {
        if (((Boolean) ft.c().c(ox.f8063p2)).booleanValue()) {
            return this.f4543w.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // ai.nc1
    public final void zzb() {
        rp0 rp0Var = this.f4543w;
        if (rp0Var != null) {
            rp0Var.zzb();
        }
    }
}
