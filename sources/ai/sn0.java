package ai;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.appcompat.widget.ActivityChooserModel;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sn0 implements r30<em0> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9883a;

    public static int b(Context context, Map<String, String> map, String str, int i10) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                dt.a();
                i10 = nj0.q(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(str.length() + 34 + str2.length());
                sb2.append("Could not parse ");
                sb2.append(str);
                sb2.append(" in a video GMSG: ");
                sb2.append(str2);
                uj0.f(sb2.toString());
            }
        }
        if (yg.p1.m()) {
            StringBuilder sb3 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            sb3.append("Parse pixels for ");
            sb3.append(str);
            sb3.append(", got string ");
            sb3.append(str2);
            sb3.append(", int ");
            sb3.append(i10);
            sb3.append(TopicConstant.SEPARATOR);
            yg.p1.k(sb3.toString());
        }
        return i10;
    }

    public static void c(rl0 rl0Var, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                rl0Var.E(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                uj0.f(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            rl0Var.F(Integer.parseInt(str2));
        }
        if (str3 != null) {
            rl0Var.G(Integer.parseInt(str3));
        }
        if (str4 != null) {
            rl0Var.H(Integer.parseInt(str4));
        }
        if (str5 != null) {
            rl0Var.j(Integer.parseInt(str5));
        }
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(em0 em0Var, Map map) {
        int min;
        int min2;
        String str;
        String str2;
        String str3;
        String str4;
        em0 em0Var2 = em0Var;
        String str5 = (String) map.get(ActionLogBase.ACTION);
        if (str5 == null) {
            uj0.f("Action missing from video GMSG.");
            return;
        }
        if (uj0.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str5.length() + 13 + String.valueOf(jSONObject2).length());
            sb2.append("Video GMSG: ");
            sb2.append(str5);
            sb2.append(" ");
            sb2.append(jSONObject2);
            uj0.a(sb2.toString());
        }
        if ("background".equals(str5)) {
            String str6 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str6)) {
                uj0.f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                em0Var2.setBackgroundColor(Color.parseColor(str6));
            } catch (IllegalArgumentException unused) {
                uj0.f("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str5)) {
            String str7 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str7)) {
                uj0.f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                em0Var2.e0(Color.parseColor(str7));
            } catch (IllegalArgumentException unused2) {
                uj0.f("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            int i10 = 0;
            if ("decoderProps".equals(str5)) {
                String str8 = (String) map.get("mimeTypes");
                if (str8 == null) {
                    uj0.f("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put(MRLog.PAYLOAD_KEY_ERROR, "missingMimeTypes");
                    em0Var2.j0("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                String[] split = str8.split(",");
                int length = split.length;
                while (i10 < length) {
                    String str9 = split[i10];
                    hashMap2.put(str9, yg.m1.a(str9.trim()));
                    i10++;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                em0Var2.j0("onVideoEvent", hashMap3);
                return;
            }
            sl0 a10 = em0Var2.a();
            if (a10 == null) {
                uj0.f("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str5);
            boolean equals2 = "position".equals(str5);
            if (!equals && !equals2) {
                nq0 e10 = em0Var2.e();
                if (e10 != null) {
                    if ("timeupdate".equals(str5)) {
                        String str10 = (String) map.get("currentTime");
                        if (str10 == null) {
                            uj0.f("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            e10.T5(Float.parseFloat(str10));
                            return;
                        } catch (NumberFormatException unused3) {
                            if (str10.length() != 0) {
                                str4 = "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str10);
                            } else {
                                str4 = new String("Could not parse currentTime parameter from timeupdate video GMSG: ");
                            }
                            uj0.f(str4);
                            return;
                        }
                    } else if ("skip".equals(str5)) {
                        e10.w();
                        return;
                    }
                }
                rl0 c10 = a10.c();
                if (c10 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    em0Var2.j0("onVideoEvent", hashMap4);
                    return;
                } else if (MRLog.ACTION_TYPE_CLICK.equals(str5)) {
                    Context context = em0Var2.getContext();
                    int b10 = b(context, map, "x", 0);
                    int b11 = b(context, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, b10, b11, 0);
                    c10.k(obtain);
                    obtain.recycle();
                    return;
                } else if ("currentTime".equals(str5)) {
                    String str11 = (String) map.get(ActivityChooserModel.ATTRIBUTE_TIME);
                    if (str11 == null) {
                        uj0.f("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        c10.A((int) (Float.parseFloat(str11) * 1000.0f));
                        return;
                    } catch (NumberFormatException unused4) {
                        if (str11.length() != 0) {
                            str3 = "Could not parse time parameter from currentTime video GMSG: ".concat(str11);
                        } else {
                            str3 = new String("Could not parse time parameter from currentTime video GMSG: ");
                        }
                        uj0.f(str3);
                        return;
                    }
                } else if ("hide".equals(str5)) {
                    c10.setVisibility(4);
                    return;
                } else if ("load".equals(str5)) {
                    c10.x();
                    return;
                } else if ("loadControl".equals(str5)) {
                    c(c10, map);
                    return;
                } else if ("muted".equals(str5)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        c10.B();
                        return;
                    } else {
                        c10.C();
                        return;
                    }
                } else if ("pause".equals(str5)) {
                    c10.y();
                    return;
                } else if ("play".equals(str5)) {
                    c10.z();
                    return;
                } else if ("show".equals(str5)) {
                    c10.setVisibility(0);
                    return;
                } else if ("src".equals(str5)) {
                    String str12 = (String) map.get("src");
                    Integer num = null;
                    if (map.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused5) {
                            uj0.f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str12};
                    String str13 = (String) map.get("demuxed");
                    if (str13 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str13);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                strArr2[i11] = jSONArray.getString(i11);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused6) {
                            if (str13.length() != 0) {
                                str2 = "Malformed demuxed URL list for playback: ".concat(str13);
                            } else {
                                str2 = new String("Malformed demuxed URL list for playback: ");
                            }
                            uj0.f(str2);
                            strArr = new String[]{str12};
                        }
                    }
                    if (num != null) {
                        em0Var2.U0(num.intValue());
                    }
                    c10.v(str12, strArr);
                    return;
                } else if ("touchMove".equals(str5)) {
                    Context context2 = em0Var2.getContext();
                    c10.w(b(context2, map, "dx", 0), b(context2, map, "dy", 0));
                    if (this.f9883a) {
                        return;
                    }
                    em0Var2.j();
                    this.f9883a = true;
                    return;
                } else if ("volume".equals(str5)) {
                    String str14 = (String) map.get("volume");
                    if (str14 == null) {
                        uj0.f("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        c10.D(Float.parseFloat(str14));
                        return;
                    } catch (NumberFormatException unused7) {
                        if (str14.length() != 0) {
                            str = "Could not parse volume parameter from volume video GMSG: ".concat(str14);
                        } else {
                            str = new String("Could not parse volume parameter from volume video GMSG: ");
                        }
                        uj0.f(str);
                        return;
                    }
                } else if ("watermark".equals(str5)) {
                    c10.l();
                    return;
                } else {
                    uj0.f(str5.length() != 0 ? "Unknown video action: ".concat(str5) : new String("Unknown video action: "));
                    return;
                }
            }
            Context context3 = em0Var2.getContext();
            int b12 = b(context3, map, "x", 0);
            int b13 = b(context3, map, "y", 0);
            int b14 = b(context3, map, "w", -1);
            gx<Boolean> gxVar = ox.f8063p2;
            if (!((Boolean) ft.c().c(gxVar)).booleanValue()) {
                if (yg.p1.m()) {
                    int u10 = em0Var2.u();
                    StringBuilder sb3 = new StringBuilder(110);
                    sb3.append("Calculate width with original width ");
                    sb3.append(b14);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(u10);
                    sb3.append(", x ");
                    sb3.append(b12);
                    sb3.append(TopicConstant.SEPARATOR);
                    yg.p1.k(sb3.toString());
                }
                min = Math.min(b14, em0Var2.u() - b12);
            } else if (b14 == -1) {
                min = em0Var2.u();
            } else {
                min = Math.min(b14, em0Var2.u());
            }
            int b15 = b(context3, map, "h", -1);
            if (!((Boolean) ft.c().c(gxVar)).booleanValue()) {
                if (yg.p1.m()) {
                    int z10 = em0Var2.z();
                    StringBuilder sb4 = new StringBuilder(113);
                    sb4.append("Calculate height with original height ");
                    sb4.append(b15);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(z10);
                    sb4.append(", y ");
                    sb4.append(b13);
                    sb4.append(TopicConstant.SEPARATOR);
                    yg.p1.k(sb4.toString());
                }
                min2 = Math.min(b15, em0Var2.z() - b13);
            } else if (b15 == -1) {
                min2 = em0Var2.z();
            } else {
                min2 = Math.min(b15, em0Var2.z());
            }
            int i12 = min2;
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused8) {
            }
            int i13 = i10;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && a10.c() == null) {
                a10.b(b12, b13, min, i12, i13, parseBoolean, new dm0((String) map.get("flags")));
                rl0 c11 = a10.c();
                if (c11 != null) {
                    c(c11, map);
                    return;
                }
                return;
            }
            a10.a(b12, b13, min, i12);
        }
    }
}
