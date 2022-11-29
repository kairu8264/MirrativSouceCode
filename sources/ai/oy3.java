package ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class oy3 extends qy3 {

    /* renamed from: b  reason: collision with root package name */
    public final long f8170b;

    /* renamed from: c  reason: collision with root package name */
    public final List<py3> f8171c;

    /* renamed from: d  reason: collision with root package name */
    public final List<oy3> f8172d;

    public oy3(int i10, long j10) {
        super(i10);
        this.f8170b = j10;
        this.f8171c = new ArrayList();
        this.f8172d = new ArrayList();
    }

    public final void c(py3 py3Var) {
        this.f8171c.add(py3Var);
    }

    public final void d(oy3 oy3Var) {
        this.f8172d.add(oy3Var);
    }

    public final py3 e(int i10) {
        int size = this.f8171c.size();
        for (int i11 = 0; i11 < size; i11++) {
            py3 py3Var = this.f8171c.get(i11);
            if (py3Var.f9239a == i10) {
                return py3Var;
            }
        }
        return null;
    }

    public final oy3 f(int i10) {
        int size = this.f8172d.size();
        for (int i11 = 0; i11 < size; i11++) {
            oy3 oy3Var = this.f8172d.get(i11);
            if (oy3Var.f9239a == i10) {
                return oy3Var;
            }
        }
        return null;
    }

    @Override // ai.qy3
    public final String toString() {
        String b10 = qy3.b(this.f9239a);
        String arrays = Arrays.toString(this.f8171c.toArray());
        String arrays2 = Arrays.toString(this.f8172d.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb2 = new StringBuilder(b10.length() + 22 + length + String.valueOf(arrays2).length());
        sb2.append(b10);
        sb2.append(" leaves: ");
        sb2.append(arrays);
        sb2.append(" containers: ");
        sb2.append(arrays2);
        return sb2.toString();
    }
}
