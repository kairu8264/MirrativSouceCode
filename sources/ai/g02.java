package ai;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import p.d;

/* loaded from: classes3.dex */
public final class g02 implements ry1<id1> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4271a;

    /* renamed from: b  reason: collision with root package name */
    public final ge1 f4272b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f4273c;

    /* renamed from: d  reason: collision with root package name */
    public final el2 f4274d;

    public g02(Context context, Executor executor, ge1 ge1Var, el2 el2Var) {
        this.f4271a = context;
        this.f4272b = ge1Var;
        this.f4273c = executor;
        this.f4274d = el2Var;
    }

    public static String d(fl2 fl2Var) {
        try {
            return fl2Var.f4111v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ai.ry1
    public final s43<id1> a(final sl2 sl2Var, final fl2 fl2Var) {
        String d10 = d(fl2Var);
        final Uri parse = d10 != null ? Uri.parse(d10) : null;
        return j43.i(j43.a(null), new p33(this, parse, sl2Var, fl2Var) { // from class: ai.e02

            /* renamed from: a  reason: collision with root package name */
            public final g02 f3485a;

            /* renamed from: b  reason: collision with root package name */
            public final Uri f3486b;

            /* renamed from: c  reason: collision with root package name */
            public final sl2 f3487c;

            /* renamed from: d  reason: collision with root package name */
            public final fl2 f3488d;

            {
                this.f3485a = this;
                this.f3486b = parse;
                this.f3487c = sl2Var;
                this.f3488d = fl2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f3485a.c(this.f3486b, this.f3487c, this.f3488d, obj);
            }
        }, this.f4273c);
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        return (this.f4271a instanceof Activity) && vh.n.b() && ny.a(this.f4271a) && !TextUtils.isEmpty(d(fl2Var));
    }

    public final /* synthetic */ s43 c(Uri uri, sl2 sl2Var, fl2 fl2Var, Object obj) throws Exception {
        try {
            p.d a10 = new d.a().a();
            a10.f45629a.setData(uri);
            xg.e eVar = new xg.e(a10.f45629a, null);
            final mk0 mk0Var = new mk0();
            jd1 c10 = this.f4272b.c(new j11(sl2Var, fl2Var, null), new md1(new ne1(mk0Var) { // from class: ai.f02

                /* renamed from: a  reason: collision with root package name */
                public final mk0 f3871a;

                {
                    this.f3871a = mk0Var;
                }

                @Override // ai.ne1
                public final void a(boolean z10, Context context, i51 i51Var) {
                    mk0 mk0Var2 = this.f3871a;
                    try {
                        wg.t.c();
                        xg.o.a(context, (AdOverlayInfoParcel) mk0Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            mk0Var.d(new AdOverlayInfoParcel(eVar, null, c10.i(), null, new zj0(0, 0, false, false, false), null, null));
            this.f4274d.d();
            return j43.a(c10.h());
        } catch (Throwable th2) {
            uj0.d("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }
}
