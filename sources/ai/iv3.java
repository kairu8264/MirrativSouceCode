package ai;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes3.dex */
public final class iv3 implements sv3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5428a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<? extends mv3> f5429b;

    static {
        Constructor<? extends mv3> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(mv3.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f5429b = constructor;
    }

    public static final void b(int i10, List<mv3> list) {
        switch (i10) {
            case 0:
                list.add(new l04());
                return;
            case 1:
                list.add(new o04());
                return;
            case 2:
                list.add(new r04(0));
                return;
            case 3:
                list.add(new xw3(0));
                return;
            case 4:
                Constructor<? extends mv3> constructor = f5429b;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(0));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                }
                list.add(new dx3(0));
                return;
            case 5:
                list.add(new gx3());
                return;
            case 6:
                list.add(new by3(0));
                return;
            case 7:
                list.add(new jy3(0));
                return;
            case 8:
                list.add(new ez3(0, null));
                list.add(new jz3(0));
                return;
            case 9:
                list.add(new zz3());
                return;
            case 10:
                list.add(new v14());
                return;
            case 11:
                list.add(new g24(1, 0, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                return;
            case 12:
                list.add(new s24());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new kx3());
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x02bf, code lost:
        if (r15 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02c1, code lost:
        b(r15, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0175 A[Catch: all -> 0x02e3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:105:0x0175, B:106:0x0178, B:192:0x02c1, B:193:0x02c4, B:195:0x02c9, B:198:0x02cf, B:199:0x02d2, B:200:0x02d5, B:109:0x0181, B:111:0x0189, B:114:0x0193, B:117:0x019e, B:119:0x01a6, B:122:0x01b0, B:125:0x01bb, B:128:0x01c6, B:131:0x01d1, B:133:0x01df, B:136:0x01e9, B:139:0x01f4, B:141:0x01fc, B:143:0x020a, B:145:0x0218, B:148:0x0228, B:150:0x0236, B:153:0x0240, B:155:0x0248, B:157:0x0250, B:159:0x0258, B:162:0x0262, B:164:0x026a, B:167:0x0279, B:169:0x0281, B:172:0x028a, B:174:0x0292, B:177:0x029b, B:179:0x02a3, B:12:0x003b, B:13:0x0043, B:88:0x0152, B:15:0x0048, B:18:0x0053, B:21:0x005e, B:24:0x0069, B:27:0x0074, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:42:0x00ae, B:45:0x00ba, B:48:0x00c5, B:51:0x00d0, B:54:0x00db, B:57:0x00e7, B:60:0x00f2, B:63:0x00fc, B:66:0x0107, B:69:0x0112, B:72:0x011d, B:75:0x0127, B:78:0x0131, B:81:0x013c, B:84:0x0147), top: B:206:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0181 A[Catch: all -> 0x02e3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:105:0x0175, B:106:0x0178, B:192:0x02c1, B:193:0x02c4, B:195:0x02c9, B:198:0x02cf, B:199:0x02d2, B:200:0x02d5, B:109:0x0181, B:111:0x0189, B:114:0x0193, B:117:0x019e, B:119:0x01a6, B:122:0x01b0, B:125:0x01bb, B:128:0x01c6, B:131:0x01d1, B:133:0x01df, B:136:0x01e9, B:139:0x01f4, B:141:0x01fc, B:143:0x020a, B:145:0x0218, B:148:0x0228, B:150:0x0236, B:153:0x0240, B:155:0x0248, B:157:0x0250, B:159:0x0258, B:162:0x0262, B:164:0x026a, B:167:0x0279, B:169:0x0281, B:172:0x028a, B:174:0x0292, B:177:0x029b, B:179:0x02a3, B:12:0x003b, B:13:0x0043, B:88:0x0152, B:15:0x0048, B:18:0x0053, B:21:0x005e, B:24:0x0069, B:27:0x0074, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:42:0x00ae, B:45:0x00ba, B:48:0x00c5, B:51:0x00d0, B:54:0x00db, B:57:0x00e7, B:60:0x00f2, B:63:0x00fc, B:66:0x0107, B:69:0x0112, B:72:0x011d, B:75:0x0127, B:78:0x0131, B:81:0x013c, B:84:0x0147), top: B:206:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c9 A[Catch: all -> 0x02e3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:105:0x0175, B:106:0x0178, B:192:0x02c1, B:193:0x02c4, B:195:0x02c9, B:198:0x02cf, B:199:0x02d2, B:200:0x02d5, B:109:0x0181, B:111:0x0189, B:114:0x0193, B:117:0x019e, B:119:0x01a6, B:122:0x01b0, B:125:0x01bb, B:128:0x01c6, B:131:0x01d1, B:133:0x01df, B:136:0x01e9, B:139:0x01f4, B:141:0x01fc, B:143:0x020a, B:145:0x0218, B:148:0x0228, B:150:0x0236, B:153:0x0240, B:155:0x0248, B:157:0x0250, B:159:0x0258, B:162:0x0262, B:164:0x026a, B:167:0x0279, B:169:0x0281, B:172:0x028a, B:174:0x0292, B:177:0x029b, B:179:0x02a3, B:12:0x003b, B:13:0x0043, B:88:0x0152, B:15:0x0048, B:18:0x0053, B:21:0x005e, B:24:0x0069, B:27:0x0074, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:42:0x00ae, B:45:0x00ba, B:48:0x00c5, B:51:0x00d0, B:54:0x00db, B:57:0x00e7, B:60:0x00f2, B:63:0x00fc, B:66:0x0107, B:69:0x0112, B:72:0x011d, B:75:0x0127, B:78:0x0131, B:81:0x013c, B:84:0x0147), top: B:206:0x0001 }] */
    @Override // ai.sv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized ai.mv3[] a(android.net.Uri r19, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r20) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.iv3.a(android.net.Uri, java.util.Map):ai.mv3[]");
    }
}
