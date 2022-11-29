package ai;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes3.dex */
public interface rp0 extends or, nc1, ip0, z50, oq0, tq0, n60, vk, xq0, wg.l, ar0, br0, em0, cr0 {
    void A0(int i10);

    void B0();

    xg.n C();

    fl2 D();

    Context D0();

    kl2 E();

    void F();

    void F0(boolean z10);

    View G();

    String H();

    WebView I();

    boolean I0(boolean z10, int i10);

    void J(nq0 nq0Var);

    void J0(int i10);

    void K0(yh.a aVar);

    void L();

    boolean N0();

    void O();

    WebViewClient O0();

    boolean P0();

    void Q();

    void Q0(fl2 fl2Var, kl2 kl2Var);

    void R0(jm jmVar);

    yz S();

    boolean T();

    void V();

    boolean V0();

    void W();

    void W0(boolean z10);

    s43<String> X();

    void X0(xg.n nVar);

    void Y(boolean z10);

    void Y0(String str, r30<? super rp0> r30Var);

    void Z0(String str, String str2, String str3);

    void a0(xg.n nVar);

    void a1(String str, vh.o<r30<? super rp0>> oVar);

    boolean c0();

    void c1(String str, r30<? super rp0> r30Var);

    boolean canGoBack();

    xg.n d0();

    void destroy();

    nq0 e();

    void f0(yz yzVar);

    Activity g();

    void g0(boolean z10);

    @Override // ai.tq0, ai.em0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h0(Context context);

    wg.a i();

    fr0 i0();

    by l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    zj0 m();

    void measure(int i10, int i11);

    void n0(boolean z10);

    void o(String str, fo0 fo0Var);

    yh.a o0();

    void onPause();

    void onResume();

    ir0 q();

    void q0(vz vzVar);

    jm r();

    void r0();

    @Override // ai.em0
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0(boolean z10);

    boolean u0();

    void v0(ir0 ir0Var);

    u w();
}
