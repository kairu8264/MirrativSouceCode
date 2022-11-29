package ai;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class nn0 implements ui {

    /* renamed from: a  reason: collision with root package name */
    public final ui f7413a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7414b;

    /* renamed from: c  reason: collision with root package name */
    public final ui f7415c;

    /* renamed from: d  reason: collision with root package name */
    public long f7416d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f7417e;

    public nn0(ui uiVar, int i10, ui uiVar2) {
        this.f7413a = uiVar;
        this.f7414b = i10;
        this.f7415c = uiVar2;
    }

    @Override // ai.ui
    public final Uri b() {
        return this.f7417e;
    }

    @Override // ai.ui
    public final void d() throws IOException {
        this.f7413a.d();
        this.f7415c.d();
    }

    @Override // ai.ui
    public final int e(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.f7416d;
        long j11 = this.f7414b;
        if (j10 < j11) {
            int e10 = this.f7413a.e(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f7416d + e10;
            this.f7416d = j12;
            i12 = e10;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 >= this.f7414b) {
            int e11 = this.f7415c.e(bArr, i10 + i12, i11 - i12);
            this.f7416d += e11;
            return i12 + e11;
        }
        return i12;
    }

    @Override // ai.ui
    public final long f(vi viVar) throws IOException {
        vi viVar2;
        this.f7417e = viVar.f11093a;
        long j10 = viVar.f11095c;
        long j11 = this.f7414b;
        vi viVar3 = null;
        if (j10 >= j11) {
            viVar2 = null;
        } else {
            long j12 = viVar.f11096d;
            viVar2 = new vi(viVar.f11093a, null, j10, j10, j12 != -1 ? Math.min(j12, j11 - j10) : j11 - j10, null, 0);
        }
        long j13 = viVar.f11096d;
        if (j13 == -1 || viVar.f11095c + j13 > this.f7414b) {
            long max = Math.max(this.f7414b, viVar.f11095c);
            long j14 = viVar.f11096d;
            viVar3 = new vi(viVar.f11093a, null, max, max, j14 != -1 ? Math.min(j14, (viVar.f11095c + j14) - this.f7414b) : -1L, null, 0);
        }
        long f10 = viVar2 != null ? this.f7413a.f(viVar2) : 0L;
        long f11 = viVar3 != null ? this.f7415c.f(viVar3) : 0L;
        this.f7416d = viVar.f11095c;
        if (f11 == -1) {
            return -1L;
        }
        return f10 + f11;
    }
}
