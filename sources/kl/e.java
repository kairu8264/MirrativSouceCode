package kl;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f38867a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38868b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f38869c;

    /* renamed from: d  reason: collision with root package name */
    public final e f38870d;

    public e(Throwable th2, d dVar) {
        this.f38867a = th2.getLocalizedMessage();
        this.f38868b = th2.getClass().getName();
        this.f38869c = dVar.a(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f38870d = cause != null ? new e(cause, dVar) : null;
    }
}
