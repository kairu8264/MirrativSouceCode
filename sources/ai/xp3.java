package ai;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class xp3 implements ws3, qo3 {

    /* renamed from: b */
    public final Uri f12062b;

    /* renamed from: c */
    public final ht3 f12063c;

    /* renamed from: d */
    public final sp3 f12064d;

    /* renamed from: e */
    public final pv3 f12065e;

    /* renamed from: f */
    public final x9 f12066f;

    /* renamed from: h */
    public volatile boolean f12068h;

    /* renamed from: j */
    public long f12070j;

    /* renamed from: m */
    public pw3 f12073m;

    /* renamed from: n */
    public boolean f12074n;

    /* renamed from: o */
    public final /* synthetic */ cq3 f12075o;

    /* renamed from: g */
    public final iw3 f12067g = new iw3();

    /* renamed from: i */
    public boolean f12069i = true;

    /* renamed from: l */
    public long f12072l = -1;

    /* renamed from: a */
    public final long f12061a = so3.a();

    /* renamed from: k */
    public bc f12071k = j(0);

    public xp3(cq3 cq3Var, Uri uri, a8 a8Var, sp3 sp3Var, pv3 pv3Var, x9 x9Var) {
        this.f12075o = cq3Var;
        this.f12062b = uri;
        this.f12063c = new ht3(a8Var);
        this.f12064d = sp3Var;
        this.f12065e = pv3Var;
        this.f12066f = x9Var;
    }

    public static /* synthetic */ long b(xp3 xp3Var) {
        return xp3Var.f12061a;
    }

    public static /* synthetic */ ht3 c(xp3 xp3Var) {
        return xp3Var.f12063c;
    }

    public static /* synthetic */ long d(xp3 xp3Var) {
        return xp3Var.f12070j;
    }

    public static /* synthetic */ bc g(xp3 xp3Var) {
        return xp3Var.f12071k;
    }

    public static /* synthetic */ long h(xp3 xp3Var) {
        return xp3Var.f12072l;
    }

    public static /* synthetic */ void i(xp3 xp3Var, long j10, long j11) {
        xp3Var.f12067g.f5438a = j10;
        xp3Var.f12070j = j11;
        xp3Var.f12069i = true;
        xp3Var.f12074n = false;
    }

    @Override // ai.qo3
    public final void a(hb hbVar) {
        long J;
        long max;
        if (this.f12074n) {
            J = this.f12075o.J();
            max = Math.max(J, this.f12070j);
        } else {
            max = this.f12070j;
        }
        int l10 = hbVar.l();
        pw3 pw3Var = this.f12073m;
        Objects.requireNonNull(pw3Var);
        nw3.b(pw3Var, hbVar, l10);
        pw3Var.e(max, 1, l10, 0, null);
        this.f12074n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0093 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a9 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00bf A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00d5 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f1 A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0137 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x014a A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0192 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019b A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01eb A[EDGE_INSN: B:263:0x01eb->B:228:0x01eb ?: BREAK  , SYNTHETIC] */
    @Override // ai.ws3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.xp3.e():void");
    }

    @Override // ai.ws3
    public final void f() {
        this.f12068h = true;
    }

    public final bc j(long j10) {
        Map<String, String> map;
        aa aaVar = new aa();
        aaVar.a(this.f12062b);
        aaVar.c(j10);
        aaVar.d(6);
        map = cq3.f2898h0;
        aaVar.b(map);
        return aaVar.e();
    }
}
