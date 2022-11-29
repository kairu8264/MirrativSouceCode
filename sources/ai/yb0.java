package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yb0 extends zb0 implements r30<rp0> {

    /* renamed from: c  reason: collision with root package name */
    public final rp0 f12504c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f12505d;

    /* renamed from: e  reason: collision with root package name */
    public final WindowManager f12506e;

    /* renamed from: f  reason: collision with root package name */
    public final xw f12507f;

    /* renamed from: g  reason: collision with root package name */
    public DisplayMetrics f12508g;

    /* renamed from: h  reason: collision with root package name */
    public float f12509h;

    /* renamed from: i  reason: collision with root package name */
    public int f12510i;

    /* renamed from: j  reason: collision with root package name */
    public int f12511j;

    /* renamed from: k  reason: collision with root package name */
    public int f12512k;

    /* renamed from: l  reason: collision with root package name */
    public int f12513l;

    /* renamed from: m  reason: collision with root package name */
    public int f12514m;

    /* renamed from: n  reason: collision with root package name */
    public int f12515n;

    /* renamed from: o  reason: collision with root package name */
    public int f12516o;

    public yb0(rp0 rp0Var, Context context, xw xwVar) {
        super(rp0Var, "");
        this.f12510i = -1;
        this.f12511j = -1;
        this.f12513l = -1;
        this.f12514m = -1;
        this.f12515n = -1;
        this.f12516o = -1;
        this.f12504c = rp0Var;
        this.f12505d = context;
        this.f12507f = xwVar;
        this.f12506e = (WindowManager) context.getSystemService("window");
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObject;
        this.f12508g = new DisplayMetrics();
        Display defaultDisplay = this.f12506e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f12508g);
        this.f12509h = this.f12508g.density;
        this.f12512k = defaultDisplay.getRotation();
        dt.a();
        DisplayMetrics displayMetrics = this.f12508g;
        this.f12510i = nj0.o(displayMetrics, displayMetrics.widthPixels);
        dt.a();
        DisplayMetrics displayMetrics2 = this.f12508g;
        this.f12511j = nj0.o(displayMetrics2, displayMetrics2.heightPixels);
        Activity g10 = this.f12504c.g();
        if (g10 != null && g10.getWindow() != null) {
            wg.t.d();
            int[] t10 = yg.d2.t(g10);
            dt.a();
            this.f12513l = nj0.o(this.f12508g, t10[0]);
            dt.a();
            this.f12514m = nj0.o(this.f12508g, t10[1]);
        } else {
            this.f12513l = this.f12510i;
            this.f12514m = this.f12511j;
        }
        if (this.f12504c.q().g()) {
            this.f12515n = this.f12510i;
            this.f12516o = this.f12511j;
        } else {
            this.f12504c.measure(0, 0);
        }
        g(this.f12510i, this.f12511j, this.f12513l, this.f12514m, this.f12509h, this.f12512k);
        xb0 xb0Var = new xb0();
        xw xwVar = this.f12507f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        xb0Var.g(xwVar.c(intent));
        xw xwVar2 = this.f12507f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        xb0Var.f(xwVar2.c(intent2));
        xb0Var.h(this.f12507f.b());
        xb0Var.i(this.f12507f.a());
        xb0Var.j(true);
        z10 = xb0Var.f11901a;
        z11 = xb0Var.f11902b;
        z12 = xb0Var.f11903c;
        z13 = xb0Var.f11904d;
        z14 = xb0Var.f11905e;
        rp0 rp0Var2 = this.f12504c;
        try {
            jSONObject = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            uj0.d("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        rp0Var2.c("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f12504c.getLocationOnScreen(iArr);
        h(dt.a().a(this.f12505d, iArr[0]), dt.a().a(this.f12505d, iArr[1]));
        if (uj0.j(2)) {
            uj0.e("Dispatching Ready Event.");
        }
        c(this.f12504c.m().f13013w);
    }

    public final void h(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f12505d instanceof Activity) {
            wg.t.d();
            i12 = yg.d2.v((Activity) this.f12505d)[0];
        } else {
            i12 = 0;
        }
        if (this.f12504c.q() == null || !this.f12504c.q().g()) {
            int width = this.f12504c.getWidth();
            int height = this.f12504c.getHeight();
            if (((Boolean) ft.c().c(ox.M)).booleanValue()) {
                if (width == 0) {
                    width = this.f12504c.q() != null ? this.f12504c.q().f5332c : 0;
                }
                if (height == 0) {
                    if (this.f12504c.q() != null) {
                        i13 = this.f12504c.q().f5331b;
                    }
                    this.f12515n = dt.a().a(this.f12505d, width);
                    this.f12516o = dt.a().a(this.f12505d, i13);
                }
            }
            i13 = height;
            this.f12515n = dt.a().a(this.f12505d, width);
            this.f12516o = dt.a().a(this.f12505d, i13);
        }
        e(i10, i11 - i12, this.f12515n, this.f12516o);
        this.f12504c.i0().m0(i10, i11);
    }
}
