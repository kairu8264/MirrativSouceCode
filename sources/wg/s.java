package wg;

import ai.as;
import ai.dt;
import ai.ed0;
import ai.eu;
import ai.ff0;
import ai.fs;
import ai.hk0;
import ai.hu;
import ai.iv;
import ai.jt;
import ai.ky;
import ai.ls;
import ai.lu;
import ai.lv;
import ai.nj0;
import ai.nt;
import ai.om;
import ai.pu;
import ai.pv;
import ai.qt;
import ai.tv;
import ai.ty;
import ai.u;
import ai.uj0;
import ai.uw;
import ai.zc0;
import ai.zj0;
import ai.zt;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzaat;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class s extends zt {
    public final r A;
    public WebView B;
    public nt C;
    public u D;
    public AsyncTask<Void, Void, String> E;

    /* renamed from: w */
    public final zj0 f58727w;

    /* renamed from: x */
    public final fs f58728x;

    /* renamed from: y */
    public final Future<u> f58729y = hk0.f4878a.h(new o(this));

    /* renamed from: z */
    public final Context f58730z;

    public s(Context context, fs fsVar, String str, zj0 zj0Var) {
        this.f58730z = context;
        this.f58727w = zj0Var;
        this.f58728x = fsVar;
        this.B = new WebView(context);
        this.A = new r(context, str);
        S5(0);
        this.B.setVerticalScrollBarEnabled(false);
        this.B.getSettings().setJavaScriptEnabled(true);
        this.B.setWebViewClient(new m(this));
        this.B.setOnTouchListener(new n(this));
    }

    public static /* synthetic */ String V5(s sVar, String str) {
        if (sVar.D == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = sVar.D.e(parse, sVar.f58730z, null, null);
        } catch (zzaat e10) {
            uj0.g("Unable to process ad data", e10);
        }
        return parse.toString();
    }

    public static /* synthetic */ void W5(s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f58730z.startActivity(intent);
    }

    @Override // ai.au
    public final pv B0() {
        return null;
    }

    @Override // ai.au
    public final void E1(eu euVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void E3(yh.a aVar) {
    }

    @Override // ai.au
    public final boolean G() throws RemoteException {
        return false;
    }

    @Override // ai.au
    public final void H2(zc0 zc0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final nt K() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // ai.au
    public final void N1(pu puVar) {
    }

    @Override // ai.au
    public final String O() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // ai.au
    public final void O3(ls lsVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void P1(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final int R5(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            dt.a();
            return nj0.q(this.f58730z, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void S5(int i10) {
        if (this.B == null) {
            return;
        }
        this.B.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // ai.au
    public final void T3(uw uwVar) {
        throw new IllegalStateException("Unused method");
    }

    public final String T5() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(ty.f10506d.e());
        builder.appendQueryParameter("query", this.A.b());
        builder.appendQueryParameter("pubId", this.A.c());
        builder.appendQueryParameter("mappver", this.A.d());
        Map<String, String> e10 = this.A.e();
        for (String str : e10.keySet()) {
            builder.appendQueryParameter(str, e10.get(str));
        }
        Uri build = builder.build();
        u uVar = this.D;
        if (uVar != null) {
            try {
                build = uVar.c(build, this.f58730z);
            } catch (zzaat e11) {
                uj0.g("Unable to process ad data", e11);
            }
        }
        String U5 = U5();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb2 = new StringBuilder(U5.length() + 1 + String.valueOf(encodedQuery).length());
        sb2.append(U5);
        sb2.append("#");
        sb2.append(encodedQuery);
        return sb2.toString();
    }

    public final String U5() {
        String a10 = this.A.a();
        if (true == TextUtils.isEmpty(a10)) {
            a10 = "www.google.com";
        }
        String e10 = ty.f10506d.e();
        StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 8 + String.valueOf(e10).length());
        sb2.append("https://");
        sb2.append(a10);
        sb2.append(e10);
        return sb2.toString();
    }

    @Override // ai.au
    public final void V0(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void V1(jt jtVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void V3(as asVar, qt qtVar) {
    }

    @Override // ai.au
    public final void X4(lu luVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void d1(ky kyVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final boolean e4(as asVar) throws RemoteException {
        rh.p.j(this.B, "This Search Ad has already been torn down");
        this.A.f(asVar, this.f58727w);
        this.E = new p(this, null).execute(new Void[0]);
        return true;
    }

    @Override // ai.au
    public final void g() throws RemoteException {
        rh.p.d("destroy must be called on the main UI thread.");
        this.E.cancel(true);
        this.f58729y.cancel(true);
        this.B.destroy();
        this.B = null;
    }

    @Override // ai.au
    public final yh.a h() throws RemoteException {
        rh.p.d("getAdFrame must be called on the main UI thread.");
        return yh.b.h1(this.B);
    }

    @Override // ai.au
    public final boolean i() throws RemoteException {
        return false;
    }

    @Override // ai.au
    public final void i1(ff0 ff0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void k() throws RemoteException {
        rh.p.d("pause must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void l5(iv ivVar) {
    }

    @Override // ai.au
    public final void m() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void m1(om omVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void n() throws RemoteException {
        rh.p.d("resume must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void n0(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void q() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void q1(nt ntVar) throws RemoteException {
        this.C = ntVar;
    }

    @Override // ai.au
    public final fs r() throws RemoteException {
        return this.f58728x;
    }

    @Override // ai.au
    public final void s1(tv tvVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void s2(hu huVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final void t2(boolean z10) throws RemoteException {
    }

    @Override // ai.au
    public final String u() throws RemoteException {
        return null;
    }

    @Override // ai.au
    public final Bundle w() {
        throw new IllegalStateException("Unused method");
    }

    @Override // ai.au
    public final hu x() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // ai.au
    public final lv y() {
        return null;
    }

    @Override // ai.au
    public final String z() throws RemoteException {
        return null;
    }

    @Override // ai.au
    public final void z3(fs fsVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // ai.au
    public final void z5(ed0 ed0Var, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }
}
