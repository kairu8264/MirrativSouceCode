package ai;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzcmw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ii1 {

    /* renamed from: a  reason: collision with root package name */
    public final ym1 f5242a;

    /* renamed from: b  reason: collision with root package name */
    public final nl1 f5243b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver.OnScrollChangedListener f5244c = null;

    public ii1(ym1 ym1Var, nl1 nl1Var) {
        this.f5242a = ym1Var;
        this.f5243b = nl1Var;
    }

    public static final int f(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        dt.a();
        return nj0.q(context, i10);
    }

    public final View a(final View view, final WindowManager windowManager) throws zzcmw {
        rp0 b10 = this.f5242a.b(fs.P(), null, null);
        View view2 = (View) b10;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        b10.c1("/sendMessageToSdk", new r30(this) { // from class: ai.bi1

            /* renamed from: a  reason: collision with root package name */
            public final ii1 f2356a;

            {
                this.f2356a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f2356a.e((rp0) obj, map);
            }
        });
        b10.c1("/hideValidatorOverlay", new r30(this, windowManager, view) { // from class: ai.ci1

            /* renamed from: a  reason: collision with root package name */
            public final ii1 f2838a;

            /* renamed from: b  reason: collision with root package name */
            public final WindowManager f2839b;

            /* renamed from: c  reason: collision with root package name */
            public final View f2840c;

            {
                this.f2838a = this;
                this.f2839b = windowManager;
                this.f2840c = view;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f2838a.d(this.f2839b, this.f2840c, (rp0) obj, map);
            }
        });
        b10.c1("/open", new d40(null, null, null, null, null));
        this.f5243b.i(new WeakReference(b10), "/loadNativeAdPolicyViolations", new r30(this, view, windowManager) { // from class: ai.ei1

            /* renamed from: a  reason: collision with root package name */
            public final ii1 f3677a;

            /* renamed from: b  reason: collision with root package name */
            public final View f3678b;

            /* renamed from: c  reason: collision with root package name */
            public final WindowManager f3679c;

            {
                this.f3677a = this;
                this.f3678b = view;
                this.f3679c = windowManager;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f3677a.b(this.f3678b, this.f3679c, (rp0) obj, map);
            }
        });
        this.f5243b.i(new WeakReference(b10), "/showValidatorOverlay", fi1.f4043a);
        return (View) b10;
    }

    public final /* synthetic */ void b(final View view, final WindowManager windowManager, final rp0 rp0Var, final Map map) {
        int i10;
        rp0Var.i0().b1(new dr0(this, map) { // from class: ai.hi1

            /* renamed from: w  reason: collision with root package name */
            public final ii1 f4858w;

            /* renamed from: x  reason: collision with root package name */
            public final Map f4859x;

            {
                this.f4858w = this;
                this.f4859x = map;
            }

            @Override // ai.dr0
            public final void b(boolean z10) {
                this.f4858w.c(this.f4859x, z10);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int f10 = f(context, (String) map.get("validator_width"), ((Integer) ft.c().c(ox.K5)).intValue());
        int f11 = f(context, (String) map.get("validator_height"), ((Integer) ft.c().c(ox.L5)).intValue());
        int f12 = f(context, (String) map.get("validator_x"), 0);
        int f13 = f(context, (String) map.get("validator_y"), 0);
        rp0Var.v0(ir0.c(f10, f11));
        try {
            rp0Var.I().getSettings().setUseWideViewPort(((Boolean) ft.c().c(ox.M5)).booleanValue());
            rp0Var.I().getSettings().setLoadWithOverviewMode(((Boolean) ft.c().c(ox.N5)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams j10 = yg.c1.j();
        j10.x = f12;
        j10.y = f13;
        windowManager.updateViewLayout(rp0Var.G(), j10);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str) && !"2".equals(str)) {
                i10 = rect.top;
            } else {
                i10 = rect.bottom;
            }
            final int i11 = i10 - f13;
            this.f5244c = new ViewTreeObserver.OnScrollChangedListener(view, rp0Var, str, j10, i11, windowManager) { // from class: ai.gi1
                public final int A;
                public final WindowManager B;

                /* renamed from: w  reason: collision with root package name */
                public final View f4465w;

                /* renamed from: x  reason: collision with root package name */
                public final rp0 f4466x;

                /* renamed from: y  reason: collision with root package name */
                public final String f4467y;

                /* renamed from: z  reason: collision with root package name */
                public final WindowManager.LayoutParams f4468z;

                {
                    this.f4465w = view;
                    this.f4466x = rp0Var;
                    this.f4467y = str;
                    this.f4468z = j10;
                    this.A = i11;
                    this.B = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.f4465w;
                    rp0 rp0Var2 = this.f4466x;
                    String str2 = this.f4467y;
                    WindowManager.LayoutParams layoutParams = this.f4468z;
                    int i12 = this.A;
                    WindowManager windowManager2 = this.B;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || rp0Var2.G().getWindowToken() == null) {
                        return;
                    }
                    if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str2) && !"2".equals(str2)) {
                        layoutParams.y = rect2.top - i12;
                    } else {
                        layoutParams.y = rect2.bottom - i12;
                    }
                    windowManager2.updateViewLayout(rp0Var2.G(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f5244c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        rp0Var.loadUrl(str2);
    }

    public final /* synthetic */ void c(Map map, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(TtmlNode.ATTR_ID, (String) map.get(TtmlNode.ATTR_ID));
        this.f5243b.g("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void d(WindowManager windowManager, View view, rp0 rp0Var, Map map) {
        uj0.a("Hide native ad policy validator overlay.");
        rp0Var.G().setVisibility(8);
        if (rp0Var.G().getWindowToken() != null) {
            windowManager.removeView(rp0Var.G());
        }
        rp0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f5244c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f5244c);
    }

    public final /* synthetic */ void e(rp0 rp0Var, Map map) {
        this.f5243b.g("sendMessageToNativeJs", map);
    }
}
