package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class e implements u {

    /* renamed from: a  reason: collision with root package name */
    public final u f16088a;

    /* renamed from: b  reason: collision with root package name */
    public int f16089b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f16090c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f16091d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f16092e = null;

    public e(u uVar) {
        this.f16088a = uVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        int i12;
        if (this.f16089b == 1 && i10 >= (i12 = this.f16090c)) {
            int i13 = this.f16091d;
            if (i10 <= i12 + i13) {
                this.f16091d = i13 + i11;
                this.f16090c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f16090c = i10;
        this.f16091d = i11;
        this.f16089b = 1;
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        int i12;
        if (this.f16089b == 2 && (i12 = this.f16090c) >= i10 && i12 <= i10 + i11) {
            this.f16091d += i11;
            this.f16090c = i10;
            return;
        }
        e();
        this.f16090c = i10;
        this.f16091d = i11;
        this.f16089b = 2;
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f16089b == 3) {
            int i13 = this.f16090c;
            int i14 = this.f16091d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f16092e == obj) {
                this.f16090c = Math.min(i10, i13);
                this.f16091d = Math.max(i14 + i13, i12) - this.f16090c;
                return;
            }
        }
        e();
        this.f16090c = i10;
        this.f16091d = i11;
        this.f16092e = obj;
        this.f16089b = 3;
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11) {
        e();
        this.f16088a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f16089b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f16088a.a(this.f16090c, this.f16091d);
        } else if (i10 == 2) {
            this.f16088a.b(this.f16090c, this.f16091d);
        } else if (i10 == 3) {
            this.f16088a.c(this.f16090c, this.f16091d, this.f16092e);
        }
        this.f16092e = null;
        this.f16089b = 0;
    }
}
