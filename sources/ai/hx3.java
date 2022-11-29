package ai;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hx3 extends ix3 {

    /* renamed from: b  reason: collision with root package name */
    public long f5032b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f5033c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f5034d;

    public hx3() {
        super(new lv3());
        this.f5032b = C.TIME_UNSET;
        this.f5033c = new long[0];
        this.f5034d = new long[0];
    }

    public static Double g(hb hbVar) {
        return Double.valueOf(Double.longBitsToDouble(hbVar.F()));
    }

    public static String h(hb hbVar) {
        int w10 = hbVar.w();
        int o10 = hbVar.o();
        hbVar.s(w10);
        return new String(hbVar.q(), o10, w10);
    }

    public static HashMap<String, Object> i(hb hbVar) {
        int b10 = hbVar.b();
        HashMap<String, Object> hashMap = new HashMap<>(b10);
        for (int i10 = 0; i10 < b10; i10++) {
            String h10 = h(hbVar);
            Object j10 = j(hbVar, hbVar.v());
            if (j10 != null) {
                hashMap.put(h10, j10);
            }
        }
        return hashMap;
    }

    public static Object j(hb hbVar, int i10) {
        if (i10 == 0) {
            return g(hbVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(hbVar.v() == 1);
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 != 11) {
                            return null;
                        }
                        Date date = new Date((long) g(hbVar).doubleValue());
                        hbVar.s(2);
                        return date;
                    }
                    int b10 = hbVar.b();
                    ArrayList arrayList = new ArrayList(b10);
                    for (int i11 = 0; i11 < b10; i11++) {
                        Object j10 = j(hbVar, hbVar.v());
                        if (j10 != null) {
                            arrayList.add(j10);
                        }
                    }
                    return arrayList;
                }
                return i(hbVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String h10 = h(hbVar);
                int v10 = hbVar.v();
                if (v10 == 9) {
                    return hashMap;
                }
                Object j11 = j(hbVar, v10);
                if (j11 != null) {
                    hashMap.put(h10, j11);
                }
            }
        } else {
            return h(hbVar);
        }
    }

    @Override // ai.ix3
    public final boolean a(hb hbVar) {
        return true;
    }

    @Override // ai.ix3
    public final boolean b(hb hbVar, long j10) {
        if (hbVar.v() == 2 && "onMetaData".equals(h(hbVar)) && hbVar.v() == 8) {
            HashMap<String, Object> i10 = i(hbVar);
            Object obj = i10.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f5032b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = i10.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f5033c = new long[size];
                    this.f5034d = new long[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj5 = list.get(i11);
                        Object obj6 = list2.get(i11);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f5033c = new long[0];
                            this.f5034d = new long[0];
                            break;
                        }
                        this.f5033c[i11] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f5034d[i11] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long d() {
        return this.f5032b;
    }

    public final long[] e() {
        return this.f5033c;
    }

    public final long[] f() {
        return this.f5034d;
    }
}
