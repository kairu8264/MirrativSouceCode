package ai;

import android.util.SparseArray;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v14 implements mv3 {

    /* renamed from: l  reason: collision with root package name */
    public static final sv3 f10921l = t14.f10074a;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10926e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10927f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10928g;

    /* renamed from: h  reason: collision with root package name */
    public long f10929h;

    /* renamed from: i  reason: collision with root package name */
    public r14 f10930i;

    /* renamed from: j  reason: collision with root package name */
    public pv3 f10931j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10932k;

    /* renamed from: a  reason: collision with root package name */
    public final pb f10922a = new pb(0);

    /* renamed from: c  reason: collision with root package name */
    public final hb f10924c = new hb(4096);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<u14> f10923b = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public final s14 f10925d = new s14();

    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r14, ai.iw3 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.v14.e(ai.nv3, ai.iw3):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != r5) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[LOOP:0: B:14:0x0030->B:16:0x0038, LOOP_END] */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r3, long r5) {
        /*
            r2 = this;
            ai.pb r3 = r2.f10922a
            long r3 = r3.c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L23
            ai.pb r3 = r2.f10922a
            long r3 = r3.a()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
        L23:
            ai.pb r3 = r2.f10922a
            r3.d(r5)
        L28:
            ai.r14 r3 = r2.f10930i
            r4 = 0
            if (r3 == 0) goto L30
            r3.b(r5)
        L30:
            android.util.SparseArray<ai.u14> r3 = r2.f10923b
            int r3 = r3.size()
            if (r4 >= r3) goto L46
            android.util.SparseArray<ai.u14> r3 = r2.f10923b
            java.lang.Object r3 = r3.valueAt(r4)
            ai.u14 r3 = (ai.u14) r3
            r3.a()
            int r4 = r4 + 1
            goto L30
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.v14.g(long, long):void");
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f10931j = pv3Var;
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        byte[] bArr = new byte[14];
        hv3 hv3Var = (hv3) nv3Var;
        hv3Var.c(bArr, 0, 14, false);
        if ((((bArr[0] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[1] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[2] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[3] & TagConstant.TAG_CAT_RESERVED)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hv3Var.r(bArr[13] & 7, false);
            hv3Var.c(bArr, 0, 3, false);
            return ((((bArr[0] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[1] & TagConstant.TAG_CAT_RESERVED) << 8)) | (bArr[2] & TagConstant.TAG_CAT_RESERVED)) == 1;
        }
        return false;
    }
}
