package ai;

import ai.ar0;
import ai.cr0;
import ai.ip0;
import ai.nc1;
import ai.oq0;
import ai.or;
import ai.rp0;
import ai.tq0;
import ai.xq0;
import ai.z50;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzaat;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d40<T extends or & ip0 & rp0 & z50 & oq0 & tq0 & xq0 & nc1 & ar0 & cr0> implements r30<T> {

    /* renamed from: a  reason: collision with root package name */
    public final wg.b f3129a;

    /* renamed from: b  reason: collision with root package name */
    public final pp1 f3130b;

    /* renamed from: c  reason: collision with root package name */
    public final nq2 f3131c;

    /* renamed from: e  reason: collision with root package name */
    public final tb0 f3133e;

    /* renamed from: f  reason: collision with root package name */
    public final ey1 f3134f;

    /* renamed from: g  reason: collision with root package name */
    public xg.v f3135g = null;

    /* renamed from: d  reason: collision with root package name */
    public final yj0 f3132d = new yj0(null);

    public d40(wg.b bVar, tb0 tb0Var, ey1 ey1Var, pp1 pp1Var, nq2 nq2Var) {
        this.f3129a = bVar;
        this.f3133e = tb0Var;
        this.f3134f = ey1Var;
        this.f3130b = pp1Var;
        this.f3131c = nq2Var;
    }

    public static boolean c(Map<String, String> map) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("custom_close"));
    }

    public static int d(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return wg.t.f().h();
            }
            return -1;
        }
        return -1;
    }

    public static Uri e(Context context, u uVar, Uri uri, View view, Activity activity) {
        if (uVar == null) {
            return uri;
        }
        try {
            return uVar.f(uri) ? uVar.e(uri, context, view, activity) : uri;
        } catch (zzaat unused) {
            return uri;
        } catch (Exception e10) {
            wg.t.h().k(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static Uri f(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            String valueOf = String.valueOf(uri.toString());
            uj0.d(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e10);
        }
        return uri;
    }

    @Override // ai.r30
    /* renamed from: b */
    public final void a(T t10, Map<String, String> map) {
        String str;
        boolean z10;
        HashMap hashMap;
        Object obj;
        T t11 = t10;
        String a10 = ci0.a(map.get("u"), t11.getContext(), true);
        String str2 = map.get(TopicConstant.EXTEND_LIPMETA_A);
        if (str2 == null) {
            uj0.f("Action missing from an open GMSG.");
            return;
        }
        wg.b bVar = this.f3129a;
        if (bVar != null && !bVar.b()) {
            this.f3129a.c(a10);
            return;
        }
        fl2 D = t11.D();
        kl2 E = t11.E();
        boolean z11 = false;
        if (D == null || E == null) {
            str = "";
            z10 = false;
        } else {
            z10 = D.f4091f0;
            str = E.f6277b;
        }
        boolean z12 = (((Boolean) ft.c().c(ox.Z6)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (t11.T()) {
                uj0.f("Cannot expand WebView that is already expanded.");
                return;
            }
            j(false);
            t10.T0(c(map), d(map), z12);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            j(false);
            if (a10 != null) {
                t10.G0(c(map), d(map), a10, z12);
            } else {
                t10.S0(c(map), d(map), map.get("html"), map.get("baseurl"), z12);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = t11.getContext();
            if (((Boolean) ft.c().c(ox.V2)).booleanValue()) {
                if (((Boolean) ft.c().c(ox.f7950b3)).booleanValue()) {
                    yg.p1.k("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) ft.c().c(ox.Z2)).booleanValue()) {
                        z11 = true;
                        break;
                    }
                    String str3 = (String) ft.c().c(ox.f7941a3);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : vx2.b(yw2.b(';')).d(str3)) {
                            if (str4.equals(packageName)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean a11 = ny.a(t11.getContext());
            if (z11) {
                if (!a11) {
                    k(4);
                } else {
                    j(true);
                    if (TextUtils.isEmpty(a10)) {
                        uj0.f("Cannot open browser with null or empty url");
                        k(7);
                        return;
                    }
                    Uri f10 = f(e(t11.getContext(), t11.w(), Uri.parse(a10), t11.G(), t11.g()));
                    if (z10 && this.f3134f != null && h(t10, t11.getContext(), f10.toString(), str)) {
                        return;
                    }
                    this.f3135g = new z30(this);
                    t10.t(new xg.e(null, f10.toString(), null, null, null, null, null, null, yh.b.h1(this.f3135g).asBinder(), true), z12);
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            i(t10, map, z10, str, z12);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map.get("system_browser"))) {
            i(t10, map, z10, str, z12);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) ft.c().c(ox.S5)).booleanValue()) {
                j(true);
                String str5 = map.get(TtmlNode.TAG_P);
                if (str5 == null) {
                    uj0.f("Package name missing from open app action.");
                } else if (!z10 || this.f3134f == null || !h(t10, t11.getContext(), str5, str)) {
                    PackageManager packageManager = t11.getContext().getPackageManager();
                    if (packageManager == null) {
                        uj0.f("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        t10.t(new xg.e(launchIntentForPackage, this.f3135g), z12);
                    }
                }
            }
        } else {
            j(true);
            String str6 = map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e10) {
                    String valueOf = String.valueOf(str6);
                    uj0.d(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e10);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri f11 = f(e(t11.getContext(), t11.w(), data, t11.G(), t11.g()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) ft.c().c(ox.T5)).booleanValue()) {
                            intent2.setDataAndType(f11, intent2.getType());
                        }
                    }
                    intent2.setData(f11);
                }
            }
            boolean z13 = ((Boolean) ft.c().c(ox.f7979e6)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z13) {
                hashMap = hashMap2;
                obj = TtmlNode.TAG_P;
                this.f3135g = new b40(this, z12, t10, hashMap2, map);
                z12 = false;
            } else {
                hashMap = hashMap2;
                obj = TtmlNode.TAG_P;
            }
            if (intent2 != null) {
                if (!z10 || this.f3134f == null || !h(t10, t11.getContext(), intent2.getData().toString(), str)) {
                    t10.t(new xg.e(intent2, this.f3135g), z12);
                    return;
                } else if (z13) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put(map.get("event_id"), Boolean.TRUE);
                    t10.j0("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(a10)) {
                a10 = f(e(t11.getContext(), t11.w(), Uri.parse(a10), t11.G(), t11.g())).toString();
            }
            if (!z10 || this.f3134f == null || !h(t10, t11.getContext(), a10, str)) {
                t10.t(new xg.e(map.get(TopicConstant.EXTEND_AVC_IDR), a10, map.get(TopicConstant.PACKET_TYPE_META), map.get(obj), map.get("c"), map.get("f"), map.get(i7.e.f36387u), this.f3135g), z12);
            } else if (z13) {
                hashMap4.put(map.get("event_id"), Boolean.TRUE);
                t10.j0("openIntentAsync", hashMap4);
            }
        }
    }

    public final boolean h(T t10, Context context, String str, String str2) {
        wg.t.d();
        boolean i10 = yg.d2.i(context);
        wg.t.d();
        yg.v0 d10 = yg.d2.d(context);
        pp1 pp1Var = this.f3130b;
        if (pp1Var != null) {
            my1.T5(context, pp1Var, this.f3131c, this.f3134f, str2, "offline_open");
        }
        T t11 = t10;
        boolean z10 = t11.q().g() && t11.g() == null;
        if (i10) {
            this.f3134f.d(this.f3132d, str2);
            return false;
        }
        wg.t.d();
        if (b3.m.d(context).a() && d10 != null && !z10) {
            if (((Boolean) ft.c().c(ox.f7944a6)).booleanValue()) {
                if (t11.q().g()) {
                    my1.S5(t11.g(), null, d10, this.f3134f, this.f3130b, this.f3131c, str2, str);
                } else {
                    t10.w0(d10, this.f3134f, this.f3130b, this.f3131c, str2, str, wg.t.f().h());
                }
                pp1 pp1Var2 = this.f3130b;
                if (pp1Var2 != null) {
                    my1.T5(context, pp1Var2, this.f3131c, this.f3134f, str2, "dialog_impression");
                }
                t10.onAdClicked();
                return true;
            }
        }
        this.f3134f.e(str2);
        if (this.f3130b != null) {
            HashMap hashMap = new HashMap();
            wg.t.d();
            if (!b3.m.d(context).a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (d10 == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) ft.c().c(ox.f7944a6)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z10) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            my1.U5(context, this.f3130b, this.f3131c, this.f3134f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (ai.c40.b(r11, r5, r6, r7) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(T r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.d40.i(ai.or, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    public final void j(boolean z10) {
        tb0 tb0Var = this.f3133e;
        if (tb0Var != null) {
            tb0Var.i(z10);
        }
    }

    public final void k(int i10) {
        if (this.f3130b == null) {
            return;
        }
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            nq2 nq2Var = this.f3131c;
            mq2 a10 = mq2.a("cct_action");
            a10.c("cct_open_status", my.a(i10));
            nq2Var.a(a10);
            return;
        }
        op1 d10 = this.f3130b.d();
        d10.d(ActionLogBase.ACTION, "cct_action");
        d10.d("cct_open_status", my.a(i10));
        d10.e();
    }
}
