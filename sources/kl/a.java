package kl;

/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f38862a;

    /* renamed from: b  reason: collision with root package name */
    public final d[] f38863b;

    /* renamed from: c  reason: collision with root package name */
    public final b f38864c;

    public a(int i10, d... dVarArr) {
        this.f38862a = i10;
        this.f38863b = dVarArr;
        this.f38864c = new b(i10);
    }

    @Override // kl.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= this.f38862a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f38863b) {
            if (stackTraceElementArr2.length <= this.f38862a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f38862a ? this.f38864c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
