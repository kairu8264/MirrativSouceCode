package pi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzkh;
import hi.be;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class da extends r9 {
    public da(ba baVar) {
        super(baVar);
    }

    public static <Builder extends hi.v9> Builder C(Builder builder, byte[] bArr) throws zzkh {
        hi.g8 b10 = hi.g8.b();
        if (b10 != null) {
            return (Builder) builder.x0(bArr, b10);
        }
        return (Builder) builder.A0(bArr);
    }

    public static List<hi.m4> H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                hi.l4 v10 = hi.m4.v();
                for (String str : bundle.keySet()) {
                    hi.l4 v11 = hi.m4.v();
                    v11.y(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        v11.x(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        v11.z((String) obj);
                    } else if (obj instanceof Double) {
                        v11.w(((Double) obj).doubleValue());
                    }
                    v10.r(v11);
                }
                if (v10.o() > 0) {
                    arrayList.add(v10.h());
                }
            }
        }
        return arrayList;
    }

    public static List<Long> J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean N(List<Long> list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    public static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void k(hi.h4 h4Var, String str, Object obj) {
        List<hi.m4> E = h4Var.E();
        int i10 = 0;
        while (true) {
            if (i10 >= E.size()) {
                i10 = -1;
                break;
            } else if (str.equals(E.get(i10).x())) {
                break;
            } else {
                i10++;
            }
        }
        hi.l4 v10 = hi.m4.v();
        v10.y(str);
        if (obj instanceof Long) {
            v10.x(((Long) obj).longValue());
        } else if (obj instanceof String) {
            v10.z((String) obj);
        } else if (obj instanceof Double) {
            v10.w(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            v10.q(H((Bundle[]) obj));
        }
        if (i10 >= 0) {
            h4Var.y(i10, v10);
        } else {
            h4Var.t(v10);
        }
    }

    public static final boolean l(u uVar, na naVar) {
        rh.p.i(uVar);
        rh.p.i(naVar);
        return (TextUtils.isEmpty(naVar.f48081x) && TextUtils.isEmpty(naVar.M)) ? false : true;
    }

    public static final hi.m4 m(hi.i4 i4Var, String str) {
        for (hi.m4 m4Var : i4Var.z()) {
            if (m4Var.x().equals(str)) {
                return m4Var;
            }
        }
        return null;
    }

    public static final Object n(hi.i4 i4Var, String str) {
        hi.m4 m10 = m(i4Var, str);
        if (m10 != null) {
            if (m10.O()) {
                return m10.y();
            }
            if (m10.M()) {
                return Long.valueOf(m10.u());
            }
            if (m10.K()) {
                return Double.valueOf(m10.r());
            }
            if (m10.t() > 0) {
                List<hi.m4> z10 = m10.z();
                ArrayList arrayList = new ArrayList();
                for (hi.m4 m4Var : z10) {
                    if (m4Var != null) {
                        Bundle bundle = new Bundle();
                        for (hi.m4 m4Var2 : m4Var.z()) {
                            if (m4Var2.O()) {
                                bundle.putString(m4Var2.x(), m4Var2.y());
                            } else if (m4Var2.M()) {
                                bundle.putLong(m4Var2.x(), m4Var2.u());
                            } else if (m4Var2.K()) {
                                bundle.putDouble(m4Var2.x(), m4Var2.r());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static final void q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final String s(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void t(StringBuilder sb2, int i10, String str, hi.y4 y4Var) {
        if (y4Var == null) {
            return;
        }
        q(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (y4Var.s() != 0) {
            q(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : y4Var.B()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (y4Var.u() != 0) {
            q(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : y4Var.D()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (y4Var.r() != 0) {
            q(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (hi.g4 g4Var : y4Var.A()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(g4Var.y() ? Integer.valueOf(g4Var.r()) : null);
                sb2.append(":");
                sb2.append(g4Var.x() ? Long.valueOf(g4Var.s()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (y4Var.t() != 0) {
            q(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (hi.a5 a5Var : y4Var.C()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(a5Var.z() ? Integer.valueOf(a5Var.s()) : null);
                sb2.append(": [");
                int i19 = 0;
                for (Long l12 : a5Var.w()) {
                    long longValue = l12.longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        q(sb2, 3);
        sb2.append("}\n");
    }

    public static final void u(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        q(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void v(StringBuilder sb2, int i10, String str, hi.j3 j3Var) {
        if (j3Var == null) {
            return;
        }
        q(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (j3Var.x()) {
            int C = j3Var.C();
            u(sb2, i10, "comparison_type", C != 1 ? C != 2 ? C != 3 ? C != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (j3Var.z()) {
            u(sb2, i10, "match_as_float", Boolean.valueOf(j3Var.w()));
        }
        if (j3Var.y()) {
            u(sb2, i10, "comparison_value", j3Var.t());
        }
        if (j3Var.B()) {
            u(sb2, i10, "min_comparison_value", j3Var.v());
        }
        if (j3Var.A()) {
            u(sb2, i10, "max_comparison_value", j3Var.u());
        }
        q(sb2, i10);
        sb2.append("}\n");
    }

    public static int w(hi.r4 r4Var, String str) {
        for (int i10 = 0; i10 < r4Var.j0(); i10++) {
            if (str.equals(r4Var.d0(i10).w())) {
                return i10;
            }
        }
        return -1;
    }

    public final u A(hi.b bVar) {
        Object obj;
        Bundle y10 = y(bVar.e(), true);
        String obj2 = (!y10.containsKey("_o") || (obj = y10.get("_o")) == null) ? "app" : obj.toString();
        String b10 = z5.b(bVar.d());
        if (b10 == null) {
            b10 = bVar.d();
        }
        return new u(b10, new s(y10), obj2, bVar.a());
    }

    public final hi.i4 B(p pVar) {
        hi.h4 v10 = hi.i4.v();
        v10.A(pVar.f48114e);
        r rVar = new r(pVar.f48115f);
        while (rVar.hasNext()) {
            String next = rVar.next();
            hi.l4 v11 = hi.m4.v();
            v11.y(next);
            Object r02 = pVar.f48115f.r0(next);
            rh.p.i(r02);
            L(v11, r02);
            v10.t(v11);
        }
        return v10.h();
    }

    public final String D(hi.q4 q4Var) {
        if (q4Var == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (hi.s4 s4Var : q4Var.u()) {
            if (s4Var != null) {
                q(sb2, 1);
                sb2.append("bundle {\n");
                if (s4Var.l1()) {
                    u(sb2, 1, "protocol_version", Integer.valueOf(s4Var.t1()));
                }
                u(sb2, 1, "platform", s4Var.B());
                if (s4Var.h1()) {
                    u(sb2, 1, "gmp_version", Long.valueOf(s4Var.C1()));
                }
                if (s4Var.r1()) {
                    u(sb2, 1, "uploading_gmp_version", Long.valueOf(s4Var.H1()));
                }
                if (s4Var.f1()) {
                    u(sb2, 1, "dynamite_version", Long.valueOf(s4Var.A1()));
                }
                if (s4Var.r0()) {
                    u(sb2, 1, "config_version", Long.valueOf(s4Var.y1()));
                }
                u(sb2, 1, "gmp_app_id", s4Var.y());
                u(sb2, 1, "admob_app_id", s4Var.M1());
                u(sb2, 1, MRLog.PAYLOAD_KEY_APP_ID, s4Var.N1());
                u(sb2, 1, "app_version", s4Var.s());
                if (s4Var.p0()) {
                    u(sb2, 1, "app_version_major", Integer.valueOf(s4Var.R()));
                }
                u(sb2, 1, "firebase_instance_id", s4Var.w());
                if (s4Var.e1()) {
                    u(sb2, 1, "dev_cert_hash", Long.valueOf(s4Var.z1()));
                }
                u(sb2, 1, "app_store", s4Var.r());
                if (s4Var.q1()) {
                    u(sb2, 1, "upload_timestamp_millis", Long.valueOf(s4Var.G1()));
                }
                if (s4Var.o1()) {
                    u(sb2, 1, "start_timestamp_millis", Long.valueOf(s4Var.F1()));
                }
                if (s4Var.g1()) {
                    u(sb2, 1, "end_timestamp_millis", Long.valueOf(s4Var.B1()));
                }
                if (s4Var.k1()) {
                    u(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(s4Var.E1()));
                }
                if (s4Var.j1()) {
                    u(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(s4Var.D1()));
                }
                u(sb2, 1, "app_instance_id", s4Var.O1());
                u(sb2, 1, "resettable_device_id", s4Var.C());
                u(sb2, 1, "ds_id", s4Var.v());
                if (s4Var.i1()) {
                    u(sb2, 1, "limited_ad_tracking", Boolean.valueOf(s4Var.m0()));
                }
                u(sb2, 1, "os_version", s4Var.A());
                u(sb2, 1, "device_model", s4Var.u());
                u(sb2, 1, "user_default_language", s4Var.D());
                if (s4Var.p1()) {
                    u(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(s4Var.v1()));
                }
                if (s4Var.q0()) {
                    u(sb2, 1, "bundle_sequential_index", Integer.valueOf(s4Var.b1()));
                }
                if (s4Var.n1()) {
                    u(sb2, 1, "service_upload", Boolean.valueOf(s4Var.n0()));
                }
                u(sb2, 1, "health_monitor", s4Var.z());
                if (!this.f48285a.y().A(null, c3.f47717o0) && s4Var.o0() && s4Var.x1() != 0) {
                    u(sb2, 1, "android_id", Long.valueOf(s4Var.x1()));
                }
                if (s4Var.m1()) {
                    u(sb2, 1, "retry_counter", Integer.valueOf(s4Var.u1()));
                }
                if (s4Var.w0()) {
                    u(sb2, 1, "consent_signals", s4Var.t());
                }
                List<hi.c5> G = s4Var.G();
                if (G != null) {
                    for (hi.c5 c5Var : G) {
                        if (c5Var != null) {
                            q(sb2, 2);
                            sb2.append("user_property {\n");
                            u(sb2, 2, "set_timestamp_millis", c5Var.I() ? Long.valueOf(c5Var.t()) : null);
                            u(sb2, 2, "name", this.f48285a.C().f(c5Var.w()));
                            u(sb2, 2, "string_value", c5Var.x());
                            u(sb2, 2, "int_value", c5Var.H() ? Long.valueOf(c5Var.s()) : null);
                            u(sb2, 2, "double_value", c5Var.G() ? Double.valueOf(c5Var.r()) : null);
                            q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<hi.e4> E = s4Var.E();
                if (E != null) {
                    for (hi.e4 e4Var : E) {
                        if (e4Var != null) {
                            q(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (e4Var.B()) {
                                u(sb2, 2, "audience_id", Integer.valueOf(e4Var.r()));
                            }
                            if (e4Var.C()) {
                                u(sb2, 2, "new_audience", Boolean.valueOf(e4Var.A()));
                            }
                            t(sb2, 2, "current_data", e4Var.u());
                            if (e4Var.D()) {
                                t(sb2, 2, "previous_data", e4Var.v());
                            }
                            q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<hi.i4> F = s4Var.F();
                if (F != null) {
                    for (hi.i4 i4Var : F) {
                        if (i4Var != null) {
                            q(sb2, 2);
                            sb2.append("event {\n");
                            u(sb2, 2, "name", this.f48285a.C().d(i4Var.y()));
                            if (i4Var.K()) {
                                u(sb2, 2, "timestamp_millis", Long.valueOf(i4Var.u()));
                            }
                            if (i4Var.J()) {
                                u(sb2, 2, "previous_timestamp_millis", Long.valueOf(i4Var.t()));
                            }
                            if (i4Var.I()) {
                                u(sb2, 2, "count", Integer.valueOf(i4Var.r()));
                            }
                            if (i4Var.s() != 0) {
                                o(sb2, 2, i4Var.z());
                            }
                            q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                q(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    public final String E(hi.c3 c3Var) {
        if (c3Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c3Var.F()) {
            u(sb2, 0, "filter_id", Integer.valueOf(c3Var.s()));
        }
        u(sb2, 0, "event_name", this.f48285a.C().d(c3Var.x()));
        String s10 = s(c3Var.B(), c3Var.C(), c3Var.D());
        if (!s10.isEmpty()) {
            u(sb2, 0, "filter_type", s10);
        }
        if (c3Var.E()) {
            v(sb2, 1, "event_count_filter", c3Var.w());
        }
        if (c3Var.r() > 0) {
            sb2.append("  filters {\n");
            for (hi.e3 e3Var : c3Var.y()) {
                p(sb2, 2, e3Var);
            }
        }
        q(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String G(hi.l3 l3Var) {
        if (l3Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (l3Var.A()) {
            u(sb2, 0, "filter_id", Integer.valueOf(l3Var.r()));
        }
        u(sb2, 0, "property_name", this.f48285a.C().f(l3Var.v()));
        String s10 = s(l3Var.x(), l3Var.y(), l3Var.z());
        if (!s10.isEmpty()) {
            u(sb2, 0, "filter_type", s10);
        }
        p(sb2, 1, l3Var.s());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final List<Long> I(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.f48285a.r().v().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f48285a.r().v().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r7 >= r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        r4.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        r4.add(K((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> K(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            hi.be.b()
            pi.b5 r4 = r10.f48285a
            pi.g r4 = r4.y()
            r5 = 0
            pi.b3<java.lang.Boolean> r6 = pi.c3.f47733w0
            boolean r4 = r4.A(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.K(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.K(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.K(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.da.K(android.os.Bundle, boolean):java.util.Map");
    }

    public final void L(hi.l4 l4Var, Object obj) {
        rh.p.i(obj);
        l4Var.v();
        l4Var.t();
        l4Var.s();
        l4Var.u();
        if (obj instanceof String) {
            l4Var.z((String) obj);
        } else if (obj instanceof Long) {
            l4Var.x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            l4Var.w(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            l4Var.q(H((Bundle[]) obj));
        } else {
            this.f48285a.r().p().b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void M(hi.b5 b5Var, Object obj) {
        rh.p.i(obj);
        b5Var.r();
        b5Var.q();
        b5Var.o();
        if (obj instanceof String) {
            b5Var.w((String) obj);
        } else if (obj instanceof Long) {
            b5Var.t(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            b5Var.s(((Double) obj).doubleValue());
        } else {
            this.f48285a.r().p().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean O(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f48285a.c().currentTimeMillis() - j10) > j11;
    }

    public final byte[] Q(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f48285a.r().p().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // pi.r9
    public final boolean j() {
        return false;
    }

    public final void o(StringBuilder sb2, int i10, List<hi.m4> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (hi.m4 m4Var : list) {
            if (m4Var != null) {
                q(sb2, i11);
                sb2.append("param {\n");
                u(sb2, i11, "name", m4Var.N() ? this.f48285a.C().e(m4Var.x()) : null);
                u(sb2, i11, "string_value", m4Var.O() ? m4Var.y() : null);
                u(sb2, i11, "int_value", m4Var.M() ? Long.valueOf(m4Var.u()) : null);
                u(sb2, i11, "double_value", m4Var.K() ? Double.valueOf(m4Var.r()) : null);
                if (m4Var.t() > 0) {
                    o(sb2, i11, m4Var.z());
                }
                q(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public final void p(StringBuilder sb2, int i10, hi.e3 e3Var) {
        String str;
        if (e3Var == null) {
            return;
        }
        q(sb2, i10);
        sb2.append("filter {\n");
        if (e3Var.y()) {
            u(sb2, i10, "complement", Boolean.valueOf(e3Var.x()));
        }
        if (e3Var.A()) {
            u(sb2, i10, "param_name", this.f48285a.C().e(e3Var.v()));
        }
        if (e3Var.B()) {
            int i11 = i10 + 1;
            hi.q3 u10 = e3Var.u();
            if (u10 != null) {
                q(sb2, i11);
                sb2.append("string_filter {\n");
                if (u10.z()) {
                    switch (u10.A()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    u(sb2, i11, "match_type", str);
                }
                if (u10.y()) {
                    u(sb2, i11, "expression", u10.u());
                }
                if (u10.x()) {
                    u(sb2, i11, "case_sensitive", Boolean.valueOf(u10.w()));
                }
                if (u10.r() > 0) {
                    q(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : u10.v()) {
                        q(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                q(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (e3Var.z()) {
            v(sb2, i10 + 1, "number_filter", e3Var.t());
        }
        q(sb2, i10);
        sb2.append("}\n");
    }

    public final long x(byte[] bArr) {
        rh.p.i(bArr);
        this.f48285a.N().f();
        MessageDigest q10 = ia.q();
        if (q10 == null) {
            this.f48285a.r().p().a("Failed to get MD5");
            return 0L;
        }
        return ia.q0(q10.digest(bArr));
    }

    public final Bundle y(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                be.b();
                if (this.f48285a.y().A(null, c3.f47733w0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(y((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList4.add(y((Map) arrayList3.get(i11), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    public final <T extends Parcelable> T z(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f48285a.r().p().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
