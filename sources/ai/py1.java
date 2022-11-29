package ai;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class py1 implements kc0 {
    public static wr2 b(String str) {
        if ("native".equals(str)) {
            return wr2.NATIVE;
        }
        if ("javascript".equals(str)) {
            return wr2.JAVASCRIPT;
        }
        return wr2.NONE;
    }

    public static vr2 c(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return vr2.UNSPECIFIED;
                }
                return vr2.ONE_PIXEL;
            }
            return vr2.DEFINED_BY_JAVASCRIPT;
        }
        return vr2.BEGIN_TO_RENDER;
    }

    public static tr2 d(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("video")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return null;
                }
                return tr2.VIDEO;
            }
            return tr2.NATIVE_DISPLAY;
        }
        return tr2.HTML_DISPLAY;
    }

    @Override // ai.kc0
    public final void P(yh.a aVar) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && mr2.b()) {
            Object z02 = yh.b.z0(aVar);
            if (z02 instanceof or2) {
                ((or2) z02).c();
            }
        }
    }

    @Override // ai.kc0
    public final String a(Context context) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // ai.kc0
    public final boolean p(Context context) {
        if (!((Boolean) ft.c().c(ox.f8104u3)).booleanValue()) {
            uj0.f("Omid flag is disabled");
            return false;
        } else if (mr2.b()) {
            return true;
        } else {
            mr2.a(context);
            return mr2.b();
        }
    }

    @Override // ai.kc0
    public final yh.a q(String str, WebView webView, String str2, String str3, String str4, String str5, mc0 mc0Var, lc0 lc0Var, String str6) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && mr2.b()) {
            xr2 a10 = xr2.a(str5, str);
            wr2 b10 = b("javascript");
            wr2 b11 = b(str4);
            tr2 d10 = d(lc0Var.toString());
            wr2 wr2Var = wr2.NONE;
            if (b10 == wr2Var) {
                uj0.f("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (d10 == null) {
                uj0.f("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(lc0Var)));
                return null;
            } else if (d10 == tr2.VIDEO && b11 == wr2Var) {
                String valueOf = String.valueOf(str4);
                uj0.f(valueOf.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid js session error; Video events owner unknown for video creative: "));
                return null;
            } else {
                return yh.b.h1(or2.e(pr2.a(d10, c(mc0Var.toString()), b10, b11, true), qr2.b(a10, webView, str6, "")));
            }
        }
        return null;
    }

    @Override // ai.kc0
    public final void r(yh.a aVar, View view) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && mr2.b()) {
            Object z02 = yh.b.z0(aVar);
            if (z02 instanceof or2) {
                ((or2) z02).d(view, ur2.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    @Override // ai.kc0
    public final void s(yh.a aVar, View view) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && mr2.b()) {
            Object z02 = yh.b.z0(aVar);
            if (z02 instanceof or2) {
                ((or2) z02).b(view);
            }
        }
    }

    @Override // ai.kc0
    public final yh.a t(String str, WebView webView, String str2, String str3, String str4, mc0 mc0Var, lc0 lc0Var, String str5) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && mr2.b()) {
            xr2 a10 = xr2.a("Google", str);
            wr2 b10 = b("javascript");
            tr2 d10 = d(lc0Var.toString());
            wr2 wr2Var = wr2.NONE;
            if (b10 == wr2Var) {
                uj0.f("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (d10 == null) {
                uj0.f("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(lc0Var)));
                return null;
            } else {
                wr2 b11 = b(str4);
                if (d10 == tr2.VIDEO && b11 == wr2Var) {
                    String valueOf = String.valueOf(str4);
                    uj0.f(valueOf.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid html session error; Video events owner unknown for video creative: "));
                    return null;
                }
                return yh.b.h1(or2.e(pr2.a(d10, c(mc0Var.toString()), b10, b11, true), qr2.a(a10, webView, str5, "")));
            }
        }
        return null;
    }

    @Override // ai.kc0
    public final void zzf(yh.a aVar) {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue() && mr2.b()) {
            Object z02 = yh.b.z0(aVar);
            if (z02 instanceof or2) {
                ((or2) z02).a();
            }
        }
    }
}
