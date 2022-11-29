package cg;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class k implements fg.b<Executor> {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f19617a = new k();
    }

    public static k a() {
        return a.f19617a;
    }

    public static Executor b() {
        return (Executor) fg.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
