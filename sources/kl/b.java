package kl;

/* loaded from: classes4.dex */
public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f38865a;

    public b(int i10) {
        this.f38865a = i10;
    }

    @Override // kl.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f38865a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
