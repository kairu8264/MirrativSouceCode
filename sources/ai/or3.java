package ai;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class or3 extends sr3 {

    /* renamed from: f  reason: collision with root package name */
    public static final l13<Integer> f7891f = l13.c(cr3.f2919w);

    /* renamed from: g  reason: collision with root package name */
    public static final l13<Integer> f7892g = l13.c(dr3.f3385w);

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f7893h = 0;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<ir3> f7894d;

    /* renamed from: e  reason: collision with root package name */
    public final yq3 f7895e;

    public or3(Context context) {
        yq3 yq3Var = new yq3();
        ir3 c10 = ir3.c(context);
        this.f7895e = yq3Var;
        this.f7894d = new AtomicReference<>(c10);
    }

    public static boolean k(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int m(v4 v4Var, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(v4Var.f10951c)) {
            String l10 = l(str);
            String l11 = l(v4Var.f10951c);
            if (l11 == null || l10 == null) {
                return (z10 && l11 == null) ? 1 : 0;
            } else if (l11.startsWith(l10) || l10.startsWith(l11)) {
                return 3;
            } else {
                return sb.Z(l11, "-")[0].equals(sb.Z(l10, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    @Override // ai.sr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<ai.w6[], ai.br3[]> f(ai.rr3 r28, int[][][] r29, int[] r30, ai.bp3 r31, ai.q7 r32) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.or3.f(ai.rr3, int[][][], int[], ai.bp3, ai.q7):android.util.Pair");
    }

    public final ir3 i() {
        return this.f7894d.get();
    }

    public final void j(jr3 jr3Var) {
        ir3 ir3Var = new ir3(jr3Var);
        if (this.f7894d.getAndSet(ir3Var).equals(ir3Var)) {
            return;
        }
        d();
    }
}
