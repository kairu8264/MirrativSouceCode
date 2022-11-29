package ai;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class qy1 implements kc0 {

    /* renamed from: a  reason: collision with root package name */
    public final kc0 f9236a;

    /* renamed from: b  reason: collision with root package name */
    public final kc0 f9237b;

    public qy1(kc0 kc0Var, kc0 kc0Var2) {
        this.f9236a = kc0Var;
        this.f9237b = kc0Var2;
    }

    @Override // ai.kc0
    public final void P(yh.a aVar) {
        b().P(aVar);
    }

    @Override // ai.kc0
    public final String a(Context context) {
        return b().a(context);
    }

    public final kc0 b() {
        return ((Boolean) ft.c().c(ox.f8120w3)).booleanValue() ? this.f9236a : this.f9237b;
    }

    @Override // ai.kc0
    public final boolean p(Context context) {
        return b().p(context);
    }

    @Override // ai.kc0
    public final yh.a q(String str, WebView webView, String str2, String str3, String str4, String str5, mc0 mc0Var, lc0 lc0Var, String str6) {
        return b().q(str, webView, "", "javascript", str4, str5, mc0Var, lc0Var, str6);
    }

    @Override // ai.kc0
    public final void r(yh.a aVar, View view) {
        b().r(aVar, view);
    }

    @Override // ai.kc0
    public final void s(yh.a aVar, View view) {
        b().s(aVar, view);
    }

    @Override // ai.kc0
    public final yh.a t(String str, WebView webView, String str2, String str3, String str4, mc0 mc0Var, lc0 lc0Var, String str5) {
        return b().t(str, webView, "", "javascript", str4, mc0Var, lc0Var, str5);
    }

    @Override // ai.kc0
    public final void zzf(yh.a aVar) {
        b().zzf(aVar);
    }
}
