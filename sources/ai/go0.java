package ai;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class go0 implements r30<em0> {
    public static final Integer b(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb2 = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
                sb2.append("Precache invalid numeric parameter '");
                sb2.append(str);
                sb2.append("': ");
                sb2.append(str2);
                uj0.f(sb2.toString());
                return null;
            }
        }
        return null;
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(em0 em0Var, Map map) {
        fo0 fo0Var;
        wn0 f10;
        em0 em0Var2 = em0Var;
        if (uj0.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            uj0.a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        xn0 z10 = wg.t.z();
        if (map.containsKey("abort")) {
            if (z10.d(em0Var2)) {
                return;
            }
            uj0.f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b10 = b(map, "periodicReportIntervalMs");
        Integer b11 = b(map, "exoPlayerRenderingIntervalMs");
        Integer b12 = b(map, "exoPlayerIdleIntervalMs");
        dm0 dm0Var = new dm0((String) map.get("flags"));
        boolean z11 = dm0Var.f3348n;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    uj0.f(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z11) {
                Iterator<wn0> it = z10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f10 = null;
                        break;
                    }
                    wn0 next = it.next();
                    if (next.f11692c == em0Var2 && str.equals(next.d())) {
                        f10 = next;
                        break;
                    }
                }
            } else {
                f10 = z10.f(em0Var2);
            }
            if (f10 != null) {
                uj0.f("Precache task is already running.");
                return;
            } else if (em0Var2.i() == null) {
                uj0.f("Precache requires a dependency provider.");
                return;
            } else {
                Integer b13 = b(map, "player");
                if (b13 == null) {
                    b13 = 0;
                }
                if (b10 != null) {
                    em0Var2.U0(b10.intValue());
                }
                if (b11 != null) {
                    em0Var2.N(b11.intValue());
                }
                if (b12 != null) {
                    em0Var2.Z(b12.intValue());
                }
                int intValue = b13.intValue();
                qn0 qn0Var = em0Var2.i().f58695c;
                if (intValue > 0) {
                    int R = ul0.R();
                    if (R < dm0Var.f3342h) {
                        fo0Var = new oo0(em0Var2, dm0Var);
                    } else if (R < dm0Var.f3336b) {
                        fo0Var = new lo0(em0Var2, dm0Var);
                    } else {
                        fo0Var = new jo0(em0Var2);
                    }
                } else {
                    fo0Var = new io0(em0Var2);
                }
                new wn0(em0Var2, fo0Var, str, strArr).c();
            }
        } else {
            wn0 f11 = z10.f(em0Var2);
            if (f11 == null) {
                uj0.f("Precache must specify a source.");
                return;
            }
            fo0Var = f11.f11693d;
        }
        Integer b14 = b(map, "minBufferMs");
        if (b14 != null) {
            fo0Var.j(b14.intValue());
        }
        Integer b15 = b(map, "maxBufferMs");
        if (b15 != null) {
            fo0Var.i(b15.intValue());
        }
        Integer b16 = b(map, "bufferForPlaybackMs");
        if (b16 != null) {
            fo0Var.k(b16.intValue());
        }
        Integer b17 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (b17 != null) {
            fo0Var.l(b17.intValue());
        }
    }
}
