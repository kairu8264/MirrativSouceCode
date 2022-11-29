package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class o23 {

    /* renamed from: b  reason: collision with root package name */
    public static final o23 f7628b = new o23(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f7629a;

    /* loaded from: classes3.dex */
    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public o23(Throwable th2) {
        Objects.requireNonNull(th2);
        this.f7629a = th2;
    }
}
