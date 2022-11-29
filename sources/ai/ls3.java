package ai;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ls3 implements ds3, pm {
    public static final b03<String, Integer> J;
    public static final zz2<Long> K;
    public static final zz2<Long> L;
    public static final zz2<Long> M;
    public static final zz2<Long> N;
    public static final zz2<Long> O;
    public static final zz2<Long> P;
    public static ls3 Q;
    public int B;
    public long C;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: w  reason: collision with root package name */
    public final d03<Integer, Long> f6654w;

    /* renamed from: z  reason: collision with root package name */
    public final v9 f6657z;

    /* renamed from: x  reason: collision with root package name */
    public final bs3 f6655x = new bs3();

    /* renamed from: y  reason: collision with root package name */
    public final gt3 f6656y = new gt3(2000);
    public final boolean A = true;

    static {
        a03 a03Var = new a03();
        a03Var.a("AD", 1, 2, 0, 0, 2, 2);
        a03Var.a("AE", 1, 4, 4, 4, 2, 2);
        a03Var.a("AF", 4, 4, 3, 4, 2, 2);
        a03Var.a("AG", 4, 2, 1, 4, 2, 2);
        a03Var.a("AI", 1, 2, 2, 2, 2, 2);
        a03Var.a("AL", 1, 1, 1, 1, 2, 2);
        a03Var.a("AM", 2, 2, 1, 3, 2, 2);
        a03Var.a("AO", 3, 4, 3, 1, 2, 2);
        a03Var.a("AR", 2, 4, 2, 1, 2, 2);
        a03Var.a("AS", 2, 2, 3, 3, 2, 2);
        a03Var.a("AT", 0, 1, 0, 0, 0, 2);
        a03Var.a("AU", 0, 2, 0, 1, 1, 2);
        a03Var.a("AW", 1, 2, 0, 4, 2, 2);
        a03Var.a("AX", 0, 2, 2, 2, 2, 2);
        a03Var.a("AZ", 3, 3, 3, 4, 4, 2);
        a03Var.a("BA", 1, 1, 0, 1, 2, 2);
        a03Var.a("BB", 0, 2, 0, 0, 2, 2);
        a03Var.a("BD", 2, 0, 3, 3, 2, 2);
        a03Var.a("BE", 0, 0, 2, 3, 2, 2);
        a03Var.a("BF", 4, 4, 4, 2, 2, 2);
        a03Var.a("BG", 0, 1, 0, 0, 2, 2);
        a03Var.a("BH", 1, 0, 2, 4, 2, 2);
        a03Var.a("BI", 4, 4, 4, 4, 2, 2);
        a03Var.a("BJ", 4, 4, 4, 4, 2, 2);
        a03Var.a("BL", 1, 2, 2, 2, 2, 2);
        a03Var.a("BM", 0, 2, 0, 0, 2, 2);
        a03Var.a("BN", 3, 2, 1, 0, 2, 2);
        a03Var.a("BO", 1, 2, 4, 2, 2, 2);
        a03Var.a("BQ", 1, 2, 1, 2, 2, 2);
        a03Var.a("BR", 2, 4, 3, 2, 2, 2);
        a03Var.a("BS", 2, 2, 1, 3, 2, 2);
        a03Var.a("BT", 3, 0, 3, 2, 2, 2);
        a03Var.a("BW", 3, 4, 1, 1, 2, 2);
        a03Var.a("BY", 1, 1, 1, 2, 2, 2);
        a03Var.a("BZ", 2, 2, 2, 2, 2, 2);
        a03Var.a("CA", 0, 3, 1, 2, 4, 2);
        a03Var.a("CD", 4, 2, 2, 1, 2, 2);
        a03Var.a("CF", 4, 2, 3, 2, 2, 2);
        a03Var.a("CG", 3, 4, 2, 2, 2, 2);
        a03Var.a("CH", 0, 0, 0, 0, 1, 2);
        a03Var.a("CI", 3, 3, 3, 3, 2, 2);
        a03Var.a("CK", 2, 2, 3, 0, 2, 2);
        a03Var.a("CL", 1, 1, 2, 2, 2, 2);
        a03Var.a("CM", 3, 4, 3, 2, 2, 2);
        a03Var.a("CN", 2, 2, 2, 1, 3, 2);
        a03Var.a("CO", 2, 3, 4, 2, 2, 2);
        a03Var.a("CR", 2, 3, 4, 4, 2, 2);
        a03Var.a("CU", 4, 4, 2, 2, 2, 2);
        a03Var.a("CV", 2, 3, 1, 0, 2, 2);
        a03Var.a("CW", 1, 2, 0, 0, 2, 2);
        a03Var.a("CY", 1, 1, 0, 0, 2, 2);
        a03Var.a("CZ", 0, 1, 0, 0, 1, 2);
        a03Var.a("DE", 0, 0, 1, 1, 0, 2);
        a03Var.a("DJ", 4, 0, 4, 4, 2, 2);
        a03Var.a("DK", 0, 0, 1, 0, 0, 2);
        a03Var.a("DM", 1, 2, 2, 2, 2, 2);
        a03Var.a("DO", 3, 4, 4, 4, 2, 2);
        a03Var.a("DZ", 3, 3, 4, 4, 2, 4);
        a03Var.a("EC", 2, 4, 3, 1, 2, 2);
        a03Var.a("EE", 0, 1, 0, 0, 2, 2);
        a03Var.a("EG", 3, 4, 3, 3, 2, 2);
        a03Var.a("EH", 2, 2, 2, 2, 2, 2);
        a03Var.a("ER", 4, 2, 2, 2, 2, 2);
        a03Var.a("ES", 0, 1, 1, 1, 2, 2);
        a03Var.a("ET", 4, 4, 4, 1, 2, 2);
        a03Var.a("FI", 0, 0, 0, 0, 0, 2);
        a03Var.a("FJ", 3, 0, 2, 3, 2, 2);
        a03Var.a("FK", 4, 2, 2, 2, 2, 2);
        a03Var.a("FM", 3, 2, 4, 4, 2, 2);
        a03Var.a("FO", 1, 2, 0, 1, 2, 2);
        a03Var.a("FR", 1, 1, 2, 0, 1, 2);
        a03Var.a("GA", 3, 4, 1, 1, 2, 2);
        a03Var.a("GB", 0, 0, 1, 1, 1, 2);
        a03Var.a("GD", 1, 2, 2, 2, 2, 2);
        a03Var.a("GE", 1, 1, 1, 2, 2, 2);
        a03Var.a("GF", 2, 2, 2, 3, 2, 2);
        a03Var.a("GG", 1, 2, 0, 0, 2, 2);
        a03Var.a("GH", 3, 1, 3, 2, 2, 2);
        a03Var.a("GI", 0, 2, 0, 0, 2, 2);
        a03Var.a("GL", 1, 2, 0, 0, 2, 2);
        a03Var.a("GM", 4, 3, 2, 4, 2, 2);
        a03Var.a("GN", 4, 3, 4, 2, 2, 2);
        a03Var.a("GP", 2, 1, 2, 3, 2, 2);
        a03Var.a("GQ", 4, 2, 2, 4, 2, 2);
        a03Var.a("GR", 1, 2, 0, 0, 2, 2);
        a03Var.a("GT", 3, 2, 3, 1, 2, 2);
        a03Var.a("GU", 1, 2, 3, 4, 2, 2);
        a03Var.a("GW", 4, 4, 4, 4, 2, 2);
        a03Var.a("GY", 3, 3, 3, 4, 2, 2);
        a03Var.a("HK", 0, 1, 2, 3, 2, 0);
        a03Var.a("HN", 3, 1, 3, 3, 2, 2);
        a03Var.a("HR", 1, 1, 0, 0, 3, 2);
        a03Var.a("HT", 4, 4, 4, 4, 2, 2);
        a03Var.a("HU", 0, 0, 0, 0, 0, 2);
        a03Var.a("ID", 3, 2, 3, 3, 2, 2);
        a03Var.a("IE", 0, 0, 1, 1, 3, 2);
        a03Var.a("IL", 1, 0, 2, 3, 4, 2);
        a03Var.a("IM", 0, 2, 0, 1, 2, 2);
        a03Var.a("IN", 2, 1, 3, 3, 2, 2);
        a03Var.a("IO", 4, 2, 2, 4, 2, 2);
        a03Var.a("IQ", 3, 3, 4, 4, 2, 2);
        a03Var.a("IR", 3, 2, 3, 2, 2, 2);
        a03Var.a("IS", 0, 2, 0, 0, 2, 2);
        a03Var.a("IT", 0, 4, 0, 1, 2, 2);
        a03Var.a("JE", 2, 2, 1, 2, 2, 2);
        a03Var.a("JM", 3, 3, 4, 4, 2, 2);
        a03Var.a("JO", 2, 2, 1, 1, 2, 2);
        a03Var.a("JP", 0, 0, 0, 0, 2, 1);
        a03Var.a("KE", 3, 4, 2, 2, 2, 2);
        a03Var.a("KG", 2, 0, 1, 1, 2, 2);
        a03Var.a("KH", 1, 0, 4, 3, 2, 2);
        a03Var.a("KI", 4, 2, 4, 3, 2, 2);
        a03Var.a("KM", 4, 3, 2, 3, 2, 2);
        a03Var.a("KN", 1, 2, 2, 2, 2, 2);
        a03Var.a("KP", 4, 2, 2, 2, 2, 2);
        a03Var.a("KR", 0, 0, 1, 3, 1, 2);
        a03Var.a("KW", 1, 3, 1, 1, 1, 2);
        a03Var.a("KY", 1, 2, 0, 2, 2, 2);
        a03Var.a("KZ", 2, 2, 2, 3, 2, 2);
        a03Var.a("LA", 1, 2, 1, 1, 2, 2);
        a03Var.a("LB", 3, 2, 0, 0, 2, 2);
        a03Var.a("LC", 1, 2, 0, 0, 2, 2);
        a03Var.a("LI", 0, 2, 2, 2, 2, 2);
        a03Var.a("LK", 2, 0, 2, 3, 2, 2);
        a03Var.a("LR", 3, 4, 4, 3, 2, 2);
        a03Var.a("LS", 3, 3, 2, 3, 2, 2);
        a03Var.a("LT", 0, 0, 0, 0, 2, 2);
        a03Var.a("LU", 1, 0, 1, 1, 2, 2);
        a03Var.a("LV", 0, 0, 0, 0, 2, 2);
        a03Var.a("LY", 4, 2, 4, 3, 2, 2);
        a03Var.a("MA", 3, 2, 2, 1, 2, 2);
        a03Var.a("MC", 0, 2, 0, 0, 2, 2);
        a03Var.a("MD", 1, 2, 0, 0, 2, 2);
        a03Var.a("ME", 1, 2, 0, 1, 2, 2);
        a03Var.a("MF", 2, 2, 1, 1, 2, 2);
        a03Var.a("MG", 3, 4, 2, 2, 2, 2);
        a03Var.a("MH", 4, 2, 2, 4, 2, 2);
        a03Var.a("MK", 1, 1, 0, 0, 2, 2);
        a03Var.a("ML", 4, 4, 2, 2, 2, 2);
        a03Var.a("MM", 2, 3, 3, 3, 2, 2);
        a03Var.a("MN", 2, 4, 2, 2, 2, 2);
        a03Var.a("MO", 0, 2, 4, 4, 2, 2);
        a03Var.a("MP", 0, 2, 2, 2, 2, 2);
        a03Var.a("MQ", 2, 2, 2, 3, 2, 2);
        a03Var.a("MR", 3, 0, 4, 3, 2, 2);
        a03Var.a("MS", 1, 2, 2, 2, 2, 2);
        a03Var.a("MT", 0, 2, 0, 0, 2, 2);
        a03Var.a("MU", 2, 1, 1, 2, 2, 2);
        a03Var.a("MV", 4, 3, 2, 4, 2, 2);
        a03Var.a("MW", 4, 2, 1, 0, 2, 2);
        a03Var.a("MX", 2, 4, 4, 4, 4, 2);
        a03Var.a("MY", 1, 0, 3, 2, 2, 2);
        a03Var.a("MZ", 3, 3, 2, 1, 2, 2);
        a03Var.a("NA", 4, 3, 3, 2, 2, 2);
        a03Var.a("NC", 3, 0, 4, 4, 2, 2);
        a03Var.a("NE", 4, 4, 4, 4, 2, 2);
        a03Var.a("NF", 2, 2, 2, 2, 2, 2);
        a03Var.a("NG", 3, 3, 2, 3, 2, 2);
        a03Var.a("NI", 2, 1, 4, 4, 2, 2);
        a03Var.a("NL", 0, 2, 3, 2, 0, 2);
        a03Var.a("NO", 0, 1, 2, 0, 0, 2);
        a03Var.a("NP", 2, 0, 4, 2, 2, 2);
        a03Var.a("NR", 3, 2, 3, 1, 2, 2);
        a03Var.a("NU", 4, 2, 2, 2, 2, 2);
        a03Var.a("NZ", 0, 2, 1, 2, 4, 2);
        a03Var.a("OM", 2, 2, 1, 3, 3, 2);
        a03Var.a("PA", 1, 3, 3, 3, 2, 2);
        a03Var.a("PE", 2, 3, 4, 4, 2, 2);
        a03Var.a("PF", 2, 2, 2, 1, 2, 2);
        a03Var.a("PG", 4, 4, 3, 2, 2, 2);
        a03Var.a("PH", 2, 1, 3, 3, 3, 2);
        a03Var.a("PK", 3, 2, 3, 3, 2, 2);
        a03Var.a("PL", 1, 0, 1, 2, 3, 2);
        a03Var.a("PM", 0, 2, 2, 2, 2, 2);
        a03Var.a("PR", 2, 1, 2, 2, 4, 3);
        a03Var.a("PS", 3, 3, 2, 2, 2, 2);
        a03Var.a("PT", 0, 1, 1, 0, 2, 2);
        a03Var.a("PW", 1, 2, 4, 1, 2, 2);
        a03Var.a("PY", 2, 0, 3, 2, 2, 2);
        a03Var.a("QA", 2, 3, 1, 2, 3, 2);
        a03Var.a("RE", 1, 0, 2, 2, 2, 2);
        a03Var.a("RO", 0, 1, 0, 1, 0, 2);
        a03Var.a("RS", 1, 2, 0, 0, 2, 2);
        a03Var.a("RU", 0, 1, 0, 1, 4, 2);
        a03Var.a("RW", 3, 3, 3, 1, 2, 2);
        a03Var.a("SA", 2, 2, 2, 1, 1, 2);
        a03Var.a("SB", 4, 2, 3, 2, 2, 2);
        a03Var.a("SC", 4, 2, 1, 3, 2, 2);
        a03Var.a("SD", 4, 4, 4, 4, 2, 2);
        a03Var.a("SE", 0, 0, 0, 0, 0, 2);
        a03Var.a("SG", 1, 0, 1, 2, 3, 2);
        a03Var.a("SH", 4, 2, 2, 2, 2, 2);
        a03Var.a("SI", 0, 0, 0, 0, 2, 2);
        a03Var.a("SJ", 2, 2, 2, 2, 2, 2);
        a03Var.a("SK", 0, 1, 0, 0, 2, 2);
        a03Var.a("SL", 4, 3, 4, 0, 2, 2);
        a03Var.a("SM", 0, 2, 2, 2, 2, 2);
        a03Var.a("SN", 4, 4, 4, 4, 2, 2);
        a03Var.a("SO", 3, 3, 3, 4, 2, 2);
        a03Var.a("SR", 3, 2, 2, 2, 2, 2);
        a03Var.a("SS", 4, 4, 3, 3, 2, 2);
        a03Var.a("ST", 2, 2, 1, 2, 2, 2);
        a03Var.a("SV", 2, 1, 4, 3, 2, 2);
        a03Var.a("SX", 2, 2, 1, 0, 2, 2);
        a03Var.a("SY", 4, 3, 3, 2, 2, 2);
        a03Var.a("SZ", 3, 3, 2, 4, 2, 2);
        a03Var.a("TC", 2, 2, 2, 0, 2, 2);
        a03Var.a("TD", 4, 3, 4, 4, 2, 2);
        a03Var.a("TG", 3, 2, 2, 4, 2, 2);
        a03Var.a("TH", 0, 3, 2, 3, 2, 2);
        a03Var.a("TJ", 4, 4, 4, 4, 2, 2);
        a03Var.a("TL", 4, 0, 4, 4, 2, 2);
        a03Var.a("TM", 4, 2, 4, 3, 2, 2);
        a03Var.a("TN", 2, 1, 1, 2, 2, 2);
        a03Var.a("TO", 3, 3, 4, 3, 2, 2);
        a03Var.a("TR", 1, 2, 1, 1, 2, 2);
        a03Var.a("TT", 1, 4, 0, 1, 2, 2);
        a03Var.a("TV", 3, 2, 2, 4, 2, 2);
        a03Var.a("TW", 0, 0, 0, 0, 1, 0);
        a03Var.a("TZ", 3, 3, 3, 2, 2, 2);
        a03Var.a("UA", 0, 3, 1, 1, 2, 2);
        a03Var.a("UG", 3, 2, 3, 3, 2, 2);
        a03Var.a("US", 1, 1, 2, 2, 4, 2);
        a03Var.a("UY", 2, 2, 1, 1, 2, 2);
        a03Var.a("UZ", 2, 1, 3, 4, 2, 2);
        a03Var.a("VC", 1, 2, 2, 2, 2, 2);
        a03Var.a("VE", 4, 4, 4, 4, 2, 2);
        a03Var.a("VG", 2, 2, 1, 1, 2, 2);
        a03Var.a("VI", 1, 2, 1, 2, 2, 2);
        a03Var.a("VN", 0, 1, 3, 4, 2, 2);
        a03Var.a("VU", 4, 0, 3, 1, 2, 2);
        a03Var.a("WF", 4, 2, 2, 4, 2, 2);
        a03Var.a("WS", 3, 1, 3, 1, 2, 2);
        a03Var.a("XK", 0, 1, 1, 0, 2, 2);
        a03Var.a("YE", 4, 4, 4, 3, 2, 2);
        a03Var.a("YT", 4, 2, 2, 3, 2, 2);
        a03Var.a("ZA", 3, 3, 2, 1, 2, 2);
        a03Var.a("ZM", 3, 2, 3, 3, 2, 2);
        a03Var.a("ZW", 3, 2, 4, 3, 2, 2);
        J = a03Var.b();
        K = zz2.w(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
        L = zz2.w(248000L, 160000L, 142000L, 127000L, 113000L);
        M = zz2.w(2200000L, 1300000L, 950000L, 760000L, 520000L);
        N = zz2.w(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
        O = zz2.w(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
        P = zz2.w(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ls3(Context context, Context context2, Map<Integer, Long> map, int i10, v9 v9Var, boolean z10) {
        this.f6654w = d03.e(context2);
        this.f6657z = i10;
        if (context != null) {
            fb a10 = fb.a(context);
            int c10 = a10.c();
            this.E = c10;
            this.H = h(c10);
            a10.b(new ab(this) { // from class: ai.js3

                /* renamed from: a  reason: collision with root package name */
                public final ls3 f5916a;

                {
                    this.f5916a = this;
                }

                @Override // ai.ab
                public final void G(int i11) {
                    this.f5916a.d(i11);
                }
            });
            return;
        }
        this.E = 0;
        this.H = h(0);
    }

    public static synchronized ls3 c(Context context) {
        ls3 ls3Var;
        synchronized (ls3.class) {
            if (Q == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                zz2<Integer> j10 = J.j(sb.x(context));
                if (j10.isEmpty()) {
                    j10 = zz2.x(2, 2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                zz2<Long> zz2Var = K;
                hashMap.put(2, zz2Var.get(j10.get(0).intValue()));
                hashMap.put(3, L.get(j10.get(1).intValue()));
                hashMap.put(4, M.get(j10.get(2).intValue()));
                hashMap.put(5, N.get(j10.get(3).intValue()));
                hashMap.put(10, O.get(j10.get(4).intValue()));
                hashMap.put(9, P.get(j10.get(5).intValue()));
                hashMap.put(7, zz2Var.get(j10.get(0).intValue()));
                Q = new ls3(applicationContext, hashMap, 2000, v9.f11007a, true, null);
            }
            ls3Var = Q;
        }
        return ls3Var;
    }

    public static boolean i(bc bcVar, boolean z10) {
        return z10 && !bcVar.b(8);
    }

    @Override // ai.ds3
    public final void a(Handler handler, cs3 cs3Var) {
        this.f6655x.a(handler, cs3Var);
    }

    @Override // ai.ds3
    public final void b(cs3 cs3Var) {
        this.f6655x.b(cs3Var);
    }

    /* renamed from: e */
    public final synchronized void d(int i10) {
        int i11 = this.E;
        if (i11 == 0 || this.A) {
            if (i11 == i10) {
                return;
            }
            this.E = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.H = h(i10);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                f(this.B > 0 ? (int) (elapsedRealtime - this.C) : 0, this.D, this.H);
                this.C = elapsedRealtime;
                this.D = 0L;
                this.G = 0L;
                this.F = 0L;
                this.f6656y.a();
            }
        }
    }

    public final void f(int i10, long j10, long j11) {
        int i11;
        if (i10 != 0) {
            i11 = i10;
        } else if (j10 == 0 && j11 == this.I) {
            return;
        } else {
            i11 = 0;
        }
        this.I = j11;
        this.f6655x.c(i11, j10, j11);
    }

    @Override // ai.pm
    public final synchronized void g(a8 a8Var, bc bcVar, boolean z10) {
        if (i(bcVar, z10)) {
            if (this.B == 0) {
                this.C = SystemClock.elapsedRealtime();
            }
            this.B++;
        }
    }

    public final long h(int i10) {
        Long l10 = this.f6654w.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f6654w.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    @Override // ai.pm
    public final synchronized void k(a8 a8Var, bc bcVar, boolean z10) {
        if (i(bcVar, z10)) {
            u9.d(this.B > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i10 = (int) (elapsedRealtime - this.C);
            this.F += i10;
            long j10 = this.G;
            long j11 = this.D;
            this.G = j10 + j11;
            if (i10 > 0) {
                this.f6656y.b((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.F >= SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS || this.G >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.H = this.f6656y.c(0.5f);
                }
                f(i10, this.D, this.H);
                this.C = elapsedRealtime;
                this.D = 0L;
            }
            this.B--;
        }
    }

    @Override // ai.pm
    public final synchronized void s(a8 a8Var, bc bcVar, boolean z10, int i10) {
        if (i(bcVar, z10)) {
            this.D += i10;
        }
    }

    @Override // ai.pm
    public final void w(a8 a8Var, bc bcVar, boolean z10) {
    }
}
