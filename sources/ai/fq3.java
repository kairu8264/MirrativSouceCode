package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class fq3 implements mp3 {

    /* renamed from: a  reason: collision with root package name */
    public final z6 f4162a;

    /* renamed from: b  reason: collision with root package name */
    public final rp3 f4163b;

    /* renamed from: c  reason: collision with root package name */
    public int f4164c;

    /* renamed from: d  reason: collision with root package name */
    public final os3 f4165d;

    /* renamed from: e  reason: collision with root package name */
    public final ei2 f4166e;

    public fq3(z6 z6Var, final sv3 sv3Var) {
        rp3 rp3Var = new rp3(sv3Var) { // from class: ai.eq3

            /* renamed from: a  reason: collision with root package name */
            public final sv3 f3750a;

            {
                this.f3750a = sv3Var;
            }

            @Override // ai.rp3
            public final sp3 zza() {
                return new pm3(this.f3750a);
            }
        };
        this.f4162a = z6Var;
        this.f4163b = rp3Var;
        this.f4166e = new ei2();
        this.f4165d = new os3(-1);
        this.f4164c = 1048576;
    }

    public final fq3 a(int i10) {
        this.f4164c = i10;
        return this;
    }

    public final hq3 b(k5 k5Var) {
        Objects.requireNonNull(k5Var.f6086b);
        return new hq3(k5Var, this.f4162a, this.f4163b, kq2.f6339a, this.f4165d, this.f4164c, null, null);
    }
}
