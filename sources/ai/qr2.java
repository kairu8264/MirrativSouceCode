package ai;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qr2 {

    /* renamed from: a  reason: collision with root package name */
    public final xr2 f9068a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f9069b;

    /* renamed from: c  reason: collision with root package name */
    public final List<yr2> f9070c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, yr2> f9071d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f9072e = "";

    /* renamed from: f  reason: collision with root package name */
    public final String f9073f;

    /* renamed from: g  reason: collision with root package name */
    public final rr2 f9074g;

    public qr2(xr2 xr2Var, WebView webView, String str, List<yr2> list, String str2, String str3, rr2 rr2Var) {
        this.f9068a = xr2Var;
        this.f9069b = webView;
        this.f9074g = rr2Var;
        this.f9073f = str2;
    }

    public static qr2 a(xr2 xr2Var, WebView webView, String str, String str2) {
        return new qr2(xr2Var, webView, null, null, str, "", rr2.HTML);
    }

    public static qr2 b(xr2 xr2Var, WebView webView, String str, String str2) {
        return new qr2(xr2Var, webView, null, null, str, "", rr2.JAVASCRIPT);
    }

    public final xr2 c() {
        return this.f9068a;
    }

    public final List<yr2> d() {
        return Collections.unmodifiableList(this.f9070c);
    }

    public final Map<String, yr2> e() {
        return Collections.unmodifiableMap(this.f9071d);
    }

    public final WebView f() {
        return this.f9069b;
    }

    public final String g() {
        return this.f9073f;
    }

    public final String h() {
        return this.f9072e;
    }

    public final rr2 i() {
        return this.f9074g;
    }
}
