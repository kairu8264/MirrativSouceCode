package ai;

import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzcmw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zh1 {

    /* renamed from: a  reason: collision with root package name */
    public final ym1 f12990a;

    /* renamed from: b  reason: collision with root package name */
    public final nl1 f12991b;

    /* renamed from: c  reason: collision with root package name */
    public final lx0 f12992c;

    /* renamed from: d  reason: collision with root package name */
    public final wg1 f12993d;

    public zh1(ym1 ym1Var, nl1 nl1Var, lx0 lx0Var, wg1 wg1Var) {
        this.f12990a = ym1Var;
        this.f12991b = nl1Var;
        this.f12992c = lx0Var;
        this.f12993d = wg1Var;
    }

    public final View a() throws zzcmw {
        rp0 b10 = this.f12990a.b(fs.P(), null, null);
        ((View) b10).setVisibility(8);
        b10.c1("/sendMessageToSdk", new r30(this) { // from class: ai.th1

            /* renamed from: a  reason: collision with root package name */
            public final zh1 f10308a;

            {
                this.f10308a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f10308a.f((rp0) obj, map);
            }
        });
        b10.c1("/adMuted", new r30(this) { // from class: ai.uh1

            /* renamed from: a  reason: collision with root package name */
            public final zh1 f10706a;

            {
                this.f10706a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f10706a.e((rp0) obj, map);
            }
        });
        this.f12991b.i(new WeakReference(b10), "/loadHtml", new r30(this) { // from class: ai.vh1

            /* renamed from: a  reason: collision with root package name */
            public final zh1 f11087a;

            {
                this.f11087a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, final Map map) {
                final zh1 zh1Var = this.f11087a;
                rp0 rp0Var = (rp0) obj;
                rp0Var.i0().b1(new dr0(zh1Var, map) { // from class: ai.yh1

                    /* renamed from: w  reason: collision with root package name */
                    public final zh1 f12595w;

                    /* renamed from: x  reason: collision with root package name */
                    public final Map f12596x;

                    {
                        this.f12595w = zh1Var;
                        this.f12596x = map;
                    }

                    @Override // ai.dr0
                    public final void b(boolean z10) {
                        this.f12595w.d(this.f12596x, z10);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    rp0Var.loadData(str, "text/html", C.UTF8_NAME);
                } else {
                    rp0Var.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                }
            }
        });
        this.f12991b.i(new WeakReference(b10), "/showOverlay", new r30(this) { // from class: ai.wh1

            /* renamed from: a  reason: collision with root package name */
            public final zh1 f11625a;

            {
                this.f11625a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f11625a.c((rp0) obj, map);
            }
        });
        this.f12991b.i(new WeakReference(b10), "/hideOverlay", new r30(this) { // from class: ai.xh1

            /* renamed from: a  reason: collision with root package name */
            public final zh1 f11935a;

            {
                this.f11935a = this;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                this.f11935a.b((rp0) obj, map);
            }
        });
        return (View) b10;
    }

    public final /* synthetic */ void b(rp0 rp0Var, Map map) {
        uj0.e("Hiding native ads overlay.");
        rp0Var.G().setVisibility(8);
        this.f12992c.d(false);
    }

    public final /* synthetic */ void c(rp0 rp0Var, Map map) {
        uj0.e("Showing native ads overlay.");
        rp0Var.G().setVisibility(0);
        this.f12992c.d(true);
    }

    public final /* synthetic */ void d(Map map, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(TtmlNode.ATTR_ID, (String) map.get(TtmlNode.ATTR_ID));
        this.f12991b.g("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void e(rp0 rp0Var, Map map) {
        this.f12993d.J();
    }

    public final /* synthetic */ void f(rp0 rp0Var, Map map) {
        this.f12991b.g("sendMessageToNativeJs", map);
    }
}
