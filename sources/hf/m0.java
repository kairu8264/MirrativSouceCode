package hf;

import android.content.Context;
import android.os.Build;
import nd.f1;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f35562c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f35563d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kf.t f35564a;

    /* renamed from: b  reason: collision with root package name */
    public final r f35565b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public m0(kf.t tVar, r rVar) {
        jo.p.h(tVar, "settingPreference");
        jo.p.h(rVar, "featureHelper");
        this.f35564a = tVar;
        this.f35565b = rVar;
    }

    public final void a() {
        int Z1 = this.f35564a.Z1();
        this.f35564a.M(Z1 <= 100 ? Z1 + 1 : 100);
    }

    public final void b() {
        int S4 = this.f35564a.S4();
        this.f35564a.h2(S4 <= 100 ? S4 + 1 : 100);
    }

    public final boolean c() {
        return this.f35564a.C() && Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r0.equals("high") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0.equals("normal") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r6.f35565b.m() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        return "normal";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        return "high";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            r6 = this;
            kf.t r0 = r6.f35564a
            java.lang.String r0 = r0.y3()
            int r1 = r0.hashCode()
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            java.lang.String r3 = "low"
            java.lang.String r4 = "high"
            java.lang.String r5 = "normal"
            if (r1 == r2) goto L2e
            r2 = 107348(0x1a354, float:1.50427E-40)
            if (r1 == r2) goto L27
            r2 = 3202466(0x30dda2, float:4.48761E-39)
            if (r1 == r2) goto L20
            goto L34
        L20:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L3c
            goto L34
        L27:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3f
            goto L34
        L2e:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L3e
        L34:
            hf.r r0 = r6.f35565b
            boolean r0 = r0.m()
            if (r0 == 0) goto L3e
        L3c:
            r3 = r4
            goto L3f
        L3e:
            r3 = r5
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.m0.d():java.lang.String");
    }

    public final String e(Context context, String str) {
        return so.n.q(context.getString(f1.H2), str, true) ? "high" : (!so.n.q(context.getString(f1.f41989s3), str, true) && so.n.q(context.getString(f1.Y2), str, true)) ? "low" : "normal";
    }

    public final int f(Context context, CharSequence[] charSequenceArr) {
        jo.p.h(context, "context");
        String g10 = g(context);
        if (charSequenceArr != null) {
            int length = charSequenceArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (so.n.q(g10, charSequenceArr[i10].toString(), true)) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String g(Context context) {
        jo.p.h(context, "context");
        String d10 = d();
        int hashCode = d10.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode != 107348) {
                if (hashCode == 3202466 && d10.equals("high")) {
                    String string = context.getString(f1.H2);
                    jo.p.g(string, "context.getString(R.string.text_high_quality_mode)");
                    return string;
                }
            } else if (d10.equals("low")) {
                String string2 = context.getString(f1.Y2);
                jo.p.g(string2, "context.getString(R.string.text_low_quality_mode)");
                return string2;
            }
        } else if (d10.equals("normal")) {
            String string3 = context.getString(f1.f41989s3);
            jo.p.g(string3, "context.getString(R.stri…text_normal_quality_mode)");
            return string3;
        }
        return "";
    }

    public final int h() {
        boolean i52 = this.f35564a.i5();
        if (this.f35565b.d()) {
            return i52 ? 1 : 0;
        }
        return 0;
    }

    public final int i() {
        return this.f35564a.x();
    }

    public final int j(int i10) {
        return i() == 0 ? i10 : i();
    }

    public final int k(Context context, String str) {
        String string;
        jo.p.h(context, "context");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1039745817) {
                if (hashCode != 107348) {
                    if (hashCode == 3202466 && str.equals("high")) {
                        string = context.getString(f1.pref_value_bitrate_1M);
                        jo.p.g(string, "context.getString(R.string.pref_value_bitrate_1M)");
                    }
                } else if (str.equals("low")) {
                    string = context.getString(f1.pref_value_bitrate_256k);
                    jo.p.g(string, "context.getString(R.stri….pref_value_bitrate_256k)");
                }
            } else if (str.equals("normal")) {
                string = context.getString(f1.pref_value_bitrate_512k);
                jo.p.g(string, "context.getString(R.stri….pref_value_bitrate_512k)");
            }
            return Integer.parseInt(string) * 1024;
        }
        string = context.getString(f1.pref_value_bitrate_512k);
        jo.p.g(string, "context.getString(R.stri….pref_value_bitrate_512k)");
        return Integer.parseInt(string) * 1024;
    }

    public final int l(Context context, String str) {
        String string;
        jo.p.h(context, "context");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1039745817) {
                if (hashCode != 107348) {
                    if (hashCode == 3202466 && str.equals("high")) {
                        string = context.getString(f1.pref_value_fps_20);
                        jo.p.g(string, "context.getString(R.string.pref_value_fps_20)");
                    }
                } else if (str.equals("low")) {
                    string = context.getString(f1.pref_value_fps_15);
                    jo.p.g(string, "context.getString(R.string.pref_value_fps_15)");
                }
            } else if (str.equals("normal")) {
                string = context.getString(f1.pref_value_fps_20);
                jo.p.g(string, "context.getString(R.string.pref_value_fps_20)");
            }
            return Integer.parseInt(string);
        }
        string = context.getString(f1.pref_value_fps_20);
        jo.p.g(string, "context.getString(R.string.pref_value_fps_20)");
        return Integer.parseInt(string);
    }

    public final int m() {
        return this.f35564a.r4() ? 1 : 0;
    }

    public final boolean n() {
        return so.n.q("high", this.f35564a.y3(), true);
    }

    public final void o(String str) {
        this.f35564a.U0(str);
    }

    public final void p(Context context, CharSequence[] charSequenceArr, int i10) {
        jo.p.h(context, "context");
        if (charSequenceArr == null || i10 <= -1 || i10 >= charSequenceArr.length) {
            return;
        }
        o(e(context, charSequenceArr[i10].toString()));
    }

    public final int q() {
        return this.f35564a.f1() ? 1 : 0;
    }
}
